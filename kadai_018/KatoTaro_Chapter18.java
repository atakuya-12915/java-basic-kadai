package kadai_018;

//Kato_Chapter18クラスの継承
public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	// メソッド③：名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	// 抽象メソッド①に処理を実装(オーバーライド)
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
// 各、子クラスのコンストラクタでgivenNameを設定した。
// 抽象メソッドeachIntroduceを各クラスでオーバーライドし、各自のメッセージを追加した。