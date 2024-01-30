package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.config.AmazonAuthorConfig;
import com.amazon.spapi.enums.EndpointsEnum;
import com.amazon.spapi.model.tokens.CreateRestrictedDataTokenRequest;
import com.amazon.spapi.model.tokens.RestrictedResource;
import lombok.var;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@Ignore
public class TokensApiTest {



    static String refreshtoken="***";
    static EndpointsEnum endpointsEnum = EndpointsEnum.US;
    static List<String> marketplaceIds= Arrays.asList(endpointsEnum.getMarketplaceId());
    static  AmazonAuthorConfig authorConfig=new AmazonAuthorConfig(refreshtoken, endpointsEnum.getRegion(),endpointsEnum.getEndpoint());
    static String appId="amzn1.sp.solution.6666666666666";
    private final  TokensApi api =TokensApi.amazonAuthorizationApi(authorConfig);
    @Test
   public void createRestrictedDataToken() throws ApiException {

        CreateRestrictedDataTokenRequest body =new CreateRestrictedDataTokenRequest();
        //被委派访问权限的目标应用程序的应用程序 ID
        body.setTargetApplication(appId);
        //受限资源列表。
        List<RestrictedResource> list=new ArrayList<>();
        RestrictedResource resource=new RestrictedResource();
        resource.setMethod(RestrictedResource.MethodEnum.GET);
        //下一步要用到的接口是什么操作就要传什么类型
        //https://developer-docs.amazon.com/sp-api/docs/tax-remittance-restricted-role#apis
        resource.setPath("/reports/2021-06-30/reports" );
        resource.setDataElements(Arrays.asList("GET_VAT_TRANSACTION_DATA"));
        list.add(resource);
        body.setRestrictedResources(list);
        var response=api.createRestrictedDataToken(body);
        System.out.println(response);
    }

    /**
    * 获取订单RDT
    * @author AmteMa
    * @date 2023/3/28
    */
    @Test
    public void createGetOrdersRestrictedDataToken() throws ApiException {

        CreateRestrictedDataTokenRequest body =new CreateRestrictedDataTokenRequest();
        //被委派访问权限的目标应用程序的应用程序 ID
        body.setTargetApplication(appId);
        //受限资源列表。
        List<RestrictedResource> list=new ArrayList<>();
        RestrictedResource resource=new RestrictedResource();
        resource.setMethod(RestrictedResource.MethodEnum.GET);
        //下一步要用到的接口是什么操作就要传什么类型
        //https://developer-docs.amazon.com/sp-api/docs/tax-remittance-restricted-role#apis
        resource.setPath("/orders/v0/orders");
        resource.setDataElements(Arrays.asList("buyerInfo","shippingAddress"));
        list.add(resource);
        body.setRestrictedResources(list);
        var response=api.createRestrictedDataToken(body);
        System.out.println(response);
    }
    /**
    * 获取具体orderId
    * @author AmteMa
    * @date 2023/3/28
    */
    @Test
    public void createGetOrderRestrictedDataToken() throws ApiException {

        CreateRestrictedDataTokenRequest body =new CreateRestrictedDataTokenRequest();
        //被委派访问权限的目标应用程序的应用程序 ID
        body.setTargetApplication(appId);
        //受限资源列表。
        List<RestrictedResource> list=new ArrayList<>();
        RestrictedResource resource=new RestrictedResource();
        resource.setMethod(RestrictedResource.MethodEnum.GET);
        //下一步要用到的接口是什么操作就要传什么类型
        //https://developer-docs.amazon.com/sp-api/docs/tax-remittance-restricted-role#apis
        resource.setPath("/orders/v0/orders/112-0470199-8632239");
        resource.setDataElements(Arrays.asList("buyerInfo","shippingAddress"));
        list.add(resource);
        body.setRestrictedResources(list);
        var response=api.createRestrictedDataToken(body);
        System.out.println(response);
    }
}
