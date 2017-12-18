# Main Step Specification  


## 1. Basic Information  

|**SysNm**|**SubSysCd**|**SubSysNm**|**MainStepID**|**MainStepName**|**Timing**|**Place**|**Run by**|
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|`PCS`|`N62`||`DN62CARLISTM002`|`車両 速報 リスト出力(メイン)`|`Monthly 08:00`|`TWS`|`Schedule`|


## 2. Overview  



## 3. Called Sub Step List  

|**No**|**SubStepID**|**SubStepName**|**Overview**|
|---:|:---|:---|:---|
|1|`DN6275LM_L`|||
|2|`DN6275LO_L`|||


## 4. Main Step Detail Definition  

1. 開始処理  
    1. 変数MODULE_NAMEに`DN62CARLISTM002`をセットする。  
    1. 日付時刻、PID, メインステップ名, 実行開始メッセージを以下の形式でログに出力する。  

        > "`date +%H:%M:%S` ${PID} ${MODULENAME} - MODULE EXECUTION STARTED\n"  

    1. エラーフラグMODULE_RSPに初期値(`0`)をセットする。  

1. 第1サブステップ呼び出し処理  
    1. エラーフラグMODULE_RSPが`0`かどうかチェックする。  
    1. [MODULE_RSP=`0`の場合]  
        1. 日付時刻、サブステップ名と, 実行開始メッセージを以下の形式でログに出力する。  

            > "`date +%H:%M:%S` DN6275LM_L - JOB EXECUTION STARTED"  

        1. サブステップ**[DN6275LM_L](deliverable/D0422_Sub_step_specification/N62/DN6275LM_L/DN6275LM_L.md)**を実行する。  
        1. エラーフラグMODULE_RSPにサブステップの戻り値をセットする。  
        1. 日付時刻、サブステップ名, 実行終了メッセージ、エラーフラグを以下の形式でログに出力する。  

            > "`date +%H:%M:%S` DN6275LM_L - JOB EXECUTION ENDED   RETURN CODE:${MODULE_RSP}\n"  

1. 第2サブステップ呼び出し処理  
    1. エラーフラグMODULE_RSPが`0`かどうかチェックする。  
    1. [MODULE_RSP=`0`の場合]  
        1. 日付時刻、サブステップ名と, 実行開始メッセージを以下の形式でログに出力する。  

            > "`date +%H:%M:%S` DN6275LO_L - JOB EXECUTION STARTED"  

        1. サブステップ**[DN6275LO_L](deliverable/D0422_Sub_step_specification/N62/DN6275LO_L/DN6275LO_L.md)**を実行する。  
        1. エラーフラグMODULE_RSPにサブステップの戻り値をセットする。  
        1. 日付時刻、サブステップ名, 実行終了メッセージ、エラーフラグを以下の形式でログに出力する。  

            > "`date +%H:%M:%S` DN6275LO_L - JOB EXECUTION ENDED   RETURN CODE:${MODULE_RSP}\n"  

1. 終了処理  
    1. 日付時刻、PID, メインステップ名、実行終了メッセージ、エラーフラグをログに出力する。  

        > "`date +%H:%M:%S` ${PID} ${MODULENAME} - MODULE EXECUTION ENDED   RETURN CODE:${MODULE_RSP}"  

    1. エラーフラグMODULE_RSPを戻り値として出力し、処理を終了する。  
