. `/usr/bin/dirname $0`/../../ETC/MCATS_run.env
cd /${CPFID}/APPL-PGM/SHELL/MAIN
DN62CARMAINM002_INIT()
{
. init.sh
NOTIFY=`whoami`
PID=$$
CDT=`date +%y%m%d_%H%M%S`_${PID}
MSGLG=${MSGLOC}/${NOTIFY}_DN62CARMAINM002_MSGLG_${CDT}
}
MODULENAME=DN62CARMAINM002
export MODULENAME
echo "Module DN62CARMAINM002 submitted. PID = $$"
DN62CARMAINM002_INIT
echo "`date +%H:%M:%S` ${PID} ${MODULENAME} - MODULE EXECUTION STARTED\n" >> ${MSGLG}
MODULE_RSP=0
export MODULE_RSP
if [ "$MODULE_RSP" -eq 0 ]
then
    if ( CheckCondition "-f" "$JOB_PATH/DN6275LM.sh" )
    then
        echo "`date +%H:%M:%S` DN6275LM - JOB EXECUTION STARTED" >> ${MSGLG}
        DN6275LM.sh
        MODULE_RSP=$?
        echo "`date +%H:%M:%S` DN6275LM - JOB EXECUTION ENDED   RETURN CODE:${MODULE_RSP}\n" >> ${MSGLG}
    else
        MODULE_RSP=16
        echo $MODULENAME "  Error JOB DN6275LM.sh not found!"
        echo "`date +%H:%M:%S` DN6275LM - ERROR JOB NOT FOUND RETURN CODE:${MODULE_RSP}\n" >> ${MSGLG}
    fi
    echo $MODULE_RSP
fi
if [ "$MODULE_RSP" -eq 0 ]
then
    if ( CheckCondition "-f" "$JOB_PATH/DN6275LO.sh" )
    then
        echo "`date +%H:%M:%S` DN6275LO - JOB EXECUTION STARTED" >> ${MSGLG}
        DN6275LO.sh
        MODULE_RSP=$?
        echo "`date +%H:%M:%S` DN6275LO - JOB EXECUTION ENDED   RETURN CODE:${MODULE_RSP}\n" >> ${MSGLG}
    else
        MODULE_RSP=16
        echo $MODULENAME "  Error JOB DN6275LO.sh not found!"
        echo "`date +%H:%M:%S` DN6275LO - ERROR JOB NOT FOUND RETURN CODE:${MODULE_RSP}\n" >> ${MSGLG}
    fi
    echo $MODULE_RSP
fi
echo "`date +%H:%M:%S` ${PID} ${MODULENAME} - MODULE EXECUTION ENDED   RETURN CODE:${MODULE_RSP}" >> ${MSGLG}
exit ${MODULE_RSP}
