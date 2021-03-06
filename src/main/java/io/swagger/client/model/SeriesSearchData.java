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
import java.util.ArrayList;
import java.util.List;


/**
 * SeriesSearchData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-25T18:21:04.363-04:00")
public class SeriesSearchData   {
  @SerializedName("aliases")
  private List<String> aliases = new ArrayList<String>();

  @SerializedName("banner")
  private String banner = null;

  @SerializedName("firstAired")
  private String firstAired = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("overview")
  private String overview = null;

  @SerializedName("seriesName")
  private String seriesName = null;

  @SerializedName("status")
  private String status = null;

  public SeriesSearchData aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public SeriesSearchData addAliasesItem(String aliasesItem) {
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }

  public SeriesSearchData banner(String banner) {
    this.banner = banner;
    return this;
  }

   /**
   * Get banner
   * @return banner
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBanner() {
    return banner;
  }

  public void setBanner(String banner) {
    this.banner = banner;
  }

  public SeriesSearchData firstAired(String firstAired) {
    this.firstAired = firstAired;
    return this;
  }

   /**
   * Get firstAired
   * @return firstAired
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstAired() {
    return firstAired;
  }

  public void setFirstAired(String firstAired) {
    this.firstAired = firstAired;
  }

  public SeriesSearchData id(Integer id) {
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

  public SeriesSearchData network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public SeriesSearchData overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public SeriesSearchData seriesName(String seriesName) {
    this.seriesName = seriesName;
    return this;
  }

   /**
   * Get seriesName
   * @return seriesName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSeriesName() {
    return seriesName;
  }

  public void setSeriesName(String seriesName) {
    this.seriesName = seriesName;
  }

  public SeriesSearchData status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeriesSearchData seriesSearchData = (SeriesSearchData) o;
    return Objects.equals(this.aliases, seriesSearchData.aliases) &&
        Objects.equals(this.banner, seriesSearchData.banner) &&
        Objects.equals(this.firstAired, seriesSearchData.firstAired) &&
        Objects.equals(this.id, seriesSearchData.id) &&
        Objects.equals(this.network, seriesSearchData.network) &&
        Objects.equals(this.overview, seriesSearchData.overview) &&
        Objects.equals(this.seriesName, seriesSearchData.seriesName) &&
        Objects.equals(this.status, seriesSearchData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, banner, firstAired, id, network, overview, seriesName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesSearchData {\n");
    
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    firstAired: ").append(toIndentedString(firstAired)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    seriesName: ").append(toIndentedString(seriesName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

