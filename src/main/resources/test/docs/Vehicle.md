

# Vehicle

Information related to the vehicle we're asking the loan for. Only needed when the goodsType is related to vehicles.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of vehicle |  [optional] |
|**subtype** | [**SubtypeEnum**](#SubtypeEnum) | The subtype of vehicle |  [optional] |
|**make** | [**MakeEnum**](#MakeEnum) | The make/brand of the vehicle |  [optional] |
|**registrationNumber** | **String** | The registration number |  [optional] |
|**firstRegistrationDate** | **LocalDate** | Date was the vehicle was first registered |  [optional] |
|**vin** | **String** | Vehicle identification number |  [optional] |
|**mileage** | **Integer** | The number of kilometers traveled by the vehicle |  [optional] |
|**versionCode** | **String** | The national vehicle code |  [optional] |
|**reregistered** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;PRIVATE&quot; |
| COMMERCIAL | &quot;COMMERCIAL&quot; |
| BIKES | &quot;BIKES&quot; |



## Enum: SubtypeEnum

| Name | Value |
|---- | -----|
| PASSENGER_CAR | &quot;PASSENGER_CAR&quot; |
| OFF_ROAD | &quot;OFF_ROAD&quot; |
| MINIVAN | &quot;MINIVAN&quot; |
| MICROCAR | &quot;MICROCAR&quot; |
| SUPERMINI | &quot;SUPERMINI&quot; |
| LUXURY | &quot;LUXURY&quot; |
| REFINANCED | &quot;REFINANCED&quot; |
| MULTIPURPOSE | &quot;MULTIPURPOSE&quot; |
| TAXI | &quot;TAXI&quot; |
| AMBULANCE | &quot;AMBULANCE&quot; |
| CONVERTED | &quot;CONVERTED&quot; |
| SPECIAL | &quot;SPECIAL&quot; |
| LIGHT_INDUSTRIAL | &quot;LIGHT_INDUSTRIAL&quot; |
| MOTORCYCLE | &quot;MOTORCYCLE&quot; |
| QUAD | &quot;QUAD&quot; |



## Enum: MakeEnum

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



