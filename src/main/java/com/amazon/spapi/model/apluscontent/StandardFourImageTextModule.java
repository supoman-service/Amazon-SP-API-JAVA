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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Four standard images with text, presented across a single row.
 */
@ApiModel(description = "Four standard images with text, presented across a single row.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-13T15:02:00.299+08:00")
public class StandardFourImageTextModule {
  @SerializedName("headline")
  private TextComponent headline = null;

  @SerializedName("block1")
  private StandardImageTextBlock block1 = null;

  @SerializedName("block2")
  private StandardImageTextBlock block2 = null;

  @SerializedName("block3")
  private StandardImageTextBlock block3 = null;

  @SerializedName("block4")
  private StandardImageTextBlock block4 = null;

  public StandardFourImageTextModule headline(TextComponent headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Get headline
   * @return headline
  **/
  @ApiModelProperty(value = "")
  public TextComponent getHeadline() {
    return headline;
  }

  public void setHeadline(TextComponent headline) {
    this.headline = headline;
  }

  public StandardFourImageTextModule block1(StandardImageTextBlock block1) {
    this.block1 = block1;
    return this;
  }

   /**
   * Get block1
   * @return block1
  **/
  @ApiModelProperty(value = "")
  public StandardImageTextBlock getBlock1() {
    return block1;
  }

  public void setBlock1(StandardImageTextBlock block1) {
    this.block1 = block1;
  }

  public StandardFourImageTextModule block2(StandardImageTextBlock block2) {
    this.block2 = block2;
    return this;
  }

   /**
   * Get block2
   * @return block2
  **/
  @ApiModelProperty(value = "")
  public StandardImageTextBlock getBlock2() {
    return block2;
  }

  public void setBlock2(StandardImageTextBlock block2) {
    this.block2 = block2;
  }

  public StandardFourImageTextModule block3(StandardImageTextBlock block3) {
    this.block3 = block3;
    return this;
  }

   /**
   * Get block3
   * @return block3
  **/
  @ApiModelProperty(value = "")
  public StandardImageTextBlock getBlock3() {
    return block3;
  }

  public void setBlock3(StandardImageTextBlock block3) {
    this.block3 = block3;
  }

  public StandardFourImageTextModule block4(StandardImageTextBlock block4) {
    this.block4 = block4;
    return this;
  }

   /**
   * Get block4
   * @return block4
  **/
  @ApiModelProperty(value = "")
  public StandardImageTextBlock getBlock4() {
    return block4;
  }

  public void setBlock4(StandardImageTextBlock block4) {
    this.block4 = block4;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardFourImageTextModule standardFourImageTextModule = (StandardFourImageTextModule) o;
    return Objects.equals(this.headline, standardFourImageTextModule.headline) &&
        Objects.equals(this.block1, standardFourImageTextModule.block1) &&
        Objects.equals(this.block2, standardFourImageTextModule.block2) &&
        Objects.equals(this.block3, standardFourImageTextModule.block3) &&
        Objects.equals(this.block4, standardFourImageTextModule.block4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, block1, block2, block3, block4);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardFourImageTextModule {\n");

    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    block1: ").append(toIndentedString(block1)).append("\n");
    sb.append("    block2: ").append(toIndentedString(block2)).append("\n");
    sb.append("    block3: ").append(toIndentedString(block3)).append("\n");
    sb.append("    block4: ").append(toIndentedString(block4)).append("\n");
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

