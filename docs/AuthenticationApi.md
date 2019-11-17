# AuthenticationApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginPost**](AuthenticationApi.md#loginPost) | **POST** /login | 
[**refreshTokenGet**](AuthenticationApi.md#refreshTokenGet) | **GET** /refresh_token | 


<a name="loginPost"></a>
# **loginPost**
> Token loginPost(authenticationString)



Returns a session token to be included in the rest of the requests. Note that API key authentication is required for all subsequent requests and user auth is required for routes in the &#x60;User&#x60; section

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
Auth authenticationString = new Auth(); // Auth | JSON string containing your authentication details.
try {
    Token result = apiInstance.loginPost(authenticationString);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#loginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationString** | [**Auth**](Auth.md)| JSON string containing your authentication details. |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refreshTokenGet"></a>
# **refreshTokenGet**
> Token refreshTokenGet()



Refreshes your current, valid JWT token and returns a new token. Hit this route so that you do not have to post to &#x60;/login&#x60; with your API key and credentials once you have already been authenticated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    Token result = apiInstance.refreshTokenGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#refreshTokenGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Token**](Token.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

