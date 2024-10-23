# SimulationApi

All URIs are relative to *https://api-sandbox.lendismart.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLoanSimulation**](SimulationApi.md#createLoanSimulation) | **POST** /v2/simulation | Creates a simulation |


<a id="createLoanSimulation"></a>
# **createLoanSimulation**
> LoanSimulationResponseDTO createLoanSimulation(apiLoanSimulationPayload)

Creates a simulation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    ApiLoanSimulationPayload apiLoanSimulationPayload = new ApiLoanSimulationPayload(); // ApiLoanSimulationPayload | The simulation payload
    try {
      LoanSimulationResponseDTO result = apiInstance.createLoanSimulation(apiLoanSimulationPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#createLoanSimulation");
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
| **apiLoanSimulationPayload** | [**ApiLoanSimulationPayload**](ApiLoanSimulationPayload.md)| The simulation payload | |

### Return type

[**LoanSimulationResponseDTO**](LoanSimulationResponseDTO.md)

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
| **200** | The simulation has been successfully created |  -  |
| **401** | You are not authorized, please check your API-KEY |  -  |

