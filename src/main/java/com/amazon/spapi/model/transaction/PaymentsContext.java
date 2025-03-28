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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Additional information related to payments-related transactions.
 */
@ApiModel(description = "Additional information related to payments-related transactions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-29T14:15:07.629+08:00")
public class PaymentsContext {
  @SerializedName("paymentType")
  private String paymentType = null;

  @SerializedName("paymentMethod")
  private String paymentMethod = null;

  @SerializedName("paymentReference")
  private String paymentReference = null;

  @SerializedName("paymentDate")
  private String paymentDate = null;

  public PaymentsContext paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * The type of payment.
   * @return paymentType
  **/
  @ApiModelProperty(value = "The type of payment.")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentsContext paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The method of payment.
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "The method of payment.")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentsContext paymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

   /**
   * The reference number of the payment.
   * @return paymentReference
  **/
  @ApiModelProperty(value = "The reference number of the payment.")
  public String getPaymentReference() {
    return paymentReference;
  }

  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }

  public PaymentsContext paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * The date of the payment.
   * @return paymentDate
  **/
  @ApiModelProperty(value = "The date of the payment.")
  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsContext paymentsContext = (PaymentsContext) o;
    return Objects.equals(this.paymentType, paymentsContext.paymentType) &&
        Objects.equals(this.paymentMethod, paymentsContext.paymentMethod) &&
        Objects.equals(this.paymentReference, paymentsContext.paymentReference) &&
        Objects.equals(this.paymentDate, paymentsContext.paymentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, paymentMethod, paymentReference, paymentDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsContext {\n");

    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
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

