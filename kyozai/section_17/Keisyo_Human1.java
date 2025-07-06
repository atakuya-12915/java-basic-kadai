package text.section_17;

public class Keisyo_Human1 {
	// 体重フィールド
	double weight;
	// 身長フィールド
	double height;
	
	 // BMIを計算するメソッド
	double calcBmi ( double weight, double height ) {
		return this.weight / ( this.height * this.height );
	}
}
