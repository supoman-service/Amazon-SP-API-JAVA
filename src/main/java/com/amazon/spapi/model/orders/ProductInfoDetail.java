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
 * Product information on the number of items.
 */
@ApiModel(description = "Product information on the number of items.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-10T10:27:36.694+08:00")
public class ProductInfoDetail {
  @SerializedName("NumberOfItems")
  private Integer numberOfItems = null;

  public ProductInfoDetail numberOfItems(Integer numberOfItems) {
    this.numberOfItems = numberOfItems;
    return this;
  }

   /**
   * The total number of items that are included in the ASIN.
   * @return numberOfItems
  **/
  @ApiModelProperty(value = "The total number of items that are included in the ASIN.")
  public Integer getNumberOfItems() {
    return numberOfItems;
  }

  public void setNumberOfItems(Integer numberOfItems) {
    this.numberOfItems = numberOfItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInfoDetail productInfoDetail = (ProductInfoDetail) o;
    return Objects.equals(this.numberOfItems, productInfoDetail.numberOfItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInfoDetail {\n");

    sb.append("    numberOfItems: ").append(toIndentedString(numberOfItems)).append("\n");
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

