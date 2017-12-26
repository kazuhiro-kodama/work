000600 01           X182)-AREA.
000700   03         X182)-KOUJOU-KUBUN           PIC  X(01).
000800   03         X182)-MODEL.
000900     05       X182)-MODEL-KIHON            PIC  X(03).
001000     05       X182)-MODEL-KATASHIKI        PIC  X(07).
001100     05       X182)-MODEL-KUBUN            PIC  X(08).
001200   03         X182)-COLOR-UCHIBARI-EX.
001300     05       X182)-COLOR                  PIC  X(03).
001400     05       X182)-UCHIBARI               PIC  X(01).
001500     05       X182)-EX-NO                  PIC  X(05).
001600   03         X182)-LINE-TRIM              PIC  X(01).
001700   03         X182)-KOKUYU-KUBUN           PIC  X(01).
001800   03         X182)-YYMM.
001900     05       X182)-YY                     PIC  9(02).
002000     05       X182)-MM                     PIC  9(02).
002100   03         X182)-KOUTEI-ID              PIC  X(02).
002200   03         X182)-JISSEKI.
002300     05       X182)-JISSEKI-ZENGETSU       PIC S9(05) COMP-3.
002400     05       X182)-JISSEKI-TOUGETSU-TBL.
002500      07      X182)-JISSEKI-TOUGETSU       PIC S9(03) COMP-3
002600                                           OCCURS  63.
002700     05       X182)-JISSEKI-JIGETSU-TBL.
002800       07     X182)-JISSEKI-JIGETSU        PIC S9(03) COMP-3
002900                                           OCCURS  41.
003000   03         X182)-KEIKAKU.
003100     05       X182)-RUISA-ZEN-ZENGETSU     PIC S9(05) COMP-3.
003200     05       X182)-KEIKAKU-ZENGETSU       PIC S9(05) COMP-3.
003300     05       X182)-RUISA-ZENGETSU         PIC S9(05) COMP-3.
003400     05       X182)-KEIKAKU-TOUGETSU-TBL.
003500       07     X182)-KEIKAKU-TOUGETSU       PIC S9(03) COMP-3
003600                                           OCCURS  63.
003700     05       X182)-KEIKAKU-JIGETSU-TBL.
003800       07     X182)-KEIKAKU-JIGETSU        PIC S9(03) COMP-3
003900                                           OCCURS  41.
004000   03         X182)-IKAN.
004100     05       X182)-IKAN-ZENGETSU          PIC S9(05) COMP-3.
004200     05       X182)-IKAN-TOUGETSU          PIC S9(05) COMP-3.
004300     05       X182)-IKAN-JIGETSU           PIC S9(05) COMP-3.
004400   03         X182)-SHIKYUU.
004500     05       X182)-SHIKYUU-ZENGETSU       PIC S9(05) COMP-3.
004600     05       X182)-SHIKYUU-TOUGETSU       PIC S9(05) COMP-3.
004700     05       X182)-SHIKYUU-JIGETSU        PIC S9(05) COMP-3.
004800   03         X182)-MIKEN-ZAIKO.
004900     05       X182)-MIKEN-ZEN-ZENGETSU     PIC S9(05) COMP-3.
005000     05       X182)-MIKEN-ZENGETSU         PIC S9(05) COMP-3.
005100   03         X182)-KANKEN-ZAIKO.
005200     05       X182)-KANKEN-ZEN-ZENGETSU    PIC S9(05) COMP-3.
005300     05       X182)-KANKEN-ZENGETSU        PIC S9(05) COMP-3.
