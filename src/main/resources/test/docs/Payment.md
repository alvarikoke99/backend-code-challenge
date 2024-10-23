

# Payment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier of the Payment |  [optional] |
|**externalId** | **String** | External identifier of the Payment Plan |  [optional] |
|**paymentPlanId** | **UUID** | The unique identifier of the Payment Plan |  [optional] |
|**externalTransactionId** | **String** | External identifier of the Payment |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of payment (initial, recurrent, final, etc.) |  [optional] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | Payment method used (e.g. VISA, MASTERCARD, SEPA debit, etc.) |  [optional] |
|**amount** | **BigDecimal** | Amount to be paid |  [optional] |
|**amountRefunded** | **BigDecimal** | Amount that has been refunded in relation with the Payment |  [optional] |
|**costs** | [**Set&lt;PaymentCost&gt;**](PaymentCost.md) | Represents the collection of costs from a payment |  [optional] |
|**paymentProcessor** | [**PaymentProcessorEnum**](#PaymentProcessorEnum) | Payment provider processing the Payment |  [optional] |
|**processorPaymentId** | **String** | Id used by the payment processor to uniquely identify the Payment |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | Currency in which the Payment is denominated |  [optional] |
|**dueDate** | **OffsetDateTime** | Instant when the Payment becomes due |  [optional] |
|**paymentDate** | **OffsetDateTime** | Instant when the Payment was successfully paid |  [optional] |
|**paymentNumber** | **Integer** | Payment number order in PaymentPlan |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the Payment |  [optional] |
|**resultCode** | **String** | Result |  [optional] |
|**resultDescription** | **String** | Result description |  [optional] |
|**errorDescription** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FIRST_PAYMENT | &quot;FIRST_PAYMENT&quot; |
| INSTALMENT | &quot;INSTALMENT&quot; |
| LAST_PAYMENT | &quot;LAST_PAYMENT&quot; |
| DOWN_PAYMENT | &quot;DOWN_PAYMENT&quot; |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| AFTERPAY | &quot;AFTERPAY&quot; |
| AMEX | &quot;AMEX&quot; |
| APPLEPAY | &quot;APPLEPAY&quot; |
| BANKTRANS | &quot;BANKTRANS&quot; |
| DIRECTBANK | &quot;DIRECTBANK&quot; |
| DINERS | &quot;DINERS&quot; |
| DISCOVER | &quot;DISCOVER&quot; |
| GOOGLEPAY | &quot;GOOGLEPAY&quot; |
| JCB | &quot;JCB&quot; |
| KLARNA | &quot;KLARNA&quot; |
| MAESTRO | &quot;MAESTRO&quot; |
| MASTERCARD | &quot;MASTERCARD&quot; |
| PAYAFTER | &quot;PAYAFTER&quot; |
| PAYPAL | &quot;PAYPAL&quot; |
| UNIONPAY | &quot;UNIONPAY&quot; |
| VISA | &quot;VISA&quot; |



## Enum: PaymentProcessorEnum

| Name | Value |
|---- | -----|
| MULTISAFEPAY | &quot;MULTISAFEPAY&quot; |
| STRIPE | &quot;STRIPE&quot; |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| AED | &quot;AED&quot; |
| AFN | &quot;AFN&quot; |
| ALL | &quot;ALL&quot; |
| AMD | &quot;AMD&quot; |
| ANG | &quot;ANG&quot; |
| AOA | &quot;AOA&quot; |
| ARS | &quot;ARS&quot; |
| AUD | &quot;AUD&quot; |
| AWG | &quot;AWG&quot; |
| AZN | &quot;AZN&quot; |
| BAM | &quot;BAM&quot; |
| BBD | &quot;BBD&quot; |
| BDT | &quot;BDT&quot; |
| BGN | &quot;BGN&quot; |
| BHD | &quot;BHD&quot; |
| BIF | &quot;BIF&quot; |
| BMD | &quot;BMD&quot; |
| BND | &quot;BND&quot; |
| BOB | &quot;BOB&quot; |
| BRL | &quot;BRL&quot; |
| BSD | &quot;BSD&quot; |
| BTN | &quot;BTN&quot; |
| BWP | &quot;BWP&quot; |
| BYR | &quot;BYR&quot; |
| BZD | &quot;BZD&quot; |
| CAD | &quot;CAD&quot; |
| CDF | &quot;CDF&quot; |
| CHF | &quot;CHF&quot; |
| CLP | &quot;CLP&quot; |
| CNY | &quot;CNY&quot; |
| COP | &quot;COP&quot; |
| CRC | &quot;CRC&quot; |
| CUC | &quot;CUC&quot; |
| CUP | &quot;CUP&quot; |
| CVE | &quot;CVE&quot; |
| CZK | &quot;CZK&quot; |
| DJF | &quot;DJF&quot; |
| DKK | &quot;DKK&quot; |
| DOP | &quot;DOP&quot; |
| DZD | &quot;DZD&quot; |
| EGP | &quot;EGP&quot; |
| ERN | &quot;ERN&quot; |
| ETB | &quot;ETB&quot; |
| EUR | &quot;EUR&quot; |
| FJD | &quot;FJD&quot; |
| FKP | &quot;FKP&quot; |
| GBP | &quot;GBP&quot; |
| GEL | &quot;GEL&quot; |
| GGP | &quot;GGP&quot; |
| GHS | &quot;GHS&quot; |
| GIP | &quot;GIP&quot; |
| GMD | &quot;GMD&quot; |
| GNF | &quot;GNF&quot; |
| GTQ | &quot;GTQ&quot; |
| GYD | &quot;GYD&quot; |
| HKD | &quot;HKD&quot; |
| HNL | &quot;HNL&quot; |
| HRK | &quot;HRK&quot; |
| HTG | &quot;HTG&quot; |
| HUF | &quot;HUF&quot; |
| IDR | &quot;IDR&quot; |
| ILS | &quot;ILS&quot; |
| IMP | &quot;IMP&quot; |
| INR | &quot;INR&quot; |
| IQD | &quot;IQD&quot; |
| IRR | &quot;IRR&quot; |
| ISK | &quot;ISK&quot; |
| JEP | &quot;JEP&quot; |
| JMD | &quot;JMD&quot; |
| JOD | &quot;JOD&quot; |
| JPY | &quot;JPY&quot; |
| KES | &quot;KES&quot; |
| KGS | &quot;KGS&quot; |
| KHR | &quot;KHR&quot; |
| KMF | &quot;KMF&quot; |
| KPW | &quot;KPW&quot; |
| KRW | &quot;KRW&quot; |
| KWD | &quot;KWD&quot; |
| KYD | &quot;KYD&quot; |
| KZT | &quot;KZT&quot; |
| LAK | &quot;LAK&quot; |
| LBP | &quot;LBP&quot; |
| LKR | &quot;LKR&quot; |
| LRD | &quot;LRD&quot; |
| LSL | &quot;LSL&quot; |
| LYD | &quot;LYD&quot; |
| MAD | &quot;MAD&quot; |
| MDL | &quot;MDL&quot; |
| MGA | &quot;MGA&quot; |
| MKD | &quot;MKD&quot; |
| MMK | &quot;MMK&quot; |
| MNT | &quot;MNT&quot; |
| MOP | &quot;MOP&quot; |
| MRO | &quot;MRO&quot; |
| MUR | &quot;MUR&quot; |
| MVR | &quot;MVR&quot; |
| MWK | &quot;MWK&quot; |
| MXN | &quot;MXN&quot; |
| MYR | &quot;MYR&quot; |
| MZN | &quot;MZN&quot; |
| NAD | &quot;NAD&quot; |
| NGN | &quot;NGN&quot; |
| NIO | &quot;NIO&quot; |
| NOK | &quot;NOK&quot; |
| NPR | &quot;NPR&quot; |
| NZD | &quot;NZD&quot; |
| OMR | &quot;OMR&quot; |
| PAB | &quot;PAB&quot; |
| PEN | &quot;PEN&quot; |
| PGK | &quot;PGK&quot; |
| PHP | &quot;PHP&quot; |
| PKR | &quot;PKR&quot; |
| PLN | &quot;PLN&quot; |
| PYG | &quot;PYG&quot; |
| QAR | &quot;QAR&quot; |
| RON | &quot;RON&quot; |
| RSD | &quot;RSD&quot; |
| RUB | &quot;RUB&quot; |
| RWF | &quot;RWF&quot; |
| SAR | &quot;SAR&quot; |
| SBD | &quot;SBD&quot; |
| SCR | &quot;SCR&quot; |
| SDG | &quot;SDG&quot; |
| SEK | &quot;SEK&quot; |
| SGD | &quot;SGD&quot; |
| SHP | &quot;SHP&quot; |
| SLL | &quot;SLL&quot; |
| SOS | &quot;SOS&quot; |
| SPL | &quot;SPL&quot; |
| SRD | &quot;SRD&quot; |
| STD | &quot;STD&quot; |
| SVC | &quot;SVC&quot; |
| SYP | &quot;SYP&quot; |
| SZL | &quot;SZL&quot; |
| THB | &quot;THB&quot; |
| TJS | &quot;TJS&quot; |
| TMT | &quot;TMT&quot; |
| TND | &quot;TND&quot; |
| TOP | &quot;TOP&quot; |
| TRY | &quot;TRY&quot; |
| TTD | &quot;TTD&quot; |
| TVD | &quot;TVD&quot; |
| TWD | &quot;TWD&quot; |
| TZS | &quot;TZS&quot; |
| UAH | &quot;UAH&quot; |
| UGX | &quot;UGX&quot; |
| USD | &quot;USD&quot; |
| UYU | &quot;UYU&quot; |
| UZS | &quot;UZS&quot; |
| VEF | &quot;VEF&quot; |
| VND | &quot;VND&quot; |
| VUV | &quot;VUV&quot; |
| WST | &quot;WST&quot; |
| XAF | &quot;XAF&quot; |
| XCD | &quot;XCD&quot; |
| XDR | &quot;XDR&quot; |
| XOF | &quot;XOF&quot; |
| XPF | &quot;XPF&quot; |
| YER | &quot;YER&quot; |
| ZAR | &quot;ZAR&quot; |
| ZMW | &quot;ZMW&quot; |
| ZWD | &quot;ZWD&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOT_DUE | &quot;NOT_DUE&quot; |
| DUE | &quot;DUE&quot; |
| AUTHORIZED | &quot;AUTHORIZED&quot; |
| INITIALIZED | &quot;INITIALIZED&quot; |
| CHARGEDBACK | &quot;CHARGEDBACK&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| COMPLETED_IN_STORE | &quot;COMPLETED_IN_STORE&quot; |
| UNCLEARED | &quot;UNCLEARED&quot; |
| RESERVED | &quot;RESERVED&quot; |
| REFUNDED | &quot;REFUNDED&quot; |
| PARTIAL_REFUNDED | &quot;PARTIAL_REFUNDED&quot; |
| DECLINED | &quot;DECLINED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| VOID | &quot;VOID&quot; |
| ERROR | &quot;ERROR&quot; |



