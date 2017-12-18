# Data Specification  


## 1. Basic Information  

|**SysNm**|**Vehicle/Parts**|**Schema**|**ID**|**LogicalName**|**PhysicalName**|**Kind**|**Business/ System**|**LogicalSummaryDBGroup**|**UsedSite**|**TotalLength**|**MaxRecords**|**Increase/Year**|
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|`PCS`|`Vehicle`|`Plant`|`D00208`|`仕様別DB`|`SHIYOU_182`|`Transaction`|`Business`|`生産実績DB`|`H6,H7`|`938`|`1000`|`10`|


## 2. Overview  



## 3. Data Definition  

|**No**|**Field Name**|**Type**|**Length**|**Precision**|**Scale**|**NotNull**|**Default Value**|**Original Field Name**|
|---:|:---|:---:|---:|---:|---:|:---:|---:|:---|
|1|`KOUJOU_KUBUN`|`CHAR`|`1`|||`Y`|` `|`工場区分`|
|2|`MODEL`|`CHAR`|`18`|||`Y`|` `|`モデル`|
|3|`COLOR_UCHIBARI_EX`|`CHAR`|`9`|||`N`|` `|`塗色内張りエクステリア`|
|4|`LINE_TRIM`|`CHAR`|`1`|||`Y`|` `|`ライン組立`|
|5|`KOKUYU_KUBUN`|`CHAR`|`1`|||`Y`|` `|`国輸区分`|
|6|`YYMM`|`CHAR`|`4`|||`N`|` `|`年月`|
|7|`KOUTEI_ID`|`CHAR`|`2`|||`Y`|` `|`工程ID`|
|8|`JISSEKI_ZENGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`実績年月`|
|9|`JISSEKI_TOUGETSU`|`CHAR`|`252`|||`N`|` `|`実績当月`|
|10|`JISSEKI_JIGETSU`|`CHAR`|`164`|||`N`|` `|`実績次月`|
|11|`RUISA_ZEN_ZENGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`累計差異前々月`|
|12|`KEIKAKU_ZENGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`計画前月`|
|13|`RUISA_ZENGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`累計差異前月`|
|14|`KEIKAKU_TOUGETSU`|`CHAR`|`252`|||`N`|` `|`計画当月`|
|15|`KEIKAKU_JIGETSU`|`CHAR`|`164`|||`N`|` `|`計画次月`|
|16|`IKAN_ZENGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`移管前月`|
|17|`IKAN_TOUGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`移管当月`|
|18|`IKAN_JIGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`移管次月`|
|19|`SHIKYUU_ZENGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`支給前月`|
|20|`SHIKYUU_TOUGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`支給当月`|
|21|`SHIKYUU_JIGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`支給次月`|
|22|`MIKEN_ZEN_ZENGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`未検前々月`|
|23|`MIKEN_ZENGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`未検前月`|
|24|`KANKEN_ZEN_ZENGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`完検前々月`|
|25|`KANKEN_ZENGETSU`|`NUMBER`||`5`|`0`|`N`|`0`|`完検前月`|


## 4. Index Definition  

|**No**|**Index Name**|**Unique**|
|---:|:---|---:|
|1|`SP_SHIYOU_KEY_1_182`|`N`|
|2|`SP_SHIYOU_KEY_2_182`|`N`|



### 4.1. SP_SHIYOU_KEY_1_182  

|**No**|**Field Name**|
|---:|:---|
|1|`KOUJOU_KUBUN`|
|2|`MODEL`|
|3|`LINE_TRIM`|
|4|`KOUTEI_ID`|



### 4.2. SP_SHIYOU_KEY_2_182  

|**No**|**Field Name**|
|---:|:---|
|1|`KOUJOU_KUBUN`|
|2|`LINE_TRIM`|
|3|`KOKUYU_KUBUN`|
|4|`MODEL`|
|5|`KOUTEI_ID`|

