/*
 * The Selling Partner API for Amazon Warehousing and Distribution
 * The Selling Partner API for Amazon Warehousing and Distribution (AWD) provides programmatic access to information about AWD shipments and inventory.
 *
 * OpenAPI spec version: 2024-05-09
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.awd;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AWD inventory payload.
 */
@ApiModel(description = "AWD inventory payload.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-12-13T16:08:01.615+08:00")
public class InventoryListing {
  @SerializedName("inventory")
  private List<InventorySummary> inventory = new ArrayList<InventorySummary>();

  @SerializedName("nextToken")
  private String nextToken = null;

  public InventoryListing inventory(List<InventorySummary> inventory) {
    this.inventory = inventory;
    return this;
  }

  public InventoryListing addInventoryItem(InventorySummary inventoryItem) {
    this.inventory.add(inventoryItem);
    return this;
  }

   /**
   * List of inventory summaries.
   * @return inventory
  **/
  @ApiModelProperty(required = true, value = "List of inventory summaries.")
  public List<InventorySummary> getInventory() {
    return inventory;
  }

  public void setInventory(List<InventorySummary> inventory) {
    this.inventory = inventory;
  }

  public InventoryListing nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Token to retrieve the next set of paginated results.
   * @return nextToken
  **/
  @ApiModelProperty(example = "SampleToken", value = "Token to retrieve the next set of paginated results.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryListing inventoryListing = (InventoryListing) o;
    return Objects.equals(this.inventory, inventoryListing.inventory) &&
        Objects.equals(this.nextToken, inventoryListing.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventory, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryListing {\n");

    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

