

# Address

Shipping address.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**streetType** | [**StreetTypeEnum**](#StreetTypeEnum) |  |  [optional] |
|**street** | **String** |  |  [optional] |
|**number** | **String** |  |  [optional] |
|**block** | **String** |  |  [optional] |
|**stairs** | **String** |  |  [optional] |
|**floor** | **String** |  |  [optional] |
|**door** | **String** |  |  [optional] |
|**complement** | **String** |  |  [optional] |
|**postalCode** | **String** |  |  [optional] |
|**province** | [**ProvinceEnum**](#ProvinceEnum) |  |  [optional] |
|**cityCode** | **String** | The INE (Instituto Nacional de Estadística) code of the city. |  [optional] |
|**localityCode** | **String** | The INE (Instituto Nacional de Estadística) code of the locality. |  [optional] |
|**countryIso** | **String** | The ISO 3166-1 alpha-2 country code. |  [optional] |
|**fullAddress** | **String** | Optional field, use this field when you store the whole address as a string instead of multiple fields. |  [optional] |
|**line1** | **String** | Address line 1. |  [optional] |
|**line2** | **String** | Address line 2. |  [optional] |
|**cityName** | **String** | Name of the city. |  [optional] |
|**provinceName** | **String** | Name of the province/state. |  [optional] |



## Enum: StreetTypeEnum

| Name | Value |
|---- | -----|
| ALAMEDA | &quot;ALAMEDA&quot; |
| APARTAMENTO | &quot;APARTAMENTO&quot; |
| AVENIDA | &quot;AVENIDA&quot; |
| BARRIO | &quot;BARRIO&quot; |
| BLOQUE | &quot;BLOQUE&quot; |
| CALLE | &quot;CALLE&quot; |
| CALLEJA | &quot;CALLEJA&quot; |
| CAMINO | &quot;CAMINO&quot; |
| CARRER | &quot;CARRER&quot; |
| CARRETERA | &quot;CARRETERA&quot; |
| CASERIO | &quot;CASERIO&quot; |
| CHALET | &quot;CHALET&quot; |
| COLONIA | &quot;COLONIA&quot; |
| CUESTA | &quot;CUESTA&quot; |
| EDIFICIO | &quot;EDIFICIO&quot; |
| GLORIETA | &quot;GLORIETA&quot; |
| GRAN_VIA | &quot;GRAN_VIA&quot; |
| GRUPO | &quot;GRUPO&quot; |
| KALEA | &quot;KALEA&quot; |
| LUGAR | &quot;LUGAR&quot; |
| MANZANA | &quot;MANZANA&quot; |
| MERCADO | &quot;MERCADO&quot; |
| MUNICIPIO | &quot;MUNICIPIO&quot; |
| PARQUE | &quot;PARQUE&quot; |
| PASAJE | &quot;PASAJE&quot; |
| PASEO | &quot;PASEO&quot; |
| PLAZA | &quot;PLAZA&quot; |
| POBLADO | &quot;POBLADO&quot; |
| POLIGONO | &quot;POLIGONO&quot; |
| PROLONGACION | &quot;PROLONGACION&quot; |
| RAMBLA | &quot;RAMBLA&quot; |
| RONDA | &quot;RONDA&quot; |
| RUA | &quot;RUA&quot; |
| SENDA | &quot;SENDA&quot; |
| TRAVESIA | &quot;TRAVESIA&quot; |
| URBANIZACION | &quot;URBANIZACION&quot; |
| VIA | &quot;VIA&quot; |



## Enum: ProvinceEnum

| Name | Value |
|---- | -----|
| ALAVA | &quot;ALAVA&quot; |
| ALBACETE | &quot;ALBACETE&quot; |
| ALICANTE | &quot;ALICANTE&quot; |
| ALMERIA | &quot;ALMERIA&quot; |
| AVILA | &quot;AVILA&quot; |
| BADAJOZ | &quot;BADAJOZ&quot; |
| BALEARES | &quot;BALEARES&quot; |
| BARCELONA | &quot;BARCELONA&quot; |
| BURGOS | &quot;BURGOS&quot; |
| CACERES | &quot;CACERES&quot; |
| CADIZ | &quot;CADIZ&quot; |
| CASTELLON | &quot;CASTELLON&quot; |
| CIUDAD_REAL | &quot;CIUDAD_REAL&quot; |
| CORDOBA | &quot;CORDOBA&quot; |
| A_CORUNA | &quot;A_CORUNA&quot; |
| CUENCA | &quot;CUENCA&quot; |
| GERONA | &quot;GERONA&quot; |
| GRANADA | &quot;GRANADA&quot; |
| GUADALAJARA | &quot;GUADALAJARA&quot; |
| GUIPUZCOA | &quot;GUIPUZCOA&quot; |
| HUELVA | &quot;HUELVA&quot; |
| HUESCA | &quot;HUESCA&quot; |
| JAEN | &quot;JAEN&quot; |
| LEON | &quot;LEON&quot; |
| LERIDA | &quot;LERIDA&quot; |
| LA_RIOJA | &quot;LA_RIOJA&quot; |
| LUGO | &quot;LUGO&quot; |
| MADRID | &quot;MADRID&quot; |
| MALAGA | &quot;MALAGA&quot; |
| MURCIA | &quot;MURCIA&quot; |
| NAVARRA | &quot;NAVARRA&quot; |
| ORENSE | &quot;ORENSE&quot; |
| ASTURIAS | &quot;ASTURIAS&quot; |
| PALENCIA | &quot;PALENCIA&quot; |
| LAS_PALMAS | &quot;LAS_PALMAS&quot; |
| PONTEVEDRA | &quot;PONTEVEDRA&quot; |
| SALAMANCA | &quot;SALAMANCA&quot; |
| SANTA_CRUZ_DE_TENERIFE | &quot;SANTA_CRUZ_DE_TENERIFE&quot; |
| CANTABRIA | &quot;CANTABRIA&quot; |
| SEGOVIA | &quot;SEGOVIA&quot; |
| SEVILLA | &quot;SEVILLA&quot; |
| SORIA | &quot;SORIA&quot; |
| TARRAGONA | &quot;TARRAGONA&quot; |
| TERUEL | &quot;TERUEL&quot; |
| TOLEDO | &quot;TOLEDO&quot; |
| VALENCIA | &quot;VALENCIA&quot; |
| VALLADOLID | &quot;VALLADOLID&quot; |
| VIZCAYA | &quot;VIZCAYA&quot; |
| ZAMORA | &quot;ZAMORA&quot; |
| ZARAGOZA | &quot;ZARAGOZA&quot; |
| CEUTA | &quot;CEUTA&quot; |
| MELILLA | &quot;MELILLA&quot; |
| AVEIRO | &quot;AVEIRO&quot; |
| BEJA | &quot;BEJA&quot; |
| BRAGA | &quot;BRAGA&quot; |
| BRAGANCA | &quot;BRAGANCA&quot; |
| CASTELO_BRANCO | &quot;CASTELO_BRANCO&quot; |
| COIMBRA | &quot;COIMBRA&quot; |
| EVORA | &quot;EVORA&quot; |
| FARO | &quot;FARO&quot; |
| GUARDA | &quot;GUARDA&quot; |
| LEIRIA | &quot;LEIRIA&quot; |
| LISBOA | &quot;LISBOA&quot; |
| PORTALEGRE | &quot;PORTALEGRE&quot; |
| PORTO | &quot;PORTO&quot; |
| SANTAREM | &quot;SANTAREM&quot; |
| SETUBAL | &quot;SETUBAL&quot; |
| VIANA_DO_CASTELO | &quot;VIANA_DO_CASTELO&quot; |
| VILA_REAL | &quot;VILA_REAL&quot; |
| VISEU | &quot;VISEU&quot; |
| ILHA_DA_MADEIRA | &quot;ILHA_DA_MADEIRA&quot; |
| ILHA_DE_PORTO_SANTO | &quot;ILHA_DE_PORTO_SANTO&quot; |
| ILHA_DE_SANTA_MARIA | &quot;ILHA_DE_SANTA_MARIA&quot; |
| ILHA_DE_SAO_MIGUEL | &quot;ILHA_DE_SAO_MIGUEL&quot; |
| ILHA_TERCEIRA | &quot;ILHA_TERCEIRA&quot; |
| ILHA_DA_GRACIOSA | &quot;ILHA_DA_GRACIOSA&quot; |
| ILHA_DE_SAO_JORGE | &quot;ILHA_DE_SAO_JORGE&quot; |
| ILHA_DO_PICO | &quot;ILHA_DO_PICO&quot; |
| ILHA_DO_FAIAL | &quot;ILHA_DO_FAIAL&quot; |
| ILHA_DAS_FLORES | &quot;ILHA_DAS_FLORES&quot; |
| ILHA_DO_CORVO | &quot;ILHA_DO_CORVO&quot; |
| AGRIGENTO | &quot;AGRIGENTO&quot; |
| ALESSANDRIA | &quot;ALESSANDRIA&quot; |
| ANCONA | &quot;ANCONA&quot; |
| VALLE_D_AOSTA | &quot;VALLE_D_AOSTA&quot; |
| AREZZO | &quot;AREZZO&quot; |
| ASCOLI_PICENO | &quot;ASCOLI_PICENO&quot; |
| ASTI | &quot;ASTI&quot; |
| AVELLINO | &quot;AVELLINO&quot; |
| BARI | &quot;BARI&quot; |
| BARLETTA_ANDRIA_TRANI | &quot;BARLETTA_ANDRIA_TRANI&quot; |
| BELLUNO | &quot;BELLUNO&quot; |
| BENEVENTO | &quot;BENEVENTO&quot; |
| BERGAMO | &quot;BERGAMO&quot; |
| BIELLA | &quot;BIELLA&quot; |
| BOLOGNA | &quot;BOLOGNA&quot; |
| BOLZANO | &quot;BOLZANO&quot; |
| BRESCIA | &quot;BRESCIA&quot; |
| BRINDISI | &quot;BRINDISI&quot; |
| CAGLIARI | &quot;CAGLIARI&quot; |
| CALTANISSETTA | &quot;CALTANISSETTA&quot; |
| CAMPOBASSO | &quot;CAMPOBASSO&quot; |
| CASERTA | &quot;CASERTA&quot; |
| CATANIA | &quot;CATANIA&quot; |
| CATANZARO | &quot;CATANZARO&quot; |
| CHIETI | &quot;CHIETI&quot; |
| COMO | &quot;COMO&quot; |
| COSENZA | &quot;COSENZA&quot; |
| CREMONA | &quot;CREMONA&quot; |
| CROTONE | &quot;CROTONE&quot; |
| CUNEO | &quot;CUNEO&quot; |
| ENNA | &quot;ENNA&quot; |
| FERMO | &quot;FERMO&quot; |
| FERRARA | &quot;FERRARA&quot; |
| FIRENZE | &quot;FIRENZE&quot; |
| FOGGIA | &quot;FOGGIA&quot; |
| FORLI_CESENA | &quot;FORLI_CESENA&quot; |
| FROSINONE | &quot;FROSINONE&quot; |
| GENOVA | &quot;GENOVA&quot; |
| GORIZIA | &quot;GORIZIA&quot; |
| GROSSETO | &quot;GROSSETO&quot; |
| IMPERIA | &quot;IMPERIA&quot; |
| ISERNIA | &quot;ISERNIA&quot; |
| L_AQUILA | &quot;L_AQUILA&quot; |
| LA_SPEZIA | &quot;LA_SPEZIA&quot; |
| LATINA | &quot;LATINA&quot; |
| LECCE | &quot;LECCE&quot; |
| LECCO | &quot;LECCO&quot; |
| LIVORNO | &quot;LIVORNO&quot; |
| LODI | &quot;LODI&quot; |
| LUCCA | &quot;LUCCA&quot; |
| MACERATA | &quot;MACERATA&quot; |
| MANTOVA | &quot;MANTOVA&quot; |
| MASSA_CARRARA | &quot;MASSA_CARRARA&quot; |
| MATERA | &quot;MATERA&quot; |
| MESSINA | &quot;MESSINA&quot; |
| MILANO | &quot;MILANO&quot; |
| MODENA | &quot;MODENA&quot; |
| MONZA_E_DELLA_BRIANZA | &quot;MONZA_E_DELLA_BRIANZA&quot; |
| NAPOLI | &quot;NAPOLI&quot; |
| NOVARA | &quot;NOVARA&quot; |
| NUORO | &quot;NUORO&quot; |
| ORISTANO | &quot;ORISTANO&quot; |
| PADOVA | &quot;PADOVA&quot; |
| PALERMO | &quot;PALERMO&quot; |
| PARMA | &quot;PARMA&quot; |
| PAVIA | &quot;PAVIA&quot; |
| PERUGIA | &quot;PERUGIA&quot; |
| PESARO_E_URBINO | &quot;PESARO_E_URBINO&quot; |
| PESCARA | &quot;PESCARA&quot; |
| PIACENZA | &quot;PIACENZA&quot; |
| PISA | &quot;PISA&quot; |
| PISTOIA | &quot;PISTOIA&quot; |
| PORDENONE | &quot;PORDENONE&quot; |
| POTENZA | &quot;POTENZA&quot; |
| PRATO | &quot;PRATO&quot; |
| RAGUSA | &quot;RAGUSA&quot; |
| RAVENNA | &quot;RAVENNA&quot; |
| REGGIO_CALABRIA | &quot;REGGIO_CALABRIA&quot; |
| REGGIO_NELL_EMILIA | &quot;REGGIO_NELL_EMILIA&quot; |
| RIETI | &quot;RIETI&quot; |
| RIMINI | &quot;RIMINI&quot; |
| ROMA | &quot;ROMA&quot; |
| ROVIGO | &quot;ROVIGO&quot; |
| SALERNO | &quot;SALERNO&quot; |
| SASSARI | &quot;SASSARI&quot; |
| SAVONA | &quot;SAVONA&quot; |
| SIENA | &quot;SIENA&quot; |
| SIRACUSA | &quot;SIRACUSA&quot; |
| SONDRIO | &quot;SONDRIO&quot; |
| SUD_SARDEGNA | &quot;SUD_SARDEGNA&quot; |
| TARANTO | &quot;TARANTO&quot; |
| TERAMO | &quot;TERAMO&quot; |
| TERNI | &quot;TERNI&quot; |
| TORINO | &quot;TORINO&quot; |
| TRAPANI | &quot;TRAPANI&quot; |
| TRENTO | &quot;TRENTO&quot; |
| TREVISO | &quot;TREVISO&quot; |
| TRIESTE | &quot;TRIESTE&quot; |
| UDINE | &quot;UDINE&quot; |
| VARESE | &quot;VARESE&quot; |
| VENEZIA | &quot;VENEZIA&quot; |
| VERBANO_CUSIO_OSSOLA | &quot;VERBANO_CUSIO_OSSOLA&quot; |
| VERCELLI | &quot;VERCELLI&quot; |
| VERONA | &quot;VERONA&quot; |
| VIBO_VALENTIA | &quot;VIBO_VALENTIA&quot; |
| VICENZA | &quot;VICENZA&quot; |
| VITERBO | &quot;VITERBO&quot; |
| AIN | &quot;AIN&quot; |
| AISNE | &quot;AISNE&quot; |
| ALLIER | &quot;ALLIER&quot; |
| ALPES_DE_HAUTE_PROVENCE | &quot;ALPES_DE_HAUTE_PROVENCE&quot; |
| HAUTES_ALPES | &quot;HAUTES_ALPES&quot; |
| ALPES_MARITIMES | &quot;ALPES_MARITIMES&quot; |
| ARDECHE | &quot;ARDECHE&quot; |
| ARDENNES | &quot;ARDENNES&quot; |
| ARIEGE | &quot;ARIEGE&quot; |
| AUBE | &quot;AUBE&quot; |
| AUDE | &quot;AUDE&quot; |
| AVEYRON | &quot;AVEYRON&quot; |
| BOUCHES_DU_RHONE | &quot;BOUCHES_DU_RHONE&quot; |
| CALVADOS | &quot;CALVADOS&quot; |
| CANTAL | &quot;CANTAL&quot; |
| CHARENTE | &quot;CHARENTE&quot; |
| CHARENTE_MARITIME | &quot;CHARENTE_MARITIME&quot; |
| CHER | &quot;CHER&quot; |
| CORREZE | &quot;CORREZE&quot; |
| CORSE_DU_SUD | &quot;CORSE_DU_SUD&quot; |
| HAUTE_CORSE | &quot;HAUTE_CORSE&quot; |
| COTE_D_OR | &quot;COTE_D_OR&quot; |
| COTES_D_ARMOR | &quot;COTES_D_ARMOR&quot; |
| CREUSE | &quot;CREUSE&quot; |
| DORDOGNE | &quot;DORDOGNE&quot; |
| DOUBS | &quot;DOUBS&quot; |
| DROME | &quot;DROME&quot; |
| EURE | &quot;EURE&quot; |
| EURE_ET_LOIR | &quot;EURE_ET_LOIR&quot; |
| FINISTERE | &quot;FINISTERE&quot; |
| GARD | &quot;GARD&quot; |
| HAUTE_GARONNE | &quot;HAUTE_GARONNE&quot; |
| GERS | &quot;GERS&quot; |
| GIRONDE | &quot;GIRONDE&quot; |
| HERAULT | &quot;HERAULT&quot; |
| ILLE_ET_VILAINE | &quot;ILLE_ET_VILAINE&quot; |
| INDRE | &quot;INDRE&quot; |
| INDRE_ET_LOIRE | &quot;INDRE_ET_LOIRE&quot; |
| ISERE | &quot;ISERE&quot; |
| JURA | &quot;JURA&quot; |
| LANDES | &quot;LANDES&quot; |
| LOIR_ET_CHER | &quot;LOIR_ET_CHER&quot; |
| LOIRE | &quot;LOIRE&quot; |
| HAUTE_LOIRE | &quot;HAUTE_LOIRE&quot; |
| LOIRE_ATLANTIQUE | &quot;LOIRE_ATLANTIQUE&quot; |
| LOIRET | &quot;LOIRET&quot; |
| LOT | &quot;LOT&quot; |
| LOT_ET_GARONNE | &quot;LOT_ET_GARONNE&quot; |
| LOZERE | &quot;LOZERE&quot; |
| MAINE_ET_LOIRE | &quot;MAINE_ET_LOIRE&quot; |
| MANCHE | &quot;MANCHE&quot; |
| MARNE | &quot;MARNE&quot; |
| HAUTE_MARNE | &quot;HAUTE_MARNE&quot; |
| MAYENNE | &quot;MAYENNE&quot; |
| MEURTHE_ET_MOSELLE | &quot;MEURTHE_ET_MOSELLE&quot; |
| MEUSE | &quot;MEUSE&quot; |
| MORBIHAN | &quot;MORBIHAN&quot; |
| MOSELLE | &quot;MOSELLE&quot; |
| NIEVRE | &quot;NIEVRE&quot; |
| NORD | &quot;NORD&quot; |
| OISE | &quot;OISE&quot; |
| ORNE | &quot;ORNE&quot; |
| PAS_DE_CALAIS | &quot;PAS_DE_CALAIS&quot; |
| PUY_DE_DOME | &quot;PUY_DE_DOME&quot; |
| PYRENEES_ATLANTIQUES | &quot;PYRENEES_ATLANTIQUES&quot; |
| HAUTES_PYRENEES | &quot;HAUTES_PYRENEES&quot; |
| PYRENEES_ORIENTALES | &quot;PYRENEES_ORIENTALES&quot; |
| BAS_RHIN | &quot;BAS_RHIN&quot; |
| HAUT_RHIN | &quot;HAUT_RHIN&quot; |
| RHONE | &quot;RHONE&quot; |
| LYON_METROPOLIS | &quot;LYON_METROPOLIS&quot; |
| HAUTE_SAONE | &quot;HAUTE_SAONE&quot; |
| SAONE_ET_LOIRE | &quot;SAONE_ET_LOIRE&quot; |
| SARTHE | &quot;SARTHE&quot; |
| SAVOIE | &quot;SAVOIE&quot; |
| HAUTE_SAVOIE | &quot;HAUTE_SAVOIE&quot; |
| PARIS | &quot;PARIS&quot; |
| SEINE_MARITIME | &quot;SEINE_MARITIME&quot; |
| SEINE_ET_MARNE | &quot;SEINE_ET_MARNE&quot; |
| YVELINES | &quot;YVELINES&quot; |
| DEUX_SEVRES | &quot;DEUX_SEVRES&quot; |
| SOMME | &quot;SOMME&quot; |
| TARN | &quot;TARN&quot; |
| TARN_ET_GARONNE | &quot;TARN_ET_GARONNE&quot; |
| VAR | &quot;VAR&quot; |
| VAUCLUSE | &quot;VAUCLUSE&quot; |
| VENDEE | &quot;VENDEE&quot; |
| VIENNE | &quot;VIENNE&quot; |
| HAUTE_VIENNE | &quot;HAUTE_VIENNE&quot; |
| VOSGES | &quot;VOSGES&quot; |
| YONNE | &quot;YONNE&quot; |
| TERRITOIRE_DE_BELFORT | &quot;TERRITOIRE_DE_BELFORT&quot; |
| ESSONNE | &quot;ESSONNE&quot; |
| HAUTS_DE_SEINE | &quot;HAUTS_DE_SEINE&quot; |
| SEINE_SAINT_DENIS | &quot;SEINE_SAINT_DENIS&quot; |
| VAL_DE_MARNE | &quot;VAL_DE_MARNE&quot; |
| VAL_D_OISE | &quot;VAL_D_OISE&quot; |
| GUADELOUPE | &quot;GUADELOUPE&quot; |
| MARTINIQUE | &quot;MARTINIQUE&quot; |
| GUYANE | &quot;GUYANE&quot; |
| LA_REUNION | &quot;LA_REUNION&quot; |
| SAINT_PIERRE_ET_MIQUELON | &quot;SAINT_PIERRE_ET_MIQUELON&quot; |
| MAYOTTE | &quot;MAYOTTE&quot; |
| SAINT_BARTHELEMY | &quot;SAINT_BARTHELEMY&quot; |
| SAINT_MARTIN | &quot;SAINT_MARTIN&quot; |
| TERRES_AUSTRALES_ET_ANTARCTIQUES_FRANCAISES | &quot;TERRES_AUSTRALES_ET_ANTARCTIQUES_FRANCAISES&quot; |
| WALLIS_ET_FUTUNA | &quot;WALLIS_ET_FUTUNA&quot; |
| POLYNESIE_FRANCAISE | &quot;POLYNESIE_FRANCAISE&quot; |
| NOUVELLE_CALEDONIE | &quot;NOUVELLE_CALEDONIE&quot; |
| ILE_DE_CLIPPERTON | &quot;ILE_DE_CLIPPERTON&quot; |
| MONACO | &quot;MONACO&quot; |



