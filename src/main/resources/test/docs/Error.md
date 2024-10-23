

# Error

Will be returned when an error occurs when calling the API

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**httpStatusCode** | **Integer** | The returned HTTP status code |  [optional] |
|**message** | **String** | A human readable message about the error that may include tips on how to fix the error |  [optional] |
|**detailedMessage** | **String** | A developer focused message with more detailed information about the error that occurred |  [optional] |
|**errorCode** | [**ErrorCodeEnum**](#ErrorCodeEnum) | A code that identifies the error, can be used programmatically since it&#39;s unique |  [optional] |
|**validationErrors** | [**List&lt;ValidationError&gt;**](ValidationError.md) | An object that contains the validation errors, if there are any |  [optional] |
|**errorId** | **UUID** | A UUID that uniquely identifies the error. If you need help debugging the error you can pass this ID to Lendismart&#39;s staff |  [optional] |



## Enum: ErrorCodeEnum

| Name | Value |
|---- | -----|
| API_KEY_NOT_FOUND | &quot;API_KEY_NOT_FOUND&quot; |
| API_KEY_NOT_VALID | &quot;API_KEY_NOT_VALID&quot; |
| INVALID_USER_API_CONFIGURATION | &quot;INVALID_USER_API_CONFIGURATION&quot; |
| UNEXPECTED_ERROR | &quot;UNEXPECTED_ERROR&quot; |
| BAD_REQUEST | &quot;BAD_REQUEST&quot; |
| INVALID_PAYLOAD | &quot;INVALID_PAYLOAD&quot; |
| MALFORMED_APPLICATION_ID | &quot;MALFORMED_APPLICATION_ID&quot; |
| RESOURCE_NOT_FOUND | &quot;RESOURCE_NOT_FOUND&quot; |
| FORBIDDEN | &quot;FORBIDDEN&quot; |



