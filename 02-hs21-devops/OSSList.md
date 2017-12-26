| ソフト名 | カテゴリ | 有償 | N社CoE | 評価 | 備考 |
| --- | --- | --- | --- | --- | --- |
| OpenLDAP | LDAP管理 | N | `Y` | ○ | 独自のLDAP管理を実現 |
| MkDocs | ドキュメント管理 | N | `Y` | ○ | Markdownで簡単にプロジェクトポータルを実現 |
| Confluence | ドキュメント管理 | `Y` | N | - | Atlassian社ツール。IS0 9月本番化予定。ドキュメントの整理用 |
| ownCloud | オンラインストレージ | N | `Y` | ○ | 大容量ドキュメントの管理と開発環境とのデータ連携に使用 |
| [Gitlab](https://gitlab.13.78.61.98.xip.io/hs21/devops/wikis/home) | 分散バージョン管理 | N | `Y` | ◎ | GitHubライクなツール。ドキュメントやソースのバージョン管理/タスク管理/Issue管理/CI管理をこれ一つで全て実現 |
| Git LFS | Git大容量ファイルストレージ | N | N | - | ラージファイル(画像・音声・映像等)を扱うための拡張機能。今後利用予定 |
| BitBucket | 分散バージョン管理 | `Y` | N | - | Atlassian社ツール。IS0 9月本番化予定。GitHubライクなツール |
| [Redmine](https://redmine.13.78.61.98.xip.io/projects/hs21-devops/wiki) | プロジェクト管理 | N | `Y` | △ | 設定が困難。他ツールとの連携も面倒。チケット登録も面倒で形骸化した。管理も属人化してしまう |
| JIRA | プロジェクト管理 | `Y` | N | - | Atlassian社ツール。IS0 9月本番化予定。Redmineライクなツール |
| Jenkins | CI管理 | N | `Y` | × | 設定が困難。他ツールとの連携も面倒。管理が属人化してしまう |
| Bamboo | CI管理 | `Y` | N | - | Atlassian社ツール。IS0 9月本番化予定。Jenkinsライクなツール |
| Mattermost | チャット | N | `Y` | ◎ | Slackライクなツール。様々なコミュニケーション用に導入 |
| [Rocket.Chat](https://chat.13.78.61.98.xip.io/home) | チャット | N | N | ○ | Slackライクなツール。検証環境用に導入 |
| HipChat | チャット | N | N | - | Atlassian社ツール。IS0ソリューション外。Slackライクなツール |
| SonarQube | 静的解析/可視化 | N | `Y` | ○ | 静的解析とCIの結果の可視化、分析に利用 |
| Maven | Java用プロジェクト管理 | N | `Y` | ○ | 主にBuildツールとして利用 |
| JUnit | Java UT自動化FW | N | `Y` | ○ | JavaのUTを自動化するためのFW |
| Selenium | UI UT自動化FW | N | `Y` | ○ | UI(JavaScript)のUTを自動化するためのFW |
| Spring | Java FW | N | `Y` | ○ | Javaプラットフォーム向けのオープンソースアプリケーションFW |
| Lombok | Javaライブラリ | N | `Y` | ○ | アノテーションによりJavaのコーディングを軽くするライブラリ |
| AngularJS | JavaScript FW | N | `Y` | △ | 日産アライアンス標準のJavaScriptフレームワーク |
| Vaadin | JavaScript FW | N | `Y` | ○ |  リッチなUIをJavaだけで構築するフレームワーク |
| TypeScript | プログラミング言語 | N | `Y` | ○ |  JavaScript に対して、省略も可能な静的型付けとクラスベースオブジェクト指向を加えた厳密なスーパーセット |
| electron | クロスプラットフォームFW | N | `Y` | ○ | クロスプラットフォームなデスクトップクライアントを作るためのFW |
| MySQL | RDBMS | N | `Y` | ○ | ポストOracle。様々なツールのデータの永続化に使用 |
| PostgreSQL | RDBMS | N | `Y` | ○ | ポストOracle。様々なツールのデータの永続化に使用 |
| Neo4j | NoSQL | N | `Y` | ◎ | グラフDB。データを関連性で管理。部品表のような親子関係を持つデータの管理に適している |
| Docker | 仮想化ソフト | N | `Y` | ◎ | アプリケーションやOSの開発・配備を行うための基盤ソフトウェア。コンテナ |
| Docker Compose | 複数コンテナ管理 | N | `Y` | ○ | 複数のコンテナを利用して一つのサービスを提供する場合に YAML 一発で構築出来るようにするツール |
| Docker Registry | リポジトリサーバ | N | `Y` | ○ | DockerHubのプライベートなレジストリサーバー構築のため利用 |
| Vagrant | 仮想マシン環境管理 | N | `Y` | ○ | どこでも同じ環境を再現できるように仮想マシン環境を管理するため利用 |
| Ansible | 構成管理 | N | `Y` | ○ | 多数のサーバーや複数のクラウドインフラを統一的に制御するため利用 |
| CentOS | OS | N | `Y` | ○ | RHELとの完全互換を目指したフリーのLinuxディストリビューション |
| OpenShift | PaaS | N | N | - | Red Hat社製。IS0 9月本番化予定。開発者がクラウドでアプリを迅速に開発、ホスティング、拡張、デリバリーするためのPaaS。 |
| Consul | サーバオーケストレーション | N | `Y` | ○ | サービス検出と設定のためのソリューション。API管理としての機能を期待 |
| MediaWiki | Wiki | N | N | - | PHP言語で、もともとはウィキペディアで使用するために書かれたウィキパッケージ |






