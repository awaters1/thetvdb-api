# LanguagesApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languagesGet**](LanguagesApi.md#languagesGet) | **GET** /languages | 
[**languagesIdGet**](LanguagesApi.md#languagesIdGet) | **GET** /languages/{id} | 


<a name="languagesGet"></a>
# **languagesGet**
> LanguageData languagesGet()



All available languages. These language abbreviations can be used in the &#x60;Accept-Language&#x60; header for routes that return translation records.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

LanguagesApi apiInstance = new LanguagesApi();
try {
    LanguageData result = apiInstance.languagesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#languagesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LanguageData**](LanguageData.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="languagesIdGet"></a>
# **languagesIdGet**
> Language languagesIdGet(id)



Information about a particular language, given the language ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LanguagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

LanguagesApi apiInstance = new LanguagesApi();
String id = "id_example"; // String | ID of the language
try {
    Language result = apiInstance.languagesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#languagesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the language |

### Return type

[**Language**](Language.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

