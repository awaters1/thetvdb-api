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
import io.swagger.client.model.SeriesImageQueryResultRatingsInfo;


/**
 * SeriesImageQueryResult
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-25T18:21:04.363-04:00")
public class SeriesImageQueryResult   {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("keyType")
  private String keyType = null;

  @SerializedName("languageId")
  private Integer languageId = null;

  @SerializedName("ratingsInfo")
  private SeriesImageQueryResultRatingsInfo ratingsInfo = null;

  @SerializedName("resolution")
  private String resolution = null;

  @SerializedName("subKey")
  private String subKey = null;

  @SerializedName("thumbnail")
  private String thumbnail = null;

  public SeriesImageQueryResult fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public SeriesImageQueryResult id(Integer id) {
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

  public SeriesImageQueryResult keyType(String keyType) {
    this.keyType = keyType;
    return this;
  }

   /**
   * Get keyType
   * @return keyType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKeyType() {
    return keyType;
  }

  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }

  public SeriesImageQueryResult languageId(Integer languageId) {
    this.languageId = languageId;
    return this;
  }

   /**
   * Get languageId
   * @return languageId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLanguageId() {
    return languageId;
  }

  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }

  public SeriesImageQueryResult ratingsInfo(SeriesImageQueryResultRatingsInfo ratingsInfo) {
    this.ratingsInfo = ratingsInfo;
    return this;
  }

   /**
   * Get ratingsInfo
   * @return ratingsInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public SeriesImageQueryResultRatingsInfo getRatingsInfo() {
    return ratingsInfo;
  }

  public void setRatingsInfo(SeriesImageQueryResultRatingsInfo ratingsInfo) {
    this.ratingsInfo = ratingsInfo;
  }

  public SeriesImageQueryResult resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public SeriesImageQueryResult subKey(String subKey) {
    this.subKey = subKey;
    return this;
  }

   /**
   * Get subKey
   * @return subKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubKey() {
    return subKey;
  }

  public void setSubKey(String subKey) {
    this.subKey = subKey;
  }

  public SeriesImageQueryResult thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeriesImageQueryResult seriesImageQueryResult = (SeriesImageQueryResult) o;
    return Objects.equals(this.fileName, seriesImageQueryResult.fileName) &&
        Objects.equals(this.id, seriesImageQueryResult.id) &&
        Objects.equals(this.keyType, seriesImageQueryResult.keyType) &&
        Objects.equals(this.languageId, seriesImageQueryResult.languageId) &&
        Objects.equals(this.ratingsInfo, seriesImageQueryResult.ratingsInfo) &&
        Objects.equals(this.resolution, seriesImageQueryResult.resolution) &&
        Objects.equals(this.subKey, seriesImageQueryResult.subKey) &&
        Objects.equals(this.thumbnail, seriesImageQueryResult.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, id, keyType, languageId, ratingsInfo, resolution, subKey, thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesImageQueryResult {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    ratingsInfo: ").append(toIndentedString(ratingsInfo)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    subKey: ").append(toIndentedString(subKey)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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

