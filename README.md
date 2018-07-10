# slick-codegen-sample
Slick 3.2.3のコードジェネレータでMySQLのスキーマコードを自動生成するサンプルコードです．

## 使い方
1.  MySQLにテーブルを生成する. 接続情報は適宜変更します．

    ```
    $ mysql -uroot
    > CREATE DATABASE test_db;
    > CREATE TABLE IF NOT EXISTS test_db.`user`(
        `id` INT UNSIGNED NOT NULL,
        `name` VARCHAR(255) NOT NULL,
        `age` TINYINT UNSIGNED,
        `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (`id`)
      ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
    ```

2. codegen.confを書き換える  
接続情報を適宜変更します．

    ```
    codegen {
      test_db {
        profile = "slick.jdbc.MySQLProfile$"
        db {
          dataSourceClass = "slick.jdbc.DatabaseUrlDataSource"
          properties {
            driver = com.mysql.jdbc.Driver
            user = "root"
            url = "jdbc:mysql://localhost/test_db?useSSL=false"
            password = "root"
          }
        }
        codegen.package = "jp.mattsu"
        codegen.outputDir = "./src/main/scala"
      }
    }
    ```
    
3. 実行する  
本プロジェクトのルートディレクトリ(build.sbtがある場所)で以下を実行．
するとTablesクラスが生成されます．  
(生成後のTablesクラスも本プロジェクトに既に入っているので，この例では何も起こりません)
```
$ sbt run
```