/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, see the [Notifications Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md)
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;


import com.amazon.spapi.client.ApiException;

import com.amazon.spapi.config.AmazonAuthorConfig;
import com.amazon.spapi.enums.EndpointsEnum;
import com.amazon.spapi.enums.ReportTypeEnum;
import com.amazon.spapi.model.notifications.*;
import lombok.var;
import org.junit.Test;
import org.junit.Ignore;

import java.util.*;
/**
 * API tests for NotificationsApi
 */
@Ignore
public class NotificationsApiTest {

    static String refreshtoken="***";
    static EndpointsEnum endpointsEnum = EndpointsEnum.US;
    static List<String> marketplaceIds= Arrays.asList(endpointsEnum.getMarketplaceId());
    AmazonAuthorConfig authorConfig=new AmazonAuthorConfig(refreshtoken, endpointsEnum.getRegion(),endpointsEnum.getEndpoint());


    static AmazonAuthorConfig noauthorConfig = new AmazonAuthorConfig(refreshtoken, endpointsEnum.getRegion(),endpointsEnum.getEndpoint());
    private final NotificationsApi noapi =  NotificationsApi.amazonAuthorizationApi(noauthorConfig,"noAuth");
    private final NotificationsApi api =  NotificationsApi.amazonAuthorizationApi(authorConfig);




    /**
     *
     *
     * Creates a destination resource to receive notifications. The createDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDestinationSqsTest() throws ApiException {
        CreateDestinationRequest body = new CreateDestinationRequest();
        body.setName("Sqs-FlowSeller");
        DestinationResourceSpecification specification=new DestinationResourceSpecification();
        var sqs=new SqsResource();
        sqs.setArn("arn:aws:sqs:us-east-1:11111:Sqs-FlowSeller");
        specification.setSqs(sqs);
//        var eventBridge=new EventBridgeResourceSpecification();
//        eventBridge.setRegion("us-east-1");
//        eventBridge.setAccountId("468102549593");
//        specification.setEventBridge(eventBridge);
        //只能注册一种  要么SQS 要么事件
        body.setResourceSpecification(specification);
        CreateDestinationResponse response = noapi.createDestination(body);
        System.out.println(response);
        // TODO: test validations
    }
    @Test
    public void createDestinationSqsCCTest() throws ApiException {
        CreateDestinationRequest body = new CreateDestinationRequest();
        body.setName("EU");
        DestinationResourceSpecification specification=new DestinationResourceSpecification();
        var sqs=new SqsResource();
        sqs.setArn("arn:aws:sqs:eu-west-2:111111111:EU");
        specification.setSqs(sqs);
        body.setResourceSpecification(specification);
        CreateDestinationResponse response = noapi.createDestination(body);
        System.out.println(response);
        // TODO: test validations
    }

    @Test
    public void createDestinationEnvTest() throws ApiException {


        DestinationResourceSpecification spec = new DestinationResourceSpecification();
        EventBridgeResourceSpecification eventBridgeResourceSpecification = new EventBridgeResourceSpecification();
        eventBridgeResourceSpecification.setAccountId("11111");
        eventBridgeResourceSpecification.setRegion("us-east-1");
        spec.setEventBridge(eventBridgeResourceSpecification);
        CreateDestinationRequest createDestinationRequest = new CreateDestinationRequest();
        createDestinationRequest.setName("demo");
        createDestinationRequest.setResourceSpecification(spec);
        CreateDestinationResponse response = noapi.createDestination(createDestinationRequest);
        System.out.println(response);
        // TODO: test validations
    }

    /**
     * 调用createSubscription 创建订阅
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSubscriptionTest() throws ApiException {

        CreateSubscriptionRequest request = new CreateSubscriptionRequest();
        request.setDestinationId("fc1b96e8-5917-4a33-abde-c1d273e6693c");
        request.setPayloadVersion("1.0");
        CreateSubscriptionResponse response = api.createSubscription(request,"ANY_OFFER_CHANGED");
        System.out.println(response);
        // TODO: test validations
    }

    /**
     *
     *
     * Deletes the destination that you specify. The deleteDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDestinationTest() throws ApiException {
        String destinationId = null;
        DeleteDestinationResponse response = api.deleteDestination(destinationId);

        // TODO: test validations
    }

    /**
     *
     *
     * Deletes the subscription indicated by the subscription identifier and notification type that you specify. The subscription identifier can be for any subscription associated with your application. After you successfully call this operation, notifications will stop being sent for the associated subscription. The deleteSubscriptionById API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSubscriptionByIdTest() throws ApiException {
        String subscriptionId = null;
        String notificationType = null;
        DeleteSubscriptionByIdResponse response = api.deleteSubscriptionById(subscriptionId, notificationType);

        // TODO: test validations
    }

    /**
     *
     *
     * Returns information about the destination that you specify. The getDestination API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDestinationTest() throws ApiException {
        String destinationId = "895bc25c-321e-4162-b045-442ddca0156e";
        GetDestinationResponse response = api.getDestination(destinationId);
        System.out.println(response);
        // TODO: test validations
    }

    /**
     *
     *
     * Returns information about all destinations. The getDestinations API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDestinationsTest() throws ApiException {
        GetDestinationsResponse response = api.getDestinations();
        System.out.println(response);
        // TODO: test validations
    }

    /**
     *
     *
     * Returns information about subscriptions of the specified notification type. You can use this API to get subscription information when you do not have a subscription identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionTest() throws ApiException {
        String notificationType = "ANY_OFFER_CHANGED";
        GetSubscriptionResponse response = api.getSubscription(notificationType);
        System.out.println(response);
        // TODO: test validations
    }

    /**
     *
     *
     * Returns information about a subscription for the specified notification type. The getSubscriptionById API is grantless. For more information, see \&quot;Grantless operations\&quot; in the Selling Partner API Developer Guide.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionByIdTest() throws ApiException {
        String subscriptionId = "365065a6-47a4-4c70-ab2a-9703d2db1ef8";
        String notificationType = "ANY_OFFER_CHANGED";
        GetSubscriptionByIdResponse response = api.getSubscriptionById(subscriptionId, notificationType);
        System.out.println(response);
        // TODO: test validations
    }

}
