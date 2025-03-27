/*
 * The Selling Partner API for Finances
 * The Selling Partner API for Finances provides financial information relevant to a seller's business. You can obtain financial events for a given order or date range without having to wait until a statement period closes.
 *
 * OpenAPI spec version: 2024-06-19
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.transaction;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Additional information related to Amazon Pay.
 */
@ApiModel(description = "Additional information related to Amazon Pay.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-29T14:15:07.629+08:00")
public class AmazonPayContext {
  @SerializedName("storeName")
  private String storeName = null;

  @SerializedName("orderType")
  private String orderType = null;

  @SerializedName("channel")
  private String channel = null;

  public AmazonPayContext storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * The name of the store that is related to the transaction.
   * @return storeName
  **/
  @ApiModelProperty(value = "The name of the store that is related to the transaction.")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public AmazonPayContext orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * The transaction&#39;s order type.
   * @return orderType
  **/
  @ApiModelProperty(value = "The transaction's order type.")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public AmazonPayContext channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Channel details of related transaction.
   * @return channel
  **/
  @ApiModelProperty(value = "Channel details of related transaction.")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmazonPayContext amazonPayContext = (AmazonPayContext) o;
    return Objects.equals(this.storeName, amazonPayContext.storeName) &&
        Objects.equals(this.orderType, amazonPayContext.orderType) &&
        Objects.equals(this.channel, amazonPayContext.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeName, orderType, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonPayContext {\n");

    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

