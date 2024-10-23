

# Applicant

Represents the person that is going to apply for a loan.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | The role the applicant has in the loan application |  |
|**relationship** | [**RelationshipEnum**](#RelationshipEnum) | The relationship this applicant has with the MAIN_APPLICANT. Should be specified only when the role is not MAIN_APPLICANT. If it&#39;s specified when the role is MAIN applicant a validation error will be thrown |  [optional] |
|**docIdType** | [**DocIdTypeEnum**](#DocIdTypeEnum) | The type of the identification document |  [optional] |
|**docIdType2** | [**DocIdType2Enum**](#DocIdType2Enum) | The type of the second identification document (only available in some countries such as Portugal) |  [optional] |
|**docIdNumber** | **String** | The actual value of the identification document |  [optional] |
|**docIdNumber2** | **String** | The actual value of the second identification document (only available in some countries such as Portugal) |  [optional] |
|**docIdExpirationDate** | **LocalDate** | Expiration date of the identification number (&#39;9999-01-01&#39; in the case of perpetual documents) |  [optional] |
|**drivingLicenceIssuanceDate** | **LocalDate** | Driving license issuance date |  [optional] |
|**title** | [**TitleEnum**](#TitleEnum) | The applicant&#39;s title |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**surname1** | **String** |  |  [optional] |
|**surname2** | **String** |  |  [optional] |
|**birthDate** | **LocalDate** |  |  [optional] |
|**nationalityIso** | **String** | The ISO-3166-1 alpha-2 code of the nationality country |  [optional] |
|**nationality2Iso** | **String** | The ISO-3166-1 alpha-2 code of the second nationality country |  [optional] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | The payment method to be used |  [optional] |
|**cardNumber** | **String** | The credit card number. Empty spaces and non alphanumeric characters will be removed. This field should have a value only when the paymentMethod field is CREDIT_CARD |  [optional] |
|**accountNumber** | **String** | The account number, should only by specified when the paymentMethod is CCC. It can be either an account number or an IBAN |  [optional] |
|**accountCreationDate** | **LocalDate** | The date when the account specified in the previous field (accountNumber) has been created |  [optional] |
|**email** | **String** |  |  [optional] |
|**socialSecurityNumber** | **String** |  |  [optional] |
|**phoneType1** | [**PhoneType1Enum**](#PhoneType1Enum) |  |  [optional] |
|**phone1** | **String** |  |  [optional] |
|**phoneType2** | [**PhoneType2Enum**](#PhoneType2Enum) |  |  [optional] |
|**phone2** | **String** |  |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**residencyStartDate** | **LocalDate** | The date when the applicant started his/her residency. Should only be specified when the docIdType is not NATIONAL_ID |  [optional] |
|**residencyEndDate** | **LocalDate** | The date when the applicant ends his/her residency. Should only be specified when the docIdType is not NATIONAL_ID |  [optional] |
|**nativeAddress** | [**Address**](Address.md) |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**maritalStatus** | [**MaritalStatusEnum**](#MaritalStatusEnum) |  |  [optional] |
|**dependent** | **Integer** | The number of dependant persons the applicant has (children, ancestors, or both) |  [optional] |
|**housingTenureType** | [**HousingTenureTypeEnum**](#HousingTenureTypeEnum) | Type of property ownership / tenure of the house where the applicant lives |  [optional] |
|**housingTenureStartDate** | **LocalDate** | The date when the applicant started to live in the house described by the previous field (housingTenureType) |  [optional] |
|**housingExpenses** | **String** | The monthly housing related expenses |  [optional] |
|**otherExpenses** | **String** | Other monthly expenses the applicant may have, existing loans etc. |  [optional] |
|**occupationType** | [**OccupationTypeEnum**](#OccupationTypeEnum) | The applicant&#39;s occupation type |  [optional] |
|**occupation** | [**OccupationEnum**](#OccupationEnum) | The specific occupation the applicant has |  [optional] |
|**profession** | [**ProfessionEnum**](#ProfessionEnum) | If the applicant is a salaried employee, the applicant&#39;s profession |  [optional] |
|**jobTitle** | [**JobTitleEnum**](#JobTitleEnum) | If the applicant is a salaried employee, the applicant&#39;s job title / level of responsibility |  [optional] |
|**industryType** | [**IndustryTypeEnum**](#IndustryTypeEnum) | The industry area in which the applicant&#39;s work takes place (only applies to public / private employees and the self-employed) |  [optional] |
|**industry** | [**IndustryEnum**](#IndustryEnum) | The specific industry in which the applicant&#39;s work takes place (only applies to public / private employees and the self-employed) |  [optional] |
|**contractStartDate** | **LocalDate** | Starting date of the applicant&#39;s current job (only applies to public / private employees) |  [optional] |
|**contractEndDate** | **LocalDate** | Contract end job of the applicant&#39;s current job (only applies to temporary public / private employees) |  [optional] |
|**companyIdNumber** | **String** | The company&#39;s identification number |  [optional] |
|**companyPhone** | **String** | The applicant&#39;s working telephone number (only applies to public / private employees and the self-employed) |  [optional] |
|**companyName** | **String** | Name of the company where the applicant works (only applies to public / private employees) |  [optional] |
|**companyAddress** | [**Address**](Address.md) |  |  [optional] |
|**monthlyIncome** | **String** | The applicant&#39;s monthly net income (it may be subject to proof of income) |  [optional] |
|**incomeFrequency** | **Integer** | Number of pay periods in which the applicant&#39;s annual income is paid, usually 12/14 (it doesn&#39;t apply to the self employed) |  [optional] |
|**consentGroup** | **Boolean** | Indicates if the applicant has already given its consent to the merchant&#39;s policies |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| MAIN_APPLICANT | &quot;MAIN_APPLICANT&quot; |
| COAPPLICANT | &quot;COAPPLICANT&quot; |
| GUARANTOR | &quot;GUARANTOR&quot; |



## Enum: RelationshipEnum

| Name | Value |
|---- | -----|
| SPOUSE | &quot;SPOUSE&quot; |
| PARTNER | &quot;PARTNER&quot; |
| SON_OR_DAUGHTER | &quot;SON_OR_DAUGHTER&quot; |
| PARENT | &quot;PARENT&quot; |
| SIBLING | &quot;SIBLING&quot; |
| SECOND_DEGREE | &quot;SECOND_DEGREE&quot; |
| OTHER_FAMILY | &quot;OTHER_FAMILY&quot; |
| NO_RELATION | &quot;NO_RELATION&quot; |



## Enum: DocIdTypeEnum

| Name | Value |
|---- | -----|
| NATIONAL_ID | &quot;NATIONAL_ID&quot; |
| TEMPORARY_RESIDENT | &quot;TEMPORARY_RESIDENT&quot; |
| PERMANENT_RESIDENT | &quot;PERMANENT_RESIDENT&quot; |
| CIF | &quot;CIF&quot; |
| EU_RESIDENCE_CARD | &quot;EU_RESIDENCE_CARD&quot; |
| ARMY_CARD | &quot;ARMY_CARD&quot; |
| AIR_FORCE_CARD | &quot;AIR_FORCE_CARD&quot; |
| GENDARMERIE_CARD | &quot;GENDARMERIE_CARD&quot; |
| NAVY_CARD | &quot;NAVY_CARD&quot; |
| POLICE_CARD | &quot;POLICE_CARD&quot; |
| CIVIL_CARD | &quot;CIVIL_CARD&quot; |
| CITIZEN_CARD | &quot;CITIZEN_CARD&quot; |
| PORTO_SEGURO_TREATY_CARD | &quot;PORTO_SEGURO_TREATY_CARD&quot; |
| CPLP_RESIDENCE_PERMIT | &quot;CPLP_RESIDENCE_PERMIT&quot; |
| PASSPORT | &quot;PASSPORT&quot; |
| DRIVING_LICENCE | &quot;DRIVING_LICENCE&quot; |



## Enum: DocIdType2Enum

| Name | Value |
|---- | -----|
| NATIONAL_ID | &quot;NATIONAL_ID&quot; |
| TEMPORARY_RESIDENT | &quot;TEMPORARY_RESIDENT&quot; |
| PERMANENT_RESIDENT | &quot;PERMANENT_RESIDENT&quot; |
| CIF | &quot;CIF&quot; |
| EU_RESIDENCE_CARD | &quot;EU_RESIDENCE_CARD&quot; |
| ARMY_CARD | &quot;ARMY_CARD&quot; |
| AIR_FORCE_CARD | &quot;AIR_FORCE_CARD&quot; |
| GENDARMERIE_CARD | &quot;GENDARMERIE_CARD&quot; |
| NAVY_CARD | &quot;NAVY_CARD&quot; |
| POLICE_CARD | &quot;POLICE_CARD&quot; |
| CIVIL_CARD | &quot;CIVIL_CARD&quot; |
| CITIZEN_CARD | &quot;CITIZEN_CARD&quot; |
| PORTO_SEGURO_TREATY_CARD | &quot;PORTO_SEGURO_TREATY_CARD&quot; |
| CPLP_RESIDENCE_PERMIT | &quot;CPLP_RESIDENCE_PERMIT&quot; |
| PASSPORT | &quot;PASSPORT&quot; |
| DRIVING_LICENCE | &quot;DRIVING_LICENCE&quot; |



## Enum: TitleEnum

| Name | Value |
|---- | -----|
| SR_SRA | &quot;SR_SRA&quot; |
| DR_DRA | &quot;DR_DRA&quot; |
| ENG | &quot;ENG&quot; |
| ARQ | &quot;ARQ&quot; |
| PRF | &quot;PRF&quot; |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| CCC | &quot;CCC&quot; |
| CREDIT_CARD | &quot;CREDIT_CARD&quot; |



## Enum: PhoneType1Enum

| Name | Value |
|---- | -----|
| LANDLINE | &quot;LANDLINE&quot; |
| MOBILE | &quot;MOBILE&quot; |



## Enum: PhoneType2Enum

| Name | Value |
|---- | -----|
| LANDLINE | &quot;LANDLINE&quot; |
| MOBILE | &quot;MOBILE&quot; |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| MALE | &quot;MALE&quot; |
| FEMALE | &quot;FEMALE&quot; |



## Enum: MaritalStatusEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;SINGLE&quot; |
| PARTNERSHIP | &quot;PARTNERSHIP&quot; |
| MARRIED_COMMUNITY | &quot;MARRIED_COMMUNITY&quot; |
| MARRIED_SEPARATION | &quot;MARRIED_SEPARATION&quot; |
| SEPARATED | &quot;SEPARATED&quot; |
| DIVORCED | &quot;DIVORCED&quot; |
| WIDOWED | &quot;WIDOWED&quot; |



## Enum: HousingTenureTypeEnum

| Name | Value |
|---- | -----|
| OWN_MORTGAGE | &quot;OWN_MORTGAGE&quot; |
| OWN_OUTRIGHT | &quot;OWN_OUTRIGHT&quot; |
| RENTED | &quot;RENTED&quot; |
| PARENTS | &quot;PARENTS&quot; |
| SPOUSE | &quot;SPOUSE&quot; |
| OTHER_RELATIVES | &quot;OTHER_RELATIVES&quot; |
| EMPLOYER | &quot;EMPLOYER&quot; |
| LEASE_TO_OWN | &quot;LEASE_TO_OWN&quot; |
| USUFRUCT | &quot;USUFRUCT&quot; |
| RENTED_ROOM | &quot;RENTED_ROOM&quot; |
| RESIDENT_ABROAD | &quot;RESIDENT_ABROAD&quot; |
| OTHER | &quot;OTHER&quot; |



## Enum: OccupationTypeEnum

| Name | Value |
|---- | -----|
| PUBLIC_EMPLOYEE | &quot;PUBLIC_EMPLOYEE&quot; |
| PRIVATE_EMPLOYEE | &quot;PRIVATE_EMPLOYEE&quot; |
| SELF_EMPLOYED | &quot;SELF_EMPLOYED&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



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



## Enum: ProfessionEnum

| Name | Value |
|---- | -----|
| ATTORNEY | &quot;ATTORNEY&quot; |
| ADMINISTRATOR | &quot;ADMINISTRATOR&quot; |
| FARMER | &quot;FARMER&quot; |
| ARCHITECT | &quot;ARCHITECT&quot; |
| ARTIST | &quot;ARTIST&quot; |
| WAITER | &quot;WAITER&quot; |
| CHEF | &quot;CHEF&quot; |
| AGENT | &quot;AGENT&quot; |
| CONCIERGE | &quot;CONCIERGE&quot; |
| CONSULTANT | &quot;CONSULTANT&quot; |
| ACCOUNTANT | &quot;ACCOUNTANT&quot; |
| DRAFTSMAN | &quot;DRAFTSMAN&quot; |
| DENTIST | &quot;DENTIST&quot; |
| SHOP_ASSISTANT | &quot;SHOP_ASSISTANT&quot; |
| SPORTSMAN | &quot;SPORTSMAN&quot; |
| DIPLOMATIC | &quot;DIPLOMATIC&quot; |
| ECONOMIST | &quot;ECONOMIST&quot; |
| ELECTRICAL_TECHNICIAN | &quot;ELECTRICAL_TECHNICIAN&quot; |
| TIPPED_EMPLOYEE | &quot;TIPPED_EMPLOYEE&quot; |
| BANKING_CLERK | &quot;BANKING_CLERK&quot; |
| NURSE | &quot;NURSE&quot; |
| WRITER | &quot;WRITER&quot; |
| STATISCIAN_OR_MATHEMATICIAN | &quot;STATISCIAN_OR_MATHEMATICIAN&quot; |
| PHARMACIST | &quot;PHARMACIST&quot; |
| PLUMBER | &quot;PLUMBER&quot; |
| PRISONS_OFFICIAL | &quot;PRISONS_OFFICIAL&quot; |
| COMPUTER_ENGINEER | &quot;COMPUTER_ENGINEER&quot; |
| ENGINEER | &quot;ENGINEER&quot; |
| INVESTIGATOR | &quot;INVESTIGATOR&quot; |
| CLEANING | &quot;CLEANING&quot; |
| SAILOR | &quot;SAILOR&quot; |
| DOCTOR | &quot;DOCTOR&quot; |
| MILITARY | &quot;MILITARY&quot; |
| WORKER | &quot;WORKER&quot; |
| JOURNALIST | &quot;JOURNALIST&quot; |
| PRIVATE_SECURITY | &quot;PRIVATE_SECURITY&quot; |
| PAINTER | &quot;PAINTER&quot; |
| POLICE | &quot;POLICE&quot; |
| TEACHER | &quot;TEACHER&quot; |
| RELIGIOUS | &quot;RELIGIOUS&quot; |
| PERSONAL_ASSISTANT | &quot;PERSONAL_ASSISTANT&quot; |
| CARRIER | &quot;CARRIER&quot; |
| SALES_REP | &quot;SALES_REP&quot; |
| ONCE_SALESMAN | &quot;ONCE_SALESMAN&quot; |
| VET | &quot;VET&quot; |
| OTHER_TECHNICIANS | &quot;OTHER_TECHNICIANS&quot; |
| OTHER_UNSKILLED | &quot;OTHER_UNSKILLED&quot; |



## Enum: JobTitleEnum

| Name | Value |
|---- | -----|
| SENIOR_MANAGER | &quot;SENIOR_MANAGER&quot; |
| MANAGER | &quot;MANAGER&quot; |
| MIDDLE_MANAGEMENT | &quot;MIDDLE_MANAGEMENT&quot; |
| ADVANCED_TECHNICIAN | &quot;ADVANCED_TECHNICIAN&quot; |
| TECHNICIAN | &quot;TECHNICIAN&quot; |
| OFFICE_CLERK | &quot;OFFICE_CLERK&quot; |
| SUPERVISOR | &quot;SUPERVISOR&quot; |
| SKILLED_WORKER | &quot;SKILLED_WORKER&quot; |
| UNSKILLED_WORKER | &quot;UNSKILLED_WORKER&quot; |
| CONSTRUCTION_WORKER | &quot;CONSTRUCTION_WORKER&quot; |
| SALESMAN | &quot;SALESMAN&quot; |
| COMMISSION_AGENT | &quot;COMMISSION_AGENT&quot; |



## Enum: IndustryTypeEnum

| Name | Value |
|---- | -----|
| AGRICULTURE_LIVESTOCK_FISHING | &quot;AGRICULTURE_LIVESTOCK_FISHING&quot; |
| MINING_AND_QUARRYING | &quot;MINING_AND_QUARRYING&quot; |
| MANUFACTURING | &quot;MANUFACTURING&quot; |
| ENERGY_SUPPLY | &quot;ENERGY_SUPPLY&quot; |
| WATER_SUPPLY | &quot;WATER_SUPPLY&quot; |
| CONSTRUCTION | &quot;CONSTRUCTION&quot; |
| RETAIL | &quot;RETAIL&quot; |
| TRANSPORTATION_STORAGE_POST | &quot;TRANSPORTATION_STORAGE_POST&quot; |
| HOSPITALITY | &quot;HOSPITALITY&quot; |
| MEDIA_IT | &quot;MEDIA_IT&quot; |
| BANK_INSURANCE | &quot;BANK_INSURANCE&quot; |
| REAL_ESTATE | &quot;REAL_ESTATE&quot; |
| TECHNICAL_ACTIVITIES | &quot;TECHNICAL_ACTIVITIES&quot; |
| ADMINISTRATIVE_AND_SUPPORT | &quot;ADMINISTRATIVE_AND_SUPPORT&quot; |
| GOVERNMENTAL | &quot;GOVERNMENTAL&quot; |
| EDUCATION | &quot;EDUCATION&quot; |
| HEALTH_SOCIAL_SERVICES | &quot;HEALTH_SOCIAL_SERVICES&quot; |
| ARTS_ENTERTAINMENT | &quot;ARTS_ENTERTAINMENT&quot; |
| OTHER_SERVICES | &quot;OTHER_SERVICES&quot; |
| HOUSEHOLDS | &quot;HOUSEHOLDS&quot; |
| EXTRATERRITORIAL_ORGANISATIONS | &quot;EXTRATERRITORIAL_ORGANISATIONS&quot; |



## Enum: IndustryEnum

| Name | Value |
|---- | -----|
| AGRICULTURE | &quot;AGRICULTURE&quot; |
| LIVESTOCK | &quot;LIVESTOCK&quot; |
| FISHING | &quot;FISHING&quot; |
| MINING | &quot;MINING&quot; |
| FOOD | &quot;FOOD&quot; |
| TEXTILE | &quot;TEXTILE&quot; |
| LEATHER | &quot;LEATHER&quot; |
| WOOD | &quot;WOOD&quot; |
| PAPER | &quot;PAPER&quot; |
| CHEMISTRY | &quot;CHEMISTRY&quot; |
| PLASTIC | &quot;PLASTIC&quot; |
| WEAPONS | &quot;WEAPONS&quot; |
| MACHINERY | &quot;MACHINERY&quot; |
| MACHINERY_REPAIR | &quot;MACHINERY_REPAIR&quot; |
| INDUSTRY_OTHERS | &quot;INDUSTRY_OTHERS&quot; |
| ENERGY_SUPPLY | &quot;ENERGY_SUPPLY&quot; |
| WATER_SUPPLY | &quot;WATER_SUPPLY&quot; |
| REAL_ESTATE | &quot;REAL_ESTATE&quot; |
| CIVIL_ENGINEERING | &quot;CIVIL_ENGINEERING&quot; |
| ELECTRICAL_INSTALLATIONS | &quot;ELECTRICAL_INSTALLATIONS&quot; |
| PLUMBING | &quot;PLUMBING&quot; |
| CARPENTRY | &quot;CARPENTRY&quot; |
| PAINTING | &quot;PAINTING&quot; |
| CONSTRUCTION_OTHERS | &quot;CONSTRUCTION_OTHERS&quot; |
| STREET_VENDING_FOOD | &quot;STREET_VENDING_FOOD&quot; |
| STREET_VENDING_TEXTILE | &quot;STREET_VENDING_TEXTILE&quot; |
| STREET_VENDING_OTHER | &quot;STREET_VENDING_OTHER&quot; |
| FOOD_RETAILERS | &quot;FOOD_RETAILERS&quot; |
| PHARMACIES | &quot;PHARMACIES&quot; |
| RETAIL_OTHERS | &quot;RETAIL_OTHERS&quot; |
| TAXI | &quot;TAXI&quot; |
| PASSENGER_TRANSPORT | &quot;PASSENGER_TRANSPORT&quot; |
| FREIGHT_TRANSPORT | &quot;FREIGHT_TRANSPORT&quot; |
| MOVING_SERVICES | &quot;MOVING_SERVICES&quot; |
| MAIL | &quot;MAIL&quot; |
| TRANSPORT_OTHERS | &quot;TRANSPORT_OTHERS&quot; |
| HOTELS | &quot;HOTELS&quot; |
| RESTAURANTS_AND_BARS | &quot;RESTAURANTS_AND_BARS&quot; |
| MEDIA | &quot;MEDIA&quot; |
| IT_CONSULTING | &quot;IT_CONSULTING&quot; |
| IT_OTHERS | &quot;IT_OTHERS&quot; |
| INTERNET | &quot;INTERNET&quot; |
| TELECOMMUNICATIONS | &quot;TELECOMMUNICATIONS&quot; |
| BANKING | &quot;BANKING&quot; |
| INSURANCE | &quot;INSURANCE&quot; |
| FINANCE_OTHERS | &quot;FINANCE_OTHERS&quot; |
| REAL_ESTATE_AGENCIES | &quot;REAL_ESTATE_AGENCIES&quot; |
| LEGAL | &quot;LEGAL&quot; |
| ADVISORY | &quot;ADVISORY&quot; |
| ARCHITECTURE | &quot;ARCHITECTURE&quot; |
| RESEARCH | &quot;RESEARCH&quot; |
| ADVERTISING | &quot;ADVERTISING&quot; |
| TECHNICAL_OTHERS | &quot;TECHNICAL_OTHERS&quot; |
| ADMINISTRATIVE_AND_SUPPORT | &quot;ADMINISTRATIVE_AND_SUPPORT&quot; |
| PUBLIC_ADMINISTRATION | &quot;PUBLIC_ADMINISTRATION&quot; |
| CULTURAL | &quot;CULTURAL&quot; |
| ARMY | &quot;ARMY&quot; |
| PUBLIC_ADMINISTRATION_OTHERS | &quot;PUBLIC_ADMINISTRATION_OTHERS&quot; |
| EDUCATION_SPORTS_LEISURE | &quot;EDUCATION_SPORTS_LEISURE&quot; |
| EDUCATION_DRIVING | &quot;EDUCATION_DRIVING&quot; |
| EDUCATION_OTHERS | &quot;EDUCATION_OTHERS&quot; |
| VETERINARY_ACTIVITIES | &quot;VETERINARY_ACTIVITIES&quot; |
| DENTAL | &quot;DENTAL&quot; |
| MEDICAL | &quot;MEDICAL&quot; |
| ELDERLY | &quot;ELDERLY&quot; |
| HEALTH_OTHERS | &quot;HEALTH_OTHERS&quot; |
| ARTS_AND_ENTERTAINMENT | &quot;ARTS_AND_ENTERTAINMENT&quot; |
| LIBRARIES_AND_MUSEUMS | &quot;LIBRARIES_AND_MUSEUMS&quot; |
| GAMBLING | &quot;GAMBLING&quot; |
| SPORTS | &quot;SPORTS&quot; |
| ARTS_AND_ENTERTAINMENT_OTHER | &quot;ARTS_AND_ENTERTAINMENT_OTHER&quot; |
| RELIGIOUS_ORGANIZATIONS | &quot;RELIGIOUS_ORGANIZATIONS&quot; |
| POLITICAL_ORGANIZATIONS | &quot;POLITICAL_ORGANIZATIONS&quot; |
| OTHER_ASSOCIATIVE_ACTIVITIES | &quot;OTHER_ASSOCIATIVE_ACTIVITIES&quot; |
| REPAIR | &quot;REPAIR&quot; |
| COLLECTION | &quot;COLLECTION&quot; |
| TRAVEL_AGENCIES | &quot;TRAVEL_AGENCIES&quot; |
| CLEANING_SERVICES | &quot;CLEANING_SERVICES&quot; |
| GARDENING | &quot;GARDENING&quot; |
| SECURITY | &quot;SECURITY&quot; |
| BEAUTY | &quot;BEAUTY&quot; |
| PACKAGING | &quot;PACKAGING&quot; |
| SKILLED_SERVICES_OTHER | &quot;SKILLED_SERVICES_OTHER&quot; |
| UNSKILLED_SERVICES_OTHER | &quot;UNSKILLED_SERVICES_OTHER&quot; |
| DOMESTIC_SERVANTS | &quot;DOMESTIC_SERVANTS&quot; |
| EXTRATERRITORIAL_ORGANISATIONS | &quot;EXTRATERRITORIAL_ORGANISATIONS&quot; |



