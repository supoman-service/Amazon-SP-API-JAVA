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


package com.amazon.spapi.model.catalogitems;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.catalogitems.ShippingTimeType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QualifiersType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:17:36.166+08:00")
public class QualifiersType {
  @SerializedName("ItemCondition")
  private String itemCondition = null;

  @SerializedName("ItemSubcondition")
  private String itemSubcondition = null;

  @SerializedName("FulfillmentChannel")
  private String fulfillmentChannel = null;

  @SerializedName("ShipsDomestically")
  private String shipsDomestically = null;

  @SerializedName("ShippingTime")
  private ShippingTimeType shippingTime = null;

  @SerializedName("SellerPositiveFeedbackRating")
  private String sellerPositiveFeedbackRating = null;

  public QualifiersType itemCondition(String itemCondition) {
    this.itemCondition = itemCondition;
    return this;
  }

   /**
   * The condition of the item. Possible values: New, Used, Collectible, Refurbished, or Club.
   * @return itemCondition
  **/
  @ApiModelProperty(required = true, value = "The condition of the item. Possible values: New, Used, Collectible, Refurbished, or Club.")
  public String getItemCondition() {
    return itemCondition;
  }

  public void setItemCondition(String itemCondition) {
    this.itemCondition = itemCondition;
  }

  public QualifiersType itemSubcondition(String itemSubcondition) {
    this.itemSubcondition = itemSubcondition;
    return this;
  }

   /**
   * The item subcondition for the offer listing. Possible values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.
   * @return itemSubcondition
  **/
  @ApiModelProperty(required = true, value = "The item subcondition for the offer listing. Possible values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.")
  public String getItemSubcondition() {
    return itemSubcondition;
  }

  public void setItemSubcondition(String itemSubcondition) {
    this.itemSubcondition = itemSubcondition;
  }

  public QualifiersType fulfillmentChannel(String fulfillmentChannel) {
    this.fulfillmentChannel = fulfillmentChannel;
    return this;
  }

   /**
   * The fulfillment channel for the item. Possible values:  * Amazon - Fulfilled by Amazon. * Merchant - Fulfilled by the seller.
   * @return fulfillmentChannel
  **/
  @ApiModelProperty(required = true, value = "The fulfillment channel for the item. Possible values:  * Amazon - Fulfilled by Amazon. * Merchant - Fulfilled by the seller.")
  public String getFulfillmentChannel() {
    return fulfillmentChannel;
  }

  public void setFulfillmentChannel(String fulfillmentChannel) {
    this.fulfillmentChannel = fulfillmentChannel;
  }

  public QualifiersType shipsDomestically(String shipsDomestically) {
    this.shipsDomestically = shipsDomestically;
    return this;
  }

   /**
   * Indicates whether the marketplace specified in the request and the location that the item ships from are in the same country. Possible values: True, False, or Unknown.
   * @return shipsDomestically
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the marketplace specified in the request and the location that the item ships from are in the same country. Possible values: True, False, or Unknown.")
  public String getShipsDomestically() {
    return shipsDomestically;
  }

  public void setShipsDomestically(String shipsDomestically) {
    this.shipsDomestically = shipsDomestically;
  }

  public QualifiersType shippingTime(ShippingTimeType shippingTime) {
    this.shippingTime = shippingTime;
    return this;
  }

   /**
   * (0-2 days, 3-7 days, 8-13 days, or 14 or more days) – Indicates the maximum time within which the item will likely be shipped once an order has been placed.
   * @return shippingTime
  **/
  @ApiModelProperty(required = true, value = "(0-2 days, 3-7 days, 8-13 days, or 14 or more days) – Indicates the maximum time within which the item will likely be shipped once an order has been placed.")
  public ShippingTimeType getShippingTime() {
    return shippingTime;
  }

  public void setShippingTime(ShippingTimeType shippingTime) {
    this.shippingTime = shippingTime;
  }

  public QualifiersType sellerPositiveFeedbackRating(String sellerPositiveFeedbackRating) {
    this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
    return this;
  }

   /**
   * (98-100%, 95-97%, 90-94%, 80-89%, 70-79%, Less than 70%, or Just launched ) – Indicates the percentage of feedback ratings that were positive over the past 12 months.
   * @return sellerPositiveFeedbackRating
  **/
  @ApiModelProperty(required = true, value = "(98-100%, 95-97%, 90-94%, 80-89%, 70-79%, Less than 70%, or Just launched ) – Indicates the percentage of feedback ratings that were positive over the past 12 months.")
  public String getSellerPositiveFeedbackRating() {
    return sellerPositiveFeedbackRating;
  }

  public void setSellerPositiveFeedbackRating(String sellerPositiveFeedbackRating) {
    this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualifiersType qualifiersType = (QualifiersType) o;
    return Objects.equals(this.itemCondition, qualifiersType.itemCondition) &&
        Objects.equals(this.itemSubcondition, qualifiersType.itemSubcondition) &&
        Objects.equals(this.fulfillmentChannel, qualifiersType.fulfillmentChannel) &&
        Objects.equals(this.shipsDomestically, qualifiersType.shipsDomestically) &&
        Objects.equals(this.shippingTime, qualifiersType.shippingTime) &&
        Objects.equals(this.sellerPositiveFeedbackRating, qualifiersType.sellerPositiveFeedbackRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCondition, itemSubcondition, fulfillmentChannel, shipsDomestically, shippingTime, sellerPositiveFeedbackRating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualifiersType {\n");
    
    sb.append("    itemCondition: ").append(toIndentedString(itemCondition)).append("\n");
    sb.append("    itemSubcondition: ").append(toIndentedString(itemSubcondition)).append("\n");
    sb.append("    fulfillmentChannel: ").append(toIndentedString(fulfillmentChannel)).append("\n");
    sb.append("    shipsDomestically: ").append(toIndentedString(shipsDomestically)).append("\n");
    sb.append("    shippingTime: ").append(toIndentedString(shippingTime)).append("\n");
    sb.append("    sellerPositiveFeedbackRating: ").append(toIndentedString(sellerPositiveFeedbackRating)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

