

# LoanSimulationResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**purchaseAmount** | **String** | The total amount of the purchase. |  [optional] |
|**loanAmount** | **String** | The amount that could be financed through the loan (it might differ from the requested amount if maximum/minimum thresholds apply) |  [optional] |
|**term** | **Integer** | The desired number of terms in which the loan will be payed. |  [optional] |
|**gracePeriod** | **Integer** | The desired grace period in months - initial period during which the loan doesn&#39;t have to be repaid |  [optional] |
|**openingFeePct** | **String** | The desired maximum opening fee (per currency unit) |  [optional] |
|**openingFeeCost** | **String** | Opening fee cost, wether paid upfront or financed over the course of the loan |  [optional] |
|**openingFeeUpfront** | **String** | If the opening fee is greater than zero and the feePaymentType is &#39;UPFRONT&#39;, the opening fee upfront associated to it |  [optional] |
|**insuranceCost** | **String** | Cost of the insurance |  [optional] |
|**insuranceUpfront** | **String** | If the loan includes an insurance product and the insurancePaymentType is &#39;UPFRONT&#39;, the insurance upfront associated to it |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | The desired financial product type (e.g. interest-free, interest-bearing, etc.) |  [optional] |
|**productTypeLabel** | **String** | The translated productType label according to languageTag code |  [optional] |
|**feePaymentType** | [**FeePaymentTypeEnum**](#FeePaymentTypeEnum) | The preferred type of fee payment (if not zero) |  [optional] |
|**nir** | **String** | The nominal annual rate to apply |  [optional] |
|**apr** | **String** | The annual percentage rate to apply |  [optional] |
|**hasInsurance** | **Boolean** | Whether the loan includes an insurance or not. |  [optional] |
|**downPayment** | **String** | Down payment to be paid by the applicant in relation with the loan |  [optional] |
|**monthlyPayment** | **String** | The monthly instalment the applicant will have to pay for the loan |  [optional] |
|**finalPayment** | **String** | Final payment to be paid in relation with the loan |  [optional] |
|**totalPayments** | **String** | Total payments to be paid in relation with the loan |  [optional] |
|**totalCost** | **String** | Cost of the loan |  [optional] |
|**totalInterest** | **String** | Total interest to be paid in relation with the loan |  [optional] |
|**simulationMessage** | **String** | Detailed descriptions of the financial terms of the loan |  [optional] |
|**merchantCost** | **String** | Cost of the loan to the merchant (discount, if positive), or intermediation commission (if negative) |  [optional] |
|**lenderCode** | **String** | Code of the lender associated with the product returned in the simulation. |  [optional] |
|**lenderName** | **String** | Name of the lender associated with the product returned in the simulation. |  [optional] |
|**lenders** | **Set&lt;String&gt;** | Code of the available lenders whose products were considered in the simulation results. |  [optional] |
|**goodsTypeCode** | **String** | Code associated to the good/service sold. |  [optional] |
|**insurances** | [**List&lt;Insurance&gt;**](Insurance.md) | Insurances included in the offer |  [optional] |
|**currency** | **String** | Currency symbol. |  [optional] |



## Enum: ProductTypeEnum

| Name | Value |
|---- | -----|
| INTEREST_BEARING | &quot;INTEREST_BEARING&quot; |
| ZERO_INTEREST | &quot;ZERO_INTEREST&quot; |
| SUBSIDIZED_INTEREST | &quot;SUBSIDIZED_INTEREST&quot; |
| OPTION_PLUS | &quot;OPTION_PLUS&quot; |
| MULTIOPTION | &quot;MULTIOPTION&quot; |
| LEASING | &quot;LEASING&quot; |
| REFINANCING | &quot;REFINANCING&quot; |
| BULLET | &quot;BULLET&quot; |
| LOAN | &quot;LOAN&quot; |
| SUBSCRIPTION | &quot;SUBSCRIPTION&quot; |
| VARIABLE_RATE | &quot;VARIABLE_RATE&quot; |
| RENTING | &quot;RENTING&quot; |
| PROMOTION | &quot;PROMOTION&quot; |
| STANDARD | &quot;STANDARD&quot; |
| BNPL | &quot;BNPL&quot; |
| KIA_FLEXIBLE_RANGE_FINANCE | &quot;KIA_FLEXIBLE_RANGE_FINANCE&quot; |
| KIA_KREDIT | &quot;KIA_KREDIT&quot; |
| KIA_PROTECCION_CLIENTE | &quot;KIA_PROTECCION_CLIENTE&quot; |
| KIA_FLEXIPLAN | &quot;KIA_FLEXIPLAN&quot; |



## Enum: FeePaymentTypeEnum

| Name | Value |
|---- | -----|
| UPFRONT | &quot;UPFRONT&quot; |
| FINANCED | &quot;FINANCED&quot; |



