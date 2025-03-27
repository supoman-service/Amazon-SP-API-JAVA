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


import java.util.Objects;

/**
 * Represents the volume of the package with a unit of measurement.
 */
@ApiModel(description = "Represents the volume of the package with a unit of measurement.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-12-13T16:08:01.615+08:00")
public class PackageVolume {
  @SerializedName("unitOfMeasurement")
  private VolumeUnitOfMeasurement unitOfMeasurement = null;

  @SerializedName("volume")
  private Double volume = null;

  public PackageVolume unitOfMeasurement(VolumeUnitOfMeasurement unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
    return this;
  }

   /**
   * Unit of measurement for the package volume.
   * @return unitOfMeasurement
  **/
  @ApiModelProperty(required = true, value = "Unit of measurement for the package volume.")
  public VolumeUnitOfMeasurement getUnitOfMeasurement() {
    return unitOfMeasurement;
  }

  public void setUnitOfMeasurement(VolumeUnitOfMeasurement unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
  }

  public PackageVolume volume(Double volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The package volume value.
   * @return volume
  **/
  @ApiModelProperty(required = true, value = "The package volume value.")
  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageVolume packageVolume = (PackageVolume) o;
    return Objects.equals(this.unitOfMeasurement, packageVolume.unitOfMeasurement) &&
        Objects.equals(this.volume, packageVolume.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitOfMeasurement, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageVolume {\n");

    sb.append("    unitOfMeasurement: ").append(toIndentedString(unitOfMeasurement)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

