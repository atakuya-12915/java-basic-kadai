package text.section_17;

public class Keisyo_Main2 {

	public static void main(String[] args) {
		
		// Keisyo_Kato2クラスのオブジェクトを作る
		Keisyo_Kato2 kato = new Keisyo_Kato2();
		
		// 年齢を設定する
		kato.age = 35;
		// 体重を設定する
		kato.weight = 70.0;
		// 出力メソッドを実行する
		kato.output( kato.age, kato.weight);
	}

}
