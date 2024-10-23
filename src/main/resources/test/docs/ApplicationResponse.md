

# ApplicationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The main identifier of the Application |  [optional] |
|**applicants** | [**List&lt;Applicant&gt;**](Applicant.md) | Represents the collection of applicants who are applying for a loan. At least one applicant is required |  [optional] |
|**merchant** | [**Merchant**](Merchant.md) |  |  |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**loanDetails** | [**LoanDetails**](LoanDetails.md) |  |  [optional] |
|**sendLeadEmail** | **Boolean** | If the flag is true an email will be sent to the main applicant informing him/her that an Application has been created. Please note that if this flag is set to true,  the MAIN_APPLICANT&#39;s email field should have a valid value. Also, if this flag is true the managedBy field will be set to APPLICANT automatically |  [optional] |
|**phoneValidationRequired** | **Boolean** | If the flag is false mobile phone validation will be skipped |  [optional] |
|**signatureDisabled** | **Boolean** | If this flag is true the signature will be disabled until it is set to false |  [optional] |
|**managedBy** | [**ManagedByEnum**](#ManagedByEnum) | Indicates who is responsible for managing the Application creation and submission |  [optional] |
|**applicationTtlSec** | **Integer** | Indicates for how long you as as merchant are willing to keep an application alive in seconds. This value will determine for how long the &#39;token&#39; field will be valid. If this field is not specified and the &#39;managedBy&#39; field is set to APPLICANT, a default value of one week will be assigned |  [optional] |
|**sessionTtlSec** | **Integer** | Indicates how long the session in Lendismart will last in seconds once you&#39;ve opened the widget via the &#39;openCheckout&#39; method of the JavaScript SDK or you have redirected the user to the applicantUrl. You should try to align the Lendismart session ttl with you own session ttl. Only applies if the &#39;managedBy&#39; field is set to APPLICANT. |  [optional] |
|**primaryColor** | **String** | Allows for the customization of the UI color (only applies to applications &#39;managed by applicant&#39;). It should be passed as the color&#39;s hexadecimal code preceded by a # |  [optional] |
|**showDenials** | **Boolean** | Indicates if denied offers must be shown to the applicant |  [optional] |
|**ipAddress** | **String** | Customer IP address. |  [optional] |
|**userAgent** | **String** | Customer user agent. |  [optional] |
|**comments** | **String** | Comments you may want to make about this particular Application can be placed here |  [optional] |
|**readableId** | **Long** | The secondary identifier of the Application. It&#39;s more user friendly and UI oriented |  [optional] |
|**applicationUiUrl** | **String** | URL where the Application can be accessed in Lendismart&#39;s UI |  [optional] |
|**applicantUrl** | **String** | URL where the Applicant should be pointed to when a merchant needs the Applicant to sign the contract and upload the documentation and does not want to use the JavaScript SDK for this purpose. |  [optional] |
|**token** | **String** | Token that is meant to be used in the browser in order to open the checkout widget |  [optional] |
|**creationDate** | **OffsetDateTime** | Timestamp that indicates when the Application has been created |  [optional] |
|**cancellationDate** | **OffsetDateTime** | Timestamp that indicates when the Application has been cancelled |  [optional] |
|**cancellationReason** | [**CancellationReasonEnum**](#CancellationReasonEnum) | The reason why the application got cancelled |  [optional] |
|**clonedFromId** | **UUID** | If the Application has been cloned from another Application, it represents de Id of the original Application |  [optional] |
|**clonedFromReadableId** | **Long** | If the Application has been cloned from another Application, it represents de readableId of the original Application |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state the Application, checkout the docs for a detailed explanation about the different available states |  [optional] |
|**paymentAuthorizationCode** | **String** | When applicable, payment authorization code used for the settlement of the purchase price |  [optional] |
|**selectedOffer** | [**Offer**](Offer.md) |  |  [optional] |
|**deselectedOffer** | [**Offer**](Offer.md) |  |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | Represents where was the application created in initially |  [optional] |



## Enum: ManagedByEnum

| Name | Value |
|---- | -----|
| APPLICANT | &quot;APPLICANT&quot; |
| AGENT | &quot;AGENT&quot; |



## Enum: CancellationReasonEnum

| Name | Value |
|---- | -----|
| OTHER_PAYMENT_METHOD | &quot;OTHER_PAYMENT_METHOD&quot; |
| OTHER_FINANCING_OPTION | &quot;OTHER_FINANCING_OPTION&quot; |
| NO_LONGER_INTERESTED | &quot;NO_LONGER_INTERESTED&quot; |
| DUPLICATED_APPLICATION | &quot;DUPLICATED_APPLICATION&quot; |
| CLONED_APPLICATION | &quot;CLONED_APPLICATION&quot; |
| NON_ELIGIBLE | &quot;NON_ELIGIBLE&quot; |
| IRREGULAR_DOCUMENTS | &quot;IRREGULAR_DOCUMENTS&quot; |
| ILLNESS | &quot;ILLNESS&quot; |
| SERVICE_PERIOD_EXCEEDED | &quot;SERVICE_PERIOD_EXCEEDED&quot; |
| QUOTE_INCREASE | &quot;QUOTE_INCREASE&quot; |
| NOT_SPECIFIED | &quot;NOT_SPECIFIED&quot; |
| TTL_CONCLUDED | &quot;TTL_CONCLUDED&quot; |
| JUST_BROWSING | &quot;JUST_BROWSING&quot; |
| TOO_EXPENSIVE | &quot;TOO_EXPENSIVE&quot; |
| UNCLEAR_TERMS | &quot;UNCLEAR_TERMS&quot; |
| ERROR_OCCURRED | &quot;ERROR_OCCURRED&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| PREAPPROVED | &quot;PREAPPROVED&quot; |
| SUBMITTING | &quot;SUBMITTING&quot; |
| PENDING_REVIEW | &quot;PENDING_REVIEW&quot; |
| PENDING_DATA | &quot;PENDING_DATA&quot; |
| PENDING_SUBMISSION | &quot;PENDING_SUBMISSION&quot; |
| DRAFT | &quot;DRAFT&quot; |
| ERROR | &quot;ERROR&quot; |
| DENIED | &quot;DENIED&quot; |
| CANCELED | &quot;CANCELED&quot; |
| RETURNED | &quot;RETURNED&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| PORTAL | &quot;PORTAL&quot; |
| API | &quot;API&quot; |



