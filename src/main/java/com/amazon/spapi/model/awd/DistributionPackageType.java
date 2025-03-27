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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Type of distribution packages.
 */
@JsonAdapter(DistributionPackageType.Adapter.class)
public enum DistributionPackageType {

  CASE("CASE"),

  PALLET("PALLET");

  private String value;

  DistributionPackageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DistributionPackageType fromValue(String text) {
    for (DistributionPackageType b : DistributionPackageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DistributionPackageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DistributionPackageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DistributionPackageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DistributionPackageType.fromValue(String.valueOf(value));
    }
  }
}

