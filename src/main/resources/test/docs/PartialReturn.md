

# PartialReturn

Represents each of the partial returns requested in relation with an approved offer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier of the PartialReturn |  [optional] |
|**amount** | **String** | Partial return amount (requested or completed, depending on the returnState) |  [optional] |
|**comments** | **String** | Comments associated to the PartialReturn |  [optional] |
|**returnDate** | **OffsetDateTime** | Timestamp that indicates when the down payment status changed to COMPLETED |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | State of the partial return |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| NOT_REQUESTED | &quot;NOT_REQUESTED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |
| DENIED | &quot;DENIED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| CONFIRMED | &quot;CONFIRMED&quot; |
| PARTIALLY_RETURNED | &quot;PARTIALLY_RETURNED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



