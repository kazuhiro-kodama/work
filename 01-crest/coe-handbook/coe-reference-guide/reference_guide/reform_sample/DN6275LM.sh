. FUNCLIB.sh
. init.sh
JCLNAME=${CMNPLANTCD}DN6275LM
export JCLNAME
echo "Job ${JCLNAME} submitted. PID = $$"
trap 'ABORTHANDLER ${NOTIFY} ${JCLNAME} $$' 1 2 3 6 15
. JOBINIT.sh
STRT_MSGLG ${JCLNAME} ${NOTIFY} ${PID}
DD_SUBDAT=${DATA}/SYSTEM.SUBDAT
export DD_SUBDAT
DD_SYSDATE=${DATA}/SYSTEM.SYSDATE
export DD_SYSDATE
if [ "$COND_CODE" -eq 0 ]
then
    STRTLOG ${NOTIFY} "${JCLNAME}" "S010"
    DD_SYSIN=${PARAM}/BN62W10G
    export DD_SYSIN
    DD_SYS031=${DATA}/${PID}.S010.SYS031
    export DD_SYS031
    DD_SYS032=${DATA}/${PID}.S010.SYS032
    export DD_SYS032
    RunCobol "${JCLNAME}" "S010" "E62750" "NULL" 1>>$tempout  2>>$temperr
    COND_CODE=${RetCod}
    EXEC_PROC  ${NOTIFY} "${JCLNAME}" S010
    ENDLOG ${NOTIFY} "${JCLNAME}" "S010" ${COND_CODE} "PROC"
fi
if [ "$COND_CODE" -eq 0 ]
then
    STRTLOG ${NOTIFY} "${JCLNAME}" "S015"
    DD_SYS011=${DATA}/${PID}.S010.SYS031
    export DD_SYS011
    DD_SYS031=${DATA}/${MODULENAME}.${JCLNAME}.STATUS
    export DD_SYS031
    RunCobol "${JCLNAME}" "S015" "E62X10" "NULL" 1>>$tempout  2>>$temperr
    COND_CODE=${RetCod}
    EXEC_PROC  ${NOTIFY} "${JCLNAME}" S015
    ENDLOG ${NOTIFY} "${JCLNAME}" "S015" ${COND_CODE} "PROC"
fi
if [ "$COND_CODE" -eq 0 ]
then
    STRTLOG ${NOTIFY} "${JCLNAME}" "S056"
    DD_SORTIN=${DATA}/${PID}.S010.SYS032
    export DD_SORTIN
    DD_SORTOUT=${DATA}/${PID}.S056.SORTOUT
    export DD_SORTOUT
    DD_SORTPARM=${SORTSHELL}/A562061S
    export DD_SORTPARM
    DD_SYSOUT=${DATA}/${PID}.S056.SYSOUT
    export DD_SYSOUT
    RunSort  ${DD_SORTPARM} 1>>$tempout  2>>$temperr
    SORTFILE ${NOTIFY} "${JCLNAME}" S056 ${DD_SORTIN} ${DD_SORTOUT}
    COND_CODE=${RetCod}
    EXEC_UTILS ${NOTIFY} "${JCLNAME}" S056
    ENDLOG ${NOTIFY} "${JCLNAME}" "S056" ${COND_CODE} "UTILS"
fi
if [ "$COND_CODE" -eq 0 ]
then
    STRTLOG ${NOTIFY} "${JCLNAME}" "S057"
    DD_SYS011=${DATA}/${PID}.S056.SORTOUT
    export DD_SYS011
    DD_SYS031=${DATA}/${MODULENAME}.${JCLNAME}.SHIYOU
    export DD_SYS031
    RunCobol "${JCLNAME}" "S057" "E62X20" "NULL" 1>>$tempout  2>>$temperr
    COND_CODE=${RetCod}
    EXEC_PROC  ${NOTIFY} "${JCLNAME}" S057
    ENDLOG ${NOTIFY} "${JCLNAME}" "S057" ${COND_CODE} "PROC"
fi
if [ "$COND_CODE" -eq 0 ]
then
   if ( CheckCondition "-f" "${DATA}/${PID}.*" )
   then
      rm ${DATA}/${PID}.*
   fi
   if ( CheckCondition "-f" "${TEMP}/${PID}.*" )
   then
      rm ${TEMP}/${PID}.*
   fi
   if ( CheckCondition "-f" "${TEMP}/*_${PID}" )
   then
      rm ${TEMP}/*_${PID}
   fi
fi
END_MSGLG ${JCLNAME} ${NOTIFY} ${PID}
exit ${COND_CODE}
