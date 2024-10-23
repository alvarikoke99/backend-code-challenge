# UserApi

All URIs are relative to *https://api-sandbox.lendismart.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UserApi.md#createUser) | **POST** /v2/users | Creates a new user |
| [**getUser**](UserApi.md#getUser) | **GET** /v2/users/{id} | Retrieves user information |
| [**patchUser**](UserApi.md#patchUser) | **PATCH** /v2/users/{id} | Patches a user |
| [**searchUser**](UserApi.md#searchUser) | **GET** /v2/users | Search users information |
| [**updateUser**](UserApi.md#updateUser) | **PUT** /v2/users/{id} | Updates a user |


<a id="createUser"></a>
# **createUser**
> User createUser(user)

Creates a new user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    User user = new User(); // User | The payload of the user that is about to be created
    try {
      User result = apiInstance.createUser(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **user** | [**User**](User.md)| The payload of the user that is about to be created | |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The request was malformed |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **500** | An unexpected error has occurred |  -  |
| **201** | The user has been successfully created |  -  |
| **401** | You are not authorized, please check your API-KEY |  -  |

<a id="getUser"></a>
# **getUser**
> User getUser(id)

Retrieves user information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      User result = apiInstance.getUser(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The request was malformed |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **500** | An unexpected error has occurred |  -  |
| **200** | User recovered successfully |  -  |
| **401** | You are not authorized, please check your API-KEY |  -  |

<a id="patchUser"></a>
# **patchUser**
> User patchUser(id, user)

Patches a user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | 
    User user = new User(); // User | Payload including the fields that we want to patch from the User
    try {
      User result = apiInstance.patchUser(id, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#patchUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **user** | [**User**](User.md)| Payload including the fields that we want to patch from the User | |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The request was malformed |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **500** | An unexpected error has occurred |  -  |
| **200** | The user has been successfully patched |  -  |
| **401** | You are not authorized, please check your API-KEY |  -  |

<a id="searchUser"></a>
# **searchUser**
> UserApiSearchResponse searchUser(page, pageSize, pageToken, usernameStartsWith, createdBefore, createdAfter, stateIn)

Search users information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    Integer page = 0; // Integer | If this parameter is specified, standard pagination will be performed, returning the users corresponding to the indicated page (0 based indexed) for the indicated page size. For example: page=2&pageSize=10 will return the results (20-29). The results will be sorted by descending creation date.
    Integer pageSize = 20; // Integer | Maximum number of users to be returned. If not specified, 20 users will be returned by default..
    String pageToken = "MjAxNy0wNy0yMVQxNzozMjoyOFpfMmRiMzJkNjMtOTUzNS00ZjRiLTg1MDItZjhiOGRhNTU2YmE3"; // String | If the \"page\" parameter has not been specified, the search will use cursor-based pagination. Each search result will include a nextPageToken field in the \"meta\" section. This nextPageToken must be included as a pageToken in the following request in order to get the next page of users. The initial search should not include pageToken. The results will always be returned ordered by descending creation date.
    String usernameStartsWith = "francisco"; // String | Name of the user you want to search for. Results whose username begins with this value will be returned.
    OffsetDateTime createdBefore = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Users created prior to the date will be returned.
    OffsetDateTime createdAfter = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Users created after the date will be returned.
    List<String> stateIn = Arrays.asList(); // List<String> | Users whose state matches one of the values in this array will be returned.
    try {
      UserApiSearchResponse result = apiInstance.searchUser(page, pageSize, pageToken, usernameStartsWith, createdBefore, createdAfter, stateIn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#searchUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| If this parameter is specified, standard pagination will be performed, returning the users corresponding to the indicated page (0 based indexed) for the indicated page size. For example: page&#x3D;2&amp;pageSize&#x3D;10 will return the results (20-29). The results will be sorted by descending creation date. | [optional] |
| **pageSize** | **Integer**| Maximum number of users to be returned. If not specified, 20 users will be returned by default.. | [optional] [default to 20] |
| **pageToken** | **String**| If the \&quot;page\&quot; parameter has not been specified, the search will use cursor-based pagination. Each search result will include a nextPageToken field in the \&quot;meta\&quot; section. This nextPageToken must be included as a pageToken in the following request in order to get the next page of users. The initial search should not include pageToken. The results will always be returned ordered by descending creation date. | [optional] |
| **usernameStartsWith** | **String**| Name of the user you want to search for. Results whose username begins with this value will be returned. | [optional] |
| **createdBefore** | **OffsetDateTime**| Users created prior to the date will be returned. | [optional] |
| **createdAfter** | **OffsetDateTime**| Users created after the date will be returned. | [optional] |
| **stateIn** | [**List&lt;String&gt;**](String.md)| Users whose state matches one of the values in this array will be returned. | [optional] [enum: ACTIVE, INACTIVE, LOCKED, EXPIRED, DELETED] |

### Return type

[**UserApiSearchResponse**](UserApiSearchResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The request was malformed |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **500** | An unexpected error has occurred |  -  |
| **200** | User recovered successfully |  -  |
| **401** | You are not authorized, please check your API-KEY |  -  |

<a id="updateUser"></a>
# **updateUser**
> User updateUser(id, user)

Updates a user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | The id of the user
    User user = new User(); // User | The payload of the user that is about to be updated
    try {
      User result = apiInstance.updateUser(id, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The id of the user | |
| **user** | [**User**](User.md)| The payload of the user that is about to be updated | |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The request was malformed |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **500** | An unexpected error has occurred |  -  |
| **200** | The user has been successfully updated |  -  |
| **401** | You are not authorized, please check your API-KEY |  -  |

