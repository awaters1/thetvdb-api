# SearchApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchSeriesGet**](SearchApi.md#searchSeriesGet) | **GET** /search/series | 
[**searchSeriesParamsGet**](SearchApi.md#searchSeriesParamsGet) | **GET** /search/series/params | 


<a name="searchSeriesGet"></a>
# **searchSeriesGet**
> SeriesSearchResults searchSeriesGet(name, imdbId, zap2itId, slug, acceptLanguage)



Allows the user to search for a series based on the following parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SearchApi apiInstance = new SearchApi();
String name = "name_example"; // String | Name of the series to search for.
String imdbId = "imdbId_example"; // String | IMDB id of the series
String zap2itId = "zap2itId_example"; // String | Zap2it ID of the series to search for.
String slug = "slug_example"; // String | Slug from site URL of series (https://www.thetvdb.com/series/$SLUG)
String acceptLanguage = "acceptLanguage_example"; // String | Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields.
try {
    SeriesSearchResults result = apiInstance.searchSeriesGet(name, imdbId, zap2itId, slug, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchSeriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the series to search for. | [optional]
 **imdbId** | **String**| IMDB id of the series | [optional]
 **zap2itId** | **String**| Zap2it ID of the series to search for. | [optional]
 **slug** | **String**| Slug from site URL of series (https://www.thetvdb.com/series/$SLUG) | [optional]
 **acceptLanguage** | **String**| Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields. | [optional]

### Return type

[**SeriesSearchResults**](SeriesSearchResults.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchSeriesParamsGet"></a>
# **searchSeriesParamsGet**
> EpisodeDataQueryParams searchSeriesParamsGet()



Returns an array of parameters to query by in the &#x60;/search/series&#x60; route.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

SearchApi apiInstance = new SearchApi();
try {
    EpisodeDataQueryParams result = apiInstance.searchSeriesParamsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchSeriesParamsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EpisodeDataQueryParams**](EpisodeDataQueryParams.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

