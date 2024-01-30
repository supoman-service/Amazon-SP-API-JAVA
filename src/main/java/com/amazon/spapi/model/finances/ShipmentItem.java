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


package com.amazon.spapi.model.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * An item of a shipment, refund, guarantee claim, or chargeback.
 */
@ApiModel(description = "An item of a shipment, refund, guarantee claim, or chargeback.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-21T12:22:28.126+08:00")
public class ShipmentItem {
  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("OrderItemId")
  private String orderItemId = null;

  @SerializedName("OrderAdjustmentItemId")
  private String orderAdjustmentItemId = null;

  @SerializedName("QuantityShipped")
  private Integer quantityShipped = null;

  @SerializedName("ItemChargeList")
  private ChargeComponentList itemChargeList = null;

  @SerializedName("ItemChargeAdjustmentList")
  private ChargeComponentList itemChargeAdjustmentList = null;

  @SerializedName("ItemFeeList")
  private FeeComponentList itemFeeList = null;

  @SerializedName("ItemFeeAdjustmentList")
  private FeeComponentList itemFeeAdjustmentList = null;

  @SerializedName("ItemTaxWithheldList")
  private TaxWithheldComponentList itemTaxWithheldList = null;

  @SerializedName("PromotionList")
  private PromotionList promotionList = null;

  @SerializedName("PromotionAdjustmentList")
  private PromotionList promotionAdjustmentList = null;

  @SerializedName("CostOfPointsGranted")
  private Currency costOfPointsGranted = null;

  @SerializedName("CostOfPointsReturned")
  private Currency costOfPointsReturned = null;

  public ShipmentItem sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller SKU of the item. The seller SKU is qualified by the seller&#39;s seller ID, which is included with every call to the Selling Partner API.
   * @return sellerSKU
  **/
  @ApiModelProperty(value = "The seller SKU of the item. The seller SKU is qualified by the seller's seller ID, which is included with every call to the Selling Partner API.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }

  public ShipmentItem orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * An Amazon-defined order item identifier.
   * @return orderItemId
  **/
  @ApiModelProperty(value = "An Amazon-defined order item identifier.")
  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public ShipmentItem orderAdjustmentItemId(String orderAdjustmentItemId) {
    this.orderAdjustmentItemId = orderAdjustmentItemId;
    return this;
  }

   /**
   * An Amazon-defined order adjustment identifier defined for refunds, guarantee claims, and chargeback events.
   * @return orderAdjustmentItemId
  **/
  @ApiModelProperty(value = "An Amazon-defined order adjustment identifier defined for refunds, guarantee claims, and chargeback events.")
  public String getOrderAdjustmentItemId() {
    return orderAdjustmentItemId;
  }

  public void setOrderAdjustmentItemId(String orderAdjustmentItemId) {
    this.orderAdjustmentItemId = orderAdjustmentItemId;
  }

  public ShipmentItem quantityShipped(Integer quantityShipped) {
    this.quantityShipped = quantityShipped;
    return this;
  }

   /**
   * The number of items shipped.
   * @return quantityShipped
  **/
  @ApiModelProperty(value = "The number of items shipped.")
  public Integer getQuantityShipped() {
    return quantityShipped;
  }

  public void setQuantityShipped(Integer quantityShipped) {
    this.quantityShipped = quantityShipped;
  }

  public ShipmentItem itemChargeList(ChargeComponentList itemChargeList) {
    this.itemChargeList = itemChargeList;
    return this;
  }

   /**
   * A list of charges associated with the shipment item.
   * @return itemChargeList
  **/
  @ApiModelProperty(value = "A list of charges associated with the shipment item.")
  public ChargeComponentList getItemChargeList() {
    return itemChargeList;
  }

  public void setItemChargeList(ChargeComponentList itemChargeList) {
    this.itemChargeList = itemChargeList;
  }

  public ShipmentItem itemChargeAdjustmentList(ChargeComponentList itemChargeAdjustmentList) {
    this.itemChargeAdjustmentList = itemChargeAdjustmentList;
    return this;
  }

   /**
   * A list of charge adjustments associated with the shipment item. This value is only returned for refunds, guarantee claims, and chargeback events.
   * @return itemChargeAdjustmentList
  **/
  @ApiModelProperty(value = "A list of charge adjustments associated with the shipment item. This value is only returned for refunds, guarantee claims, and chargeback events.")
  public ChargeComponentList getItemChargeAdjustmentList() {
    return itemChargeAdjustmentList;
  }

  public void setItemChargeAdjustmentList(ChargeComponentList itemChargeAdjustmentList) {
    this.itemChargeAdjustmentList = itemChargeAdjustmentList;
  }

  public ShipmentItem itemFeeList(FeeComponentList itemFeeList) {
    this.itemFeeList = itemFeeList;
    return this;
  }

   /**
   * A list of fees associated with the shipment item.
   * @return itemFeeList
  **/
  @ApiModelProperty(value = "A list of fees associated with the shipment item.")
  public FeeComponentList getItemFeeList() {
    return itemFeeList;
  }

  public void setItemFeeList(FeeComponentList itemFeeList) {
    this.itemFeeList = itemFeeList;
  }

  public ShipmentItem itemFeeAdjustmentList(FeeComponentList itemFeeAdjustmentList) {
    this.itemFeeAdjustmentList = itemFeeAdjustmentList;
    return this;
  }

   /**
   * A list of fee adjustments associated with the shipment item. This value is only returned for refunds, guarantee claims, and chargeback events.
   * @return itemFeeAdjustmentList
  **/
  @ApiModelProperty(value = "A list of fee adjustments associated with the shipment item. This value is only returned for refunds, guarantee claims, and chargeback events.")
  public FeeComponentList getItemFeeAdjustmentList() {
    return itemFeeAdjustmentList;
  }

  public void setItemFeeAdjustmentList(FeeComponentList itemFeeAdjustmentList) {
    this.itemFeeAdjustmentList = itemFeeAdjustmentList;
  }

  public ShipmentItem itemTaxWithheldList(TaxWithheldComponentList itemTaxWithheldList) {
    this.itemTaxWithheldList = itemTaxWithheldList;
    return this;
  }

   /**
   * A list of taxes withheld information for a shipment item.
   * @return itemTaxWithheldList
  **/
  @ApiModelProperty(value = "A list of taxes withheld information for a shipment item.")
  public TaxWithheldComponentList getItemTaxWithheldList() {
    return itemTaxWithheldList;
  }

  public void setItemTaxWithheldList(TaxWithheldComponentList itemTaxWithheldList) {
    this.itemTaxWithheldList = itemTaxWithheldList;
  }

  public ShipmentItem promotionList(PromotionList promotionList) {
    this.promotionList = promotionList;
    return this;
  }

   /**
   * Get promotionList
   * @return promotionList
  **/
  @ApiModelProperty(value = "")
  public PromotionList getPromotionList() {
    return promotionList;
  }

  public void setPromotionList(PromotionList promotionList) {
    this.promotionList = promotionList;
  }

  public ShipmentItem promotionAdjustmentList(PromotionList promotionAdjustmentList) {
    this.promotionAdjustmentList = promotionAdjustmentList;
    return this;
  }

   /**
   * A list of promotion adjustments associated with the shipment item. This value is only returned for refunds, guarantee claims, and chargeback events.
   * @return promotionAdjustmentList
  **/
  @ApiModelProperty(value = "A list of promotion adjustments associated with the shipment item. This value is only returned for refunds, guarantee claims, and chargeback events.")
  public PromotionList getPromotionAdjustmentList() {
    return promotionAdjustmentList;
  }

  public void setPromotionAdjustmentList(PromotionList promotionAdjustmentList) {
    this.promotionAdjustmentList = promotionAdjustmentList;
  }

  public ShipmentItem costOfPointsGranted(Currency costOfPointsGranted) {
    this.costOfPointsGranted = costOfPointsGranted;
    return this;
  }

   /**
   * The cost of Amazon Points granted for a shipment item.
   * @return costOfPointsGranted
  **/
  @ApiModelProperty(value = "The cost of Amazon Points granted for a shipment item.")
  public Currency getCostOfPointsGranted() {
    return costOfPointsGranted;
  }

  public void setCostOfPointsGranted(Currency costOfPointsGranted) {
    this.costOfPointsGranted = costOfPointsGranted;
  }

  public ShipmentItem costOfPointsReturned(Currency costOfPointsReturned) {
    this.costOfPointsReturned = costOfPointsReturned;
    return this;
  }

   /**
   * The cost of Amazon Points returned for a shipment item. This value is only returned for refunds, guarantee claims, and chargeback events.
   * @return costOfPointsReturned
  **/
  @ApiModelProperty(value = "The cost of Amazon Points returned for a shipment item. This value is only returned for refunds, guarantee claims, and chargeback events.")
  public Currency getCostOfPointsReturned() {
    return costOfPointsReturned;
  }

  public void setCostOfPointsReturned(Currency costOfPointsReturned) {
    this.costOfPointsReturned = costOfPointsReturned;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentItem shipmentItem = (ShipmentItem) o;
    return Objects.equals(this.sellerSKU, shipmentItem.sellerSKU) &&
        Objects.equals(this.orderItemId, shipmentItem.orderItemId) &&
        Objects.equals(this.orderAdjustmentItemId, shipmentItem.orderAdjustmentItemId) &&
        Objects.equals(this.quantityShipped, shipmentItem.quantityShipped) &&
        Objects.equals(this.itemChargeList, shipmentItem.itemChargeList) &&
        Objects.equals(this.itemChargeAdjustmentList, shipmentItem.itemChargeAdjustmentList) &&
        Objects.equals(this.itemFeeList, shipmentItem.itemFeeList) &&
        Objects.equals(this.itemFeeAdjustmentList, shipmentItem.itemFeeAdjustmentList) &&
        Objects.equals(this.itemTaxWithheldList, shipmentItem.itemTaxWithheldList) &&
        Objects.equals(this.promotionList, shipmentItem.promotionList) &&
        Objects.equals(this.promotionAdjustmentList, shipmentItem.promotionAdjustmentList) &&
        Objects.equals(this.costOfPointsGranted, shipmentItem.costOfPointsGranted) &&
        Objects.equals(this.costOfPointsReturned, shipmentItem.costOfPointsReturned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSKU, orderItemId, orderAdjustmentItemId, quantityShipped, itemChargeList, itemChargeAdjustmentList, itemFeeList, itemFeeAdjustmentList, itemTaxWithheldList, promotionList, promotionAdjustmentList, costOfPointsGranted, costOfPointsReturned);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentItem {\n");

    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    orderAdjustmentItemId: ").append(toIndentedString(orderAdjustmentItemId)).append("\n");
    sb.append("    quantityShipped: ").append(toIndentedString(quantityShipped)).append("\n");
    sb.append("    itemChargeList: ").append(toIndentedString(itemChargeList)).append("\n");
    sb.append("    itemChargeAdjustmentList: ").append(toIndentedString(itemChargeAdjustmentList)).append("\n");
    sb.append("    itemFeeList: ").append(toIndentedString(itemFeeList)).append("\n");
    sb.append("    itemFeeAdjustmentList: ").append(toIndentedString(itemFeeAdjustmentList)).append("\n");
    sb.append("    itemTaxWithheldList: ").append(toIndentedString(itemTaxWithheldList)).append("\n");
    sb.append("    promotionList: ").append(toIndentedString(promotionList)).append("\n");
    sb.append("    promotionAdjustmentList: ").append(toIndentedString(promotionAdjustmentList)).append("\n");
    sb.append("    costOfPointsGranted: ").append(toIndentedString(costOfPointsGranted)).append("\n");
    sb.append("    costOfPointsReturned: ").append(toIndentedString(costOfPointsReturned)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

