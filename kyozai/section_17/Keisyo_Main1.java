package text.section_17;

public class Keisyo_Main1 {

	public static void main(String[] args) {
		
		// Keisyo_Kato1クラスのオブジェクトを作る
		Keisyo_Kato1 kato = new Keisyo_Kato1();
		
		// 体重を設定する
		kato.weight = 70.0;
		// 身長を設定する(BMIでは160cmの身長は1.6と表します。)
		kato.height = 1.6;
		
		// BMIを計算する(変数bmiに代入)
		double bmi = kato.calcBmi ( kato.weight, kato.height );
		// BMIを出力する
		System.out.println( "BMIは" + bmi );
	}
	
}
