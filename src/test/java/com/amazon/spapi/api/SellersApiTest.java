/*
 * Selling Partner API for Sellers
 * The Selling Partner API for Sellers lets you retrieve information on behalf of sellers about their seller account, such as the marketplaces they participate in. Along with listing the marketplaces that a seller can sell in, the API also provides additional information about the marketplace such as the default language and the default currency. The API also provides seller-specific information such as whether the seller has suspended listings in that marketplace.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import com.alibaba.fastjson2.JSON;
import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.config.AmazonAuthorConfig;
import com.amazon.spapi.enums.EndpointsEnum;
import com.amazon.spapi.model.sellers.GetMarketplaceParticipationsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.Arrays;
import java.util.List;


/**
 * API tests for SellersApi
 */
@Ignore
public class SellersApiTest {



    static String refreshtoken="***";
    static EndpointsEnum endpointsEnum = EndpointsEnum.US;
    static List<String> marketplaceIds= Arrays.asList(endpointsEnum.getMarketplaceId());
    static  AmazonAuthorConfig authorConfig=new AmazonAuthorConfig(refreshtoken, endpointsEnum.getRegion(),endpointsEnum.getEndpoint());
    private final SellersApi api =  SellersApi.amazonAuthorizationApi(authorConfig);;


    /**
     *
     *
     * Returns a list of marketplaces that the seller submitting the request can sell in and information about the seller&#39;s participation in those marketplaces.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | .016 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketplaceParticipationsTest() throws ApiException {
        GetMarketplaceParticipationsResponse response = api.getMarketplaceParticipations();
        System.out.println(JSON.toJSONString(response.getPayload()));
        //System.out.println(response.getPayload());
        //System.out.println(response.getPayload().stream().filter(a->a.getMarketplace().getDomainName().contains("www.amazon.")).collect(Collectors.toList()));
    }

}
