/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson2.JSON;
import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.config.AmazonAuthorConfig;
import com.amazon.spapi.enums.EndpointsEnum;
import com.amazon.spapi.model.finances.*;

import lombok.var;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.Arrays;
import java.util.List;

/**
 * API tests for DefaultApi
 */
@Ignore
public class FinancesApiTest {

    static String refreshtoken="***";
    static EndpointsEnum endpointsEnum = EndpointsEnum.US;
    AmazonAuthorConfig authorConfig=new AmazonAuthorConfig(refreshtoken, endpointsEnum.getRegion(),endpointsEnum.getEndpoint());
    private final FinancesApi api =  FinancesApi.amazonAuthorizationApi(authorConfig);


    /**
     *
     *
     * 返回给定日期范围内的金融事件组。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFinancialEventGroupsTest() throws ApiException {
        Integer maxResultsPerPage = null;

        /*OffsetDateTime financialEventGroupStartedBefore = org.threeten.bp.OffsetDateTime.now().plusDays(-7);
        OffsetDateTime financialEventGroupStartedAfter = org.threeten.bp.OffsetDateTime.now().plusMonths(-1);*/
        //开始时间
        var financialEventGroupStartedAfter = org.threeten.bp.OffsetDateTime.of(2023, 05, 01, 0, 0, 0, 0, org.threeten.bp.ZoneOffset.ofHours(0));
        //截止时间
        var financialEventGroupStartedBefore =org.threeten.bp.OffsetDateTime.of(2023, 05, 12, 0, 0, 0, 0, org.threeten.bp.ZoneOffset.ofHours(0));//financialEventGroupStartedAfter.plusMonths(1);
        String nextToken = null;
        ListFinancialEventGroupsResponse response = api.listFinancialEventGroups(maxResultsPerPage, financialEventGroupStartedBefore, financialEventGroupStartedAfter, nextToken);
        System.out.println(response.getPayload().getFinancialEventGroupList());
        //String json=JSON.toJSONString(response);
        //System.out.println(json);
        // TODO: test validations
    }

    /**
     *
     *
     * 返回指定数据范围的金融事件。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFinancialEventsTest() throws ApiException {
        Integer maxResultsPerPage = null;
        OffsetDateTime postedAfter =  org.threeten.bp.OffsetDateTime.now().plusMonths(-1);
        OffsetDateTime postedBefore = org.threeten.bp.OffsetDateTime.now().plusDays(-3);
        String nextToken = null;
        ListFinancialEventsResponse response = api.listFinancialEvents(maxResultsPerPage, postedAfter, postedBefore, nextToken);
        //System.out.println(response.getPayload().getFinancialEvents());
        System.out.println(JSON.toJSONString(response.getPayload()));
        // TODO: test validations
    }

    /**
     *
     *返回指定金融事件组的所有金融事件。
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFinancialEventsByGroupIdTest() throws ApiException {
        String eventGroupId ="KdWFB3ilW8Uh2EHKKojmeKoj7bU6QNyohy844qvl8o8";
        listFinancialEventsByGroupId(eventGroupId,null);
        // TODO: test validations
    }

    public void listFinancialEventsByGroupId(String eventGroupId,String nextToken) throws ApiException {
        ListFinancialEventsResponse response = api.listFinancialEventsByGroupId(eventGroupId, 100, null,null,nextToken);
        //System.out.println(response.getPayload());
        /*if (response.getPayload().getFinancialEvents()!=null &&response.getPayload().getFinancialEvents().getRefundEventList().size()>0){
            System.out.println(JSON.toJSONString(response.getPayload().getFinancialEvents().getRefundEventList()));
        }*/
        System.out.println(JSONUtil.toJsonStr(response.getPayload().getFinancialEvents()));
        /*if (response.getPayload().getNextToken() !=null){
            listFinancialEventsByGroupId(eventGroupId,response.getPayload().getNextToken() );
        }*/
        // TODO: test validations
    }

    /**
     *
     *
     * Returns all financial events for the specified order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFinancialEventsByOrderIdTest() throws ApiException {
        String orderId = "9274339433551";
        Integer maxResultsPerPage = null;
        String nextToken = null;
        ListFinancialEventsResponse response = api.listFinancialEventsByOrderId(orderId, maxResultsPerPage, nextToken);
        //System.out.println(response.getPayload());
        System.out.println(JSON.toJSONString(response.getPayload()));
        String pattern = "<e type=\"web\" href=\"(https?://[^\"]+)\">";
        // TODO: test validations
    }

}
