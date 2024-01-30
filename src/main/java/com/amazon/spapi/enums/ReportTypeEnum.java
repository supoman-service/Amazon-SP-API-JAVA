package com.amazon.spapi.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import lombok.Getter;

import java.io.IOException;

/**
 * @author: supoman
 * @description: 报告类型枚举类,仅供测试调试用
 * @date: 2024/01/29
 */
@JsonAdapter(ReportTypeEnum.Adapter.class)
public enum ReportTypeEnum {
    //实时更新
    GET_AFN_INVENTORY_DATA("GET_AFN_INVENTORY_DATA","Amazon Fulfilled Inventory","亚马逊库存","每天"),
    //实时更新
    GET_AFN_INVENTORY_DATA_BY_COUNTRY("GET_AFN_INVENTORY_DATA_BY_COUNTRY","Multi-Country Inventory","欧洲库存","每天"),
    //实时更新
    GET_EXCESS_INVENTORY_DATA("GET_EXCESS_INVENTORY_DATA","Excess inventory","冗余库存报告","每月"),
    //内容至少每 72 小时更新一次
    GET_FBA_ESTIMATED_FBA_FEES_TXT_DATA("GET_FBA_ESTIMATED_FBA_FEES_TXT_DATA","Fee Preview","费用预览","每天"),
    //内容每日更新
    GET_FBA_FULFILLMENT_CUSTOMER_RETURNS_DATA("GET_FBA_FULFILLMENT_CUSTOMER_RETURNS_DATA","FBA customer returns","亚马逊物流买家退货","每月"),
    //实时更新，从订单发货到配送订单中的商品出现在报告中之间会有大约1-3小时的延迟。在极少数情况下，可能会延迟长达24小时。
    GET_FBA_FULFILLMENT_CUSTOMER_SHIPMENT_SALES_DATA("GET_FBA_FULFILLMENT_CUSTOMER_SHIPMENT_SALES_DATA","Customer Shipment Sales","亚马逊物流买家货件销售报告","每天"),
    //内容每日更新
    GET_FBA_FULFILLMENT_INVENTORY_HEALTH_DATA("GET_FBA_FULFILLMENT_INVENTORY_HEALTH_DATA","Inventory health","库存健康报告","每月"),
    //内容每日更新
    GET_FBA_FULFILLMENT_INVENTORY_RECEIPTS_DATA("GET_FBA_FULFILLMENT_INVENTORY_RECEIPTS_DATA","Received inventory","接收库存报告","每天"),
    GET_FBA_FULFILLMENT_LONGTERM_STORAGE_FEE_CHARGES_DATA("GET_FBA_FULFILLMENT_LONGTERM_STORAGE_FEE_CHARGES_DATA","Long Term Storage Fee Charges","长期仓储费","每月"),
    //内容每日更新
    GET_FBA_FULFILLMENT_MONTHLY_INVENTORY_DATA("GET_FBA_FULFILLMENT_MONTHLY_INVENTORY_DATA","Monthly inventory history","月度库存报告","每月"),
    //内容近乎实时更新
    GET_FBA_FULFILLMENT_REMOVAL_ORDER_DETAIL_DATA("GET_FBA_FULFILLMENT_REMOVAL_ORDER_DETAIL_DATA","Removal Order Detail","移除订单详情报告","每月"),
    //内容每日更新
    GET_FBA_INVENTORY_AGED_DATA("GET_FBA_INVENTORY_AGED_DATA","Inventory Age","库龄报告","每天"),
    //内容近乎实时更新
    GET_FBA_MYI_UNSUPPRESSED_INVENTORY_DATA("GET_FBA_MYI_UNSUPPRESSED_INVENTORY_DATA","Manage FBA Inventory","管理亚马逊库存/亚马逊来货","每天"),
    //内容每日更新
    GET_FBA_REIMBURSEMENTS_DATA("GET_FBA_REIMBURSEMENTS_DATA","Reimbursements","赔偿报告","每月"),
    //亚马逊运营中心内卖家库存的每个 ASIN 的估计每月库存仓储费
    GET_FBA_STORAGE_FEE_CHARGES_DATA("GET_FBA_STORAGE_FEE_CHARGES_DATA","Monthly Storage Fees","月储存费用","每月"),
    //可以在单个报告中请求最多 60 天的数据
    GET_FLAT_FILE_RETURNS_DATA_BY_RETURN_DATE("GET_FLAT_FILE_RETURNS_DATA_BY_RETURN_DATE","Seller Fulfilled Return Reports","销售退货报告","每周"),
    GET_MERCHANT_LISTINGS_ALL_DATA("GET_MERCHANT_LISTINGS_ALL_DATA","All Listings Report","所有商品的信息","每天"),
    GET_MERCHANT_LISTINGS_DATA("GET_MERCHANT_LISTINGS_DATA","Active Listings Report","在售商品报告","每天"),
    //内容近乎实时更新
    GET_RESTOCK_INVENTORY_RECOMMENDATIONS_REPORT("GET_RESTOCK_INVENTORY_RECOMMENDATIONS_REPORT","Restock Inventory","补货报告","每天"),
    GET_SELLER_FEEDBACK_DATA("GET_SELLER_FEEDBACK_DATA","Flat File Feedback","卖家的负面和中性反馈","每天"),
    //亚马逊物流滞留库存报告，内容近乎实时更新
    GET_STRANDED_INVENTORY_UI_DATA("GET_STRANDED_INVENTORY_UI_DATA","Stranded Inventory","红字库存","每周"),
    //不能自主创建报告，由亚马逊自动生成报告，使用getReports查询报告
    GET_V2_SETTLEMENT_REPORT_DATA_FLAT_FILE("GET_V2_SETTLEMENT_REPORT_DATA_FLAT_FILE","Flat_File_Settlement_Report","结算报告","每周"),
    //不能自主创建报告，由亚马逊自动生成报告，使用getReports查询报告
    GET_V2_SETTLEMENT_REPORT_DATA_FLAT_FILE_V2("GET_V2_SETTLEMENT_REPORT_DATA_FLAT_FILE_V2","Flat_File_V2_Settlement_Report","结算报告","每周"),
    //此报告仅适用于德国、西班牙、意大利、法国和英国市场
    GET_VAT_TRANSACTION_DATA("GET_VAT_TRANSACTION_DATA","Amazon VAT Transactions Report","亚马逊增值税交易报告","每月"),
    GET_XML_ALL_ORDERS_DATA_BY_LAST_UPDATE("GET_XML_ALL_ORDERS_DATA_BY_LAST_UPDATE","XML Orders By Last Update Report","所有订单","每天"),
    //最多可以在一份报告中请求一个月的数据，欧洲 (EU)、日本和北美 (NA) 的内容近乎实时更新
    GET_AMAZON_FULFILLED_SHIPMENTS_DATA_GENERAL("GET_AMAZON_FULFILLED_SHIPMENTS_DATA_GENERAL","Amazon Fulfilled Shipments","亚马逊配送货件","每天"),
    //XML 报告显示在指定时间段内更新的所有订单
    GET_XML_ALL_ORDERS_DATA_BY_LAST_UPDATE_GENERAL("GET_XML_ALL_ORDERS_DATA_BY_LAST_UPDATE_GENERAL","ALL Orders By Last Update Report","所有订单","每天"),
    //亚马逊物流库存调整报告
    GET_FBA_FULFILLMENT_INVENTORY_ADJUSTMENTS_DATA("GET_FBA_FULFILLMENT_INVENTORY_ADJUSTMENTS_DATA","ADJUSTMENTS_DATA","亚马逊物流库存调整报告","每天"),
    GET_FLAT_FILE_OFFAMAZONPAYMENTS_SANDBOX_SETTLEMENT_DATA("GET_FLAT_FILE_OFFAMAZONPAYMENTS_SANDBOX_SETTLEMENT_DATA","AmazonPay","AmazonPay 沙盒结算报告","每周"),
    GET_FLAT_FILE_OPEN_LISTINGS_DATA("GET_FLAT_FILE_OPEN_LISTINGS_DATA","","",""),
    GET_FLAT_FILE_ACTIONABLE_ORDER_DATA_SHIPPING("GET_FLAT_FILE_ACTIONABLE_ORDER_DATA_SHIPPING","","",""),
    GET_V1_SELLER_PERFORMANCE_REPORT("GET_V1_SELLER_PERFORMANCE_REPORT","卖方中心仪表板的选择的个人绩效指标数据","XML 客户指标报告",""),
    //包含来自卖方中心账户健康仪表板的个人绩效指标数据的报告
    GET_V2_SELLER_PERFORMANCE_REPORT("GET_V2_SELLER_PERFORMANCE_REPORT","卖家绩效报告","包含来自卖方中心账户健康仪表板的个人绩效指标数据的报告",""),
    GET_BRAND_ANALYTICS_SEARCH_TERMS_REPORT("GET_BRAND_ANALYTICS_SEARCH_TERMS_REPORT","搜索关键词","Search Terms Report返回数据包括根据搜索关键词和各个站点品类下，点击和转化共享数据的Top3ASIN，以及各个搜索关键词的相对搜索频率排名。提供不同维度的返回数据包括：DAY, WEEK, MONTH, QUARTER",""),
    GET_VENDOR_NET_PURE_PRODUCT_MARGIN_REPORT("GET_VENDOR_NET_PURE_PRODUCT_MARGIN_REPORT","净纯产品利润率报告","净纯产品利润率报告",""),
    GET_FBA_INVENTORY_PLANNING_DATA("GET_FBA_INVENTORY_PLANNING_DATA","FBA Manage Inventory Health Report","FBA Manage Inventory Health Report",""),
    GET_FBA_FULFILLMENT_REMOVAL_SHIPMENT_DETAIL_DATA("GET_FBA_FULFILLMENT_REMOVAL_SHIPMENT_DETAIL_DATA","FBA Removal Shipment Detail Report","移除货件详情","每天"),
    GET_SALES_AND_TRAFFIC_REPORT("GET_SALES_AND_TRAFFIC_REPORT","Sales and Traffic Business Report","流量报告",""),
    GET_DATE_RANGE_FINANCIAL_SUMMARY_DATA("GET_DATE_RANGE_FINANCIAL_SUMMARY_DATA","Date Range TRANSACTION Report","日期范围报告",""),
    GET_EPR_MONTHLY_REPORTS("GET_EPR_MONTHLY_REPORTS","EPR Month","EPR Month",""),
    GET_DATE_RANGE_FINANCIAL_TRANSACTION_DATA("GET_DATE_RANGE_FINANCIAL_TRANSACTION_DATA","Date Range","Date Range",""),
    GET_LEDGER_DETAIL_VIEW_DATA("GET_LEDGER_DETAIL_VIEW_DATA","","",""),
    GET_LEDGER_SUMMARY_VIEW_DATA ("GET_LEDGER_SUMMARY_VIEW_DATA","","",""),
    GET_PRODUCT_EXCHANGE_DATA("GET_PRODUCT_EXCHANGE_DATA","","",""),

    GET_FLAT_FILE_ALL_ORDERS_DATA_BY_LAST_UPDATE_GENERAL("GET_FLAT_FILE_ALL_ORDERS_DATA_BY_LAST_UPDATE_GENERAL","订单报告"),
    GET_FBA_OVERAGE_FEE_CHARGES_DATA("GET_FBA_OVERAGE_FEE_CHARGES_DATA"),
    GET_FBA_FULFILLMENT_INVENTORY_SUMMARY_DATA("GET_FBA_FULFILLMENT_INVENTORY_SUMMARY_DATA"),
    GET_FLAT_FILE_PENDING_ORDERS_DATA("GET_FLAT_FILE_PENDING_ORDERS_DATA","","",""),
    GET_CONVERGED_FLAT_FILE_PENDING_ORDERS_DATA("GET_CONVERGED_FLAT_FILE_PENDING_ORDERS_DATA"),
    GET_FLAT_FILE_ARCHIVED_ORDERS_DATA_BY_ORDER_DATE("GET_FLAT_FILE_ARCHIVED_ORDERS_DATA_BY_ORDER_DATE"),
    GET_FBA_FULFILLMENT_CURRENT_INVENTORY_DATA("GET_FBA_FULFILLMENT_CURRENT_INVENTORY_DATA","","亚马逊物流每日库存历史报告",""),
    GET_FBA_SNS_FORECAST_DATA("GET_FBA_SNS_FORECAST_DATA","预测报告"),
    GET_B2B_PRODUCT_OPPORTUNITIES_RECOMMENDED_FOR_YOU("GET_B2B_PRODUCT_OPPORTUNITIES_RECOMMENDED_FOR_YOU","B2B商品推荐报告"),
    GET_FBA_FULFILLMENT_CUSTOMER_SHIPMENT_REPLACEMENT_DATA("GET_FBA_FULFILLMENT_CUSTOMER_SHIPMENT_REPLACEMENT_DATA","FBA更换报告"),

    GET_XML_BROWSE_TREE_DATA("GET_XML_BROWSE_TREE_DATA"),
    //pii 获取订单报告数据运输
    GET_FLAT_FILE_ORDER_REPORT_DATA_TAX("GET_FLAT_FILE_ORDER_REPORT_DATA_TAX"),
    GET_AMAZON_FULFILLED_SHIPMENTS_DATA_TAX("GET_AMAZON_FULFILLED_SHIPMENTS_DATA_TAX"),
    GET_ORDER_REPORT_DATA_SHIPPING("GET_ORDER_REPORT_DATA_SHIPPING",""),
    GET_FLAT_FILE_ORDER_REPORT_DATA_SHIPPING("GET_FLAT_FILE_ORDER_REPORT_DATA_SHIPPING"),
    GET_GST_MTR_B2B_CUSTOM("GET_GST_MTR_B2B_CUSTOM"),
    GET_V2_SETTLEMENT_REPORT_DATA_XML("GET_V2_SETTLEMENT_REPORT_DATA_XML"),
    GET_FLAT_FILE_SALES_TAX_DATA("GET_FLAT_FILE_SALES_TAX_DATA"),
    RFQD_BULK_DOWNLOAD("RFQD_BULK_DOWNLOAD"),
    FEE_DISCOUNTS_REPORT("FEE_DISCOUNTS_REPORT")
    ;
    /**
     * 报告类型
     */
    private String value;

    /**
     * 报告英文名称
     */
    private String reportTypeEN;

    /**
     * 报告中文名称value
     */
    private String reportTypeCN;

    /**
     * 报告下载周期
     */
    private String reportCycle;
    ReportTypeEnum(String value){
        this.value = value;
        this.reportTypeEN = "";
        this.reportTypeCN = "";
        this.reportCycle = "";
    }
    ReportTypeEnum(String value,String reportTypeCN){
        this.value = value;
        this.reportTypeEN = "";
        this.reportTypeCN = reportTypeCN;
        this.reportCycle = "";
    }

    ReportTypeEnum(String value, String reportTypeEN, String reportTypeCN, String reportCycle){
        this.value = value;
        this.reportTypeEN = reportTypeEN;
        this.reportTypeCN = reportTypeCN;
        this.reportCycle = reportCycle;
    }

    public String getValue() {
        return value;
    }

    public String getReportTypeEN() {
        return reportTypeEN;
    }

    public String getReportTypeCN() {
        return reportTypeCN;
    }

    public String getReportCycle() {
        return reportCycle;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportTypeEnum fromValue(String reportType) {
        for (ReportTypeEnum b : ReportTypeEnum.values()) {
            if (String.valueOf(b.value).equals(reportType)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<ReportTypeEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReportTypeEnum enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReportTypeEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReportTypeEnum.fromValue(String.valueOf(value));
        }
    }
}
