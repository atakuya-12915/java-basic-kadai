package kadai_018;

// 抽象クラスとする：abstract
abstract public class Kato_Chapter18 {
		
	// フィールドの初期化
	public static String familyName = "加藤";
	public static String givenName = "";
	public static String address = "東京都中野区⚪︎×";
	
	// メソッド①：共通の紹介を出力する	→givenNameのみ変わる
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	// 抽象メソッド①：個別の紹介を出力する	→決まった出力値ではないため、子クラスでオーバーライドする
	abstract public void eachIntroduce();
	
	// メソッド②：紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}

// Kato_Chapter18を抽象クラスとして定義し「個別の自己紹介」を行うeachIntroduceを抽象メソッドにした。
//これをそれぞれのクラスでオーバーライドする。
