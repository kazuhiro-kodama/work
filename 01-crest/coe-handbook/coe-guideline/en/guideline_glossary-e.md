## Glossary
　The definitions of terms used in this quideline are listed to below.   

| ＃ | 日本語名称 | English name | 意味(日本語) | Meaning (English)| Source | Remarks |
| --- | --- | --- | --- | --- | --- | --- |
| 1 | タスク | task | 処理の最小単位であり，単一トランザクション単位。Method, Classの集合体。 |A  minimum unit of processing and a single transaction unit. A collection of methods and classes. |  | |
| 2 | ステップ | step | タスクの流れを表すための単位。1ステップに対して1つのタスクを割り当てる。 | A unit for expressing a flow of a task. One task is assigned to one step. |  | |
| 3| ジョブ | job | 1つ以上のステップ（タスク）の集合体であり，機能としてリリースされる最小単位。 |A collection of one or more steps (tasks), a minimum unit which is released as a function. | | |
| 4 | ジョブグループ | job group | 1つ以上のジョブの集合体であり，機能として完結する単位。 | A collection of one or more jobs, an unit to complete as a function. |  | |
| 5 | ジョブフロー | job flow | ジョブグループを構成するジョブのフロー。 | A flow of jobs which constitute a job group. |  | |
| 6 | タスクフロー | task flow | ジョブを構成するタスクのフロー。 | A flow of tasks which constitute a job. |  | |
| 7 | REST | REST | 分散システムにおいて複数のソフトウェアを連携させるのに適した設計原則の集合。また狭義には，それをWebに適用したソフトウェアの設計様式。 | A set of design principles suitable for cooperating plural softwares in a distributed system. In a narrow sense, software design style of applying them to the Web | IT用語辞典e-Words |  | 
| 8 | 疎結合化アーキテクチャ | loosely coupled architecture | システムの構成要素（UI，処理，データ）をモジュールとして分離して，それらのモジュール間は統一の標準インタフェースを介して相互接続させることで疎結合化し，1つ以上のモジュールの組合せでシステムを構成するという，システムアーキテクチャ。| The system architecture by separating system components (UI, processing, data) as a module, loose-coupling-izing these modules by interconnection through the standard interface, and constituting a system from combination of one or more modules. | | |
| 9 | モジュール | module | 機能単位，交換可能な構成部分。システムの一部を構成するひとまとまりの機能を持った部品で，システムや他の部品へのインターフェースの仕様が規格化・標準化されていて，容易に追加や交換ができるもの。 | A functional unit, exchangeable component part. A part with a mass of functions which constitute part of a system, that specification of interface to a system or other parts is standardized, therefore that is what can be easily added or replaced. | IT用語辞典e-Words |  | 
| 10 | グローバル | global | 全世界的に共通であり，統一の基準に基づいていること。 | Worldwide common and based on unified standard. |  | |
| 11 | ローカル | local | 各地の工場毎に独自であること。 | Original for every plant of every place. |  | |
| 12 | リージョン | region | 国・地域の範囲。 | Range of a country and a region. |  | |
| 13 | 共通 | common | グローバルに共通の仕様であること。 | Common specification globally. |  | |
| 14 | 可変 | different | ローカルもしくはリージョン毎に異なる仕様であること。 | Different specification for every local or region. |  | |
| 15 | 生産管理 | production control | 製品の生産を合理的，効率的に行うためにされる管理のこと。生産計画，生産組織，生産統制の3機能で構成される。 | Management carried out in order to produce a product rationally and efficiently. It consists of three functions of production planning, production organization and production control. | ASCII.jpデジタル用語辞典 |  |
| 16 | 生産管理システム | production control system | 生産管理を系統的に行うために，生産に伴う現品，情報，原価（価値）の流れを統合的かつ総合的に管理するシステム。 | A system which manages  comprehensively flows of actual products associated with the production, information and cost (value) in order to perform production control systematically.| 日本工業規格（JIS） |  |
| 17 | 開発 | development | ある目的を達するための技術や仕組み，ソフトウェア（プログラムコード），装置，システム等を作りあげる行為や事業。 | Act which completes technology, structure, software (program code), equipment, system, etc. in order to attain a certain purpose | IT用語辞典e-Words |  | 
| 18 | 運用 | operation | システム等が正常に稼動し続けられるような状態を維持すること。異常の兆候がないか状態の監視したり，最新版のソフトウェアに入れ替える等の保守作業，老朽化した設備の更新，障害に備えたデータ等の保全，障害時の復旧作業等が含まれる。 | Maintaining a state where a system continues working normally. It contains monitoring whether there are any signs of abnormalities, maintenance work such as changing to the software of the latest version, upgrading superannuated equipments, data maintenance in preparation for an obstacle and repair work at the time of an obstacle. | IT用語辞典e-Words |  | 
| 19 | 保守 | maintenance | いったん完成したプログラムコードを改良・改修していくこと。発見されたバグや不具合を修正したり，効率の良いコードに書き換えて性能を向上させたりする作業が含まれる。 | Improving and repairing once completed program codes. It contains correcting discovered bugs and rewriting in efficient codes in order to raise performance.|IT用語辞典e-Words |  | |

* * *
[**Table of contents**](guideline_summery-e.md#guideline-contents)    
[**Cautions**](guideline_caution-e.md)


