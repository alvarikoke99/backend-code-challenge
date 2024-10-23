

# Events

Holds information about the events e.g. callback url, event types you're interested in ...

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventsURL** | **String** | The URL we will POST event information when an event occurs |  |
|**eventTypes** | [**Set&lt;EventTypesEnum&gt;**](#Set&lt;EventTypesEnum&gt;) | The events that you want to be notified about. If left empty or null we will assume that you&#39;re interested in all of them. |  [optional] |



## Enum: Set&lt;EventTypesEnum&gt;

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



