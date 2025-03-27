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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The response schema for the &#x60;getListingOffers&#x60; and &#x60;getItemOffers&#x60; operations.
 */
@ApiModel(description = "The response schema for the `getListingOffers` and `getItemOffers` operations.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-30T12:29:48.923+08:00")
public class GetOffersResponse {
  @SerializedName("payload")
  private GetOffersResult payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetOffersResponse payload(GetOffersResult payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the &#x60;getListingOffers&#x60; and &#x60;getItemOffers&#x60; operations.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the `getListingOffers` and `getItemOffers` operations.")
  public GetOffersResult getPayload() {
    return payload;
  }

  public void setPayload(GetOffersResult payload) {
    this.payload = payload;
  }

  public GetOffersResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
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
    GetOffersResponse getOffersResponse = (GetOffersResponse) o;
    return Objects.equals(this.payload, getOffersResponse.payload) &&
        Objects.equals(this.errors, getOffersResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOffersResponse {\n");

    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

