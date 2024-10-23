# ApplicationApi

All URIs are relative to *https://api-sandbox.lendismart.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelApplication**](ApplicationApi.md#cancelApplication) | **PUT** /v2/applications/{id}/cancel | Cancels an application if possible (i.e. if its state is not APPROVED nor RETURNED). |
| [**checkApiKey**](ApplicationApi.md#checkApiKey) | **GET** /v2/applications/health-check | Checks the validity of an API-KEY |
| [**createApplication**](ApplicationApi.md#createApplication) | **POST** /v2/applications | Creates a new application |
| [**getApplication**](ApplicationApi.md#getApplication) | **GET** /v2/applications/{id} | Gets an existing application |
| [**offerReturnRequest**](ApplicationApi.md#offerReturnRequest) | **PUT** /v2/applications/{id}/return | Initiates the return of an approved loan |
| [**searchApplications**](ApplicationApi.md#searchApplications) | **GET** /v2/applications | Search applications |
| [**updateApplication**](ApplicationApi.md#updateApplication) | **PUT** /v2/applications/{id} | Updates an application |
| [**uploadApplicationDocument**](ApplicationApi.md#uploadApplicationDocument) | **POST** /v2/applications/{id}/document | Creates an application document. |


<a id="cancelApplication"></a>
# **cancelApplication**
> ApplicationResponse cancelApplication(id, cancelApplication)

Cancels an application if possible (i.e. if its state is not APPROVED nor RETURNED).

The application state will be updated to CANCELED and offer cancellation requests will be submitted to the lenders that support this feature

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    String id = "id_example"; // String | The id of the application, it can be a uuid or a numeric value. If the passed value is neither an uuid nor a numeric (integer) value an error will be thrown.
    CancelApplication cancelApplication = new CancelApplication(); // CancelApplication | The application cancellation payload
    try {
      ApplicationResponse result = apiInstance.cancelApplication(id, cancelApplication);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#cancelApplication");
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
| **id** | **String**| The id of the application, it can be a uuid or a numeric value. If the passed value is neither an uuid nor a numeric (integer) value an error will be thrown. | |
| **cancelApplication** | [**CancelApplication**](CancelApplication.md)| The application cancellation payload | |

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

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
| **401** | You are not authorized, please check your API-KEY |  -  |
| **200** | The application |  -  |

<a id="checkApiKey"></a>
# **checkApiKey**
> checkApiKey()

Checks the validity of an API-KEY

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    try {
      apiInstance.checkApiKey();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#checkApiKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The request was malformed |  -  |
| **404** | Resource not found |  -  |
| **403** | Forbidden |  -  |
| **500** | An unexpected error has occurred |  -  |
| **200** | OK |  -  |
| **401** | You are not authorized, please check your API-KEY |  -  |

<a id="createApplication"></a>
# **createApplication**
> ApplicationResponse createApplication(application)

Creates a new application

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    Application application = new Application(); // Application | The payload of the application that is about to be created
    try {
      ApplicationResponse result = apiInstance.createApplication(application);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#createApplication");
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
| **application** | [**Application**](Application.md)| The payload of the application that is about to be created | |

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

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
| **201** | The application has been successfully created |  -  |
| **401** | You are not authorized, please check your API-KEY |  -  |

<a id="getApplication"></a>
# **getApplication**
> ApplicationResponse getApplication(id)

Gets an existing application

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    String id = "id_example"; // String | The id of the application, it can be a uuid or a numeric value. If the passed value is neither an uuid nor a numeric (integer) value an error will be thrown.
    try {
      ApplicationResponse result = apiInstance.getApplication(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getApplication");
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
| **id** | **String**| The id of the application, it can be a uuid or a numeric value. If the passed value is neither an uuid nor a numeric (integer) value an error will be thrown. | |

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

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
| **401** | You are not authorized, please check your API-KEY |  -  |
| **200** | Application recovered successfully |  -  |

<a id="offerReturnRequest"></a>
# **offerReturnRequest**
> ApplicationResponse offerReturnRequest(id, returnRequest)

Initiates the return of an approved loan

Will commence the loan return process for an approved loan, which may, depending on the Group&#39;s settings, necessitate specific internal approvals.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    String id = "id_example"; // String | The id of the application, it can be a uuid or a numeric value. If the passed value is neither an uuid nor a numeric (integer) value an error will be thrown.
    ReturnRequest returnRequest = new ReturnRequest(); // ReturnRequest | The return request payload
    try {
      ApplicationResponse result = apiInstance.offerReturnRequest(id, returnRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#offerReturnRequest");
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
| **id** | **String**| The id of the application, it can be a uuid or a numeric value. If the passed value is neither an uuid nor a numeric (integer) value an error will be thrown. | |
| **returnRequest** | [**ReturnRequest**](ReturnRequest.md)| The return request payload | |

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

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
| **401** | You are not authorized, please check your API-KEY |  -  |
| **200** | The application |  -  |

<a id="searchApplications"></a>
# **searchApplications**
> ApplicationApiSearchResponse searchApplications(page, pageSize, pageToken, merchant, fromDate, toDate, signed, docsSubmitted, state, offerState, lender, registrationNumber, vin, offerDocsSubmitted, isNotCancelled, createdByUsername, createdByDocIdNumber, groupCode, readableId, province, surname, docIdNumber, productType, goodsType, fromPreapprovalDate, untilPreapprovalDate, fromApprovalDate, untilApprovalDate, fromDocsSubmissionDate, untilDocsSubmissionDate, fromPayoutDate, untilPayoutDate, term, feeType, fromLoanAmount, untilLoanAmount)

Search applications

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    Integer page = 0; // Integer | If this parameter is specified, standard pagination will be performed, returning the applications corresponding to the indicated page (0 based indexed) for the indicated page size. For example: page=2&pageSize=10 will return the results (20-29). The results will be sorted by descending creation date.
    Integer pageSize = 20; // Integer | Maximum number of applications to be returned. If not specified, 20 applications will be returned by default..
    String pageToken = "MjAxNy0wNy0yMVQxNzozMjoyOFpfMmRiMzJkNjMtOTUzNS00ZjRiLTg1MDItZjhiOGRhNTU2YmE3"; // String | If the \"page\" parameter has not been specified, the search will use cursor-based pagination. Each search result will include a nextPageToken field in the \"meta\" section. This nextPageToken must be included as a pageToken in the following request in order to get the next page of applications. The initial search should not include pageToken. The results will always be returned ordered by descending creation date.
    List<String> merchant = Arrays.asList(); // List<String> | Applications whose merchant code matches one of the values in this array will be returned.
    OffsetDateTime fromDate = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Applications created after the date will be returned.
    OffsetDateTime toDate = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Applications created prior to the date will be returned.
    Boolean signed = true; // Boolean | If \"signed\" is true it will recover applications with offers whose signature method equals to SIGNED_MANUAL, SIGNED_SMS or SIGNED_BIOMETRIC. If \"signed\" is false will recover applications with offers whose signature method is unset.
    Boolean docsSubmitted = true; // Boolean | Applications whose documents are submitted or not.
    List<String> state = Arrays.asList(); // List<String> | The application states to filter with.
    List<String> offerState = Arrays.asList(); // List<String> | Applications whose offers states equal to the values.
    List<String> lender = Arrays.asList(); // List<String> | Applications whose selected offer lender code equals to the values.
    String registrationNumber = "1234ABC"; // String | Applications whose motor vehicle registration number equals to the value.
    String vin = "1GNEK13ZX3R298984"; // String | Applications whose motor vehicle vin number equals to the value.
    Boolean offerDocsSubmitted = true; // Boolean | If true, will return applications with offers whose state equals to PREAPPROVED or PENDING_REVIEW with uploaded documents unsent.
    Boolean isNotCancelled = true; // Boolean | Applications whose state is not CANCELED.
    String createdByUsername = "johndoe"; // String | Applications created by the user (username) you want to search for. Results whose username begins with this value will be returned.
    String createdByDocIdNumber = "22706647N"; // String | Applications created by the user with an identification document number.
    List<String> groupCode = Arrays.asList(); // List<String> | Applications belonging to the group code values.
    String readableId = "38884464"; // String | Retrieves the application whose readable id number equals to the value.
    String province = "ALAVA"; // String | Applications whose main's applicant address province equals to the value.
    String surname = "Martinez"; // String | Applications whose main's applicant surname contains the value.
    String docIdNumber = "09605414Q"; // String | Applications whose main's applicant doc id number equals to the value.
    String productType = "INTEREST_BEARING"; // String | Applications whose financial product type equals to the value.
    String goodsType = "ELECTRONICS"; // String | Applications whose code associated to the good/service sold equals to the value.
    OffsetDateTime fromPreapprovalDate = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Applications whose pre-approval date is after the date will be returned.
    OffsetDateTime untilPreapprovalDate = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Applications whose pre-approval date is prior to the date will be returned.
    OffsetDateTime fromApprovalDate = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Applications whose approval date is after the date will be returned.
    OffsetDateTime untilApprovalDate = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Applications whose approval date is prior to the date will be returned.
    OffsetDateTime fromDocsSubmissionDate = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Applications whose docs submission date is after the date will be returned.
    OffsetDateTime untilDocsSubmissionDate = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Applications whose docs submission date is prior to the date will be returned.
    OffsetDateTime fromPayoutDate = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Applications whose payout date is after the date will be returned.
    OffsetDateTime untilPayoutDate = OffsetDateTime.parse("2017-07-21T17:32:28Z"); // OffsetDateTime | Applications whose payout date is prior to the date will be returned.
    String term = "6"; // String | Applications whose selected offer term equals to the value.
    String feeType = "INTEREST_BEARING"; // String | Applications whose selected offer product type equals to the value.
    BigDecimal fromLoanAmount = new BigDecimal("1000.99"); // BigDecimal | Applications whose selected offer loan amount is greater or equal than the value.
    BigDecimal untilLoanAmount = new BigDecimal("1000.99"); // BigDecimal | Applications whose selected offer loan amount is lower or equal than the value.
    try {
      ApplicationApiSearchResponse result = apiInstance.searchApplications(page, pageSize, pageToken, merchant, fromDate, toDate, signed, docsSubmitted, state, offerState, lender, registrationNumber, vin, offerDocsSubmitted, isNotCancelled, createdByUsername, createdByDocIdNumber, groupCode, readableId, province, surname, docIdNumber, productType, goodsType, fromPreapprovalDate, untilPreapprovalDate, fromApprovalDate, untilApprovalDate, fromDocsSubmissionDate, untilDocsSubmissionDate, fromPayoutDate, untilPayoutDate, term, feeType, fromLoanAmount, untilLoanAmount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#searchApplications");
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
| **page** | **Integer**| If this parameter is specified, standard pagination will be performed, returning the applications corresponding to the indicated page (0 based indexed) for the indicated page size. For example: page&#x3D;2&amp;pageSize&#x3D;10 will return the results (20-29). The results will be sorted by descending creation date. | [optional] |
| **pageSize** | **Integer**| Maximum number of applications to be returned. If not specified, 20 applications will be returned by default.. | [optional] [default to 20] |
| **pageToken** | **String**| If the \&quot;page\&quot; parameter has not been specified, the search will use cursor-based pagination. Each search result will include a nextPageToken field in the \&quot;meta\&quot; section. This nextPageToken must be included as a pageToken in the following request in order to get the next page of applications. The initial search should not include pageToken. The results will always be returned ordered by descending creation date. | [optional] |
| **merchant** | [**List&lt;String&gt;**](String.md)| Applications whose merchant code matches one of the values in this array will be returned. | [optional] |
| **fromDate** | **OffsetDateTime**| Applications created after the date will be returned. | [optional] |
| **toDate** | **OffsetDateTime**| Applications created prior to the date will be returned. | [optional] |
| **signed** | **Boolean**| If \&quot;signed\&quot; is true it will recover applications with offers whose signature method equals to SIGNED_MANUAL, SIGNED_SMS or SIGNED_BIOMETRIC. If \&quot;signed\&quot; is false will recover applications with offers whose signature method is unset. | [optional] |
| **docsSubmitted** | **Boolean**| Applications whose documents are submitted or not. | [optional] |
| **state** | [**List&lt;String&gt;**](String.md)| The application states to filter with. | [optional] [enum: APPROVED, PREAPPROVED, SUBMITTING, PENDING_REVIEW, PENDING_DATA, PENDING_SUBMISSION, DRAFT, ERROR, DENIED, CANCELED, RETURNED] |
| **offerState** | [**List&lt;String&gt;**](String.md)| Applications whose offers states equal to the values. | [optional] [enum: APPROVED, PREAPPROVED, PENDING_REVIEW, PENDING_DATA, PENDING_SUBMISSION, SUBMITTING, DENIED, ERROR, CANCELED, RETURNED] |
| **lender** | [**List&lt;String&gt;**](String.md)| Applications whose selected offer lender code equals to the values. | [optional] |
| **registrationNumber** | **String**| Applications whose motor vehicle registration number equals to the value. | [optional] |
| **vin** | **String**| Applications whose motor vehicle vin number equals to the value. | [optional] |
| **offerDocsSubmitted** | **Boolean**| If true, will return applications with offers whose state equals to PREAPPROVED or PENDING_REVIEW with uploaded documents unsent. | [optional] |
| **isNotCancelled** | **Boolean**| Applications whose state is not CANCELED. | [optional] |
| **createdByUsername** | **String**| Applications created by the user (username) you want to search for. Results whose username begins with this value will be returned. | [optional] |
| **createdByDocIdNumber** | **String**| Applications created by the user with an identification document number. | [optional] |
| **groupCode** | [**List&lt;String&gt;**](String.md)| Applications belonging to the group code values. | [optional] |
| **readableId** | **String**| Retrieves the application whose readable id number equals to the value. | [optional] |
| **province** | **String**| Applications whose main&#39;s applicant address province equals to the value. | [optional] [enum: ALAVA, ALBACETE, ALICANTE, ALMERIA, AVILA, BADAJOZ, BALEARES, BARCELONA, BURGOS, CACERES, CADIZ, CASTELLON, CIUDAD_REAL, CORDOBA, A_CORUNA, CUENCA, GERONA, GRANADA, GUADALAJARA, GUIPUZCOA, HUELVA, HUESCA, JAEN, LEON, LERIDA, LA_RIOJA, LUGO, MADRID, MALAGA, MURCIA, NAVARRA, ORENSE, ASTURIAS, PALENCIA, LAS_PALMAS, PONTEVEDRA, SALAMANCA, SANTA_CRUZ_DE_TENERIFE, CANTABRIA, SEGOVIA, SEVILLA, SORIA, TARRAGONA, TERUEL, TOLEDO, VALENCIA, VALLADOLID, VIZCAYA, ZAMORA, ZARAGOZA, CEUTA, MELILLA, AVEIRO, BEJA, BRAGA, BRAGANCA, CASTELO_BRANCO, COIMBRA, EVORA, FARO, GUARDA, LEIRIA, LISBOA, PORTALEGRE, PORTO, SANTAREM, SETUBAL, VIANA_DO_CASTELO, VILA_REAL, VISEU, ILHA_DA_MADEIRA, ILHA_DE_PORTO_SANTO, ILHA_DE_SANTA_MARIA, ILHA_DE_SAO_MIGUEL, ILHA_TERCEIRA, ILHA_DA_GRACIOSA, ILHA_DE_SAO_JORGE, ILHA_DO_PICO, ILHA_DO_FAIAL, ILHA_DAS_FLORES, ILHA_DO_CORVO, AGRIGENTO, ALESSANDRIA, ANCONA, VALLE_D_AOSTA, AREZZO, ASCOLI_PICENO, ASTI, AVELLINO, BARI, BARLETTA_ANDRIA_TRANI, BELLUNO, BENEVENTO, BERGAMO, BIELLA, BOLOGNA, BOLZANO, BRESCIA, BRINDISI, CAGLIARI, CALTANISSETTA, CAMPOBASSO, CASERTA, CATANIA, CATANZARO, CHIETI, COMO, COSENZA, CREMONA, CROTONE, CUNEO, ENNA, FERMO, FERRARA, FIRENZE, FOGGIA, FORLI_CESENA, FROSINONE, GENOVA, GORIZIA, GROSSETO, IMPERIA, ISERNIA, L_AQUILA, LA_SPEZIA, LATINA, LECCE, LECCO, LIVORNO, LODI, LUCCA, MACERATA, MANTOVA, MASSA_CARRARA, MATERA, MESSINA, MILANO, MODENA, MONZA_E_DELLA_BRIANZA, NAPOLI, NOVARA, NUORO, ORISTANO, PADOVA, PALERMO, PARMA, PAVIA, PERUGIA, PESARO_E_URBINO, PESCARA, PIACENZA, PISA, PISTOIA, PORDENONE, POTENZA, PRATO, RAGUSA, RAVENNA, REGGIO_CALABRIA, REGGIO_NELL_EMILIA, RIETI, RIMINI, ROMA, ROVIGO, SALERNO, SASSARI, SAVONA, SIENA, SIRACUSA, SONDRIO, SUD_SARDEGNA, TARANTO, TERAMO, TERNI, TORINO, TRAPANI, TRENTO, TREVISO, TRIESTE, UDINE, VARESE, VENEZIA, VERBANO_CUSIO_OSSOLA, VERCELLI, VERONA, VIBO_VALENTIA, VICENZA, VITERBO, AIN, AISNE, ALLIER, ALPES_DE_HAUTE_PROVENCE, HAUTES_ALPES, ALPES_MARITIMES, ARDECHE, ARDENNES, ARIEGE, AUBE, AUDE, AVEYRON, BOUCHES_DU_RHONE, CALVADOS, CANTAL, CHARENTE, CHARENTE_MARITIME, CHER, CORREZE, CORSE_DU_SUD, HAUTE_CORSE, COTE_D_OR, COTES_D_ARMOR, CREUSE, DORDOGNE, DOUBS, DROME, EURE, EURE_ET_LOIR, FINISTERE, GARD, HAUTE_GARONNE, GERS, GIRONDE, HERAULT, ILLE_ET_VILAINE, INDRE, INDRE_ET_LOIRE, ISERE, JURA, LANDES, LOIR_ET_CHER, LOIRE, HAUTE_LOIRE, LOIRE_ATLANTIQUE, LOIRET, LOT, LOT_ET_GARONNE, LOZERE, MAINE_ET_LOIRE, MANCHE, MARNE, HAUTE_MARNE, MAYENNE, MEURTHE_ET_MOSELLE, MEUSE, MORBIHAN, MOSELLE, NIEVRE, NORD, OISE, ORNE, PAS_DE_CALAIS, PUY_DE_DOME, PYRENEES_ATLANTIQUES, HAUTES_PYRENEES, PYRENEES_ORIENTALES, BAS_RHIN, HAUT_RHIN, RHONE, LYON_METROPOLIS, HAUTE_SAONE, SAONE_ET_LOIRE, SARTHE, SAVOIE, HAUTE_SAVOIE, PARIS, SEINE_MARITIME, SEINE_ET_MARNE, YVELINES, DEUX_SEVRES, SOMME, TARN, TARN_ET_GARONNE, VAR, VAUCLUSE, VENDEE, VIENNE, HAUTE_VIENNE, VOSGES, YONNE, TERRITOIRE_DE_BELFORT, ESSONNE, HAUTS_DE_SEINE, SEINE_SAINT_DENIS, VAL_DE_MARNE, VAL_D_OISE, GUADELOUPE, MARTINIQUE, GUYANE, LA_REUNION, SAINT_PIERRE_ET_MIQUELON, MAYOTTE, SAINT_BARTHELEMY, SAINT_MARTIN, TERRES_AUSTRALES_ET_ANTARCTIQUES_FRANCAISES, WALLIS_ET_FUTUNA, POLYNESIE_FRANCAISE, NOUVELLE_CALEDONIE, ILE_DE_CLIPPERTON, MONACO] |
| **surname** | **String**| Applications whose main&#39;s applicant surname contains the value. | [optional] |
| **docIdNumber** | **String**| Applications whose main&#39;s applicant doc id number equals to the value. | [optional] |
| **productType** | **String**| Applications whose financial product type equals to the value. | [optional] [enum: INTEREST_BEARING, ZERO_INTEREST, SUBSIDIZED_INTEREST, OPTION_PLUS, MULTIOPTION, LEASING, REFINANCING, BULLET, LOAN, SUBSCRIPTION, VARIABLE_RATE, RENTING, PROMOTION, STANDARD, BNPL, KIA_FLEXIBLE_RANGE_FINANCE, KIA_KREDIT, KIA_PROTECCION_CLIENTE, KIA_FLEXIPLAN] |
| **goodsType** | **String**| Applications whose code associated to the good/service sold equals to the value. | [optional] |
| **fromPreapprovalDate** | **OffsetDateTime**| Applications whose pre-approval date is after the date will be returned. | [optional] |
| **untilPreapprovalDate** | **OffsetDateTime**| Applications whose pre-approval date is prior to the date will be returned. | [optional] |
| **fromApprovalDate** | **OffsetDateTime**| Applications whose approval date is after the date will be returned. | [optional] |
| **untilApprovalDate** | **OffsetDateTime**| Applications whose approval date is prior to the date will be returned. | [optional] |
| **fromDocsSubmissionDate** | **OffsetDateTime**| Applications whose docs submission date is after the date will be returned. | [optional] |
| **untilDocsSubmissionDate** | **OffsetDateTime**| Applications whose docs submission date is prior to the date will be returned. | [optional] |
| **fromPayoutDate** | **OffsetDateTime**| Applications whose payout date is after the date will be returned. | [optional] |
| **untilPayoutDate** | **OffsetDateTime**| Applications whose payout date is prior to the date will be returned. | [optional] |
| **term** | **String**| Applications whose selected offer term equals to the value. | [optional] |
| **feeType** | **String**| Applications whose selected offer product type equals to the value. | [optional] [enum: INTEREST_BEARING, ZERO_INTEREST, SUBSIDIZED_INTEREST, OPTION_PLUS, MULTIOPTION, LEASING, REFINANCING, BULLET, LOAN, SUBSCRIPTION, VARIABLE_RATE, RENTING, PROMOTION, STANDARD, BNPL, KIA_FLEXIBLE_RANGE_FINANCE, KIA_KREDIT, KIA_PROTECCION_CLIENTE, KIA_FLEXIPLAN] |
| **fromLoanAmount** | **BigDecimal**| Applications whose selected offer loan amount is greater or equal than the value. | [optional] |
| **untilLoanAmount** | **BigDecimal**| Applications whose selected offer loan amount is lower or equal than the value. | [optional] |

### Return type

[**ApplicationApiSearchResponse**](ApplicationApiSearchResponse.md)

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
| **200** | Applications recovered successfully |  -  |
| **401** | You are not authorized, please check your API-KEY |  -  |

<a id="updateApplication"></a>
# **updateApplication**
> ApplicationResponse updateApplication(id, application, validate)

Updates an application

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    String id = "id_example"; // String | The id of the application, it can be a uuid or a numeric value. If the passed value is neither an uuid nor a numeric (integer) value an error will be thrown.
    Application application = new Application(); // Application | The payload of the application that is about to be updated
    Boolean validate = true; // Boolean | 
    try {
      ApplicationResponse result = apiInstance.updateApplication(id, application, validate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateApplication");
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
| **id** | **String**| The id of the application, it can be a uuid or a numeric value. If the passed value is neither an uuid nor a numeric (integer) value an error will be thrown. | |
| **application** | [**Application**](Application.md)| The payload of the application that is about to be updated | |
| **validate** | **Boolean**|  | [optional] [default to true] |

### Return type

[**ApplicationResponse**](ApplicationResponse.md)

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
| **200** | The application has been successfully updated |  -  |
| **401** | You are not authorized, please check your API-KEY |  -  |

<a id="uploadApplicationDocument"></a>
# **uploadApplicationDocument**
> uploadApplicationDocument(id, uploadApplicationDocumentRequest)

Creates an application document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApplicationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.lendismart.com/api");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ApplicationApi apiInstance = new ApplicationApi(defaultClient);
    String id = "id_example"; // String | The id of the application, it can be a uuid or a numeric value. If the passed value is neither an uuid nor a numeric (integer) value an error will be thrown.
    UploadApplicationDocumentRequest uploadApplicationDocumentRequest = new UploadApplicationDocumentRequest(); // UploadApplicationDocumentRequest | 
    try {
      apiInstance.uploadApplicationDocument(id, uploadApplicationDocumentRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#uploadApplicationDocument");
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
| **id** | **String**| The id of the application, it can be a uuid or a numeric value. If the passed value is neither an uuid nor a numeric (integer) value an error will be thrown. | |
| **uploadApplicationDocumentRequest** | [**UploadApplicationDocumentRequest**](UploadApplicationDocumentRequest.md)|  | [optional] |

### Return type

null (empty response body)

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
| **201** | Document successfully sent |  -  |
| **401** | You are not authorized, please check your API-KEY |  -  |

