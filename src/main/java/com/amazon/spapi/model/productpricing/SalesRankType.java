/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.productpricing;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * SalesRankType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-30T12:29:48.923+08:00")
public class SalesRankType {
  @SerializedName("ProductCategoryId")
  private String productCategoryId = null;

  @SerializedName("Rank")
  private Integer rank = null;

  public SalesRankType productCategoryId(String productCategoryId) {
    this.productCategoryId = productCategoryId;
    return this;
  }

   /**
   *  Identifies the item category from which the sales rank is taken.
   * @return productCategoryId
  **/
  @ApiModelProperty(required = true, value = " Identifies the item category from which the sales rank is taken.")
  public String getProductCategoryId() {
    return productCategoryId;
  }

  public void setProductCategoryId(String productCategoryId) {
    this.productCategoryId = productCategoryId;
  }

  public SalesRankType rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * The sales rank of the item within the item category.
   * @return rank
  **/
  @ApiModelProperty(required = true, value = "The sales rank of the item within the item category.")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesRankType salesRankType = (SalesRankType) o;
    return Objects.equals(this.productCategoryId, salesRankType.productCategoryId) &&
        Objects.equals(this.rank, salesRankType.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCategoryId, rank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesRankType {\n");

    sb.append("    productCategoryId: ").append(toIndentedString(productCategoryId)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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

