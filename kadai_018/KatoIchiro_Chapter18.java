package kadai_018;

//Kato_Chapter18クラスの継承
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	// メソッド③：名を表すフィールドの値をセットする(オーバーロード)
	public void setGivenName() {
		this.givenName = "一郎";
	}
	
	// 抽象メソッド①に処理を実装(オーバーライド)
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
//各、子クラスのコンストラクタでgivenNameを設定した。
//抽象メソッドeachIntroduceを各クラスでオーバーライドし、各自のメッセージを追加した。