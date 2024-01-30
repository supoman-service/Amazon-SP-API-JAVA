package com.amazon.spapi.SellingPartnerAPIAA;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.okhttp.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

class LWAClient {
    private static final String ACCESS_TOKEN_KEY = "access_token";
    private static final String ACCESS_TOKEN_EXPIRES_IN = "expires_in";
    private static final MediaType JSON_MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");
    @Getter
    private String endpoint;

    @Setter(AccessLevel.PACKAGE)
    private OkHttpClient okHttpClient;
    private LWAAccessTokenCache lwaAccessTokenCache;

    /** Sets cache to store access token until token is expired */
    public void setLWAAccessTokenCache(LWAAccessTokenCache tokenCache) {
        this.lwaAccessTokenCache = tokenCache;
    }

    LWAClient(String endpoint) {
        okHttpClient = new OkHttpClient();
        this.endpoint = endpoint;
     }

    String getAccessToken(LWAAccessTokenRequestMeta lwaAccessTokenRequestMeta) {
        if (lwaAccessTokenCache != null) {
           return getAccessTokenFromCache(lwaAccessTokenRequestMeta);
        } else {
            return getAccessTokenFromEndpoint(lwaAccessTokenRequestMeta);
            }
    }

    String getAccessTokenFromCache(LWAAccessTokenRequestMeta lwaAccessTokenRequestMeta) {
        String accessTokenCacheData =lwaAccessTokenCache.get(lwaAccessTokenRequestMeta.getRefreshToken());
        if (accessTokenCacheData != null) {
             return accessTokenCacheData;
         } else {
             return getAccessTokenFromEndpoint(lwaAccessTokenRequestMeta);
         }
    }

    String getAccessTokenFromEndpoint(LWAAccessTokenRequestMeta lwaAccessTokenRequestMeta) {
        RequestBody requestBody = RequestBody.create(JSON_MEDIA_TYPE, new Gson().toJson(lwaAccessTokenRequestMeta));
        Request accessTokenRequest = new Request.Builder().url(endpoint).post(requestBody).build();

        String accessToken;
        try {
            Response response = okHttpClient.newCall(accessTokenRequest).execute();
            if (!response.isSuccessful()) {
                throw new IOException("Unsuccessful LWA token exchange");
            }

            JsonObject responseJson = new JsonParser().parse(response.body().string()).getAsJsonObject();

            accessToken = responseJson.get(ACCESS_TOKEN_KEY).getAsString();
            /*if (lwaAccessTokenCache != null) {
                long timeToTokenexpiry = responseJson.get(ACCESS_TOKEN_EXPIRES_IN).getAsLong();
                lwaAccessTokenCache.put(lwaAccessTokenRequestMeta.getRefreshToken(), accessToken, timeToTokenexpiry);
                }*/
            //提前5分钟失效token
            long timeToTokenexpiry = responseJson.get(ACCESS_TOKEN_EXPIRES_IN).getAsLong()-300;
            lwaAccessTokenCache.put(lwaAccessTokenRequestMeta.getRefreshToken(), accessToken, timeToTokenexpiry);
        } catch (Exception e) {
            throw new RuntimeException("Error getting LWA Access Token", e);
            }
        return accessToken;
        }

}
