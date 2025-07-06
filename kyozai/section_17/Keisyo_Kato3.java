package text.section_17;

public class Keisyo_Kato3 extends Keisyo_Human3 {

	// Keisyo_Kato3メソッドを定義
	Keisyo_Kato3(){
		// super(引数); で [親クラスのコンストラクタ] を呼び出す
		/* Keisyo_Human3(String parameter){		// super("Kato"); で引数＝String "Kato"が渡される
		   System.out.println(parameter);		// parameter = "Kato" が出力されるメソッドになった
			} */
		super("Kato");		// 親クラスのコンストラクタを実行するのと同じメソッド => "Kato" が出力される
		// 親クラスの [weightフィールド] にアクセス
		System.out.println(super.weight);
		/* 	親クラスの double weight = 80.0; にアクセスして 80.0 という値を取り出して出力 */
	}
	
}
