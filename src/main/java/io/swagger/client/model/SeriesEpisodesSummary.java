/*
 * TheTVDB API v2
 * API v2 targets v1 functionality with a few minor additions. The API is accessible via https://api.thetvdb.com and provides the following REST endpoints in JSON format.   How to use this API documentation ----------------   You may browse the API routes without authentication, but if you wish to send requests to the API and see response data, then you must authenticate. 1. Obtain a JWT token by `POST`ing  to the `/login` route in the `Authentication` section with your API key and credentials. 1. Paste the JWT token from the response into the \"JWT Token\" field at the top of the page and click the 'Add Token' button.   You will now be able to use the remaining routes to send requests to the API and get a response.   Language Selection ----------------   Language selection is done via the `Accept-Language` header. At the moment, you may only pass one language abbreviation in the header at a time. Valid language abbreviations can be found at the `/languages` route..   Authentication ----------------   Authentication to use the API is similar to the How-to section above. Users must `POST` to the `/login` route with their API key and credentials in the following format in order to obtain a JWT token.  `{\"apikey\":\"APIKEY\",\"username\":\"USERNAME\",\"userkey\":\"USERKEY\"}`  Note that the username and key are ONLY required for the `/user` routes. The user's key is labled `Account Identifier` in the account section of the main site. The token is then used in all subsequent requests by providing it in the `Authorization` header. The header will look like: `Authorization: Bearer <yourJWTtoken>`. Currently, the token expires after 24 hours. You can `GET` the `/refresh_token` route to extend that expiration date.   Versioning ----------------   You may request a different version of the API by including an `Accept` header in your request with the following format: `Accept:application/vnd.thetvdb.v$VERSION`. This documentation automatically uses the version seen at the top and bottom of the page.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SeriesEpisodesSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-17T13:20:58.565Z")
public class SeriesEpisodesSummary {
  @SerializedName("airedEpisodes")
  private String airedEpisodes = null;

  @SerializedName("airedSeasons")
  private List<String> airedSeasons = null;

  @SerializedName("dvdEpisodes")
  private String dvdEpisodes = null;

  @SerializedName("dvdSeasons")
  private List<String> dvdSeasons = null;

  public SeriesEpisodesSummary airedEpisodes(String airedEpisodes) {
    this.airedEpisodes = airedEpisodes;
    return this;
  }

   /**
   * Number of all aired episodes for this series
   * @return airedEpisodes
  **/
  @ApiModelProperty(value = "Number of all aired episodes for this series")
  public String getAiredEpisodes() {
    return airedEpisodes;
  }

  public void setAiredEpisodes(String airedEpisodes) {
    this.airedEpisodes = airedEpisodes;
  }

  public SeriesEpisodesSummary airedSeasons(List<String> airedSeasons) {
    this.airedSeasons = airedSeasons;
    return this;
  }

  public SeriesEpisodesSummary addAiredSeasonsItem(String airedSeasonsItem) {
    if (this.airedSeasons == null) {
      this.airedSeasons = new ArrayList<String>();
    }
    this.airedSeasons.add(airedSeasonsItem);
    return this;
  }

   /**
   * Get airedSeasons
   * @return airedSeasons
  **/
  @ApiModelProperty(value = "")
  public List<String> getAiredSeasons() {
    return airedSeasons;
  }

  public void setAiredSeasons(List<String> airedSeasons) {
    this.airedSeasons = airedSeasons;
  }

  public SeriesEpisodesSummary dvdEpisodes(String dvdEpisodes) {
    this.dvdEpisodes = dvdEpisodes;
    return this;
  }

   /**
   * Number of all dvd episodes for this series
   * @return dvdEpisodes
  **/
  @ApiModelProperty(value = "Number of all dvd episodes for this series")
  public String getDvdEpisodes() {
    return dvdEpisodes;
  }

  public void setDvdEpisodes(String dvdEpisodes) {
    this.dvdEpisodes = dvdEpisodes;
  }

  public SeriesEpisodesSummary dvdSeasons(List<String> dvdSeasons) {
    this.dvdSeasons = dvdSeasons;
    return this;
  }

  public SeriesEpisodesSummary addDvdSeasonsItem(String dvdSeasonsItem) {
    if (this.dvdSeasons == null) {
      this.dvdSeasons = new ArrayList<String>();
    }
    this.dvdSeasons.add(dvdSeasonsItem);
    return this;
  }

   /**
   * Get dvdSeasons
   * @return dvdSeasons
  **/
  @ApiModelProperty(value = "")
  public List<String> getDvdSeasons() {
    return dvdSeasons;
  }

  public void setDvdSeasons(List<String> dvdSeasons) {
    this.dvdSeasons = dvdSeasons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeriesEpisodesSummary seriesEpisodesSummary = (SeriesEpisodesSummary) o;
    return Objects.equals(this.airedEpisodes, seriesEpisodesSummary.airedEpisodes) &&
        Objects.equals(this.airedSeasons, seriesEpisodesSummary.airedSeasons) &&
        Objects.equals(this.dvdEpisodes, seriesEpisodesSummary.dvdEpisodes) &&
        Objects.equals(this.dvdSeasons, seriesEpisodesSummary.dvdSeasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airedEpisodes, airedSeasons, dvdEpisodes, dvdSeasons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesEpisodesSummary {\n");
    
    sb.append("    airedEpisodes: ").append(toIndentedString(airedEpisodes)).append("\n");
    sb.append("    airedSeasons: ").append(toIndentedString(airedSeasons)).append("\n");
    sb.append("    dvdEpisodes: ").append(toIndentedString(dvdEpisodes)).append("\n");
    sb.append("    dvdSeasons: ").append(toIndentedString(dvdSeasons)).append("\n");
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

