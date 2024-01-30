package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.config.AmazonAuthorConfig;
import com.amazon.spapi.enums.EndpointsEnum;
import com.amazon.spapi.model.orders.GetOrdersResponse;
import lombok.var;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@Ignore
public class VendorOrdersApiTest {


    static String refreshtoken="***";
    static EndpointsEnum endpointsEnum = EndpointsEnum.US;
    static List<String> marketplaceIds= Arrays.asList(endpointsEnum.getMarketplaceId());
    static  AmazonAuthorConfig authorConfig=new AmazonAuthorConfig(refreshtoken, endpointsEnum.getRegion(),endpointsEnum.getEndpoint());

    private final VendorOrdersApi api = VendorOrdersApi.amazonAuthorizationApi(authorConfig);
   /* @Test
    void getPurchaseOrder() {
    }

    @Test
    void getPurchaseOrdersWithHttpInfo() {
    }*/

    @Test
    public  void getPurchaseOrders() throws ApiException {

        var createdAfter =org.threeten.bp.OffsetDateTime.now().plusDays(-5);
        var createdBefore =org.threeten.bp.OffsetDateTime.now();

        var response = api.getPurchaseOrders(null,createdAfter,createdBefore,null,null,null,null,null,null,null,null,null);
        if(null == response) {
            throw new RuntimeException();
        }
        System.out.println(response.getPayload().getOrders());
    }
}
