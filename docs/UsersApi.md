# UsersApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userFavoritesGet**](UsersApi.md#userFavoritesGet) | **GET** /user/favorites | 
[**userFavoritesIdDelete**](UsersApi.md#userFavoritesIdDelete) | **DELETE** /user/favorites/{id} | 
[**userFavoritesIdPut**](UsersApi.md#userFavoritesIdPut) | **PUT** /user/favorites/{id} | 
[**userGet**](UsersApi.md#userGet) | **GET** /user | 
[**userRatingsGet**](UsersApi.md#userRatingsGet) | **GET** /user/ratings | 
[**userRatingsItemTypeItemIdDelete**](UsersApi.md#userRatingsItemTypeItemIdDelete) | **DELETE** /user/ratings/{itemType}/{itemId} | 
[**userRatingsItemTypeItemIdItemRatingPut**](UsersApi.md#userRatingsItemTypeItemIdItemRatingPut) | **PUT** /user/ratings/{itemType}/{itemId}/{itemRating} | 
[**userRatingsQueryGet**](UsersApi.md#userRatingsQueryGet) | **GET** /user/ratings/query | 
[**userRatingsQueryParamsGet**](UsersApi.md#userRatingsQueryParamsGet) | **GET** /user/ratings/query/params | 


<a name="userFavoritesGet"></a>
# **userFavoritesGet**
> UserFavoritesData userFavoritesGet()



Returns an array of favorite series for a given user, will be a blank array if no favorites exist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    UserFavoritesData result = apiInstance.userFavoritesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userFavoritesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserFavoritesData**](UserFavoritesData.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userFavoritesIdDelete"></a>
# **userFavoritesIdDelete**
> UserFavoritesData userFavoritesIdDelete(id)



Deletes the given series ID from the user’s favorite’s list and returns the updated list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Long id = 789L; // Long | ID of the series
try {
    UserFavoritesData result = apiInstance.userFavoritesIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userFavoritesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |

### Return type

[**UserFavoritesData**](UserFavoritesData.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userFavoritesIdPut"></a>
# **userFavoritesIdPut**
> UserFavoritesData userFavoritesIdPut(id)



Adds the supplied series ID to the user’s favorite’s list and returns the updated list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Long id = 789L; // Long | ID of the series
try {
    UserFavoritesData result = apiInstance.userFavoritesIdPut(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userFavoritesIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the series |

### Return type

[**UserFavoritesData**](UserFavoritesData.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userGet"></a>
# **userGet**
> UserData userGet()



Returns basic information about the currently authenticated user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    UserData result = apiInstance.userGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserData**](UserData.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userRatingsGet"></a>
# **userRatingsGet**
> UserRatingsData userRatingsGet()



Returns an array of ratings for the given user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    UserRatingsData result = apiInstance.userRatingsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userRatingsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserRatingsData**](UserRatingsData.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userRatingsItemTypeItemIdDelete"></a>
# **userRatingsItemTypeItemIdDelete**
> UserRatingsDataNoLinksEmptyArray userRatingsItemTypeItemIdDelete(itemType, itemId)



This route deletes a given rating of a given type.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
String itemType = "itemType_example"; // String | Item to update. Can be either 'series', 'episode', or 'image'
Long itemId = 789L; // Long | ID of the ratings record that you wish to modify
try {
    UserRatingsDataNoLinksEmptyArray result = apiInstance.userRatingsItemTypeItemIdDelete(itemType, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userRatingsItemTypeItemIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemType** | **String**| Item to update. Can be either &#39;series&#39;, &#39;episode&#39;, or &#39;image&#39; |
 **itemId** | **Long**| ID of the ratings record that you wish to modify |

### Return type

[**UserRatingsDataNoLinksEmptyArray**](UserRatingsDataNoLinksEmptyArray.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userRatingsItemTypeItemIdItemRatingPut"></a>
# **userRatingsItemTypeItemIdItemRatingPut**
> UserRatingsDataNoLinks userRatingsItemTypeItemIdItemRatingPut(itemType, itemId, itemRating)



This route updates a given rating of a given type.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
String itemType = "itemType_example"; // String | Item to update. Can be either 'series', 'episode', or 'image'
Long itemId = 789L; // Long | ID of the ratings record that you wish to modify
Long itemRating = 789L; // Long | The updated rating number
try {
    UserRatingsDataNoLinks result = apiInstance.userRatingsItemTypeItemIdItemRatingPut(itemType, itemId, itemRating);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userRatingsItemTypeItemIdItemRatingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemType** | **String**| Item to update. Can be either &#39;series&#39;, &#39;episode&#39;, or &#39;image&#39; |
 **itemId** | **Long**| ID of the ratings record that you wish to modify |
 **itemRating** | **Long**| The updated rating number |

### Return type

[**UserRatingsDataNoLinks**](UserRatingsDataNoLinks.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userRatingsQueryGet"></a>
# **userRatingsQueryGet**
> UserRatingsData userRatingsQueryGet(itemType)



Returns an array of ratings for a given user that match the query.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
String itemType = "itemType_example"; // String | Item to query. Can be either 'series', 'episode', or 'banner'
try {
    UserRatingsData result = apiInstance.userRatingsQueryGet(itemType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userRatingsQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemType** | **String**| Item to query. Can be either &#39;series&#39;, &#39;episode&#39;, or &#39;banner&#39; | [optional]

### Return type

[**UserRatingsData**](UserRatingsData.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userRatingsQueryParamsGet"></a>
# **userRatingsQueryParamsGet**
> UserRatingsQueryParams userRatingsQueryParamsGet()



Returns a list of query params for use in the &#x60;/user/ratings/query&#x60; route.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    UserRatingsQueryParams result = apiInstance.userRatingsQueryParamsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#userRatingsQueryParamsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserRatingsQueryParams**](UserRatingsQueryParams.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

