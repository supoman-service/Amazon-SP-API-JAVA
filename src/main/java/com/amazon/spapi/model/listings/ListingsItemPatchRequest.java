/*
 * Selling Partner API for Listings Items
 * The Selling Partner API for Listings Items (Listings Items API) provides programmatic access to selling partner listings on Amazon. Use this API in collaboration with the Selling Partner API for Product Type Definitions, which you use to retrieve the information about Amazon product types needed to use the Listings Items API.  For more information, see the [Listings Items API Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/listings-items-api-v2021-08-01-use-case-guide).
 *
 * OpenAPI spec version: 2021-08-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.listings;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.amazon.spapi.model.listings.PatchOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The request body schema for the &#x60;patchListingsItem&#x60; operation.
 */
@ApiModel(description = "The request body schema for the `patchListingsItem` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-12-19T17:08:06.914+08:00")
public class ListingsItemPatchRequest {
  @SerializedName("productType")
  private String productType = null;

  @SerializedName("patches")
  private List<PatchOperation> patches = new ArrayList<PatchOperation>();

  public ListingsItemPatchRequest productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * The Amazon product type of the listings item.
   * @return productType
  **/
  @ApiModelProperty(required = true, value = "The Amazon product type of the listings item.")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ListingsItemPatchRequest patches(List<PatchOperation> patches) {
    this.patches = patches;
    return this;
  }

  public ListingsItemPatchRequest addPatchesItem(PatchOperation patchesItem) {
    this.patches.add(patchesItem);
    return this;
  }

   /**
   * One or more JSON Patch operations to perform on the listings item.
   * @return patches
  **/
  @ApiModelProperty(required = true, value = "One or more JSON Patch operations to perform on the listings item.")
  public List<PatchOperation> getPatches() {
    return patches;
  }

  public void setPatches(List<PatchOperation> patches) {
    this.patches = patches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingsItemPatchRequest listingsItemPatchRequest = (ListingsItemPatchRequest) o;
    return Objects.equals(this.productType, listingsItemPatchRequest.productType) &&
        Objects.equals(this.patches, listingsItemPatchRequest.patches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productType, patches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingsItemPatchRequest {\n");

    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    patches: ").append(toIndentedString(patches)).append("\n");
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

