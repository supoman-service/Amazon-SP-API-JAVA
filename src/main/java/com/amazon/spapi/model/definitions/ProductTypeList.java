/*
 * Selling Partner API for Product Type Definitions
 * The Selling Partner API for Product Type Definitions provides programmatic access to attribute and data requirements for product types in the Amazon catalog. Use this API to return the JSON Schema for a product type that you can then use with other Selling Partner APIs, such as the Selling Partner API for Listings Items, the Selling Partner API for Catalog Items, and the Selling Partner API for Feeds (for JSON-based listing feeds).  For more information, see the [Product Type Definitions API Use Case Guide](doc:product-type-api-use-case-guide).
 *
 * OpenAPI spec version: 2020-09-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.definitions;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A list of Amazon product types with definitions available.
 */
@ApiModel(description = "A list of Amazon product types with definitions available.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:24:40.306+08:00")
public class ProductTypeList {
  @SerializedName("productTypes")
  private List<ProductType> productTypes = new ArrayList<ProductType>();

  @SerializedName("productTypeVersion")
  private String productTypeVersion = null;

  public ProductTypeList productTypes(List<ProductType> productTypes) {
    this.productTypes = productTypes;
    return this;
  }

  public ProductTypeList addProductTypesItem(ProductType productTypesItem) {
    this.productTypes.add(productTypesItem);
    return this;
  }

   /**
   * Get productTypes
   * @return productTypes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ProductType> getProductTypes() {
    return productTypes;
  }

  public void setProductTypes(List<ProductType> productTypes) {
    this.productTypes = productTypes;
  }

  public ProductTypeList productTypeVersion(String productTypeVersion) {
    this.productTypeVersion = productTypeVersion;
    return this;
  }

   /**
   * Amazon product type version identifier.
   * @return productTypeVersion
  **/
  @ApiModelProperty(required = true, value = "Amazon product type version identifier.")
  public String getProductTypeVersion() {
    return productTypeVersion;
  }

  public void setProductTypeVersion(String productTypeVersion) {
    this.productTypeVersion = productTypeVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTypeList productTypeList = (ProductTypeList) o;
    return Objects.equals(this.productTypes, productTypeList.productTypes) &&
        Objects.equals(this.productTypeVersion, productTypeList.productTypeVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTypes, productTypeVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTypeList {\n");

    sb.append("    productTypes: ").append(toIndentedString(productTypes)).append("\n");
    sb.append("    productTypeVersion: ").append(toIndentedString(productTypeVersion)).append("\n");
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

