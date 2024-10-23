

# ApiLoanSimulationPayload

Represents a loan simulation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantCode** | **String** | The code of the Merchant, a list of codes was provided to you by Lendismart&#39;s team. |  |
|**goodsTypeCode** | **String** | Code associated to the good/service sold. The available codes are dependant on the specific merchant and must be provided by Lendismart. |  [optional] |
|**purchaseAmount** | **String** | The total amount of the purchase. |  [optional] |
|**requestedAmount** | **String** | The amount of the loan, the value should be less than 100,000 |  [optional] |
|**applicantType** | [**ApplicantTypeEnum**](#ApplicantTypeEnum) | It indicates whether the applicant is an individual or a company |  [optional] |
|**maxMonthlyPayment** | **String** | The maximum monthly instalment the applicant is willing to pay for the loan |  [optional] |
|**subscriptionPayment** | **BigDecimal** |  |  [optional] |
|**maxNominalAnnualRate** | **String** | The maximum nominal annual rate to apply |  [optional] |
|**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | The desired financial product type (e.g. interest-free, interest-bearing, etc.) |  [optional] |
|**paymentFrequency** | [**PaymentFrequencyEnum**](#PaymentFrequencyEnum) | Frequency of loan repayments (e.g., monthly, quarterly, annually) |  [optional] |
|**instalmentType** | [**InstalmentTypeEnum**](#InstalmentTypeEnum) | Type of loan payments (end-of-period vs beginning-of-period) |  [optional] |
|**vehicleMake** | [**VehicleMakeEnum**](#VehicleMakeEnum) | The make/brand of the vehicle |  [optional] |
|**vehicleModelCode** | **String** | The vehicle&#39;s model code |  [optional] |
|**vehicleVersionCode** | **String** | The vehicle&#39;s version code |  [optional] |
|**registrationNumber** | **String** |  |  [optional] |
|**firstRegistrationDate** | **LocalDate** | Date was the vehicle was first registered |  [optional] |
|**mileage** | **Integer** |  |  [optional] |
|**serviceDuration** | [**ServiceDurationEnum**](#ServiceDurationEnum) | The duration of the service/s sold (it doesn&#39;t apply to the sale of goods). |  [optional] |
|**lender** | [**LenderEnum**](#LenderEnum) | If included, only products associated to this lender will be considered |  [optional] |
|**feePaymentType** | [**FeePaymentTypeEnum**](#FeePaymentTypeEnum) | The preferred type of fee payment (if not zero) |  [optional] |
|**term** | **Integer** | The desired number of terms in which the loan will be payed. |  [optional] |
|**gracePeriod** | **Integer** | The desired grace period in months - initial period during which the loan doesn&#39;t have to be repaid |  [optional] |
|**maxMerchantCost** | **String** | It indicates the maximum cost (in currency units) the merchant is willing to bear to subsidize loan interests |  [optional] |
|**maxMerchantCostPct** | **String** | It indicates the maximum cost (per currency unit of the loan amount) the merchant is willing to bear to subsidize loan interests |  [optional] |
|**maxNir** | **BigDecimal** |  |  [optional] |
|**openingFeePct** | **String** | The desired maximum opening fee (per currency unit) |  [optional] |
|**withInsurance** | **Boolean** | Whether the loan includes an insurance or not. |  [optional] |
|**paymentPeriodStartDate** | **LocalDate** |  |  [optional] |
|**mainApplicantBirthDate** | **LocalDate** | The main applicant&#39;s birth date |  [optional] |
|**drivingLicenceIssuanceDate** | **LocalDate** | Driving license issuance date |  [optional] |
|**postalCode** | **String** | The applicant&#39;s postal code |  [optional] |
|**occupation** | [**OccupationEnum**](#OccupationEnum) | The specific occupation the applicant has |  [optional] |
|**insuranceCoverages** | [**Set&lt;InsuranceCoveragesEnum&gt;**](#Set&lt;InsuranceCoveragesEnum&gt;) | Set of insurance coverages included in the loan |  [optional] |
|**languageTag** | **String** |  |  [optional] |



## Enum: ApplicantTypeEnum

| Name | Value |
|---- | -----|
| PERSONAL | &quot;PERSONAL&quot; |
| BUSINESS | &quot;BUSINESS&quot; |
| CONDO_ASSOCIATION | &quot;CONDO_ASSOCIATION&quot; |



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



## Enum: PaymentFrequencyEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;WEEKLY&quot; |
| BI_WEEKLY | &quot;BI_WEEKLY&quot; |
| SEMI_MONTHLY | &quot;SEMI_MONTHLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |
| BI_MONTHLY | &quot;BI_MONTHLY&quot; |
| QUARTERLY | &quot;QUARTERLY&quot; |
| SEMI_ANNUALLY | &quot;SEMI_ANNUALLY&quot; |
| ANNUALLY | &quot;ANNUALLY&quot; |



## Enum: InstalmentTypeEnum

| Name | Value |
|---- | -----|
| ORDINARY | &quot;ORDINARY&quot; |
| DUE | &quot;DUE&quot; |



## Enum: VehicleMakeEnum

| Name | Value |
|---- | -----|
| ABARTH | &quot;ABARTH&quot; |
| ADIVA | &quot;ADIVA&quot; |
| ADLY | &quot;ADLY&quot; |
| AEON | &quot;AEON&quot; |
| AIWAYS | &quot;AIWAYS&quot; |
| AIXAM | &quot;AIXAM&quot; |
| AIYUMO | &quot;AIYUMO&quot; |
| AJP | &quot;AJP&quot; |
| ALFA_ROMEO | &quot;ALFA_ROMEO&quot; |
| ALPINA | &quot;ALPINA&quot; |
| ALPINE | &quot;ALPINE&quot; |
| APRILIA | &quot;APRILIA&quot; |
| ARCTIC_CAT | &quot;ARCTIC_CAT&quot; |
| ARIIC | &quot;ARIIC&quot; |
| ARO | &quot;ARO&quot; |
| ASIA | &quot;ASIA&quot; |
| ASIA_MOTORS | &quot;ASIA_MOTORS&quot; |
| ASPID | &quot;ASPID&quot; |
| ASTON_MARTIN | &quot;ASTON_MARTIN&quot; |
| ATK | &quot;ATK&quot; |
| AUDI | &quot;AUDI&quot; |
| AUSTIN | &quot;AUSTIN&quot; |
| AUVERLAND | &quot;AUVERLAND&quot; |
| BAIC | &quot;BAIC&quot; |
| BENELLI | &quot;BENELLI&quot; |
| BENTLEY | &quot;BENTLEY&quot; |
| BERTONE | &quot;BERTONE&quot; |
| BETA | &quot;BETA&quot; |
| BIMOTA | &quot;BIMOTA&quot; |
| BMW | &quot;BMW&quot; |
| BOMBARDIER | &quot;BOMBARDIER&quot; |
| BOOM | &quot;BOOM&quot; |
| BORGWARD | &quot;BORGWARD&quot; |
| BRIXTON | &quot;BRIXTON&quot; |
| BUELL | &quot;BUELL&quot; |
| BUGATTI | &quot;BUGATTI&quot; |
| BULTACO | &quot;BULTACO&quot; |
| BYD | &quot;BYD&quot; |
| CADILLAC | &quot;CADILLAC&quot; |
| CAGIVA | &quot;CAGIVA&quot; |
| CAKE | &quot;CAKE&quot; |
| CAN_AM | &quot;CAN_AM&quot; |
| CASALINI | &quot;CASALINI&quot; |
| CATERHAM | &quot;CATERHAM&quot; |
| CCM | &quot;CCM&quot; |
| CECTEK | &quot;CECTEK&quot; |
| CF_MOTO | &quot;CF_MOTO&quot; |
| CHATENET | &quot;CHATENET&quot; |
| CHEVROLET | &quot;CHEVROLET&quot; |
| CHRYSLER | &quot;CHRYSLER&quot; |
| CITROEN | &quot;CITROEN&quot; |
| CITYCOCO | &quot;CITYCOCO&quot; |
| CLIPIC | &quot;CLIPIC&quot; |
| COOLTRA | &quot;COOLTRA&quot; |
| CORBIN | &quot;CORBIN&quot; |
| CORVETTE | &quot;CORVETTE&quot; |
| CPI_MOTOR | &quot;CPI_MOTOR&quot; |
| CSR | &quot;CSR&quot; |
| CUPRA | &quot;CUPRA&quot; |
| DACIA | &quot;DACIA&quot; |
| DAELIM | &quot;DAELIM&quot; |
| DAEWOO | &quot;DAEWOO&quot; |
| DAF | &quot;DAF&quot; |
| DAIHATSU | &quot;DAIHATSU&quot; |
| DAIMLER | &quot;DAIMLER&quot; |
| DERBI | &quot;DERBI&quot; |
| DFSK | &quot;DFSK&quot; |
| DINLI | &quot;DINLI&quot; |
| DODGE | &quot;DODGE&quot; |
| DORTON | &quot;DORTON&quot; |
| DR | &quot;DR&quot; |
| DS | &quot;DS&quot; |
| DS4 | &quot;DS4&quot; |
| DUCATI | &quot;DUCATI&quot; |
| E_MAX | &quot;E_MAX&quot; |
| EASY_TRIKE | &quot;EASY_TRIKE&quot; |
| EBROH | &quot;EBROH&quot; |
| ENERGICA | &quot;ENERGICA&quot; |
| EVO | &quot;EVO&quot; |
| FACTORY | &quot;FACTORY&quot; |
| FANTIC | &quot;FANTIC&quot; |
| FERRARI | &quot;FERRARI&quot; |
| FIAT | &quot;FIAT&quot; |
| FORD | &quot;FORD&quot; |
| FUN | &quot;FUN&quot; |
| GALLOPER | &quot;GALLOPER&quot; |
| GAS_GAS | &quot;GAS_GAS&quot; |
| GENERIC_MOTOR | &quot;GENERIC_MOTOR&quot; |
| GIANTCO | &quot;GIANTCO&quot; |
| GILERA | &quot;GILERA&quot; |
| GME | &quot;GME&quot; |
| GOES | &quot;GOES&quot; |
| GRECAV | &quot;GRECAV&quot; |
| GTA | &quot;GTA&quot; |
| GUZZI | &quot;GUZZI&quot; |
| HANWAY | &quot;HANWAY&quot; |
| HARLEY_DAVIDSON | &quot;HARLEY_DAVIDSON&quot; |
| HM | &quot;HM&quot; |
| HONDA | &quot;HONDA&quot; |
| HRD | &quot;HRD&quot; |
| HUATIAN | &quot;HUATIAN&quot; |
| HUMMER | &quot;HUMMER&quot; |
| HUONIAO | &quot;HUONIAO&quot; |
| HUSABERG | &quot;HUSABERG&quot; |
| HUSQVARNA | &quot;HUSQVARNA&quot; |
| HYOSUNG | &quot;HYOSUNG&quot; |
| HYUNDAI | &quot;HYUNDAI&quot; |
| INDIAN | &quot;INDIAN&quot; |
| INEOS | &quot;INEOS&quot; |
| INFINITI | &quot;INFINITI&quot; |
| INNOCENTI | &quot;INNOCENTI&quot; |
| INVICTA | &quot;INVICTA&quot; |
| I_MOTO | &quot;I_MOTO&quot; |
| IO | &quot;IO&quot; |
| ISETTA | &quot;ISETTA&quot; |
| ISUZU | &quot;ISUZU&quot; |
| ITALJET | &quot;ITALJET&quot; |
| IVECO | &quot;IVECO&quot; |
| JAGUAR | &quot;JAGUAR&quot; |
| JCADI | &quot;JCADI&quot; |
| JDM | &quot;JDM&quot; |
| JEEP | &quot;JEEP&quot; |
| JIAYUAN | &quot;JIAYUAN&quot; |
| JINCHENG | &quot;JINCHENG&quot; |
| JONWAY | &quot;JONWAY&quot; |
| KAIYUN | &quot;KAIYUN&quot; |
| KAWASAKI | &quot;KAWASAKI&quot; |
| KEEWAY | &quot;KEEWAY&quot; |
| KENROD | &quot;KENROD&quot; |
| KIA | &quot;KIA&quot; |
| KINROAD | &quot;KINROAD&quot; |
| KSR | &quot;KSR&quot; |
| KUBOTA | &quot;KUBOTA&quot; |
| KTM | &quot;KTM&quot; |
| KYMCO | &quot;KYMCO&quot; |
| LADA | &quot;LADA&quot; |
| LAMBORGHINI | &quot;LAMBORGHINI&quot; |
| LAMBRETTA | &quot;LAMBRETTA&quot; |
| LANCIA | &quot;LANCIA&quot; |
| LAND_ROVER | &quot;LAND_ROVER&quot; |
| LDV | &quot;LDV&quot; |
| LEONART | &quot;LEONART&quot; |
| LEVC | &quot;LEVC&quot; |
| LEXMOTO | &quot;LEXMOTO&quot; |
| LEXUS | &quot;LEXUS&quot; |
| LIFAN | &quot;LIFAN&quot; |
| LIGIER | &quot;LIGIER&quot; |
| LIMA | &quot;LIMA&quot; |
| LINHAI | &quot;LINHAI&quot; |
| LINK_AND_CO | &quot;LINK_AND_CO&quot; |
| LML | &quot;LML&quot; |
| LOTUS | &quot;LOTUS&quot; |
| MACBOR | &quot;MACBOR&quot; |
| MAHINDRA | &quot;MAHINDRA&quot; |
| MALAGUTI | &quot;MALAGUTI&quot; |
| MAN | &quot;MAN&quot; |
| MASERATI | &quot;MASERATI&quot; |
| MASH | &quot;MASH&quot; |
| MAXUS | &quot;MAXUS&quot; |
| MAYBACH | &quot;MAYBACH&quot; |
| MAZDA | &quot;MAZDA&quot; |
| MBK | &quot;MBK&quot; |
| MCLAREN | &quot;MCLAREN&quot; |
| MERCEDES_BENZ | &quot;MERCEDES_BENZ&quot; |
| MG | &quot;MG&quot; |
| MICRO_CARD_DUE | &quot;MICRO_CARD_DUE&quot; |
| MICROCARS | &quot;MICROCARS&quot; |
| MICROLINO | &quot;MICROLINO&quot; |
| MINI | &quot;MINI&quot; |
| MITSUBISHI | &quot;MITSUBISHI&quot; |
| MITT | &quot;MITT&quot; |
| MH_MOTORCYCLES | &quot;MH_MOTORCYCLES&quot; |
| MONDIAL | &quot;MONDIAL&quot; |
| MONKEY_BIKES | &quot;MONKEY_BIKES&quot; |
| MONTESA | &quot;MONTESA&quot; |
| MORGAN | &quot;MORGAN&quot; |
| MOTIVAS | &quot;MOTIVAS&quot; |
| MOTO_MORINI | &quot;MOTO_MORINI&quot; |
| MOTOR_HISPANIA | &quot;MOTOR_HISPANIA&quot; |
| MOTRON | &quot;MOTRON&quot; |
| MPM_MOTORS | &quot;MPM_MOTORS&quot; |
| MTR | &quot;MTR&quot; |
| MV_AGUSTA | &quot;MV_AGUSTA&quot; |
| MX_MOTOR | &quot;MX_MOTOR&quot; |
| MZ_MUZ | &quot;MZ_MUZ&quot; |
| NEXT | &quot;NEXT&quot; |
| NEXTEM | &quot;NEXTEM&quot; |
| NISSAN | &quot;NISSAN&quot; |
| NIU | &quot;NIU&quot; |
| NORTON | &quot;NORTON&quot; |
| ODES | &quot;ODES&quot; |
| OMODA | &quot;OMODA&quot; |
| OPEL | &quot;OPEL&quot; |
| ORCAL | &quot;ORCAL&quot; |
| OSSA | &quot;OSSA&quot; |
| PAGANI | &quot;PAGANI&quot; |
| PEUGEOT | &quot;PEUGEOT&quot; |
| PGO | &quot;PGO&quot; |
| PIAGGIO | &quot;PIAGGIO&quot; |
| POLARIS | &quot;POLARIS&quot; |
| POLESTAR | &quot;POLESTAR&quot; |
| PONTIAC | &quot;PONTIAC&quot; |
| PORSCHE | &quot;PORSCHE&quot; |
| PUCH | &quot;PUCH&quot; |
| QUADRO | &quot;QUADRO&quot; |
| QUAZZAR | &quot;QUAZZAR&quot; |
| RAM | &quot;RAM&quot; |
| RAY_ELECTRIC_MOTORS | &quot;RAY_ELECTRIC_MOTORS&quot; |
| RENAULT | &quot;RENAULT&quot; |
| RENAULT_TRUCKS | &quot;RENAULT_TRUCKS&quot; |
| REWACO | &quot;REWACO&quot; |
| RGNT | &quot;RGNT&quot; |
| RIDE | &quot;RIDE&quot; |
| RIEJU | &quot;RIEJU&quot; |
| RIYA | &quot;RIYA&quot; |
| ROLLS_ROYCE | &quot;ROLLS_ROYCE&quot; |
| ROVER | &quot;ROVER&quot; |
| ROYAL_ALLOY | &quot;ROYAL_ALLOY&quot; |
| ROYAL_ENFIELD | &quot;ROYAL_ENFIELD&quot; |
| SAAB | &quot;SAAB&quot; |
| SACHS | &quot;SACHS&quot; |
| SANTANA | &quot;SANTANA&quot; |
| SCANIA | &quot;SCANIA&quot; |
| SCARABEO | &quot;SCARABEO&quot; |
| SCOMADI | &quot;SCOMADI&quot; |
| SCORPA | &quot;SCORPA&quot; |
| SCRAMBLER_DUCATI | &quot;SCRAMBLER_DUCATI&quot; |
| SEAT | &quot;SEAT&quot; |
| SEGWAY | &quot;SEGWAY&quot; |
| SHERCO | &quot;SHERCO&quot; |
| SILENCE | &quot;SILENCE&quot; |
| SMC_SM | &quot;SMC_SM&quot; |
| SKODA | &quot;SKODA&quot; |
| SMART | &quot;SMART&quot; |
| SOKON | &quot;SOKON&quot; |
| SSANGYONG | &quot;SSANGYONG&quot; |
| STREETWISE | &quot;STREETWISE&quot; |
| SUBARU | &quot;SUBARU&quot; |
| SUMCO | &quot;SUMCO&quot; |
| SUNRA | &quot;SUNRA&quot; |
| SUPER_SOCO | &quot;SUPER_SOCO&quot; |
| SUZUKI | &quot;SUZUKI&quot; |
| SWM | &quot;SWM&quot; |
| SYM | &quot;SYM&quot; |
| TALBOT | &quot;TALBOT&quot; |
| TATA | &quot;TATA&quot; |
| TESLA | &quot;TESLA&quot; |
| TGB | &quot;TGB&quot; |
| THINK | &quot;THINK&quot; |
| TINBOT | &quot;TINBOT&quot; |
| TM | &quot;TM&quot; |
| TORROT | &quot;TORROT&quot; |
| TOYOTA | &quot;TOYOTA&quot; |
| TRIUMPH | &quot;TRIUMPH&quot; |
| TRS | &quot;TRS&quot; |
| UM | &quot;UM&quot; |
| URAL | &quot;URAL&quot; |
| VECTRIX | &quot;VECTRIX&quot; |
| VERTEMATI | &quot;VERTEMATI&quot; |
| VESPA | &quot;VESPA&quot; |
| VICTORY | &quot;VICTORY&quot; |
| V_MOTO | &quot;V_MOTO&quot; |
| VOGE | &quot;VOGE&quot; |
| VOLKSWAGEN | &quot;VOLKSWAGEN&quot; |
| VOLTA | &quot;VOLTA&quot; |
| VOLVO | &quot;VOLVO&quot; |
| VOXAN | &quot;VOXAN&quot; |
| WARTBURG | &quot;WARTBURG&quot; |
| WILDLANDER | &quot;WILDLANDER&quot; |
| WOTTAN | &quot;WOTTAN&quot; |
| XEV | &quot;XEV&quot; |
| YAMAHA | &quot;YAMAHA&quot; |
| ZERO | &quot;ZERO&quot; |
| ZIDHOU | &quot;ZIDHOU&quot; |
| ZITMUV | &quot;ZITMUV&quot; |
| ZONTES | &quot;ZONTES&quot; |
| ZOTYE | &quot;ZOTYE&quot; |
| OTHER_MAKE | &quot;OTHER_MAKE&quot; |



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



## Enum: FeePaymentTypeEnum

| Name | Value |
|---- | -----|
| UPFRONT | &quot;UPFRONT&quot; |
| FINANCED | &quot;FINANCED&quot; |



## Enum: OccupationEnum

| Name | Value |
|---- | -----|
| PERMANENT_CIVIL_SERVANT | &quot;PERMANENT_CIVIL_SERVANT&quot; |
| TEMPORARY_UNDETERMINED_CIVIL_SERVANT | &quot;TEMPORARY_UNDETERMINED_CIVIL_SERVANT&quot; |
| TEMPORARY_CIVIL_SERVANT | &quot;TEMPORARY_CIVIL_SERVANT&quot; |
| PERMANENT_NON_CAREER | &quot;PERMANENT_NON_CAREER&quot; |
| TEMPORARY_NON_CAREER | &quot;TEMPORARY_NON_CAREER&quot; |
| TEMPORARY_AGENCY_CIVIL_SERVANT | &quot;TEMPORARY_AGENCY_CIVIL_SERVANT&quot; |
| PERMANENT | &quot;PERMANENT&quot; |
| TEMPORARY_UNDETERMINED | &quot;TEMPORARY_UNDETERMINED&quot; |
| TEMPORARY | &quot;TEMPORARY&quot; |
| TEMPORARY_AGENCY | &quot;TEMPORARY_AGENCY&quot; |
| PERMANENT_SEASONAL | &quot;PERMANENT_SEASONAL&quot; |
| SERVICE_CONTRACT | &quot;SERVICE_CONTRACT&quot; |
| APPRENTICESHIP | &quot;APPRENTICESHIP&quot; |
| INTERN | &quot;INTERN&quot; |
| FREELANCE | &quot;FREELANCE&quot; |
| LIBERAL_PROFESSIONAL | &quot;LIBERAL_PROFESSIONAL&quot; |
| COMPANY_OWNER | &quot;COMPANY_OWNER&quot; |
| RETIREMENT_PENSION | &quot;RETIREMENT_PENSION&quot; |
| TEMPORARY_DISABILITY_PENSION | &quot;TEMPORARY_DISABILITY_PENSION&quot; |
| PERMANENT_DISABILITY_PENSION | &quot;PERMANENT_DISABILITY_PENSION&quot; |
| ORPHANHOOD_PENSION | &quot;ORPHANHOOD_PENSION&quot; |
| SURVIVOR_PENSION | &quot;SURVIVOR_PENSION&quot; |
| OTHER_PENSION | &quot;OTHER_PENSION&quot; |
| HOUSEWIFE | &quot;HOUSEWIFE&quot; |
| UNEMPLOYED | &quot;UNEMPLOYED&quot; |
| STUDENT | &quot;STUDENT&quot; |
| RENTIER | &quot;RENTIER&quot; |
| OTHER | &quot;OTHER&quot; |



## Enum: Set&lt;InsuranceCoveragesEnum&gt;

| Name | Value |
|---- | -----|
| LIFE | &quot;LIFE&quot; |
| TEMPORARY_DISABILITY | &quot;TEMPORARY_DISABILITY&quot; |
| UNEMPLOYMENT | &quot;UNEMPLOYMENT&quot; |
| TOTAL_LOSS | &quot;TOTAL_LOSS&quot; |
| LOSS_OF_LICENCE | &quot;LOSS_OF_LICENCE&quot; |
| REPLACEMENT | &quot;REPLACEMENT&quot; |
| MECHANICAL_BREAKDOWN | &quot;MECHANICAL_BREAKDOWN&quot; |
| FULLY_COMPREHENSIVE_WITHOUT_EXCESS | &quot;FULLY_COMPREHENSIVE_WITHOUT_EXCESS&quot; |
| FULLY_COMPREHENSIVE_WITH_300_EXCESS | &quot;FULLY_COMPREHENSIVE_WITH_300_EXCESS&quot; |
| EXTENDED_CIVIL_LIABILITY | &quot;EXTENDED_CIVIL_LIABILITY&quot; |
| SIMI30000 | &quot;SIMI30000&quot; |
| SIMI45000 | &quot;SIMI45000&quot; |
| SIMI30000_2_Y | &quot;SIMI30000_2Y&quot; |
| SIMI45000_2_Y | &quot;SIMI45000_2Y&quot; |



