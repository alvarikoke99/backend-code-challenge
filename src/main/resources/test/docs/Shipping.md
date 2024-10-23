

# Shipping

Information relate to the order shipping.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**surname1** | **String** |  |  [optional] |
|**surname2** | **String** |  |  [optional] |
|**phone** | **String** |  |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | Shipping method according to Lendismart&#39;s categories. |  [optional] |
|**methodName** | **String** | Shipping method according to the merchant&#39;s categories. |  [optional] |
|**provider** | **String** | Courier providing the shipping service, if applicable. |  [optional] |
|**days** | **Integer** | Estimated days until order delivery. |  [optional] |
|**price** | **String** | Shipping price (including any tax and/or discount). The calculation is as follows: price &#x3D; (preTaxPrice - discount) * (1 + taxRate) |  [optional] |
|**preTaxPrice** | **String** | Pre-tax shipping price. |  [optional] |
|**discount** | **String** | Shipping discount (in currency units). |  [optional] |
|**taxRate** | **String** | Shipping tax rate, expressed as a decimal. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| PICKUP_STORE | &quot;PICKUP_STORE&quot; |
| PICKUP_POINT | &quot;PICKUP_POINT&quot; |
| POSTAL | &quot;POSTAL&quot; |



