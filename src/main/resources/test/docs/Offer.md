

# Offer

Represents one of the loan options provided by a specific lender

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier of the Offer |  [optional] |
|**lenderApplicationId1** | **String** | The identifier assigned by the Lender to the Offer, which may be helpful for the resolution of incidents |  [optional] |
|**lenderApplicationId2** | **String** | Some lenders assign two different identifiers to an Offer |  [optional] |
|**lenderSignatureId** | **String** | Some lenders provide a code for the identification of the digital signature session, which may be helpful for the resolution of incidents |  [optional] |
|**lender** | [**LenderEnum**](#LenderEnum) | The lender providing the loan offer |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The Offer&#39;s state |  [optional] |
|**submissionOrder** | **Integer** | Order in which the Offer was sent to its corresponding Lender (among all Offers) |  [optional] |
|**signatureMethodUsed** | [**SignatureMethodUsedEnum**](#SignatureMethodUsedEnum) | Method used for the signature of the loan contract by the applicant/s |  [optional] |
|**signatureDate** | **OffsetDateTime** | Timestamp that indicates when the Offer has been signed |  [optional] |
|**preapprovalDate** | **OffsetDateTime** | Timestamp that indicates when the Offer has been preapproved |  [optional] |
|**approvalDate** | **OffsetDateTime** | Timestamp that indicates when the Offer has been approved |  [optional] |
|**payOutDate** | **OffsetDateTime** | Timestamp that indicates when the loan funds have been paid out to the merchant |  [optional] |
|**returnedDate** | **OffsetDateTime** | Timestamp that indicates when the Offer has been returned |  [optional] |
|**docsSubmitted** | **Boolean** | Whether the documents related to the application have been sent to the lender |  [optional] |
|**firstDocsSubmissionDate** | **OffsetDateTime** | Timestamp that indicates when the documents related to the application were sent to the lender for the first time |  [optional] |
|**cancellationDate** | **OffsetDateTime** | Timestamp that indicates when the Offer was cancelled |  [optional] |
|**errorType** | [**ErrorTypeEnum**](#ErrorTypeEnum) | Type of error preventing the scoring of the Offer by the lender |  [optional] |
|**error** | **String** | Text detailing the error preventing the scoring of the Offer by the lender |  [optional] |
|**incidentType** | [**IncidentTypeEnum**](#IncidentTypeEnum) | Type of incident preventing the approval of tht Offer |  [optional] |
|**incident** | **String** | Text detailing the incident preventing the approval of the Offer |  [optional] |
|**loanAmount** | **String** | The amount that could be financed through the Offer (it might differ from the requested amount if maximum/minimum thresholds apply) |  [optional] |
|**monthlyPayment** | **String** | The monthly instalment the applicant will have to pay for the loan |  [optional] |
|**productCode** | **String** | Identifier of the specific financial product in the Lendismart, defined by its main characteristics (lender, term, productType, etc.) |  [optional] |
|**term** | **Integer** | The number of terms in which the loan will be payed |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | The financial product type (e.g. interest-free, interest-bearing, etc.) |  [optional] |
|**nir** | **String** | The nominal interest rate associated to the Offer |  [optional] |
|**apr** | **String** | The annual percentage rate associated to the Offer |  [optional] |
|**openingFeePct** | **String** | The  opening fee (per currency unit) associated to the Offer |  [optional] |
|**feePaymentType** | [**FeePaymentTypeEnum**](#FeePaymentTypeEnum) | The type of fee payment (if not zero) |  [optional] |
|**openingFeeUpfrontPayment** | **String** | If the opening fee is greater than zero and the feePaymentType is &#39;UPFRONT&#39;, the upfront payment associated to it |  [optional] |
|**openingFeeCost** | **String** | Opening fee cost, wether paid upfront or financed over the course of the loan |  [optional] |
|**gracePeriod** | **Integer** | The grace period in months - initial period during which the loan doesn&#39;t have to be repaid |  [optional] |
|**insurance** | **Boolean** | Whether the Offer embeds an insurance product |  [optional] |
|**insurancePaymentType** | [**InsurancePaymentTypeEnum**](#InsurancePaymentTypeEnum) | If the Offer includes an insurance product, this field indicates if the insurance cost is finance or financed and included in the loan monthly payment |  [optional] |
|**insuranceUpfrontPayment** | **String** | If the Offer includes an insurance product and the insurancePaymentType is &#39;UPFRONT&#39;, the upfront payment associated to it |  [optional] |
|**merchantCost** | **String** | Cost of the loan to the merchant (discount) |  [optional] |
|**downPayment** | **String** | Down payment to be paid by the applicant in relation with the Offer |  [optional] |
|**downPaymentStatus** | [**DownPaymentStatusEnum**](#DownPaymentStatusEnum) | Status of the down payment. It will be set to NOT_DUE if it mustn&#39;t be paid through Lendismart (e.g. to be paid in cash). It will be set to COMPLETED when it has already been paid |  [optional] |
|**downPaymentTimestamp** | **OffsetDateTime** | Timestamp that indicates when the down payment status changed to COMPLETED |  [optional] |
|**returnState** | [**ReturnStateEnum**](#ReturnStateEnum) | State of the return of an approved loan |  [optional] |
|**partialReturns** | [**List&lt;PartialReturn&gt;**](PartialReturn.md) | Partial returns associated to the offer |  [optional] |
|**insurances** | [**List&lt;Insurance&gt;**](Insurance.md) | Insurances included in the offer |  [optional] |



## Enum: LenderEnum

| Name | Value |
|---- | -----|
| AUTOFIN | &quot;AUTOFIN&quot; |
| ABANCA | &quot;ABANCA&quot; |
| AKF | &quot;AKF&quot; |
| ALMA | &quot;ALMA&quot; |
| APLAZAME | &quot;APLAZAME&quot; |
| AIS | &quot;AIS&quot; |
| APK_RENTING | &quot;APK_RENTING&quot; |
| BANCO_SANTANDER | &quot;BANCO_SANTANDER&quot; |
| BANKINTER | &quot;BANKINTER&quot; |
| BBVA | &quot;BBVA&quot; |
| CAIXABANK | &quot;CAIXABANK&quot; |
| CAJAMAR | &quot;CAJAMAR&quot; |
| CAJA_RURAL | &quot;CAJA_RURAL&quot; |
| CARREFOUR_PASS | &quot;CARREFOUR_PASS&quot; |
| CETELEM | &quot;CETELEM&quot; |
| COFIDIS | &quot;COFIDIS&quot; |
| CONFIA | &quot;CONFIA&quot; |
| CREDIBOX | &quot;CREDIBOX&quot; |
| EQUIFAX | &quot;EQUIFAX&quot; |
| EVO_FINANCE | &quot;EVO_FINANCE&quot; |
| FCA | &quot;FCA&quot; |
| FINDIRECT | &quot;FINDIRECT&quot; |
| FLOA | &quot;FLOA&quot; |
| FRAKMENTA | &quot;FRAKMENTA&quot; |
| GREEN_HOME_FINANCE | &quot;GREEN_HOME_FINANCE&quot; |
| HONDA | &quot;HONDA&quot; |
| HYUNDAI | &quot;HYUNDAI&quot; |
| INSTANT_CREDIT | &quot;INSTANT_CREDIT&quot; |
| KIA | &quot;KIA&quot; |
| KUTXABANK | &quot;KUTXABANK&quot; |
| LEA_BANK | &quot;LEA_BANK&quot; |
| MICROCREDIT | &quot;MICROCREDIT&quot; |
| ONEY | &quot;ONEY&quot; |
| PAYIN7 | &quot;PAYIN7&quot; |
| PEPPER | &quot;PEPPER&quot; |
| PONTIO | &quot;PONTIO&quot; |
| RCI_BANQUE | &quot;RCI_BANQUE&quot; |
| SABADELL | &quot;SABADELL&quot; |
| SANTANDER | &quot;SANTANDER&quot; |
| SEQURA | &quot;SEQURA&quot; |
| SOYOU | &quot;SOYOU&quot; |
| STELLANTIS | &quot;STELLANTIS&quot; |
| SUZUKI | &quot;SUZUKI&quot; |
| UFA | &quot;UFA&quot; |
| VOLVO | &quot;VOLVO&quot; |
| VWFS | &quot;VWFS&quot; |
| YOUNITED | &quot;YOUNITED&quot; |
| YOUNITED_CREDIT | &quot;YOUNITED_CREDIT&quot; |
| ZAPLO | &quot;ZAPLO&quot; |
| LENDIFINANCE | &quot;LENDIFINANCE&quot; |
| LENDIPLAN | &quot;LENDIPLAN&quot; |
| LENDIPLAN_SUBSCRIPTIONS | &quot;LENDIPLAN_SUBSCRIPTIONS&quot; |
| LENDROCK | &quot;LENDROCK&quot; |
| MERCEDES | &quot;MERCEDES&quot; |
| ALMA_FR | &quot;ALMA_FR&quot; |
| FLOA_FR | &quot;FLOA_FR&quot; |
| LENDIFINANCE_FR | &quot;LENDIFINANCE_FR&quot; |
| LENDIPLAN_FR | &quot;LENDIPLAN_FR&quot; |
| LENDIPLAN_SUBSCRIPTIONS_FR | &quot;LENDIPLAN_SUBSCRIPTIONS_FR&quot; |
| SEQURA_FR | &quot;SEQURA_FR&quot; |
| YOUNITED_FR | &quot;YOUNITED_FR&quot; |
| ALMA_DE | &quot;ALMA_DE&quot; |
| FLOA_DE | &quot;FLOA_DE&quot; |
| LENDIFINANCE_DE | &quot;LENDIFINANCE_DE&quot; |
| LENDIPLAN_DE | &quot;LENDIPLAN_DE&quot; |
| LENDIPLAN_SUBSCRIPTIONS_DE | &quot;LENDIPLAN_SUBSCRIPTIONS_DE&quot; |
| NELLY_DE | &quot;NELLY_DE&quot; |
| RATEPAY_DE | &quot;RATEPAY_DE&quot; |
| UNZER_DE | &quot;UNZER_DE&quot; |
| SEQURA_DE | &quot;SEQURA_DE&quot; |
| YOUNITED_DE | &quot;YOUNITED_DE&quot; |
| ALMA_IT | &quot;ALMA_IT&quot; |
| FLOA_IT | &quot;FLOA_IT&quot; |
| LENDIFINANCE_IT | &quot;LENDIFINANCE_IT&quot; |
| LENDIPLAN_IT | &quot;LENDIPLAN_IT&quot; |
| LENDIPLAN_SUBSCRIPTIONS_IT | &quot;LENDIPLAN_SUBSCRIPTIONS_IT&quot; |
| SCALAPAY_IT | &quot;SCALAPAY_IT&quot; |
| SELLA_IT | &quot;SELLA_IT&quot; |
| SEQURA_IT | &quot;SEQURA_IT&quot; |
| YOUNITED_IT | &quot;YOUNITED_IT&quot; |
| SPRAY_PAY_NL | &quot;SPRAY_PAY_NL&quot; |
| ABANCA_PT | &quot;ABANCA_PT&quot; |
| ALMA_PT | &quot;ALMA_PT&quot; |
| BBVA_PT | &quot;BBVA_PT&quot; |
| CETELEM_PT | &quot;CETELEM_PT&quot; |
| COFIDIS_PT | &quot;COFIDIS_PT&quot; |
| COFIDIS_WEB_PT | &quot;COFIDIS_WEB_PT&quot; |
| CREDIBOM_PT | &quot;CREDIBOM_PT&quot; |
| FLOA_PT | &quot;FLOA_PT&quot; |
| LENDIFINANCE_PT | &quot;LENDIFINANCE_PT&quot; |
| LENDIPLAN_PT | &quot;LENDIPLAN_PT&quot; |
| LENDIPLAN_SUBSCRIPTIONS_PT | &quot;LENDIPLAN_SUBSCRIPTIONS_PT&quot; |
| MONTEPIO_PT | &quot;MONTEPIO_PT&quot; |
| PRIMUS_PT | &quot;PRIMUS_PT&quot; |
| SEQURA_PT | &quot;SEQURA_PT&quot; |
| YOUNITED_PT | &quot;YOUNITED_PT&quot; |
| LENDIFINANCE_UK | &quot;LENDIFINANCE_UK&quot; |
| LENDIPLAN_UK | &quot;LENDIPLAN_UK&quot; |
| LENDIPLAN_SUBSCRIPTIONS_UK | &quot;LENDIPLAN_SUBSCRIPTIONS_UK&quot; |
| BUYLINE_UK | &quot;BUYLINE_UK&quot; |
| PAYMENT_ASSIST_UK | &quot;PAYMENT_ASSIST_UK&quot; |
| LENDIPLAN_US | &quot;LENDIPLAN_US&quot; |
| BNP_PARIBAS | &quot;BNP_PARIBAS&quot; |
| CREDE | &quot;CREDE&quot; |
| DLL | &quot;DLL&quot; |
| GEDESCO | &quot;GEDESCO&quot; |
| GRENKE | &quot;GRENKE&quot; |
| IBERENT | &quot;IBERENT&quot; |
| ITL | &quot;ITL&quot; |
| IT_RENTING | &quot;IT_RENTING&quot; |
| LIQUIDO | &quot;LIQUIDO&quot; |
| SIEMENS | &quot;SIEMENS&quot; |
| SOCIETE_GENERALE | &quot;SOCIETE_GENERALE&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| PREAPPROVED | &quot;PREAPPROVED&quot; |
| PENDING_REVIEW | &quot;PENDING_REVIEW&quot; |
| PENDING_DATA | &quot;PENDING_DATA&quot; |
| PENDING_SUBMISSION | &quot;PENDING_SUBMISSION&quot; |
| SUBMITTING | &quot;SUBMITTING&quot; |
| DENIED | &quot;DENIED&quot; |
| ERROR | &quot;ERROR&quot; |
| CANCELED | &quot;CANCELED&quot; |
| RETURNED | &quot;RETURNED&quot; |



## Enum: SignatureMethodUsedEnum

| Name | Value |
|---- | -----|
| NOT_SIGNED | &quot;NOT_SIGNED&quot; |
| SIGNED_MANUAL | &quot;SIGNED_MANUAL&quot; |
| SIGNED_SMS | &quot;SIGNED_SMS&quot; |
| SIGNED_BIOMETRIC | &quot;SIGNED_BIOMETRIC&quot; |
| PENDING_COAPPLICANT | &quot;PENDING_COAPPLICANT&quot; |
| PENDING_MAIN_APPLICANT | &quot;PENDING_MAIN_APPLICANT&quot; |



## Enum: ErrorTypeEnum

| Name | Value |
|---- | -----|
| CANNOT_USE_FAST_TRACK | &quot;CANNOT_USE_FAST_TRACK&quot; |
| VEHICLE_MAKE_NOT_SUPPORTED | &quot;VEHICLE_MAKE_NOT_SUPPORTED&quot; |
| CUSTOMER_DATA_DO_NOT_MATCH | &quot;CUSTOMER_DATA_DO_NOT_MATCH&quot; |
| NOT_A_CUSTOMER | &quot;NOT_A_CUSTOMER&quot; |
| MAIN_APPLICANT_EMAIL_REQUIRED | &quot;MAIN_APPLICANT_EMAIL_REQUIRED&quot; |
| COAPPLICANT_EMAIL_REQUIRED | &quot;COAPPLICANT_EMAIL_REQUIRED&quot; |
| PREVIOUS_ACTIVE_OFFER | &quot;PREVIOUS_ACTIVE_OFFER&quot; |
| FIELD_LENGTH_EXCEEDED | &quot;FIELD_LENGTH_EXCEEDED&quot; |
| RESTRICTED_PRODUCT | &quot;RESTRICTED_PRODUCT&quot; |
| MANDATORY_INSURANCE_COVERAGES | &quot;MANDATORY_INSURANCE_COVERAGES&quot; |
| GENERATE_CONTRACT_ERROR | &quot;GENERATE_CONTRACT_ERROR&quot; |
| EMAIL_NOT_PRESENT_MAIN_APPLICANT | &quot;EMAIL_NOT_PRESENT_MAIN_APPLICANT&quot; |
| EMAIL_NOT_PRESENT_COAPPLICANT | &quot;EMAIL_NOT_PRESENT_COAPPLICANT&quot; |
| MOBILE_NOT_PRESENT_MAIN_APPLICANT | &quot;MOBILE_NOT_PRESENT_MAIN_APPLICANT&quot; |
| MOBILE_NOT_PRESENT_COAPPLICANT | &quot;MOBILE_NOT_PRESENT_COAPPLICANT&quot; |
| DIGITAL_SIGNATURE_NOT_AVAILABLE | &quot;DIGITAL_SIGNATURE_NOT_AVAILABLE&quot; |
| ALREADY_SIGNED | &quot;ALREADY_SIGNED&quot; |
| ALREADY_APPROVED | &quot;ALREADY_APPROVED&quot; |
| NO_DOCUMENTS | &quot;NO_DOCUMENTS&quot; |
| SOME_DOCUMENTS_COULD_NOT_BE_SENT | &quot;SOME_DOCUMENTS_COULD_NOT_BE_SENT&quot; |
| NO_DOCUMENTS_COULD_BE_SENT | &quot;NO_DOCUMENTS_COULD_BE_SENT&quot; |
| BAD_CREDENTIALS | &quot;BAD_CREDENTIALS&quot; |
| NO_CREDENTIALS | &quot;NO_CREDENTIALS&quot; |
| PASSWORD_EXPIRED | &quot;PASSWORD_EXPIRED&quot; |
| LOGIN | &quot;LOGIN&quot; |
| INCOMPLETE_RESOLVER_CONFIGURATION | &quot;INCOMPLETE_RESOLVER_CONFIGURATION&quot; |
| BAD_USER_INTERACTION | &quot;BAD_USER_INTERACTION&quot; |
| USER_INTERACTION_TIMEOUT | &quot;USER_INTERACTION_TIMEOUT&quot; |
| USER_INTERACTION_CANCELLED | &quot;USER_INTERACTION_CANCELLED&quot; |
| GENERIC | &quot;GENERIC&quot; |
| AMAZON_S3_IO | &quot;AMAZON_S3_IO&quot; |
| AXIS_SERIALIZATION | &quot;AXIS_SERIALIZATION&quot; |
| IO_ERROR | &quot;IO_ERROR&quot; |
| DATA | &quot;DATA&quot; |
| FORBIDDEN | &quot;FORBIDDEN&quot; |
| NO_CONTENT | &quot;NO_CONTENT&quot; |
| NOT_FOUND | &quot;NOT_FOUND&quot; |
| PERMANENTLY_PENDING_REVIEW | &quot;PERMANENTLY_PENDING_REVIEW&quot; |
| SUBMISSION_ERROR | &quot;SUBMISSION_ERROR&quot; |
| REDIRECTION_ERROR | &quot;REDIRECTION_ERROR&quot; |
| UNEXPECTED_ERROR | &quot;UNEXPECTED_ERROR&quot; |



## Enum: IncidentTypeEnum

| Name | Value |
|---- | -----|
| GENERIC | &quot;GENERIC&quot; |
| APPROVAL_DELAY | &quot;APPROVAL_DELAY&quot; |
| MISSING_DATA | &quot;MISSING_DATA&quot; |
| MISSING_ACCOUNT | &quot;MISSING_ACCOUNT&quot; |
| MISSING_ACCOUNT_MANUAL_SIGNATURE | &quot;MISSING_ACCOUNT_MANUAL_SIGNATURE&quot; |
| MISSING_DOCUMENTS | &quot;MISSING_DOCUMENTS&quot; |
| DOCUMENTS_TO_SEND | &quot;DOCUMENTS_TO_SEND&quot; |
| PAYOUT_PENDING | &quot;PAYOUT_PENDING&quot; |
| APPLICATION_ID_PENDING | &quot;APPLICATION_ID_PENDING&quot; |
| PENDING_ACTION_WEBSITE | &quot;PENDING_ACTION_WEBSITE&quot; |
| DELIVERY_PROOF_PENDING | &quot;DELIVERY_PROOF_PENDING&quot; |
| CONDITIONAL_OFFER | &quot;CONDITIONAL_OFFER&quot; |
| PENDING_REVIEW | &quot;PENDING_REVIEW&quot; |
| SMS_SENT | &quot;SMS_SENT&quot; |
| EMAIL_SENT | &quot;EMAIL_SENT&quot; |
| APPLICATION_SENT_TO_AGENT | &quot;APPLICATION_SENT_TO_AGENT&quot; |
| APPLICATION_NOT_SENT_TO_AGENT | &quot;APPLICATION_NOT_SENT_TO_AGENT&quot; |
| REDIRECTION_TO_LENDER_NEEDED | &quot;REDIRECTION_TO_LENDER_NEEDED&quot; |



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



## Enum: InsurancePaymentTypeEnum

| Name | Value |
|---- | -----|
| UPFRONT | &quot;UPFRONT&quot; |
| FINANCED | &quot;FINANCED&quot; |



## Enum: DownPaymentStatusEnum

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



## Enum: ReturnStateEnum

| Name | Value |
|---- | -----|
| NOT_REQUESTED | &quot;NOT_REQUESTED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |
| DENIED | &quot;DENIED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| CONFIRMED | &quot;CONFIRMED&quot; |
| PARTIALLY_RETURNED | &quot;PARTIALLY_RETURNED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



