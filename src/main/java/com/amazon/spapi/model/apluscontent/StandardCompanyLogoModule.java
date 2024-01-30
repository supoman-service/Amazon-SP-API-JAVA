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
 * The standard company logo image.
 */
@ApiModel(description = "The standard company logo image.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-13T15:02:00.299+08:00")
public class StandardCompanyLogoModule {
  @SerializedName("companyLogo")
  private ImageComponent companyLogo = null;

  public StandardCompanyLogoModule companyLogo(ImageComponent companyLogo) {
    this.companyLogo = companyLogo;
    return this;
  }

   /**
   * Get companyLogo
   * @return companyLogo
  **/
  @ApiModelProperty(required = true, value = "")
  public ImageComponent getCompanyLogo() {
    return companyLogo;
  }

  public void setCompanyLogo(ImageComponent companyLogo) {
    this.companyLogo = companyLogo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardCompanyLogoModule standardCompanyLogoModule = (StandardCompanyLogoModule) o;
    return Objects.equals(this.companyLogo, standardCompanyLogoModule.companyLogo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLogo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardCompanyLogoModule {\n");

    sb.append("    companyLogo: ").append(toIndentedString(companyLogo)).append("\n");
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
