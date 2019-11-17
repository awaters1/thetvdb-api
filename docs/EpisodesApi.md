# EpisodesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**episodesIdGet**](EpisodesApi.md#episodesIdGet) | **GET** /episodes/{id} | 


<a name="episodesIdGet"></a>
# **episodesIdGet**
> EpisodeRecordData episodesIdGet(id, acceptLanguage)



Returns the full information for a given episode id. __Deprecation Warning:__ The _director_ key will be deprecated in favor of the new _directors_ key in a future release.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EpisodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

EpisodesApi apiInstance = new EpisodesApi();
Long id = 789L; // Long | ID of the episode
String acceptLanguage = "acceptLanguage_example"; // String | Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields.
try {
    EpisodeRecordData result = apiInstance.episodesIdGet(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EpisodesApi#episodesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the episode |
 **acceptLanguage** | **String**| Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields. | [optional]

### Return type

[**EpisodeRecordData**](EpisodeRecordData.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

