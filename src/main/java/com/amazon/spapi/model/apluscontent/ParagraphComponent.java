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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A list of rich text content, usually presented in a text box.
 */
@ApiModel(description = "A list of rich text content, usually presented in a text box.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-13T15:02:00.299+08:00")
public class ParagraphComponent {
  @SerializedName("textList")
  private List<TextComponent> textList = new ArrayList<TextComponent>();

  public ParagraphComponent textList(List<TextComponent> textList) {
    this.textList = textList;
    return this;
  }

  public ParagraphComponent addTextListItem(TextComponent textListItem) {
    this.textList.add(textListItem);
    return this;
  }

   /**
   * Get textList
   * @return textList
  **/
  @ApiModelProperty(required = true, value = "")
  public List<TextComponent> getTextList() {
    return textList;
  }

  public void setTextList(List<TextComponent> textList) {
    this.textList = textList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParagraphComponent paragraphComponent = (ParagraphComponent) o;
    return Objects.equals(this.textList, paragraphComponent.textList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParagraphComponent {\n");

    sb.append("    textList: ").append(toIndentedString(textList)).append("\n");
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

