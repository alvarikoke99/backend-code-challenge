

# Application

Represents a loan application

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
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
|**comments** | **String** |  |  [optional] |



## Enum: ManagedByEnum

| Name | Value |
|---- | -----|
| APPLICANT | &quot;APPLICANT&quot; |
| AGENT | &quot;AGENT&quot; |



