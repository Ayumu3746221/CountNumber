# CountNumber

大学の授業で大きな桁数の数値の解析をする必要があったため作成、counterパッケージ内のCntNumberはBigDecimalで定義された数値の各桁0~9の値が何回出現したか調べられます。
ネイピア数eに対応するためにテイラー展開,ルート3などの平方根に対応するためにニュートン法,πに対応するためにマルチの公式を使用してます。

# 前提
使用環境は
・Eclipse
・JDK21(コンパイラ等)
・Cursor/Emacs(テキストエディタ)

# インストール方法

```bash
git clone https://github.com/Ayumu3746221/CountNumber

```

# 使用方法
基本的にCntNumberオブジェクトを生成してコンストラクタ通りにBigDecimal型の値を代入すれば大丈夫です。

```java
CntNumber sample = new CntNumber(name,number);

// nameに√3などの自分がわかるように,numberのところにカウントしたい値

sample.displayInfo(); //各桁0から9の値を表示
```

ネイピア数eとπ,√を扱う際はDriver.javaに関数の下部に記載したクラスを使ってください
