/*
 * Selling Partner API for FBA Inbound Eligibilty
 * With the FBA Inbound Eligibility API, you can build applications that let sellers get eligibility previews for items before shipping them to Amazon's fulfillment centers. With this API you can find out if an item is eligible for inbound shipment to Amazon's fulfillment centers in a specific marketplace. You can also find out if an item is eligible for using the manufacturer barcode for FBA inventory tracking. Sellers can use this information to inform their decisions about which items to ship Amazon's fulfillment centers.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import com.amazon.spapi.client.*;
import com.amazon.spapi.SellingPartnerAPIAA.*;

import com.amazon.spapi.common.AwsAuthInfo;
import com.amazon.spapi.config.AmazonAuthorConfig;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.amazon.spapi.model.fbainboundeligibility.GetItemEligibilityPreviewResponse;
import lombok.var;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FbaInboundEligibilityApi {
    private ApiClient apiClient;

    FbaInboundEligibilityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FbaInboundEligibilityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public static FbaInboundEligibilityApi amazonAuthorizationApi(AmazonAuthorConfig authorConfigDTO) {
        var authInfo=new AwsAuthInfo(authorConfigDTO);
        FbaInboundEligibilityApi api =new FbaInboundEligibilityApi.Builder()
                
                .lwaAuthorizationCredentials(authInfo.getLwaAuthorizationCredentials())
                
                .endpoint(authorConfigDTO.getSpEndPoint())
                .build();

        //授权失败，未获取到API实例的话抛出异常，进行重试
        if(null == api) {
            throw new RuntimeException("授权失败，未获取到API实例，请重试");
        }
        return api;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getItemEligibilityPreview
     * @param asin The ASIN of the item for which you want an eligibility preview. (required)
     * @param program The program that you want to check eligibility against. (required)
     * @param marketplaceIds The identifier for the marketplace in which you want to determine eligibility. Required only when program&#x3D;INBOUND. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemEligibilityPreviewCall(String asin, String program, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fba/inbound/v1/eligibility/itemPreview";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        if (asin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asin", asin));
        if (program != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("program", program));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemEligibilityPreviewValidateBeforeCall(String asin, String program, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'asin' is set
        if (asin == null) {
            throw new ApiException("Missing the required parameter 'asin' when calling getItemEligibilityPreview(Async)");
        }
        
        // verify the required parameter 'program' is set
        if (program == null) {
            throw new ApiException("Missing the required parameter 'program' when calling getItemEligibilityPreview(Async)");
        }
        

        com.squareup.okhttp.Call call = getItemEligibilityPreviewCall(asin, program, marketplaceIds, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * This operation gets an eligibility preview for an item that you specify. You can specify the type of eligibility preview that you want (INBOUND or COMMINGLING). For INBOUND previews, you can specify the marketplace in which you want to determine the item&#39;s eligibility.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param asin The ASIN of the item for which you want an eligibility preview. (required)
     * @param program The program that you want to check eligibility against. (required)
     * @param marketplaceIds The identifier for the marketplace in which you want to determine eligibility. Required only when program&#x3D;INBOUND. (optional)
     * @return GetItemEligibilityPreviewResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetItemEligibilityPreviewResponse getItemEligibilityPreview(String asin, String program, List<String> marketplaceIds) throws ApiException {
        ApiResponse<GetItemEligibilityPreviewResponse> resp = getItemEligibilityPreviewWithHttpInfo(asin, program, marketplaceIds);
        return resp.getData();
    }

    /**
     * 
     * This operation gets an eligibility preview for an item that you specify. You can specify the type of eligibility preview that you want (INBOUND or COMMINGLING). For INBOUND previews, you can specify the marketplace in which you want to determine the item&#39;s eligibility.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param asin The ASIN of the item for which you want an eligibility preview. (required)
     * @param program The program that you want to check eligibility against. (required)
     * @param marketplaceIds The identifier for the marketplace in which you want to determine eligibility. Required only when program&#x3D;INBOUND. (optional)
     * @return ApiResponse&lt;GetItemEligibilityPreviewResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetItemEligibilityPreviewResponse> getItemEligibilityPreviewWithHttpInfo(String asin, String program, List<String> marketplaceIds) throws ApiException {
        com.squareup.okhttp.Call call = getItemEligibilityPreviewValidateBeforeCall(asin, program, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<GetItemEligibilityPreviewResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This operation gets an eligibility preview for an item that you specify. You can specify the type of eligibility preview that you want (INBOUND or COMMINGLING). For INBOUND previews, you can specify the marketplace in which you want to determine the item&#39;s eligibility.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param asin The ASIN of the item for which you want an eligibility preview. (required)
     * @param program The program that you want to check eligibility against. (required)
     * @param marketplaceIds The identifier for the marketplace in which you want to determine eligibility. Required only when program&#x3D;INBOUND. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemEligibilityPreviewAsync(String asin, String program, List<String> marketplaceIds, final ApiCallback<GetItemEligibilityPreviewResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemEligibilityPreviewValidateBeforeCall(asin, program, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetItemEligibilityPreviewResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    public static class Builder {
       
        private LWAAuthorizationCredentials lwaAuthorizationCredentials;
        private String endpoint;
        private LWAAccessTokenCache lwaAccessTokenCache;
        private Boolean disableAccessTokenCache = false;
       

       

        public Builder lwaAuthorizationCredentials(LWAAuthorizationCredentials lwaAuthorizationCredentials) {
            this.lwaAuthorizationCredentials = lwaAuthorizationCredentials;
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        
        public Builder lwaAccessTokenCache(LWAAccessTokenCache lwaAccessTokenCache) {
            this.lwaAccessTokenCache = lwaAccessTokenCache;
            return this;
        }
		
	   public Builder disableAccessTokenCache() {
            this.disableAccessTokenCache = true;
            return this;
        }
        
        
        

        public FbaInboundEligibilityApi build() {
            

            if (lwaAuthorizationCredentials == null) {
                throw new RuntimeException("LWAAuthorizationCredentials not set");
            }

            if (StringUtil.isEmpty(endpoint)) {
                throw new RuntimeException("Endpoint not set");
            }

            
            
            LWAAuthorizationSigner lwaAuthorizationSigner = null;            
            if (disableAccessTokenCache) {
                lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials);
            }
            else {
                if (lwaAccessTokenCache == null) {
                    lwaAccessTokenCache = new LWAAccessTokenCacheImpl();                  
                 }
                 lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials,lwaAccessTokenCache);
            }

            return new FbaInboundEligibilityApi(new ApiClient()
                
                .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                .setBasePath(endpoint));
        }
    }
}