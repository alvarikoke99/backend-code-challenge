

# ApplicationEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**application** | [**ApplicationResponse**](ApplicationResponse.md) |  |  [optional] |
|**payment** | [**Payment**](Payment.md) |  |  [optional] |
|**eventsUrl** | **String** |  |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| OFFER_UPDATE | &quot;OFFER_UPDATE&quot; |
| STATE_UPDATE | &quot;STATE_UPDATE&quot; |
| SIGNATURE_UPDATE | &quot;SIGNATURE_UPDATE&quot; |
| INCIDENT_UPDATE | &quot;INCIDENT_UPDATE&quot; |
| COMMENT_UPDATE | &quot;COMMENT_UPDATE&quot; |
| DELETED | &quot;DELETED&quot; |
| PAYMENT_STATE_CHANGE | &quot;PAYMENT_STATE_CHANGE&quot; |
| DOCS_UPDATE | &quot;DOCS_UPDATE&quot; |
| DOWN_PAYMENT | &quot;DOWN_PAYMENT&quot; |
| PARTIAL_RETURN | &quot;PARTIAL_RETURN&quot; |



