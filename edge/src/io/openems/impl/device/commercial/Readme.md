# FENECON Commercial DC-Charger


Following Values are implemented:

|ChannelName|Unit|
|---|---|
|ActualPower||
|BmsDCDC1Abnormity1|1: High voltage side of DC Converter undervoltage<br/>2: High voltage side of DC Converter overvoltage<br/>4: Low voltage side  of DC Converter undervoltage<br/>8: Low voltage side  of DC Converter overvoltage<br/>16: High voltage side of DC Converter overcurrent fault<br/>32: Low voltage side of DC Converter overcurrent fault<br/>64: DC Converter IGBT fault<br/>128: DC Converter Precharge unmet<br/>|
|BmsDCDC1Abnormity2|1: BECU communication disconnected<br/>2: DC Converter communication disconnected<br/>4: Current configuration over range<br/>8: The battery request stop<br/>32: Overcurrent relay fault<br/>64: Lightning protection device fault<br/>128: DC Converter priamary contactor disconnected abnormally<br/>512: DC disconnected abnormally on low voltage side of DC convetor<br/>4096: DC convetor EEPROM abnormity 1<br/>8192: DC convetor EEPROM abnormity 1<br/>16384: EDC convetor EEPROM abnormity 1<br/>|
|BmsDCDC1Abnormity3|1: DC Convertor general overload<br/>2: DC short circuit<br/>4: Peak pulse current protection<br/>8: DC disconnect abnormally on high voltage side of DC convetor<br/>16: Effective pulse value overhigh<br/>32: DC Converte severe overload<br/>64: DC breaker disconnect abnormally on high voltage side of DC convetor<br/>128: DC breaker disconnect abnormally on low voltage side of DC convetor<br/>256: DC convetor precharge contactor close failed <br/>512: DC convetor main contactor close failed<br/>1024: AC contactor state abnormity of DC convetor<br/>2048: DC convetor emergency stop<br/>4096: DC converter charging gun disconnected<br/>8192: DC current abnormity before DC convetor work<br/>16384: Fuse disconnected<br/>32768: DC converter hardware current or voltage fault<br/>|
|BmsDCDC1Abnormity4|1: DC converter crystal oscillator circuit invalidation<br/>2: DC converter reset circuit invalidation<br/>4: DC converter sampling circuit invalidation<br/>8: DC converter digital I/O circuit invalidation<br/>16: DC converter PWM circuit invalidation<br/>32: DC converter X5045 circuit invalidation<br/>64: DC converter CAN circuit invalidation<br/>128: DC converter software&hardware protection circuit invalidation<br/>256: DC converter power circuit invalidation<br/>512: DC converter CPU invalidation<br/>1024: DC converter TINT0 interrupt invalidation<br/>2048: DC converter ADC interrupt invalidation<br/>4096: DC converter CAPITN4 interrupt invalidation<br/>8192: DC converter CAPINT6 interrupt invalidation<br/>16384: DC converter T3PINTinterrupt invalidation<br/>32768: DC converter T4PINTinterrupt invalidation<br/>|
|BmsDCDC1Abnormity5|1: DC converter PDPINTA interrupt invalidation<br/>2: DC converter T1PINT interrupt invalidation<br/>4: DC converter RESV interrupt invalidation<br/>8: DC converter 100us task invalidation<br/>16: DC converter clock  invalidation<br/>32: DC converter EMS memory invalidation<br/>64: DC converter exterior communication invalidation<br/>128: DC converter IO Interface invalidation<br/>256: DC converter Input Voltage bound fault<br/>512: DC converter Outter Voltage bound fault<br/>1024: DC converter Output Voltage bound fault<br/>2048: DC converter Induct Current bound fault<br/>4096: DC converter Input Current bound fault<br/>8192: DC converter Output Current bound fault<br/>|
|BmsDCDC1Abnormity6|1: DC Reactor over temperature<br/>2: DC IGBT over temperature<br/>4: DC Converter chanel 3 over temperature<br/>8: DC Converter chanel 4 over temperature<br/>16: DC Converter chanel 5 over temperature<br/>32: DC Converter chanel 6 over temperature<br/>64: DC Converter chanel 7 over temperature<br/>128: DC Converter chanel 8 over temperature<br/>256: DC Reactor temperature sampling invalidation<br/>512: DC IGBT temperature sampling invalidation<br/>1024: DC Converter chanel 3 temperature sampling invalidation<br/>2048: DC Converter chanel 4 temperature sampling invalidation<br/>4096: DC Converter chanel 5 temperature sampling invalidation<br/>8192: DC Converter chanel 6 temperature sampling invalidation<br/>16384: DC Converter chanel 7 temperature sampling invalidation<br/>32768: DC Converter chanel 8 temperature sampling invalidation<br/>|
|BmsDCDC1Abnormity7|32: DC Converter inductance current sampling invalidation<br/>64: Current sampling invalidation on the low voltage sideof DC Converter<br/>128: Voltage sampling invalidation on the low voltage side of DC Converter<br/>256: Insulation inspection fault<br/>512: NegContactor close unsuccessly<br/>1024: NegContactor cut When running<br/>|
|BmsDCDC1IgbtTemperature|�C|
|BmsDCDC1InputCurrent|mA|
|BmsDCDC1InputEnergy|Wh|
|BmsDCDC1InputPower|W|
|BmsDCDC1InputTotalChargeEnergy|Wh|
|BmsDCDC1InputTotalDischargeEnergy|Wh|
|BmsDCDC1InputVoltage|mV|
|BmsDCDC1OutputCurrent|mA|
|BmsDCDC1OutputEnergy|Wh|
|BmsDCDC1OutputPower|W|
|BmsDCDC1OutputTotalChargeEnergy|Wh|
|BmsDCDC1OutputTotalDischargeEnergy|Wh|
|BmsDCDC1OutputVoltage|mV|
|BmsDCDC1ReactorTemperature|�C|
|BmsDCDC1SuggestiveInformation1|1: Current sampling channel abnormity on high voltage side<br/>2: Current sampling channel abnormity on low voltage side<br/>64: EEPROM parameters over range<br/>128: Update EEPROM failed<br/>256: Read EEPROM failed<br/>512: Current sampling channel abnormity before inductance<br/>|
|BmsDCDC1SuggestiveInformation2|1: Reactor  power decrease caused by overtemperature<br/>2: IGBT  power decrease caused by overtemperature<br/>4: Temperature chanel3  power decrease caused by overtemperature<br/>8: Temperature chanel4  power decrease caused by overtemperature<br/>16: Temperature chanel5  power decrease caused by overtemperature<br/>32: Temperature chanel6  power decrease caused by overtemperature<br/>64: Temperature chanel7  power decrease caused by overtemperature<br/>128: Temperature chanel8 power decrease caused by overtemperature<br/>256: Fan 1 stop failed<br/>512: Fan 2 stop failed<br/>1024: Fan 3 stop failed<br/>2048: Fan 4 stop failed<br/>4096: Fan 1 sartup failed<br/>8192: Fan 2 sartup failed<br/>16384: Fan 3 sartup failed<br/>32768: Fan 4 sartup failed<br/>|
|BmsDCDC1SuggestiveInformation3|1: High voltage side overvoltage<br/>2: High voltage side undervoltage<br/>4: EEPROM parameters over range<br/>8: High voltage side voltage change unconventionally<br/>|
|BmsDCDC1SuggestiveInformation4|1: Current abnormity before DC Converter work on high voltage side<br/>2: Current abnormity before DC Converter work on low voltage side<br/>4: Initial Duty Ratio abnormity before DC Converter work<br/>8: Voltage abnormity before DC Converter work on high voltage side<br/>16: Voltage abnormity before  DC Converter work on low voltage side<br/>|
|BmsDCDC1SuggestiveInformation5|1: High voltage breaker inspection abnormity<br/>2: Low voltage breaker inspection abnormity<br/>4: DC precharge contactor inspection abnormity<br/>8: DC precharge contactor open unsuccessfully<br/>16: DC main contactor inspection abnormity<br/>32: DC main contactor open unsuccessfully<br/>64: Output contactor close unsuccessfully<br/>128: Output contactor open unsuccessfully<br/>256: AC main contactor close unsuccessfully<br/>512: AC main contactor open unsuccessfully<br/>1024: NegContactor open unsuccessfully<br/>2048: NegContactor close unsuccessfully<br/>4096: NegContactor state abnormal<br/>|
|BmsDCDC1SwitchState|1: DC precharge contactor<br/>2: DC main contactor<br/>4: Output contactor<br/>8: Output breaker<br/>16: Input breaker<br/>32: AC contactor<br/>64: Emergency stop button<br/>128: NegContactor<br/>|
|BmsDCDC1WorkMode|128: Constant Current<br/>256: Constant Voltage<br/>512: Boost MPPT<br/>|
|BmsDCDC1WorkState|2: Initial<br/>4: Stop<br/>8: Ready<br/>16: Running<br/>32: Fault<br/>64: Debug<br/>128: Locked<br/>|
|BmsDCDCAbnormity1|1: High voltage side of DC Converter undervoltage<br/>2: High voltage side of DC Converter overvoltage<br/>4: Low voltage side  of DC Converter undervoltage<br/>8: Low voltage side  of DC Converter overvoltage<br/>16: High voltage side of DC Converter overcurrent fault<br/>32: Low voltage side of DC Converter overcurrent fault<br/>64: DC Converter IGBT fault<br/>128: DC Converter Precharge unmet<br/>|
|BmsDCDCAbnormity2|1: BECU communication disconnected<br/>2: DC Converter communication disconnected<br/>4: Current configuration over range<br/>8: The battery request stop<br/>32: Overcurrent relay fault<br/>64: Lightning protection device fault<br/>128: DC Converter priamary contactor disconnected abnormally<br/>512: DC disconnected abnormally on low voltage side of DC convetor<br/>4096: DC convetor EEPROM abnormity 1<br/>8192: DC convetor EEPROM abnormity 1<br/>16384: EDC convetor EEPROM abnormity 1<br/>|
|BmsDCDCAbnormity3|1: DC Convertor general overload<br/>2: DC short circuit<br/>4: Peak pulse current protection<br/>8: DC disconnect abnormally on high voltage side of DC convetor<br/>16: Effective pulse value overhigh<br/>32: DC Converte severe overload<br/>64: DC breaker disconnect abnormally on high voltage side of DC convetor<br/>128: DC breaker disconnect abnormally on low voltage side of DC convetor<br/>256: DC convetor precharge contactor close failed <br/>512: DC convetor main contactor close failed<br/>1024: AC contactor state abnormity of DC convetor<br/>2048: DC convetor emergency stop<br/>4096: DC converter charging gun disconnected<br/>8192: DC current abnormity before DC convetor work<br/>16384: Fuse disconnected<br/>32768: DC converter hardware current or voltage fault<br/>|
|BmsDCDCAbnormity4|1: DC converter crystal oscillator circuit invalidation<br/>2: DC converter reset circuit invalidation<br/>4: DC converter sampling circuit invalidation<br/>8: DC converter digital I/O circuit invalidation<br/>16: DC converter PWM circuit invalidation<br/>32: DC converter X5045 circuit invalidation<br/>64: DC converter CAN circuit invalidation<br/>128: DC converter software&hardware protection circuit invalidation<br/>256: DC converter power circuit invalidation<br/>512: DC converter CPU invalidation<br/>1024: DC converter TINT0 interrupt invalidation<br/>2048: DC converter ADC interrupt invalidation<br/>4096: DC converter CAPITN4 interrupt invalidation<br/>8192: DC converter CAPINT6 interrupt invalidation<br/>16384: DC converter T3PINTinterrupt invalidation<br/>32768: DC converter T4PINTinterrupt invalidation<br/>|
|BmsDCDCAbnormity5|1: DC converter PDPINTA interrupt invalidation<br/>2: DC converter T1PINT interrupt invalidation<br/>4: DC converter RESV interrupt invalidation<br/>8: DC converter 100us task invalidation<br/>16: DC converter clock  invalidation<br/>32: DC converter EMS memory invalidation<br/>64: DC converter exterior communication invalidation<br/>128: DC converter IO Interface invalidation<br/>256: DC converter Input Voltage bound fault<br/>512: DC converter Outter Voltage bound fault<br/>1024: DC converter Output Voltage bound fault<br/>2048: DC converter Induct Current bound fault<br/>4096: DC converter Input Current bound fault<br/>8192: DC converter Output Current bound fault<br/>|
|BmsDCDCAbnormity6|1: DC Reactor over temperature<br/>2: DC IGBT over temperature<br/>4: DC Converter chanel 3 over temperature<br/>8: DC Converter chanel 4 over temperature<br/>16: DC Converter chanel 5 over temperature<br/>32: DC Converter chanel 6 over temperature<br/>64: DC Converter chanel 7 over temperature<br/>128: DC Converter chanel 8 over temperature<br/>256: DC Reactor temperature sampling invalidation<br/>512: DC IGBT temperature sampling invalidation<br/>1024: DC Converter chanel 3 temperature sampling invalidation<br/>2048: DC Converter chanel 4 temperature sampling invalidation<br/>4096: DC Converter chanel 5 temperature sampling invalidation<br/>8192: DC Converter chanel 6 temperature sampling invalidation<br/>16384: DC Converter chanel 7 temperature sampling invalidation<br/>32768: DC Converter chanel 8 temperature sampling invalidation<br/>|
|BmsDCDCAbnormity7|32: DC Converter inductance current sampling invalidation<br/>64: Current sampling invalidation on the low voltage sideof DC Converter<br/>128: Voltage sampling invalidation on the low voltage side of DC Converter<br/>256: Insulation inspection fault<br/>512: NegContactor close unsuccessly<br/>1024: NegContactor cut When running<br/>|
|BmsDCDCIgbtTemperature|�C|
|BmsDCDCInputCurrent|mA|
|BmsDCDCInputEnergy|Wh|
|BmsDCDCInputPower|W|
|BmsDCDCInputTotalChargeEnergy|Wh|
|BmsDCDCInputTotalDischargeEnergy|Wh|
|BmsDCDCInputVoltage|mV|
|BmsDCDCOutputCurrent|mA|
|BmsDCDCOutputEnergy|Wh|
|BmsDCDCOutputPower|W|
|BmsDCDCOutputTotalChargeEnergy|Wh|
|BmsDCDCOutputTotalDischargeEnergy|Wh|
|BmsDCDCOutputVoltage|mV|
|BmsDCDCReactorTemperature|�C|
|BmsDCDCSuggestiveInformation1|1: Current sampling channel abnormity on high voltage side<br/>2: Current sampling channel abnormity on low voltage side<br/>64: EEPROM parameters over range<br/>128: Update EEPROM failed<br/>256: Read EEPROM failed<br/>512: Current sampling channel abnormity before inductance<br/>|
|BmsDCDCSuggestiveInformation2|1: Reactor  power decrease caused by overtemperature<br/>2: IGBT  power decrease caused by overtemperature<br/>4: Temperature chanel3  power decrease caused by overtemperature<br/>8: Temperature chanel4  power decrease caused by overtemperature<br/>16: Temperature chanel5  power decrease caused by overtemperature<br/>32: Temperature chanel6  power decrease caused by overtemperature<br/>64: Temperature chanel7  power decrease caused by overtemperature<br/>128: Temperature chanel8 power decrease caused by overtemperature<br/>256: Fan 1 stop failed<br/>512: Fan 2 stop failed<br/>1024: Fan 3 stop failed<br/>2048: Fan 4 stop failed<br/>4096: Fan 1 sartup failed<br/>8192: Fan 2 sartup failed<br/>16384: Fan 3 sartup failed<br/>32768: Fan 4 sartup failed<br/>|
|BmsDCDCSuggestiveInformation3|1: High voltage side overvoltage<br/>2: High voltage side undervoltage<br/>4: EEPROM parameters over range<br/>8: High voltage side voltage change unconventionally<br/>|
|BmsDCDCSuggestiveInformation4|1: Current abnormity before DC Converter work on high voltage side<br/>2: Current abnormity before DC Converter work on low voltage side<br/>4: Initial Duty Ratio abnormity before DC Converter work<br/>8: Voltage abnormity before DC Converter work on high voltage side<br/>16: Voltage abnormity before  DC Converter work on low voltage side<br/>|
|BmsDCDCSuggestiveInformation5|1: High voltage breaker inspection abnormity<br/>2: Low voltage breaker inspection abnormity<br/>4: DC precharge contactor inspection abnormity<br/>8: DC precharge contactor open unsuccessfully<br/>16: DC main contactor inspection abnormity<br/>32: DC main contactor open unsuccessfully<br/>64: Output contactor close unsuccessfully<br/>128: Output contactor open unsuccessfully<br/>256: AC main contactor close unsuccessfully<br/>512: AC main contactor open unsuccessfully<br/>1024: NegContactor open unsuccessfully<br/>2048: NegContactor close unsuccessfully<br/>4096: NegContactor state abnormal<br/>|
|BmsDCDCSwitchState|1: DC precharge contactor<br/>2: DC main contactor<br/>4: Output contactor<br/>8: Output breaker<br/>16: Input breaker<br/>32: AC contactor<br/>64: Emergency stop button<br/>128: NegContactor<br/>|
|BmsDCDCWorkMode|128: Constant Current<br/>256: Constant Voltage<br/>512: Boost MPPT<br/>|
|BmsDCDCWorkState|2: Initial<br/>4: Stop<br/>8: Ready<br/>16: Running<br/>32: Fault<br/>64: Debug<br/>128: Locked<br/>|
|ActualPower||
|InputVoltage||
|NominalPower||
|InputVoltage||
|maxActualPower||
|PvDCDC1Abnormity1|1: High voltage side of DC Converter undervoltage<br/>2: High voltage side of DC Converter overvoltage<br/>4: Low voltage side  of DC Converter undervoltage<br/>8: Low voltage side  of DC Converter overvoltage<br/>16: High voltage side of DC Converter overcurrent fault<br/>32: Low voltage side of DC Converter overcurrent fault<br/>64: DC Converter IGBT fault<br/>128: DC Converter Precharge unmet<br/>|
|PvDCDC1Abnormity2|1: BECU communication disconnected<br/>2: DC Converter communication disconnected<br/>4: Current configuration over range<br/>8: The battery request stop<br/>32: Overcurrent relay fault<br/>64: Lightning protection device fault<br/>128: DC Converter priamary contactor disconnected abnormally<br/>512: DC disconnected abnormally on low voltage side of DC convetor<br/>4096: DC convetor EEPROM abnormity 1<br/>8192: DC convetor EEPROM abnormity 1<br/>16384: EDC convetor EEPROM abnormity 1<br/>|
|PvDCDC1Abnormity3|1: DC Convertor general overload<br/>2: DC short circuit<br/>4: Peak pulse current protection<br/>8: DC disconnect abnormally on high voltage side of DC convetor<br/>16: Effective pulse value overhigh<br/>32: DC Converte severe overload<br/>64: DC breaker disconnect abnormally on high voltage side of DC convetor<br/>128: DC breaker disconnect abnormally on low voltage side of DC convetor<br/>256: DC convetor precharge contactor close failed <br/>512: DC convetor main contactor close failed<br/>1024: AC contactor state abnormity of DC convetor<br/>2048: DC convetor emergency stop<br/>4096: DC converter charging gun disconnected<br/>8192: DC current abnormity before DC convetor work<br/>16384: Fuse disconnected<br/>32768: DC converter hardware current or voltage fault<br/>|
|PvDCDC1Abnormity4|1: DC converter crystal oscillator circuit invalidation<br/>2: DC converter reset circuit invalidation<br/>4: DC converter sampling circuit invalidation<br/>8: DC converter digital I/O circuit invalidation<br/>16: DC converter PWM circuit invalidation<br/>32: DC converter X5045 circuit invalidation<br/>64: DC converter CAN circuit invalidation<br/>128: DC converter software&hardware protection circuit invalidation<br/>256: DC converter power circuit invalidation<br/>512: DC converter CPU invalidation<br/>1024: DC converter TINT0 interrupt invalidation<br/>2048: DC converter ADC interrupt invalidation<br/>4096: DC converter CAPITN4 interrupt invalidation<br/>8192: DC converter CAPINT6 interrupt invalidation<br/>16384: DC converter T3PINTinterrupt invalidation<br/>32768: DC converter T4PINTinterrupt invalidation<br/>|
|PvDCDC1Abnormity5|1: DC converter PDPINTA interrupt invalidation<br/>2: DC converter T1PINT interrupt invalidation<br/>4: DC converter RESV interrupt invalidation<br/>8: DC converter 100us task invalidation<br/>16: DC converter clock  invalidation<br/>32: DC converter EMS memory invalidation<br/>64: DC converter exterior communication invalidation<br/>128: DC converter IO Interface invalidation<br/>256: DC converter Input Voltage bound fault<br/>512: DC converter Outter Voltage bound fault<br/>1024: DC converter Output Voltage bound fault<br/>2048: DC converter Induct Current bound fault<br/>4096: DC converter Input Current bound fault<br/>8192: DC converter Output Current bound fault<br/>|
|PvDCDC1Abnormity6|1: DC Reactor over temperature<br/>2: DC IGBT over temperature<br/>4: DC Converter chanel 3 over temperature<br/>8: DC Converter chanel 4 over temperature<br/>16: DC Converter chanel 5 over temperature<br/>32: DC Converter chanel 6 over temperature<br/>64: DC Converter chanel 7 over temperature<br/>128: DC Converter chanel 8 over temperature<br/>256: DC Reactor temperature sampling invalidation<br/>512: DC IGBT temperature sampling invalidation<br/>1024: DC Converter chanel 3 temperature sampling invalidation<br/>2048: DC Converter chanel 4 temperature sampling invalidation<br/>4096: DC Converter chanel 5 temperature sampling invalidation<br/>8192: DC Converter chanel 6 temperature sampling invalidation<br/>16384: DC Converter chanel 7 temperature sampling invalidation<br/>32768: DC Converter chanel 8 temperature sampling invalidation<br/>|
|PvDCDC1Abnormity7|32: DC Converter inductance current sampling invalidation<br/>64: Current sampling invalidation on the low voltage sideof DC Converter<br/>128: Voltage sampling invalidation on the low voltage side of DC Converter<br/>256: Insulation inspection fault<br/>512: NegContactor close unsuccessly<br/>1024: NegContactor cut When running<br/>|
|PvDCDC1IgbtTemperature|�C|
|PvDCDC1InputCurrent|mA|
|PvDCDC1InputEnergy|Wh|
|PvDCDC1InputPower|W|
|PvDCDC1InputTotalChargeEnergy|Wh|
|PvDCDC1InputTotalDischargeEnergy|Wh|
|PvDCDC1InputVoltage|mV|
|PvDCDC1OutputCurrent|mA|
|PvDCDC1OutputEnergy|Wh|
|PvDCDC1OutputPower|W|
|PvDCDC1OutputTotalChargeEnergy|Wh|
|PvDCDC1OutputTotalDischargeEnergy|Wh|
|PvDCDC1OutputVoltage|mV|
|PvDCDC1ReactorTemperature|�C|
|PvDCDC1SuggestiveInformation1|1: Current sampling channel abnormity on high voltage side<br/>2: Current sampling channel abnormity on low voltage side<br/>64: EEPROM parameters over range<br/>128: Update EEPROM failed<br/>256: Read EEPROM failed<br/>512: Current sampling channel abnormity before inductance<br/>|
|PvDCDC1SuggestiveInformation2|1: Reactor  power decrease caused by overtemperature<br/>2: IGBT  power decrease caused by overtemperature<br/>4: Temperature chanel3  power decrease caused by overtemperature<br/>8: Temperature chanel4  power decrease caused by overtemperature<br/>16: Temperature chanel5  power decrease caused by overtemperature<br/>32: Temperature chanel6  power decrease caused by overtemperature<br/>64: Temperature chanel7  power decrease caused by overtemperature<br/>128: Temperature chanel8 power decrease caused by overtemperature<br/>256: Fan 1 stop failed<br/>512: Fan 2 stop failed<br/>1024: Fan 3 stop failed<br/>2048: Fan 4 stop failed<br/>4096: Fan 1 sartup failed<br/>8192: Fan 2 sartup failed<br/>16384: Fan 3 sartup failed<br/>32768: Fan 4 sartup failed<br/>|
|PvDCDC1SuggestiveInformation3|1: High voltage side overvoltage<br/>2: High voltage side undervoltage<br/>4: EEPROM parameters over range<br/>8: High voltage side voltage change unconventionally<br/>|
|PvDCDC1SuggestiveInformation4|1: Current abnormity before DC Converter work on high voltage side<br/>2: Current abnormity before DC Converter work on low voltage side<br/>4: Initial Duty Ratio abnormity before DC Converter work<br/>8: Voltage abnormity before DC Converter work on high voltage side<br/>16: Voltage abnormity before  DC Converter work on low voltage side<br/>|
|PvDCDC1SuggestiveInformation5|1: High voltage breaker inspection abnormity<br/>2: Low voltage breaker inspection abnormity<br/>4: DC precharge contactor inspection abnormity<br/>8: DC precharge contactor open unsuccessfully<br/>16: DC main contactor inspection abnormity<br/>32: DC main contactor open unsuccessfully<br/>64: Output contactor close unsuccessfully<br/>128: Output contactor open unsuccessfully<br/>256: AC main contactor close unsuccessfully<br/>512: AC main contactor open unsuccessfully<br/>1024: NegContactor open unsuccessfully<br/>2048: NegContactor close unsuccessfully<br/>4096: NegContactor state abnormal<br/>|
|PvDCDC1SwitchState|1: DC precharge contactor<br/>2: DC main contactor<br/>4: Output contactor<br/>8: Output breaker<br/>16: Input breaker<br/>32: AC contactor<br/>64: Emergency stop button<br/>128: NegContactor<br/>|
|PvDCDC1WorkMode|128: Constant Current<br/>256: Constant Voltage<br/>512: Boost MPPT<br/>|
|PvDCDC1WorkState|2: Initial<br/>4: Stop<br/>8: Ready<br/>16: Running<br/>32: Fault<br/>64: Debug<br/>128: Locked<br/>|
|PvDCDCAbnormity1|1: High voltage side of DC Converter undervoltage<br/>2: High voltage side of DC Converter overvoltage<br/>4: Low voltage side  of DC Converter undervoltage<br/>8: Low voltage side  of DC Converter overvoltage<br/>16: High voltage side of DC Converter overcurrent fault<br/>32: Low voltage side of DC Converter overcurrent fault<br/>64: DC Converter IGBT fault<br/>128: DC Converter Precharge unmet<br/>|
|PvDCDCAbnormity2|1: BECU communication disconnected<br/>2: DC Converter communication disconnected<br/>4: Current configuration over range<br/>8: The battery request stop<br/>32: Overcurrent relay fault<br/>64: Lightning protection device fault<br/>128: DC Converter priamary contactor disconnected abnormally<br/>512: DC disconnected abnormally on low voltage side of DC convetor<br/>4096: DC convetor EEPROM abnormity 1<br/>8192: DC convetor EEPROM abnormity 1<br/>16384: EDC convetor EEPROM abnormity 1<br/>|
|PvDCDCAbnormity3|1: DC Convertor general overload<br/>2: DC short circuit<br/>4: Peak pulse current protection<br/>8: DC disconnect abnormally on high voltage side of DC convetor<br/>16: Effective pulse value overhigh<br/>32: DC Converte severe overload<br/>64: DC breaker disconnect abnormally on high voltage side of DC convetor<br/>128: DC breaker disconnect abnormally on low voltage side of DC convetor<br/>256: DC convetor precharge contactor close failed <br/>512: DC convetor main contactor close failed<br/>1024: AC contactor state abnormity of DC convetor<br/>2048: DC convetor emergency stop<br/>4096: DC converter charging gun disconnected<br/>8192: DC current abnormity before DC convetor work<br/>16384: Fuse disconnected<br/>32768: DC converter hardware current or voltage fault<br/>|
|PvDCDCAbnormity4|1: DC converter crystal oscillator circuit invalidation<br/>2: DC converter reset circuit invalidation<br/>4: DC converter sampling circuit invalidation<br/>8: DC converter digital I/O circuit invalidation<br/>16: DC converter PWM circuit invalidation<br/>32: DC converter X5045 circuit invalidation<br/>64: DC converter CAN circuit invalidation<br/>128: DC converter software&hardware protection circuit invalidation<br/>256: DC converter power circuit invalidation<br/>512: DC converter CPU invalidation<br/>1024: DC converter TINT0 interrupt invalidation<br/>2048: DC converter ADC interrupt invalidation<br/>4096: DC converter CAPITN4 interrupt invalidation<br/>8192: DC converter CAPINT6 interrupt invalidation<br/>16384: DC converter T3PINTinterrupt invalidation<br/>32768: DC converter T4PINTinterrupt invalidation<br/>|
|PvDCDCAbnormity5|1: DC converter PDPINTA interrupt invalidation<br/>2: DC converter T1PINT interrupt invalidation<br/>4: DC converter RESV interrupt invalidation<br/>8: DC converter 100us task invalidation<br/>16: DC converter clock  invalidation<br/>32: DC converter EMS memory invalidation<br/>64: DC converter exterior communication invalidation<br/>128: DC converter IO Interface invalidation<br/>256: DC converter Input Voltage bound fault<br/>512: DC converter Outter Voltage bound fault<br/>1024: DC converter Output Voltage bound fault<br/>2048: DC converter Induct Current bound fault<br/>4096: DC converter Input Current bound fault<br/>8192: DC converter Output Current bound fault<br/>|
|PvDCDCAbnormity6|1: DC Reactor over temperature<br/>2: DC IGBT over temperature<br/>4: DC Converter chanel 3 over temperature<br/>8: DC Converter chanel 4 over temperature<br/>16: DC Converter chanel 5 over temperature<br/>32: DC Converter chanel 6 over temperature<br/>64: DC Converter chanel 7 over temperature<br/>128: DC Converter chanel 8 over temperature<br/>256: DC Reactor temperature sampling invalidation<br/>512: DC IGBT temperature sampling invalidation<br/>1024: DC Converter chanel 3 temperature sampling invalidation<br/>2048: DC Converter chanel 4 temperature sampling invalidation<br/>4096: DC Converter chanel 5 temperature sampling invalidation<br/>8192: DC Converter chanel 6 temperature sampling invalidation<br/>16384: DC Converter chanel 7 temperature sampling invalidation<br/>32768: DC Converter chanel 8 temperature sampling invalidation<br/>|
|PvDCDCAbnormity7|32: DC Converter inductance current sampling invalidation<br/>64: Current sampling invalidation on the low voltage sideof DC Converter<br/>128: Voltage sampling invalidation on the low voltage side of DC Converter<br/>256: Insulation inspection fault<br/>512: NegContactor close unsuccessly<br/>1024: NegContactor cut When running<br/>|
|PvDCDCIgbtTemperature|�C|
|PvDCDCInputCurrent|mA|
|PvDCDCInputEnergy|Wh|
|PvDCDCInputPower|W|
|PvDCDCInputTotalChargeEnergy|Wh|
|PvDCDCInputTotalDischargeEnergy|Wh|
|PvDCDCInputVoltage|mV|
|PvDCDCOutputCurrent|mA|
|PvDCDCOutputEnergy|Wh|
|PvDCDCOutputPower|W|
|PvDCDCOutputTotalChargeEnergy|Wh|
|PvDCDCOutputTotalDischargeEnergy|Wh|
|PvDCDCOutputVoltage|mV|
|PvDCDCReactorTemperature|�C|
|PvDCDCSuggestiveInformation1|1: Current sampling channel abnormity on high voltage side<br/>2: Current sampling channel abnormity on low voltage side<br/>64: EEPROM parameters over range<br/>128: Update EEPROM failed<br/>256: Read EEPROM failed<br/>512: Current sampling channel abnormity before inductance<br/>|
|PvDCDCSuggestiveInformation2|1: Reactor  power decrease caused by overtemperature<br/>2: IGBT  power decrease caused by overtemperature<br/>4: Temperature chanel3  power decrease caused by overtemperature<br/>8: Temperature chanel4  power decrease caused by overtemperature<br/>16: Temperature chanel5  power decrease caused by overtemperature<br/>32: Temperature chanel6  power decrease caused by overtemperature<br/>64: Temperature chanel7  power decrease caused by overtemperature<br/>128: Temperature chanel8 power decrease caused by overtemperature<br/>256: Fan 1 stop failed<br/>512: Fan 2 stop failed<br/>1024: Fan 3 stop failed<br/>2048: Fan 4 stop failed<br/>4096: Fan 1 sartup failed<br/>8192: Fan 2 sartup failed<br/>16384: Fan 3 sartup failed<br/>32768: Fan 4 sartup failed<br/>|
|PvDCDCSuggestiveInformation3|1: High voltage side overvoltage<br/>2: High voltage side undervoltage<br/>4: EEPROM parameters over range<br/>8: High voltage side voltage change unconventionally<br/>|
|PvDCDCSuggestiveInformation4|1: Current abnormity before DC Converter work on high voltage side<br/>2: Current abnormity before DC Converter work on low voltage side<br/>4: Initial Duty Ratio abnormity before DC Converter work<br/>8: Voltage abnormity before DC Converter work on high voltage side<br/>16: Voltage abnormity before  DC Converter work on low voltage side<br/>|
|PvDCDCSuggestiveInformation5|1: High voltage breaker inspection abnormity<br/>2: Low voltage breaker inspection abnormity<br/>4: DC precharge contactor inspection abnormity<br/>8: DC precharge contactor open unsuccessfully<br/>16: DC main contactor inspection abnormity<br/>32: DC main contactor open unsuccessfully<br/>64: Output contactor close unsuccessfully<br/>128: Output contactor open unsuccessfully<br/>256: AC main contactor close unsuccessfully<br/>512: AC main contactor open unsuccessfully<br/>1024: NegContactor open unsuccessfully<br/>2048: NegContactor close unsuccessfully<br/>4096: NegContactor state abnormal<br/>|
|PvDCDCSwitchState|1: DC precharge contactor<br/>2: DC main contactor<br/>4: Output contactor<br/>8: Output breaker<br/>16: Input breaker<br/>32: AC contactor<br/>64: Emergency stop button<br/>128: NegContactor<br/>|
|PvDCDCWorkMode|128: Constant Current<br/>256: Constant Voltage<br/>512: Boost MPPT<br/>|
|PvDCDCWorkState|2: Initial<br/>4: Stop<br/>8: Ready<br/>16: Running<br/>32: Fault<br/>64: Debug<br/>128: Locked<br/>|
|PvPowerLimitCommand|W|
|PvPowerLimitCommand|W|
|Warning||