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
 * The number of Amazon Points offered with the purchase of an item, and their monetary value.
 */
@ApiModel(description = "The number of Amazon Points offered with the purchase of an item, and their monetary value.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-10T10:27:36.694+08:00")
public class PointsGrantedDetail {
  @SerializedName("PointsNumber")
  private Integer pointsNumber = null;

  @SerializedName("PointsMonetaryValue")
  private Money pointsMonetaryValue = null;

  public PointsGrantedDetail pointsNumber(Integer pointsNumber) {
    this.pointsNumber = pointsNumber;
    return this;
  }

   /**
   * The number of Amazon Points granted with the purchase of an item.
   * @return pointsNumber
  **/
  @ApiModelProperty(value = "The number of Amazon Points granted with the purchase of an item.")
  public Integer getPointsNumber() {
    return pointsNumber;
  }

  public void setPointsNumber(Integer pointsNumber) {
    this.pointsNumber = pointsNumber;
  }

  public PointsGrantedDetail pointsMonetaryValue(Money pointsMonetaryValue) {
    this.pointsMonetaryValue = pointsMonetaryValue;
    return this;
  }

   /**
   * The monetary value of the Amazon Points granted.
   * @return pointsMonetaryValue
  **/
  @ApiModelProperty(value = "The monetary value of the Amazon Points granted.")
  public Money getPointsMonetaryValue() {
    return pointsMonetaryValue;
  }

  public void setPointsMonetaryValue(Money pointsMonetaryValue) {
    this.pointsMonetaryValue = pointsMonetaryValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointsGrantedDetail pointsGrantedDetail = (PointsGrantedDetail) o;
    return Objects.equals(this.pointsNumber, pointsGrantedDetail.pointsNumber) &&
        Objects.equals(this.pointsMonetaryValue, pointsGrantedDetail.pointsMonetaryValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointsNumber, pointsMonetaryValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointsGrantedDetail {\n");

    sb.append("    pointsNumber: ").append(toIndentedString(pointsNumber)).append("\n");
    sb.append("    pointsMonetaryValue: ").append(toIndentedString(pointsMonetaryValue)).append("\n");
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

