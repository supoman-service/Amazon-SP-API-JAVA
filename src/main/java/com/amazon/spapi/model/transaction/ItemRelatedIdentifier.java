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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * Related business identifiers of the item.
 */
@ApiModel(description = "Related business identifiers of the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-29T14:15:07.629+08:00")
public class ItemRelatedIdentifier {
  /**
   * Enumerated set of related item identifier names for the item.
   */
  @JsonAdapter(ItemRelatedIdentifierNameEnum.Adapter.class)
  public enum ItemRelatedIdentifierNameEnum {
    ORDER_ADJUSTMENT_ITEM_ID("ORDER_ADJUSTMENT_ITEM_ID"),

    COUPON_ID("COUPON_ID"),

    REMOVAL_SHIPMENT_ITEM_ID("REMOVAL_SHIPMENT_ITEM_ID"),

    TRANSACTION_ID("TRANSACTION_ID");

    private String value;

    ItemRelatedIdentifierNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ItemRelatedIdentifierNameEnum fromValue(String text) {
      for (ItemRelatedIdentifierNameEnum b : ItemRelatedIdentifierNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ItemRelatedIdentifierNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ItemRelatedIdentifierNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ItemRelatedIdentifierNameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ItemRelatedIdentifierNameEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("itemRelatedIdentifierName")
  private ItemRelatedIdentifierNameEnum itemRelatedIdentifierName = null;

  @SerializedName("itemRelatedIdentifierValue")
  private String itemRelatedIdentifierValue = null;

  public ItemRelatedIdentifier itemRelatedIdentifierName(ItemRelatedIdentifierNameEnum itemRelatedIdentifierName) {
    this.itemRelatedIdentifierName = itemRelatedIdentifierName;
    return this;
  }

   /**
   * Enumerated set of related item identifier names for the item.
   * @return itemRelatedIdentifierName
  **/
  @ApiModelProperty(value = "Enumerated set of related item identifier names for the item.")
  public ItemRelatedIdentifierNameEnum getItemRelatedIdentifierName() {
    return itemRelatedIdentifierName;
  }

  public void setItemRelatedIdentifierName(ItemRelatedIdentifierNameEnum itemRelatedIdentifierName) {
    this.itemRelatedIdentifierName = itemRelatedIdentifierName;
  }

  public ItemRelatedIdentifier itemRelatedIdentifierValue(String itemRelatedIdentifierValue) {
    this.itemRelatedIdentifierValue = itemRelatedIdentifierValue;
    return this;
  }

   /**
   * Corresponding value to &#x60;ItemRelatedIdentifierName&#x60;.
   * @return itemRelatedIdentifierValue
  **/
  @ApiModelProperty(value = "Corresponding value to `ItemRelatedIdentifierName`.")
  public String getItemRelatedIdentifierValue() {
    return itemRelatedIdentifierValue;
  }

  public void setItemRelatedIdentifierValue(String itemRelatedIdentifierValue) {
    this.itemRelatedIdentifierValue = itemRelatedIdentifierValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemRelatedIdentifier itemRelatedIdentifier = (ItemRelatedIdentifier) o;
    return Objects.equals(this.itemRelatedIdentifierName, itemRelatedIdentifier.itemRelatedIdentifierName) &&
        Objects.equals(this.itemRelatedIdentifierValue, itemRelatedIdentifier.itemRelatedIdentifierValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemRelatedIdentifierName, itemRelatedIdentifierValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemRelatedIdentifier {\n");

    sb.append("    itemRelatedIdentifierName: ").append(toIndentedString(itemRelatedIdentifierName)).append("\n");
    sb.append("    itemRelatedIdentifierValue: ").append(toIndentedString(itemRelatedIdentifierValue)).append("\n");
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

