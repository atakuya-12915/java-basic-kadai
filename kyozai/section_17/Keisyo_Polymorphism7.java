package text.section_17;

public class Keisyo_Polymorphism7 {

	public static void main(String[] args) {
		
		// [Keisyo_Kato7のインスタンス]を親クラスの[Keisyo_Human7]に代入
		Keisyo_Human7 kato = new Keisyo_Kato7();
		// [Keisyo_Tanaka7のインスタンス]を親クラスの[Keisyo_Human7]に代入
		Keisyo_Human7 tanaka = new Keisyo_Tanaka7();
		
		// Keisyo_Kato7インスタンスのoutputメソッドを実行
		kato.output();
		// Keisyo_Tanaka7インスタンスのoutputメソッドを実行
		tanaka.output();
	}

}
