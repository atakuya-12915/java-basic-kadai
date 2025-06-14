package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {

		// インスタンス化（各、子クラスのオブジェクトを作る）
		KatoTaro_Chapter18 Taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 Ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18();
		
		// メソッド③：setGivenName(名前をフィールドに追加)の呼び出し
		Taro.setGivenName();	// ←この状態では「エラー」
		Ichiro.setGivenName();	// ←　引数を渡せば出力結果は正しくなる
		Hanako.setGivenName();
		
		// メソッド②：eachIntroduce(個別の紹介)の呼び出し
		Taro.execIntroduce();
		Ichiro.execIntroduce();
		Hanako.execIntroduce();
	}
}
