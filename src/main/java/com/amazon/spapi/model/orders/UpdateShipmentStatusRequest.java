/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The request body for the updateShipmentStatus operation.
 */
@ApiModel(description = "The request body for the updateShipmentStatus operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-10T10:27:36.694+08:00")
public class UpdateShipmentStatusRequest {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("shipmentStatus")
  private ShipmentStatus shipmentStatus = null;

  @SerializedName("orderItems")
  private OrderItems orderItems = null;

  public UpdateShipmentStatusRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Get marketplaceId
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public UpdateShipmentStatusRequest shipmentStatus(ShipmentStatus shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
    return this;
  }

   /**
   * Get shipmentStatus
   * @return shipmentStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public ShipmentStatus getShipmentStatus() {
    return shipmentStatus;
  }

  public void setShipmentStatus(ShipmentStatus shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

  public UpdateShipmentStatusRequest orderItems(OrderItems orderItems) {
    this.orderItems = orderItems;
    return this;
  }

   /**
   * Get orderItems
   * @return orderItems
  **/
  @ApiModelProperty(value = "")
  public OrderItems getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(OrderItems orderItems) {
    this.orderItems = orderItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateShipmentStatusRequest updateShipmentStatusRequest = (UpdateShipmentStatusRequest) o;
    return Objects.equals(this.marketplaceId, updateShipmentStatusRequest.marketplaceId) &&
        Objects.equals(this.shipmentStatus, updateShipmentStatusRequest.shipmentStatus) &&
        Objects.equals(this.orderItems, updateShipmentStatusRequest.orderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, shipmentStatus, orderItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShipmentStatusRequest {\n");

    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
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

