package kadai_018;

// Kato_Chapter18クラスの継承 
public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	// メソッド③：名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "花子";
	}
	
	// 抽象メソッド①に処理を実装(オーバーライド)
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
}
//各、子クラスのコンストラクタでgivenNameを設定した。
//抽象メソッドeachIntroduceを各クラスでオーバーライドし、各自のメッセージを追加した。