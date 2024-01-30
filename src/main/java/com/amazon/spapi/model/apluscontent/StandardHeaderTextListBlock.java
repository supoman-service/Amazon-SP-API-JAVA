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
 * The A+ standard fixed-length list of text, with a related headline.
 */
@ApiModel(description = "The A+ standard fixed-length list of text, with a related headline.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-13T15:02:00.299+08:00")
public class StandardHeaderTextListBlock {
  @SerializedName("headline")
  private TextComponent headline = null;

  @SerializedName("block")
  private StandardTextListBlock block = null;

  public StandardHeaderTextListBlock headline(TextComponent headline) {
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

  public StandardHeaderTextListBlock block(StandardTextListBlock block) {
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @ApiModelProperty(value = "")
  public StandardTextListBlock getBlock() {
    return block;
  }

  public void setBlock(StandardTextListBlock block) {
    this.block = block;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardHeaderTextListBlock standardHeaderTextListBlock = (StandardHeaderTextListBlock) o;
    return Objects.equals(this.headline, standardHeaderTextListBlock.headline) &&
        Objects.equals(this.block, standardHeaderTextListBlock.block);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, block);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardHeaderTextListBlock {\n");

    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
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
