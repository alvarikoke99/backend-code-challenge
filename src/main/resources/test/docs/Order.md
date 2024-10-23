

# Order

Includes the details of the good or service that is going to be financed

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**goodsType** | **String** | Code associated to the good/service sold. The available codes are dependant on the specific merchant and must be provided by Lendismart. |  [optional] |
|**serviceDuration** | [**ServiceDurationEnum**](#ServiceDurationEnum) | The duration of the service/s sold (it doesn&#39;t apply to the sale of goods). |  [optional] |
|**reference** | **String** | This field can be used by the merchant to identify the order to which the loan is referring. |  [optional] |
|**purchaseAmount** | **String** | The total amount of the purchase. |  [optional] |
|**vehicle** | [**Vehicle**](Vehicle.md) |  |  [optional] |
|**items** | [**Set&lt;Item&gt;**](Item.md) | Optional field that represents the collection items included in the order (by default this field is not required). |  [optional] |
|**billing** | [**Billing**](Billing.md) |  |  [optional] |
|**shipping** | [**Shipping**](Shipping.md) |  |  [optional] |
|**history** | [**OrderHistory**](OrderHistory.md) |  |  [optional] |



## Enum: ServiceDurationEnum

| Name | Value |
|---- | -----|
| ZERO_TO_THREE_MONTHS | &quot;ZERO_TO_THREE_MONTHS&quot; |
| THREE_TO_SIX_MONTHS | &quot;THREE_TO_SIX_MONTHS&quot; |
| SIX_TO_NINE_MONTHS | &quot;SIX_TO_NINE_MONTHS&quot; |
| NINE_TO_TWELVE_MONTHS | &quot;NINE_TO_TWELVE_MONTHS&quot; |
| TWELVE_TO_EIGHTEEN_MONTHS | &quot;TWELVE_TO_EIGHTEEN_MONTHS&quot; |
| EIGHTEEN_TO_TWENTY_FOUR_MONTHS | &quot;EIGHTEEN_TO_TWENTY_FOUR_MONTHS&quot; |
| TWENTY_FOUR_TO_THIRTY_MONTHS | &quot;TWENTY_FOUR_TO_THIRTY_MONTHS&quot; |
| MORE_THAN_THIRTY_MONTHS | &quot;MORE_THAN_THIRTY_MONTHS&quot; |



