# SeriesApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**seriesIdActorsGet**](SeriesApi.md#seriesIdActorsGet) | **GET** /series/{id}/actors | 
[**seriesIdEpisodesGet**](SeriesApi.md#seriesIdEpisodesGet) | **GET** /series/{id}/episodes | 
[**seriesIdEpisodesQueryGet**](SeriesApi.md#seriesIdEpisodesQueryGet) | **GET** /series/{id}/episodes/query | 
[**seriesIdEpisodesQueryParamsGet**](SeriesApi.md#seriesIdEpisodesQueryParamsGet) | **GET** /series/{id}/episodes/query/params | 
[**seriesIdEpisodesSummaryGet**](SeriesApi.md#seriesIdEpisodesSummaryGet) | **GET** /series/{id}/episodes/summary | 
[**seriesIdFilterGet**](SeriesApi.md#seriesIdFilterGet) | **GET** /series/{id}/filter | 
[**seriesIdFilterParamsGet**](SeriesApi.md#seriesIdFilterParamsGet) | **GET** /series/{id}/filter/params | 
[**seriesIdGet**](SeriesApi.md#seriesIdGet) | **GET** /series/{id} | 
[**seriesIdHead**](SeriesApi.md#seriesIdHead) | **HEAD** /series/{id} | 
[**seriesIdImagesGet**](SeriesApi.md#seriesIdImagesGet) | **GET** /series/{id}/images | 
[**seriesIdImagesQueryGet**](SeriesApi.md#seriesIdImagesQueryGet) | **GET** /series/{id}/images/query | 
[**seriesIdImagesQueryParamsGet**](SeriesApi.md#seriesIdImagesQueryParamsGet) | **GET** /series/{id}/images/query/params | 


<a name="seriesIdActorsGet"></a>
# **seriesIdActorsGet**
> SeriesActors seriesIdActorsGet(id)



Returns actors for the given series id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
try {
    SeriesActors result = apiInstance.seriesIdActorsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdActorsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |

### Return type

[**SeriesActors**](SeriesActors.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seriesIdEpisodesGet"></a>
# **seriesIdEpisodesGet**
> SeriesEpisodes seriesIdEpisodesGet(id, page)



All episodes for a given series. Paginated with 100 results per page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
String page = "page_example"; // String | Page of results to fetch. Defaults to page 1 if not provided.
try {
    SeriesEpisodes result = apiInstance.seriesIdEpisodesGet(id, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdEpisodesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |
 **page** | **String**| Page of results to fetch. Defaults to page 1 if not provided. | [optional]

### Return type

[**SeriesEpisodes**](SeriesEpisodes.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seriesIdEpisodesQueryGet"></a>
# **seriesIdEpisodesQueryGet**
> SeriesEpisodesQuery seriesIdEpisodesQueryGet(id, absoluteNumber, airedSeason, airedEpisode, dvdSeason, dvdEpisode, imdbId, page, acceptLanguage)



This route allows the user to query against episodes for the given series. The response is a paginated array of episode records that have been filtered down to basic information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
String absoluteNumber = "absoluteNumber_example"; // String | Absolute number of the episode
String airedSeason = "airedSeason_example"; // String | Aired season number
String airedEpisode = "airedEpisode_example"; // String | Aired episode number
String dvdSeason = "dvdSeason_example"; // String | DVD season number
String dvdEpisode = "dvdEpisode_example"; // String | DVD episode number
String imdbId = "imdbId_example"; // String | IMDB id of the series
String page = "page_example"; // String | Page of results to fetch. Defaults to page 1 if not provided.
String acceptLanguage = "acceptLanguage_example"; // String | Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields.
try {
    SeriesEpisodesQuery result = apiInstance.seriesIdEpisodesQueryGet(id, absoluteNumber, airedSeason, airedEpisode, dvdSeason, dvdEpisode, imdbId, page, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdEpisodesQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |
 **absoluteNumber** | **String**| Absolute number of the episode | [optional]
 **airedSeason** | **String**| Aired season number | [optional]
 **airedEpisode** | **String**| Aired episode number | [optional]
 **dvdSeason** | **String**| DVD season number | [optional]
 **dvdEpisode** | **String**| DVD episode number | [optional]
 **imdbId** | **String**| IMDB id of the series | [optional]
 **page** | **String**| Page of results to fetch. Defaults to page 1 if not provided. | [optional]
 **acceptLanguage** | **String**| Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields. | [optional]

### Return type

[**SeriesEpisodesQuery**](SeriesEpisodesQuery.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seriesIdEpisodesQueryParamsGet"></a>
# **seriesIdEpisodesQueryParamsGet**
> SeriesEpisodesQueryParams seriesIdEpisodesQueryParamsGet(id)



Returns the allowed query keys for the &#x60;/series/{id}/episodes/query&#x60; route

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
try {
    SeriesEpisodesQueryParams result = apiInstance.seriesIdEpisodesQueryParamsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdEpisodesQueryParamsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |

### Return type

[**SeriesEpisodesQueryParams**](SeriesEpisodesQueryParams.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seriesIdEpisodesSummaryGet"></a>
# **seriesIdEpisodesSummaryGet**
> SeriesEpisodesSummary seriesIdEpisodesSummaryGet(id)



Returns a summary of the episodes and seasons available for the series.  __Note__: Season \&quot;0\&quot; is for all episodes that are considered to be specials.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
try {
    SeriesEpisodesSummary result = apiInstance.seriesIdEpisodesSummaryGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdEpisodesSummaryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |

### Return type

[**SeriesEpisodesSummary**](SeriesEpisodesSummary.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seriesIdFilterGet"></a>
# **seriesIdFilterGet**
> SeriesData seriesIdFilterGet(id, keys, acceptLanguage)



Returns a series records, filtered by the supplied comma-separated list of keys. Query keys can be found at the &#x60;/series/{id}/filter/params&#x60; route.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
String keys = "keys_example"; // String | Comma-separated list of keys to filter by
String acceptLanguage = "acceptLanguage_example"; // String | Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields.
try {
    SeriesData result = apiInstance.seriesIdFilterGet(id, keys, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdFilterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |
 **keys** | **String**| Comma-separated list of keys to filter by |
 **acceptLanguage** | **String**| Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields. | [optional]

### Return type

[**SeriesData**](SeriesData.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seriesIdFilterParamsGet"></a>
# **seriesIdFilterParamsGet**
> FilterKeys seriesIdFilterParamsGet(id, acceptLanguage)



Returns the list of keys available for the &#x60;/series/{id}/filter&#x60; route

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
String acceptLanguage = "acceptLanguage_example"; // String | Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields.
try {
    FilterKeys result = apiInstance.seriesIdFilterParamsGet(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdFilterParamsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |
 **acceptLanguage** | **String**| Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields. | [optional]

### Return type

[**FilterKeys**](FilterKeys.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seriesIdGet"></a>
# **seriesIdGet**
> SeriesData seriesIdGet(id, acceptLanguage)



Returns a series records that contains all information known about a particular series id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
String acceptLanguage = "acceptLanguage_example"; // String | Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields.
try {
    SeriesData result = apiInstance.seriesIdGet(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |
 **acceptLanguage** | **String**| Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields. | [optional]

### Return type

[**SeriesData**](SeriesData.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seriesIdHead"></a>
# **seriesIdHead**
> seriesIdHead(id, acceptLanguage)



Returns header information only about the given series ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
String acceptLanguage = "acceptLanguage_example"; // String | Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields.
try {
    apiInstance.seriesIdHead(id, acceptLanguage);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdHead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |
 **acceptLanguage** | **String**| Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields. | [optional]

### Return type

null (empty response body)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seriesIdImagesGet"></a>
# **seriesIdImagesGet**
> SeriesImagesCounts seriesIdImagesGet(id, acceptLanguage)



Returns a summary of the images for a particular series

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
String acceptLanguage = "acceptLanguage_example"; // String | Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields.
try {
    SeriesImagesCounts result = apiInstance.seriesIdImagesGet(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdImagesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |
 **acceptLanguage** | **String**| Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields. | [optional]

### Return type

[**SeriesImagesCounts**](SeriesImagesCounts.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seriesIdImagesQueryGet"></a>
# **seriesIdImagesQueryGet**
> SeriesImageQueryResults seriesIdImagesQueryGet(id, keyType, resolution, subKey, acceptLanguage)



Query images for the given series ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
String keyType = "keyType_example"; // String | Type of image you're querying for (fanart, poster, etc. See ../images/query/params for more details).
String resolution = "resolution_example"; // String | Resolution to filter by (1280x1024, for example)
String subKey = "subKey_example"; // String | Subkey for the above query keys. See /series/{id}/images/query/params for more information
String acceptLanguage = "acceptLanguage_example"; // String | Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields.
try {
    SeriesImageQueryResults result = apiInstance.seriesIdImagesQueryGet(id, keyType, resolution, subKey, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdImagesQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |
 **keyType** | **String**| Type of image you&#39;re querying for (fanart, poster, etc. See ../images/query/params for more details). | [optional]
 **resolution** | **String**| Resolution to filter by (1280x1024, for example) | [optional]
 **subKey** | **String**| Subkey for the above query keys. See /series/{id}/images/query/params for more information | [optional]
 **acceptLanguage** | **String**| Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields. | [optional]

### Return type

[**SeriesImageQueryResults**](SeriesImageQueryResults.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seriesIdImagesQueryParamsGet"></a>
# **seriesIdImagesQueryParamsGet**
> SeriesImagesQueryParams seriesIdImagesQueryParamsGet(id, acceptLanguage)



Returns the allowed query keys for the &#x60;/series/{id}/images/query&#x60; route. Contains a parameter record for each unique &#x60;keyType&#x60;, listing values that will return results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SeriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SeriesApi apiInstance = new SeriesApi();
Long id = 789L; // Long | ID of the series
String acceptLanguage = "acceptLanguage_example"; // String | Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields.
try {
    SeriesImagesQueryParams result = apiInstance.seriesIdImagesQueryParamsGet(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SeriesApi#seriesIdImagesQueryParamsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |
 **acceptLanguage** | **String**| Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields. | [optional]

### Return type

[**SeriesImagesQueryParams**](SeriesImagesQueryParams.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

