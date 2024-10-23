

# Item

Optional field that represents the collection items included in the order (by default this field is not required).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**name** | **String** | Name/description of the item. |  [optional] |
|**type** | **String** | Type of good or service sold. |  [optional] |
|**quantity** | **Integer** | Quantity of the item included in the order. |  [optional] |
|**price** | **String** | Price per unit of the item (including any tax and/or discount). The calculation of the unit price is: price &#x3D; (preTaxPrice - discount) * (1 + taxRate) |  [optional] |
|**preTaxPrice** | **String** | Pre-tax price per unit of the item. |  [optional] |
|**discount** | **String** | Discount per unit of the item (in currency units). |  [optional] |
|**taxRate** | **String** | Article tax rate, expressed as a decimal (e.g. &#39;0.21&#39;). |  [optional] |
|**reference** | **String** | Serial number / reference of the item. |  [optional] |
|**category** | **String** | Category of the item. |  [optional] |
|**subcategory** | **String** | Subcategory of the item. |  [optional] |
|**description** | **String** | Product description. |  [optional] |
|**url** | **String** | Product page URL in the shop. |  [optional] |
|**imageUrl** | **String** | Item image absolute URL. |  [optional] |



