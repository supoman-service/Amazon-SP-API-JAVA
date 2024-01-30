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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The decimal value and unit.
 */
@ApiModel(description = "The decimal value and unit.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:17:36.166+08:00")
public class DecimalWithUnits {
  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("Units")
  private String units = null;

  public DecimalWithUnits value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The decimal value.
   * @return value
  **/
  @ApiModelProperty(value = "The decimal value.")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public DecimalWithUnits units(String units) {
    this.units = units;
    return this;
  }

   /**
   * The unit of the decimal value.
   * @return units
  **/
  @ApiModelProperty(value = "The unit of the decimal value.")
  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecimalWithUnits decimalWithUnits = (DecimalWithUnits) o;
    return Objects.equals(this.value, decimalWithUnits.value) &&
        Objects.equals(this.units, decimalWithUnits.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, units);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecimalWithUnits {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

