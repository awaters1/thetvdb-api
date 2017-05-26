# UpdatesApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updatedQueryGet**](UpdatesApi.md#updatedQueryGet) | **GET** /updated/query | 
[**updatedQueryParamsGet**](UpdatesApi.md#updatedQueryParamsGet) | **GET** /updated/query/params | 


<a name="updatedQueryGet"></a>
# **updatedQueryGet**
> UpdateData updatedQueryGet(fromTime, toTime, acceptLanguage)



Returns an array of series that have changed in a maximum of one week blocks since the provided &#x60;fromTime&#x60;.   The user may specify a &#x60;toTime&#x60; to grab results for less than a week. Any timespan larger than a week will be reduced down to one week automatically.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpdatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

UpdatesApi apiInstance = new UpdatesApi();
String fromTime = "fromTime_example"; // String | Epoch time to start your date range.
String toTime = "toTime_example"; // String | Epoch time to end your date range. Must be one week from `fromTime`.
String acceptLanguage = "acceptLanguage_example"; // String | Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields.
try {
    UpdateData result = apiInstance.updatedQueryGet(fromTime, toTime, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdatesApi#updatedQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromTime** | **String**| Epoch time to start your date range. |
 **toTime** | **String**| Epoch time to end your date range. Must be one week from &#x60;fromTime&#x60;. | [optional]
 **acceptLanguage** | **String**| Records are returned with the Episode name and Overview in the desired language, if it exists. If there is no translation for the given language, then the record is still returned but with empty values for the translated fields. | [optional]

### Return type

[**UpdateData**](UpdateData.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatedQueryParamsGet"></a>
# **updatedQueryParamsGet**
> UpdateDataQueryParams updatedQueryParamsGet()



Returns an array of valid query keys for the &#x60;/updated/query/params&#x60; route.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpdatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

UpdatesApi apiInstance = new UpdatesApi();
try {
    UpdateDataQueryParams result = apiInstance.updatedQueryParamsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdatesApi#updatedQueryParamsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UpdateDataQueryParams**](UpdateDataQueryParams.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

