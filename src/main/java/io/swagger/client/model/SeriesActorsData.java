/**
 * TheTVDB API v2
 * API v2 targets v1 functionality with a few minor additions. The API is accessible via https://api.thetvdb.com and provides the following REST endpoints in JSON format.   How to use this API documentation ----------------   You may browse the API routes without authentication, but if you wish to send requests to the API and see response data, then you must authenticate. 1. Obtain a JWT token by `POST`ing  to the `/login` route in the `Authentication` section with your API key and credentials. 1. Paste the JWT token from the response into the \"JWT Token\" field at the top of the page and click the 'Add Token' button.   You will now be able to use the remaining routes to send requests to the API and get a response.   Language Selection ----------------   Language selection is done via the `Accept-Language` header. At the moment, you may only pass one language abbreviation in the header at a time. Valid language abbreviations can be found at the `/languages` route..   Authentication ----------------   Authentication to use the API is similar to the How-to section above. Users must `POST` to the `/login` route with their API key and credentials in the following format in order to obtain a JWT token.  `{\"apikey\":\"APIKEY\",\"username\":\"USERNAME\",\"userkey\":\"USERKEY\"}`  Note that the username and key are ONLY required for the `/user` routes. The user's key is labled `Account Identifier` in the account section of the main site. The token is then used in all subsequent requests by providing it in the `Authorization` header. The header will look like: `Authorization: Bearer <yourJWTtoken>`. Currently, the token expires after 24 hours. You can `GET` the `/refresh_token` route to extend that expiration date.   Versioning ----------------   You may request a different version of the API by including an `Accept` header in your request with the following format: `Accept:application/vnd.thetvdb.v$VERSION`. This documentation automatically uses the version seen at the top and bottom of the page.
 *
 * OpenAPI spec version: 2.1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SeriesActorsData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-25T18:21:04.363-04:00")
public class SeriesActorsData   {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("imageAdded")
  private String imageAdded = null;

  @SerializedName("imageAuthor")
  private Integer imageAuthor = null;

  @SerializedName("lastUpdated")
  private String lastUpdated = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("seriesId")
  private String seriesId = null;

  @SerializedName("sortOrder")
  private Integer sortOrder = null;

  public SeriesActorsData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SeriesActorsData image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public SeriesActorsData imageAdded(String imageAdded) {
    this.imageAdded = imageAdded;
    return this;
  }

   /**
   * Get imageAdded
   * @return imageAdded
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getImageAdded() {
    return imageAdded;
  }

  public void setImageAdded(String imageAdded) {
    this.imageAdded = imageAdded;
  }

  public SeriesActorsData imageAuthor(Integer imageAuthor) {
    this.imageAuthor = imageAuthor;
    return this;
  }

   /**
   * Get imageAuthor
   * @return imageAuthor
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getImageAuthor() {
    return imageAuthor;
  }

  public void setImageAuthor(Integer imageAuthor) {
    this.imageAuthor = imageAuthor;
  }

  public SeriesActorsData lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public SeriesActorsData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SeriesActorsData role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public SeriesActorsData seriesId(String seriesId) {
    this.seriesId = seriesId;
    return this;
  }

   /**
   * Get seriesId
   * @return seriesId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSeriesId() {
    return seriesId;
  }

  public void setSeriesId(String seriesId) {
    this.seriesId = seriesId;
  }

  public SeriesActorsData sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeriesActorsData seriesActorsData = (SeriesActorsData) o;
    return Objects.equals(this.id, seriesActorsData.id) &&
        Objects.equals(this.image, seriesActorsData.image) &&
        Objects.equals(this.imageAdded, seriesActorsData.imageAdded) &&
        Objects.equals(this.imageAuthor, seriesActorsData.imageAuthor) &&
        Objects.equals(this.lastUpdated, seriesActorsData.lastUpdated) &&
        Objects.equals(this.name, seriesActorsData.name) &&
        Objects.equals(this.role, seriesActorsData.role) &&
        Objects.equals(this.seriesId, seriesActorsData.seriesId) &&
        Objects.equals(this.sortOrder, seriesActorsData.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, image, imageAdded, imageAuthor, lastUpdated, name, role, seriesId, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesActorsData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageAdded: ").append(toIndentedString(imageAdded)).append("\n");
    sb.append("    imageAuthor: ").append(toIndentedString(imageAuthor)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

