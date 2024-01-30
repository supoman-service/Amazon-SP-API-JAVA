/*
 * Selling Partner API for Messaging
 * With the Messaging API you can build applications that send messages to buyers. You can get a list of message types that are available for an order that you specify, then call an operation that sends a message to the buyer for that order. The Messaging API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
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
import com.amazon.spapi.model.messaging.CreateAmazonMotorsRequest;
import com.amazon.spapi.model.messaging.CreateAmazonMotorsResponse;
import com.amazon.spapi.model.messaging.CreateConfirmCustomizationDetailsRequest;
import com.amazon.spapi.model.messaging.CreateConfirmCustomizationDetailsResponse;
import com.amazon.spapi.model.messaging.CreateConfirmDeliveryDetailsRequest;
import com.amazon.spapi.model.messaging.CreateConfirmDeliveryDetailsResponse;
import com.amazon.spapi.model.messaging.CreateConfirmOrderDetailsRequest;
import com.amazon.spapi.model.messaging.CreateConfirmOrderDetailsResponse;
import com.amazon.spapi.model.messaging.CreateConfirmServiceDetailsRequest;
import com.amazon.spapi.model.messaging.CreateConfirmServiceDetailsResponse;
import com.amazon.spapi.model.messaging.CreateDigitalAccessKeyRequest;
import com.amazon.spapi.model.messaging.CreateDigitalAccessKeyResponse;
import com.amazon.spapi.model.messaging.CreateLegalDisclosureRequest;
import com.amazon.spapi.model.messaging.CreateLegalDisclosureResponse;
import com.amazon.spapi.model.messaging.CreateNegativeFeedbackRemovalResponse;
import com.amazon.spapi.model.messaging.CreateUnexpectedProblemRequest;
import com.amazon.spapi.model.messaging.CreateUnexpectedProblemResponse;
import com.amazon.spapi.model.messaging.CreateWarrantyRequest;
import com.amazon.spapi.model.messaging.CreateWarrantyResponse;
import com.amazon.spapi.model.messaging.GetAttributesResponse;
import com.amazon.spapi.model.messaging.GetMessagingActionsForOrderResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.*;

/**
 * API tests for MessagingApi
 */
@Ignore
public class MessagingApiTest {

    static EndpointsEnum endpointsEnum = EndpointsEnum.US;
    static List<String> marketplaceIds = Arrays.asList(endpointsEnum.getMarketplaceId());

    static AmazonAuthorConfig authorConfig = new AmazonAuthorConfig("Atzr|IwEBIMpM0EobUSRKOQHXdIFkOHtV5rH1hatXSrf0NKFF84-hfJwwEPm-fsCexy9t4EyYA_Aqryk68xm_dDCoXlSZ9oqUffKyjLkabZCE_4JBp-FS6Rkumn2KJAuGGME7FYvHJFaLrBMc2pTTUYRcnVol_04GjVzphET__Ey-zHCOdpbXUMsRdBP_DtjWCrjIQn4twGASivDGQ6tL2cug-ZKo0keR6jKxjZ5ro9LY4DkjBm1g7qaWZCfhnMekie6cugourXHbuqS5E8wrQdyvg77kT1OINFZ1QHg4oySpvXW_vjol231SYFNGWCnVK7WchJUbyPM",
            endpointsEnum.getRegion(),endpointsEnum.getEndpoint());
    private final MessagingApi api = MessagingApi.amazonAuthorizationApi(authorConfig);

    
    /**
     * 
     *
     * Sends a message asking a buyer to provide or verify customization details such as name spelling, images, initials, etc.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmCustomizationDetailsTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateConfirmCustomizationDetailsRequest body = null;
        CreateConfirmCustomizationDetailsResponse response = api.confirmCustomizationDetails(amazonOrderId, marketplaceIds, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sends a message to a buyer to provide details about an Amazon Motors order. This message can only be sent by Amazon Motors sellers.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAmazonMotorsTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateAmazonMotorsRequest body = null;
        CreateAmazonMotorsResponse response = api.createAmazonMotors(amazonOrderId, marketplaceIds, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sends a message to a buyer to arrange a delivery or to confirm contact information for making a delivery.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConfirmDeliveryDetailsTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateConfirmDeliveryDetailsRequest body = null;
        CreateConfirmDeliveryDetailsResponse response = api.createConfirmDeliveryDetails(amazonOrderId, marketplaceIds, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sends a message to ask a buyer an order-related question prior to shipping their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConfirmOrderDetailsTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateConfirmOrderDetailsRequest body = null;
        CreateConfirmOrderDetailsResponse response = api.createConfirmOrderDetails(amazonOrderId, marketplaceIds, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sends a message to contact a Home Service customer to arrange a service call or to gather information prior to a service call.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConfirmServiceDetailsTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateConfirmServiceDetailsRequest body = null;
        CreateConfirmServiceDetailsResponse response = api.createConfirmServiceDetails(amazonOrderId, marketplaceIds, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sends a message to a buyer to share a digital access key needed to utilize digital content in their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDigitalAccessKeyTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateDigitalAccessKeyRequest body = null;
        CreateDigitalAccessKeyResponse response = api.createDigitalAccessKey(amazonOrderId, marketplaceIds, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sends a critical message that contains documents that a seller is legally obligated to provide to the buyer. This message should only be used to deliver documents that are required by law.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLegalDisclosureTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateLegalDisclosureRequest body = null;
        CreateLegalDisclosureResponse response = api.createLegalDisclosure(amazonOrderId, marketplaceIds, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sends a non-critical message that asks a buyer to remove their negative feedback. This message should only be sent after the seller has resolved the buyer&#39;s problem.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNegativeFeedbackRemovalTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateNegativeFeedbackRemovalResponse response = api.createNegativeFeedbackRemoval(amazonOrderId, marketplaceIds);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sends a critical message to a buyer that an unexpected problem was encountered affecting the completion of the order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUnexpectedProblemTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateUnexpectedProblemRequest body = null;
        CreateUnexpectedProblemResponse response = api.createUnexpectedProblem(amazonOrderId, marketplaceIds, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sends a message to a buyer to provide details about warranty information on a purchase in their order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWarrantyTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateWarrantyRequest body = null;
        CreateWarrantyResponse response = api.createWarranty(amazonOrderId, marketplaceIds, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a response containing attributes related to an order. This includes buyer preferences.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttributesTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        GetAttributesResponse response = api.getAttributes(amazonOrderId, marketplaceIds);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of message types that are available for an order that you specify. A message type is represented by an actions object, which contains a path and query parameter(s). You can use the path and parameter(s) to call an operation that sends a message.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessagingActionsForOrderTest() throws ApiException {
        String amazonOrderId = "111-4753387-7438638";

        GetMessagingActionsForOrderResponse response = api.getMessagingActionsForOrder(amazonOrderId, marketplaceIds);
        System.out.println(response);

        // TODO: test validations
    }
    
}