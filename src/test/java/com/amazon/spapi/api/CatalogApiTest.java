/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items helps you programmatically retrieve item details for items in the catalog.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import com.amazon.spapi.client.*;
import com.amazon.spapi.config.AmazonAuthorConfig;
import com.amazon.spapi.enums.EndpointsEnum;
import com.amazon.spapi.model.catalogitems.*;
import org.junit.Test;
import org.junit.Ignore;

import java.util.Arrays;
import java.util.List;

/**
 * API tests for CatalogApi
 */
@Ignore
public class CatalogApiTest {


    static String refreshtoken="***";

    static EndpointsEnum endpointsEnum = EndpointsEnum.JP;


    AmazonAuthorConfig authorConfig=new AmazonAuthorConfig(refreshtoken, endpointsEnum.getRegion(),endpointsEnum.getEndpoint());

    private final CatalogApi api = CatalogApi.amazonAuthorizationApi(authorConfig);

    @Test
    public void getCatalogItemTest() throws ApiException {
        List<String> marketplaceIds = Arrays.asList(endpointsEnum.getMarketplaceId());
        List<String> includedData = Arrays.asList("attributes");
        String locale = null;
        String asin = "B07FKQKBDV";

      try{  Item response = api.getCatalogItem(asin, marketplaceIds, includedData, locale);
          System.out.println("返回结果");
          System.out.println(response);
      }catch (ApiException e){
          System.out.println(e.getCode());
          System.out.println(e.getMessage());
      }

        // TODO: test validations
    }

    @Test
    public void searchCatalogItemsTest() throws ApiException {
        List<String> marketplaceIds = null;
        List<String> identifiers = null;
        String identifiersType = null;
        List<String> includedData = null;
        String locale = null;
        String sellerId = null;
        List<String> keywords = null;
        List<String> brandNames = null;
        List<String> classificationIds = null;
        Integer pageSize = null;
        String pageToken = null;
        String keywordsLocale = null;
        ItemSearchResults response = api.searchCatalogItems(marketplaceIds, identifiers, identifiersType, includedData, locale, sellerId, keywords, brandNames, classificationIds, pageSize, pageToken, keywordsLocale);
        // TODO: test validations
    }
}