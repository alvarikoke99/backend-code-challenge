# openapi-java-client

Lendismart API
- API version: v2.0.0
  - Build date: 2024-10-23T19:03:15.118012600+02:00[Europe/Madrid]
  - Generator version: 7.9.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:v2.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
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

## Documentation for API Endpoints

All URIs are relative to *https://api-sandbox.lendismart.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationApi* | [**cancelApplication**](docs/ApplicationApi.md#cancelApplication) | **PUT** /v2/applications/{id}/cancel | Cancels an application if possible (i.e. if its state is not APPROVED nor RETURNED).
*ApplicationApi* | [**checkApiKey**](docs/ApplicationApi.md#checkApiKey) | **GET** /v2/applications/health-check | Checks the validity of an API-KEY
*ApplicationApi* | [**createApplication**](docs/ApplicationApi.md#createApplication) | **POST** /v2/applications | Creates a new application
*ApplicationApi* | [**getApplication**](docs/ApplicationApi.md#getApplication) | **GET** /v2/applications/{id} | Gets an existing application
*ApplicationApi* | [**offerReturnRequest**](docs/ApplicationApi.md#offerReturnRequest) | **PUT** /v2/applications/{id}/return | Initiates the return of an approved loan
*ApplicationApi* | [**searchApplications**](docs/ApplicationApi.md#searchApplications) | **GET** /v2/applications | Search applications
*ApplicationApi* | [**updateApplication**](docs/ApplicationApi.md#updateApplication) | **PUT** /v2/applications/{id} | Updates an application
*ApplicationApi* | [**uploadApplicationDocument**](docs/ApplicationApi.md#uploadApplicationDocument) | **POST** /v2/applications/{id}/document | Creates an application document.
*SimulationApi* | [**createLoanSimulation**](docs/SimulationApi.md#createLoanSimulation) | **POST** /v2/simulation | Creates a simulation
*UserApi* | [**createUser**](docs/UserApi.md#createUser) | **POST** /v2/users | Creates a new user
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /v2/users/{id} | Retrieves user information
*UserApi* | [**patchUser**](docs/UserApi.md#patchUser) | **PATCH** /v2/users/{id} | Patches a user
*UserApi* | [**searchUser**](docs/UserApi.md#searchUser) | **GET** /v2/users | Search users information
*UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PUT** /v2/users/{id} | Updates a user


## Documentation for Models

 - [Address](docs/Address.md)
 - [ApiLoanSimulationPayload](docs/ApiLoanSimulationPayload.md)
 - [Applicant](docs/Applicant.md)
 - [Application](docs/Application.md)
 - [ApplicationApiSearchResponse](docs/ApplicationApiSearchResponse.md)
 - [ApplicationDocument](docs/ApplicationDocument.md)
 - [ApplicationEvent](docs/ApplicationEvent.md)
 - [ApplicationResponse](docs/ApplicationResponse.md)
 - [Billing](docs/Billing.md)
 - [CancelApplication](docs/CancelApplication.md)
 - [Error](docs/Error.md)
 - [Events](docs/Events.md)
 - [Insurance](docs/Insurance.md)
 - [Item](docs/Item.md)
 - [LoanDetails](docs/LoanDetails.md)
 - [LoanSimulationResponseDTO](docs/LoanSimulationResponseDTO.md)
 - [Merchant](docs/Merchant.md)
 - [Offer](docs/Offer.md)
 - [Order](docs/Order.md)
 - [OrderHistory](docs/OrderHistory.md)
 - [PartialReturn](docs/PartialReturn.md)
 - [Payment](docs/Payment.md)
 - [PaymentCost](docs/PaymentCost.md)
 - [PreviousOrder](docs/PreviousOrder.md)
 - [ReturnRequest](docs/ReturnRequest.md)
 - [SearchApiMetaResponse](docs/SearchApiMetaResponse.md)
 - [Shipping](docs/Shipping.md)
 - [UploadApplicationDocumentRequest](docs/UploadApplicationDocumentRequest.md)
 - [User](docs/User.md)
 - [UserApiSearchResponse](docs/UserApiSearchResponse.md)
 - [ValidationError](docs/ValidationError.md)
 - [Vehicle](docs/Vehicle.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="api_key"></a>
### api_key

- **Type**: API key
- **API key parameter name**: API-KEY
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


