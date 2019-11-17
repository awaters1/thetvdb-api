# swagger-java-client

TheTVDB API v2
- API version: 3.0.0
  - Build date: 2019-11-17T13:20:58.565Z

API v2 targets v1 functionality with a few minor additions. The API is accessible via https://api.thetvdb.com and provides the following REST endpoints in JSON format.   How to use this API documentation ----------------   You may browse the API routes without authentication, but if you wish to send requests to the API and see response data, then you must authenticate. 1. Obtain a JWT token by `POST`ing  to the `/login` route in the `Authentication` section with your API key and credentials. 1. Paste the JWT token from the response into the \"JWT Token\" field at the top of the page and click the 'Add Token' button.   You will now be able to use the remaining routes to send requests to the API and get a response.   Language Selection ----------------   Language selection is done via the `Accept-Language` header. At the moment, you may only pass one language abbreviation in the header at a time. Valid language abbreviations can be found at the `/languages` route..   Authentication ----------------   Authentication to use the API is similar to the How-to section above. Users must `POST` to the `/login` route with their API key and credentials in the following format in order to obtain a JWT token.  `{\"apikey\":\"APIKEY\",\"username\":\"USERNAME\",\"userkey\":\"USERKEY\"}`  Note that the username and key are ONLY required for the `/user` routes. The user's key is labled `Account Identifier` in the account section of the main site. The token is then used in all subsequent requests by providing it in the `Authorization` header. The header will look like: `Authorization: Bearer <yourJWTtoken>`. Currently, the token expires after 24 hours. You can `GET` the `/refresh_token` route to extend that expiration date.   Versioning ----------------   You may request a different version of the API by including an `Accept` header in your request with the following format: `Accept:application/vnd.thetvdb.v$VERSION`. This documentation automatically uses the version seen at the top and bottom of the page.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AuthenticationApi;

import java.io.File;
import java.util.*;

public class AuthenticationApiExample {

    public static void main(String[] args) {
        
        AuthenticationApi apiInstance = new AuthenticationApi();
        Auth authenticationString = new Auth(); // Auth | JSON string containing your authentication details.
        try {
            Token result = apiInstance.loginPost(authenticationString);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#loginPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**loginPost**](docs/AuthenticationApi.md#loginPost) | **POST** /login | 
*AuthenticationApi* | [**refreshTokenGet**](docs/AuthenticationApi.md#refreshTokenGet) | **GET** /refresh_token | 
*EpisodesApi* | [**episodesIdGet**](docs/EpisodesApi.md#episodesIdGet) | **GET** /episodes/{id} | 
*LanguagesApi* | [**languagesGet**](docs/LanguagesApi.md#languagesGet) | **GET** /languages | 
*LanguagesApi* | [**languagesIdGet**](docs/LanguagesApi.md#languagesIdGet) | **GET** /languages/{id} | 
*SearchApi* | [**searchSeriesGet**](docs/SearchApi.md#searchSeriesGet) | **GET** /search/series | 
*SearchApi* | [**searchSeriesParamsGet**](docs/SearchApi.md#searchSeriesParamsGet) | **GET** /search/series/params | 
*SeriesApi* | [**seriesIdActorsGet**](docs/SeriesApi.md#seriesIdActorsGet) | **GET** /series/{id}/actors | 
*SeriesApi* | [**seriesIdEpisodesGet**](docs/SeriesApi.md#seriesIdEpisodesGet) | **GET** /series/{id}/episodes | 
*SeriesApi* | [**seriesIdEpisodesQueryGet**](docs/SeriesApi.md#seriesIdEpisodesQueryGet) | **GET** /series/{id}/episodes/query | 
*SeriesApi* | [**seriesIdEpisodesQueryParamsGet**](docs/SeriesApi.md#seriesIdEpisodesQueryParamsGet) | **GET** /series/{id}/episodes/query/params | 
*SeriesApi* | [**seriesIdEpisodesSummaryGet**](docs/SeriesApi.md#seriesIdEpisodesSummaryGet) | **GET** /series/{id}/episodes/summary | 
*SeriesApi* | [**seriesIdFilterGet**](docs/SeriesApi.md#seriesIdFilterGet) | **GET** /series/{id}/filter | 
*SeriesApi* | [**seriesIdFilterParamsGet**](docs/SeriesApi.md#seriesIdFilterParamsGet) | **GET** /series/{id}/filter/params | 
*SeriesApi* | [**seriesIdGet**](docs/SeriesApi.md#seriesIdGet) | **GET** /series/{id} | 
*SeriesApi* | [**seriesIdHead**](docs/SeriesApi.md#seriesIdHead) | **HEAD** /series/{id} | 
*SeriesApi* | [**seriesIdImagesGet**](docs/SeriesApi.md#seriesIdImagesGet) | **GET** /series/{id}/images | 
*SeriesApi* | [**seriesIdImagesQueryGet**](docs/SeriesApi.md#seriesIdImagesQueryGet) | **GET** /series/{id}/images/query | 
*SeriesApi* | [**seriesIdImagesQueryParamsGet**](docs/SeriesApi.md#seriesIdImagesQueryParamsGet) | **GET** /series/{id}/images/query/params | 
*UpdatesApi* | [**updatedQueryGet**](docs/UpdatesApi.md#updatedQueryGet) | **GET** /updated/query | 
*UpdatesApi* | [**updatedQueryParamsGet**](docs/UpdatesApi.md#updatedQueryParamsGet) | **GET** /updated/query/params | 
*UsersApi* | [**userFavoritesGet**](docs/UsersApi.md#userFavoritesGet) | **GET** /user/favorites | 
*UsersApi* | [**userFavoritesIdDelete**](docs/UsersApi.md#userFavoritesIdDelete) | **DELETE** /user/favorites/{id} | 
*UsersApi* | [**userFavoritesIdPut**](docs/UsersApi.md#userFavoritesIdPut) | **PUT** /user/favorites/{id} | 
*UsersApi* | [**userGet**](docs/UsersApi.md#userGet) | **GET** /user | 
*UsersApi* | [**userRatingsGet**](docs/UsersApi.md#userRatingsGet) | **GET** /user/ratings | 
*UsersApi* | [**userRatingsItemTypeItemIdDelete**](docs/UsersApi.md#userRatingsItemTypeItemIdDelete) | **DELETE** /user/ratings/{itemType}/{itemId} | 
*UsersApi* | [**userRatingsItemTypeItemIdItemRatingPut**](docs/UsersApi.md#userRatingsItemTypeItemIdItemRatingPut) | **PUT** /user/ratings/{itemType}/{itemId}/{itemRating} | 
*UsersApi* | [**userRatingsQueryGet**](docs/UsersApi.md#userRatingsQueryGet) | **GET** /user/ratings/query | 
*UsersApi* | [**userRatingsQueryParamsGet**](docs/UsersApi.md#userRatingsQueryParamsGet) | **GET** /user/ratings/query/params | 


## Documentation for Models

 - [Auth](docs/Auth.md)
 - [BasicEpisode](docs/BasicEpisode.md)
 - [Conflict](docs/Conflict.md)
 - [Episode](docs/Episode.md)
 - [EpisodeDataQueryParams](docs/EpisodeDataQueryParams.md)
 - [EpisodeLanguageInfo](docs/EpisodeLanguageInfo.md)
 - [EpisodeRecordData](docs/EpisodeRecordData.md)
 - [FilterKeys](docs/FilterKeys.md)
 - [JSONErrors](docs/JSONErrors.md)
 - [Language](docs/Language.md)
 - [LanguageData](docs/LanguageData.md)
 - [Links](docs/Links.md)
 - [NotAuthorized](docs/NotAuthorized.md)
 - [NotFound](docs/NotFound.md)
 - [Series](docs/Series.md)
 - [SeriesActors](docs/SeriesActors.md)
 - [SeriesActorsData](docs/SeriesActorsData.md)
 - [SeriesData](docs/SeriesData.md)
 - [SeriesEpisodes](docs/SeriesEpisodes.md)
 - [SeriesEpisodesQuery](docs/SeriesEpisodesQuery.md)
 - [SeriesEpisodesQueryParams](docs/SeriesEpisodesQueryParams.md)
 - [SeriesEpisodesSummary](docs/SeriesEpisodesSummary.md)
 - [SeriesImageQueryResult](docs/SeriesImageQueryResult.md)
 - [SeriesImageQueryResultRatingsInfo](docs/SeriesImageQueryResultRatingsInfo.md)
 - [SeriesImageQueryResults](docs/SeriesImageQueryResults.md)
 - [SeriesImagesCount](docs/SeriesImagesCount.md)
 - [SeriesImagesCounts](docs/SeriesImagesCounts.md)
 - [SeriesImagesQueryParam](docs/SeriesImagesQueryParam.md)
 - [SeriesImagesQueryParams](docs/SeriesImagesQueryParams.md)
 - [SeriesSearchResult](docs/SeriesSearchResult.md)
 - [SeriesSearchResults](docs/SeriesSearchResults.md)
 - [Token](docs/Token.md)
 - [Update](docs/Update.md)
 - [UpdateData](docs/UpdateData.md)
 - [UpdateDataQueryParams](docs/UpdateDataQueryParams.md)
 - [User](docs/User.md)
 - [UserData](docs/UserData.md)
 - [UserFavorites](docs/UserFavorites.md)
 - [UserFavoritesData](docs/UserFavoritesData.md)
 - [UserRatings](docs/UserRatings.md)
 - [UserRatingsData](docs/UserRatingsData.md)
 - [UserRatingsDataNoLinks](docs/UserRatingsDataNoLinks.md)
 - [UserRatingsDataNoLinksEmptyArray](docs/UserRatingsDataNoLinksEmptyArray.md)
 - [UserRatingsQueryParams](docs/UserRatingsQueryParams.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### jwtToken

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



