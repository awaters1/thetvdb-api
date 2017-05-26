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
 * Links
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-25T18:21:04.363-04:00")
public class Links   {
  @SerializedName("first")
  private Integer first = null;

  @SerializedName("last")
  private Integer last = null;

  @SerializedName("next")
  private Integer next = null;

  @SerializedName("previous")
  private Integer previous = null;

  public Links first(Integer first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getFirst() {
    return first;
  }

  public void setFirst(Integer first) {
    this.first = first;
  }

  public Links last(Integer last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLast() {
    return last;
  }

  public void setLast(Integer last) {
    this.last = last;
  }

  public Links next(Integer next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNext() {
    return next;
  }

  public void setNext(Integer next) {
    this.next = next;
  }

  public Links previous(Integer previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPrevious() {
    return previous;
  }

  public void setPrevious(Integer previous) {
    this.previous = previous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.first, links.first) &&
        Objects.equals(this.last, links.last) &&
        Objects.equals(this.next, links.next) &&
        Objects.equals(this.previous, links.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, next, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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
