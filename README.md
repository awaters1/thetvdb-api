# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

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

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

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
        AuthenticationString authenticationString = new AuthenticationString(); // AuthenticationString | JSON string containing your authentication details.
        try {
            InlineResponse2002 result = apiInstance.loginPost(authenticationString);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#loginPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/*

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
 - [AuthenticationString](docs/AuthenticationString.md)
 - [BasicEpisode](docs/BasicEpisode.md)
 - [Conflict](docs/Conflict.md)
 - [Episode](docs/Episode.md)
 - [EpisodeDataQueryParams](docs/EpisodeDataQueryParams.md)
 - [EpisodeRecordData](docs/EpisodeRecordData.md)
 - [FilterKeys](docs/FilterKeys.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20010Data](docs/InlineResponse20010Data.md)
 - [InlineResponse20010RatingsInfo](docs/InlineResponse20010RatingsInfo.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20011Data](docs/InlineResponse20011Data.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse20012Data](docs/InlineResponse20012Data.md)
 - [InlineResponse20013](docs/InlineResponse20013.md)
 - [InlineResponse20013Data](docs/InlineResponse20013Data.md)
 - [InlineResponse20014](docs/InlineResponse20014.md)
 - [InlineResponse20014Data](docs/InlineResponse20014Data.md)
 - [InlineResponse20015](docs/InlineResponse20015.md)
 - [InlineResponse20015Data](docs/InlineResponse20015Data.md)
 - [InlineResponse20016](docs/InlineResponse20016.md)
 - [InlineResponse20017](docs/InlineResponse20017.md)
 - [InlineResponse2001Data](docs/InlineResponse2001Data.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2005Data](docs/InlineResponse2005Data.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2006Data](docs/InlineResponse2006Data.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2007Data](docs/InlineResponse2007Data.md)
 - [InlineResponse2007Links](docs/InlineResponse2007Links.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponse2009Data](docs/InlineResponse2009Data.md)
 - [InlineResponse200Data](docs/InlineResponse200Data.md)
 - [InlineResponse200Errors](docs/InlineResponse200Errors.md)
 - [InlineResponse401](docs/InlineResponse401.md)
 - [InlineResponse404](docs/InlineResponse404.md)
 - [InlineResponse409](docs/InlineResponse409.md)
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
 - [SeriesImageQueryResults](docs/SeriesImageQueryResults.md)
 - [SeriesImagesCount](docs/SeriesImagesCount.md)
 - [SeriesImagesCounts](docs/SeriesImagesCounts.md)
 - [SeriesImagesQueryParam](docs/SeriesImagesQueryParam.md)
 - [SeriesImagesQueryParams](docs/SeriesImagesQueryParams.md)
 - [SeriesSearchData](docs/SeriesSearchData.md)
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



