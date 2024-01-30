/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ValidateContentDocumentAsinRelationsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-13T15:02:00.299+08:00")
public class ValidateContentDocumentAsinRelationsResponse {
  @SerializedName("warnings")
  private MessageSet warnings = null;

  @SerializedName("errors")
  private List<java.lang.Error> errors = new ArrayList<java.lang.Error>();

  public ValidateContentDocumentAsinRelationsResponse warnings(MessageSet warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(value = "")
  public MessageSet getWarnings() {
    return warnings;
  }

  public void setWarnings(MessageSet warnings) {
    this.warnings = warnings;
  }

  public ValidateContentDocumentAsinRelationsResponse errors(List<java.lang.Error> errors) {
    this.errors = errors;
    return this;
  }

  public ValidateContentDocumentAsinRelationsResponse addErrorsItem(java.lang.Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * A list of error responses returned when a request is unsuccessful.
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "A list of error responses returned when a request is unsuccessful.")
  public List<java.lang.Error> getErrors() {
    return errors;
  }

  public void setErrors(List<java.lang.Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateContentDocumentAsinRelationsResponse validateContentDocumentAsinRelationsResponse = (ValidateContentDocumentAsinRelationsResponse) o;
    return Objects.equals(this.warnings, validateContentDocumentAsinRelationsResponse.warnings) &&
        Objects.equals(this.errors, validateContentDocumentAsinRelationsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warnings, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateContentDocumentAsinRelationsResponse {\n");

    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

