

# PreviousOrder

Previous order by the customer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**date** | **OffsetDateTime** | Timestamp of the order. |  [optional] |
|**amount** | **BigDecimal** | Order amount. |  [optional] |
|**currency** | **String** | Currency of the order. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Order status according to Lendismart&#39;s categories. |  [optional] |
|**statusName** | **String** | Order status according to the merchant&#39;s own categories. |  [optional] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | Payment method according to Lendismart&#39;s categories. |  [optional] |
|**paymentMethodName** | **String** | Payment method according to the merchant&#39;s own categories. |  [optional] |
|**postalCode** | **String** | Postal code to which the order was shipped. |  [optional] |
|**countryIso** | **String** | The ISO-3166-1 alpha-2 code of the country to which the order was shipped. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| CANCELED | &quot;CANCELED&quot; |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| TRANSFER | &quot;TRANSFER&quot; |
| DEPOSIT | &quot;DEPOSIT&quot; |
| LOAN | &quot;LOAN&quot; |
| CREDIT_CARD | &quot;CREDIT_CARD&quot; |
| ON_DELIVERY | &quot;ON_DELIVERY&quot; |
| DEBIT_CARD | &quot;DEBIT_CARD&quot; |
| DIGITAL_WALLET | &quot;DIGITAL_WALLET&quot; |
| CASH | &quot;CASH&quot; |
| OTHER | &quot;OTHER&quot; |



