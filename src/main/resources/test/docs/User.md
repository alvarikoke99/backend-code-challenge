

# User

Represents a user

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**username** | **String** | The username of the User |  |
|**creationDate** | **OffsetDateTime** | Timestamp that indicates when the user has been created |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**surname1** | **String** |  |  [optional] |
|**surname2** | **String** |  |  [optional] |
|**phone1** | **String** |  |  [optional] |
|**email** | **String** |  |  |
|**docIdType** | [**DocIdTypeEnum**](#DocIdTypeEnum) |  |  [optional] |
|**docIdType2** | [**DocIdType2Enum**](#DocIdType2Enum) |  |  [optional] |
|**docIdNumber** | **String** |  |  [optional] |
|**docIdNumber2** | **String** |  |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) |  |  [optional] |
|**merchants** | **Set&lt;String&gt;** |  |  |
|**roles** | **Set&lt;String&gt;** |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| LOCKED | &quot;LOCKED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| DELETED | &quot;DELETED&quot; |



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



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| ES_ES | &quot;es_ES&quot; |
| EN_GB | &quot;en_GB&quot; |
| EN_US | &quot;en_US&quot; |
| PT_PT | &quot;pt_PT&quot; |
| DE_DE | &quot;de_DE&quot; |
| FR_FR | &quot;fr_FR&quot; |
| IT_IT | &quot;it_IT&quot; |
| CA_ES | &quot;ca_ES&quot; |
| EU_ES | &quot;eu_ES&quot; |
| GL_ES | &quot;gl_ES&quot; |



