

# OrderHistory

Customer history in the merchant's shop

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**customerId** | **String** | Customer ID in the shop. |  [optional] |
|**customerSince** | **OffsetDateTime** | Timestamp of the account creation. |  [optional] |
|**rating** | **String** | Customer rating according to the merchant&#39;s own scoring. |  [optional] |
|**lastLogin** | **OffsetDateTime** | Timestamp of the customer&#39;s last login to the merchant&#39;s online shop. |  [optional] |
|**completedOrdersCount** | **Integer** | Number of orders completed by the customer since the account was created. |  [optional] |
|**completedOrdersAmount** | **BigDecimal** | Total amount spent on orders completed by the customer since the account was created. |  [optional] |
|**previousOrders** | [**Set&lt;PreviousOrder&gt;**](PreviousOrder.md) | List of the customer&#39;s most recent orders (up to 10). |  [optional] |



