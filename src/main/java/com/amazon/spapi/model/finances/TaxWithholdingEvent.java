/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * A TaxWithholding event on seller&#39;s account.
 */
@ApiModel(description = "A TaxWithholding event on seller's account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-21T12:22:28.126+08:00")
public class TaxWithholdingEvent {
  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("BaseAmount")
  private Currency baseAmount = null;

  @SerializedName("WithheldAmount")
  private Currency withheldAmount = null;

  @SerializedName("TaxWithholdingPeriod")
  private TaxWithholdingPeriod taxWithholdingPeriod = null;

  public TaxWithholdingEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public TaxWithholdingEvent baseAmount(Currency baseAmount) {
    this.baseAmount = baseAmount;
    return this;
  }

   /**
   * The amount which tax was withheld against.
   * @return baseAmount
  **/
  @ApiModelProperty(value = "The amount which tax was withheld against.")
  public Currency getBaseAmount() {
    return baseAmount;
  }

  public void setBaseAmount(Currency baseAmount) {
    this.baseAmount = baseAmount;
  }

  public TaxWithholdingEvent withheldAmount(Currency withheldAmount) {
    this.withheldAmount = withheldAmount;
    return this;
  }

   /**
   * The amount of the tax withholding deducted from seller&#39;s account.
   * @return withheldAmount
  **/
  @ApiModelProperty(value = "The amount of the tax withholding deducted from seller's account.")
  public Currency getWithheldAmount() {
    return withheldAmount;
  }

  public void setWithheldAmount(Currency withheldAmount) {
    this.withheldAmount = withheldAmount;
  }

  public TaxWithholdingEvent taxWithholdingPeriod(TaxWithholdingPeriod taxWithholdingPeriod) {
    this.taxWithholdingPeriod = taxWithholdingPeriod;
    return this;
  }

   /**
   * Time period for which tax is withheld.
   * @return taxWithholdingPeriod
  **/
  @ApiModelProperty(value = "Time period for which tax is withheld.")
  public TaxWithholdingPeriod getTaxWithholdingPeriod() {
    return taxWithholdingPeriod;
  }

  public void setTaxWithholdingPeriod(TaxWithholdingPeriod taxWithholdingPeriod) {
    this.taxWithholdingPeriod = taxWithholdingPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxWithholdingEvent taxWithholdingEvent = (TaxWithholdingEvent) o;
    return Objects.equals(this.postedDate, taxWithholdingEvent.postedDate) &&
        Objects.equals(this.baseAmount, taxWithholdingEvent.baseAmount) &&
        Objects.equals(this.withheldAmount, taxWithholdingEvent.withheldAmount) &&
        Objects.equals(this.taxWithholdingPeriod, taxWithholdingEvent.taxWithholdingPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postedDate, baseAmount, withheldAmount, taxWithholdingPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxWithholdingEvent {\n");

    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    baseAmount: ").append(toIndentedString(baseAmount)).append("\n");
    sb.append("    withheldAmount: ").append(toIndentedString(withheldAmount)).append("\n");
    sb.append("    taxWithholdingPeriod: ").append(toIndentedString(taxWithholdingPeriod)).append("\n");
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

