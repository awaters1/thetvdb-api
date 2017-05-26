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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.SeriesActors;
import io.swagger.client.model.NotAuthorized;
import io.swagger.client.model.NotFound;
import io.swagger.client.model.SeriesEpisodes;
import io.swagger.client.model.SeriesEpisodesQuery;
import io.swagger.client.model.SeriesEpisodesQueryParams;
import io.swagger.client.model.SeriesEpisodesSummary;
import io.swagger.client.model.SeriesData;
import io.swagger.client.model.FilterKeys;
import io.swagger.client.model.SeriesImagesCounts;
import io.swagger.client.model.SeriesImageQueryResults;
import io.swagger.client.model.SeriesImagesQueryParams;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SeriesApi
 */
public class SeriesApiTest {

    private final SeriesApi api = new SeriesApi();

    
    /**
     * 
     *
     * Returns actors for the given series id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdActorsGetTest() throws ApiException {
        Long id = null;
        // SeriesActors response = api.seriesIdActorsGet(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * All episodes for a given series. Paginated with 100 results per page.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdEpisodesGetTest() throws ApiException {
        Long id = null;
        String page = null;
        // SeriesEpisodes response = api.seriesIdEpisodesGet(id, page);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * This route allows the user to query against episodes for the given series. The response is a paginated array of episode records that have been filtered down to basic information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdEpisodesQueryGetTest() throws ApiException {
        Long id = null;
        String absoluteNumber = null;
        String airedSeason = null;
        String airedEpisode = null;
        String dvdSeason = null;
        String dvdEpisode = null;
        String imdbId = null;
        String page = null;
        String acceptLanguage = null;
        // SeriesEpisodesQuery response = api.seriesIdEpisodesQueryGet(id, absoluteNumber, airedSeason, airedEpisode, dvdSeason, dvdEpisode, imdbId, page, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the allowed query keys for the &#x60;/series/{id}/episodes/query&#x60; route
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdEpisodesQueryParamsGetTest() throws ApiException {
        Long id = null;
        // SeriesEpisodesQueryParams response = api.seriesIdEpisodesQueryParamsGet(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a summary of the episodes and seasons available for the series.  __Note__: Season \&quot;0\&quot; is for all episodes that are considered to be specials.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdEpisodesSummaryGetTest() throws ApiException {
        Long id = null;
        // SeriesEpisodesSummary response = api.seriesIdEpisodesSummaryGet(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a series records, filtered by the supplied comma-separated list of keys. Query keys can be found at the &#x60;/series/{id}/filter/params&#x60; route.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdFilterGetTest() throws ApiException {
        Long id = null;
        String keys = null;
        String acceptLanguage = null;
        // SeriesData response = api.seriesIdFilterGet(id, keys, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the list of keys available for the &#x60;/series/{id}/filter&#x60; route
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdFilterParamsGetTest() throws ApiException {
        Long id = null;
        String acceptLanguage = null;
        // FilterKeys response = api.seriesIdFilterParamsGet(id, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a series records that contains all information known about a particular series id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdGetTest() throws ApiException {
        Long id = null;
        String acceptLanguage = null;
        // SeriesData response = api.seriesIdGet(id, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns header information only about the given series ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdHeadTest() throws ApiException {
        Long id = null;
        String acceptLanguage = null;
        // api.seriesIdHead(id, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a summary of the images for a particular series
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdImagesGetTest() throws ApiException {
        Long id = null;
        String acceptLanguage = null;
        // SeriesImagesCounts response = api.seriesIdImagesGet(id, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Query images for the given series ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdImagesQueryGetTest() throws ApiException {
        Long id = null;
        String keyType = null;
        String resolution = null;
        String subKey = null;
        String acceptLanguage = null;
        // SeriesImageQueryResults response = api.seriesIdImagesQueryGet(id, keyType, resolution, subKey, acceptLanguage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the allowed query keys for the &#x60;/series/{id}/images/query&#x60; route. Contains a parameter record for each unique &#x60;keyType&#x60;, listing values that will return results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seriesIdImagesQueryParamsGetTest() throws ApiException {
        Long id = null;
        String acceptLanguage = null;
        // SeriesImagesQueryParams response = api.seriesIdImagesQueryParamsGet(id, acceptLanguage);

        // TODO: test validations
    }
    
}
