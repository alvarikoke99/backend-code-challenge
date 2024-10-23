

# LoanDetails

Represents the loan details of an Application

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestedAmount** | **String** | The amount of the loan, the value should be less than 100,000 |  [optional] |
|**maxMonthlyPayment** | **String** | The maximum monthly instalment the applicant is willing to pay for the loan |  [optional] |
|**term** | **Integer** | The desired number of terms in which the loan will be payed. |  [optional] |
|**financingPromotion** | **String** | Some businesses offer special promotions when the goods or services sold are financed (i.e. this is a very common practice in the Motor industry). In such cases, this field indicates the discount in currency units. |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | The desired financial product type (e.g. interest-free, interest-bearing, etc.) |  [optional] |
|**openingFeePct** | **String** | The desired maximum opening fee (expressed as a decimal) |  [optional] |
|**maxNir** | **String** | The desired maximum nominal interest rate (expressed as a decimal) |  [optional] |
|**feePaymentType** | [**FeePaymentTypeEnum**](#FeePaymentTypeEnum) | The preferred type of fee payment (if not zero) |  [optional] |
|**gracePeriod** | **Integer** | The desired grace period in months - initial period during which the loan doesn&#39;t have to be repaid |  [optional] |
|**monthlyDueDate** | **Integer** | The preferred date of the month on which the payment will be due (not every lender takes it into account) |  [optional] |
|**insurance** | **Boolean** | Indicates whether preference should be given to offers that include (true) or don&#39;t include (false) an insurance |  [optional] |
|**noAccount** | **Boolean** | If true, it indicates that the customer doesn&#39;t have the account number on hand (certain lenders are able to score applications without the account number, although it must be provided later if preapproved) |  [optional] |
|**applicantType** | [**ApplicantTypeEnum**](#ApplicantTypeEnum) | It indicates whether the applicant is an individual or a company |  [optional] |
|**maxMerchantCost** | **String** | It indicates the maximum cost (in currency units) the merchant is willing to bear to subsidize loan interests |  [optional] |
|**maxMerchantCostPct** | **String** | It indicates the maximum cost (expressed as a decimal) the merchant is willing to bear to subsidize loan interests |  [optional] |



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



## Enum: ApplicantTypeEnum

| Name | Value |
|---- | -----|
| PERSONAL | &quot;PERSONAL&quot; |
| BUSINESS | &quot;BUSINESS&quot; |
| CONDO_ASSOCIATION | &quot;CONDO_ASSOCIATION&quot; |



