package text.section_05;

public class Variable_2 {
	public static void main(String[] args) {
		
		// 整数型の変数を宣言
		byte testByte = 1;
		short testShort = 12;
		int testInt = 123;
		long testLong = 1234;
		
		// 浮動小数点型の変数を宣言
		float testFloat = 0.123F;	// 代入する値の末尾には「F」が必要（つけないとdouble扱い＝エラー） →Fをつけた値：リテラル(実際の値)
		double testDouble = 0.123456;
		
		// 論理型の変数を宣言
		boolean testBoolean = true;
		
		
		// 文字列型の変数を宣言
		String testString = "Samurai";
		char testChar = 'S';	// 1文字の場合は、「'(シングルクォーテーション)」で囲む！
		
		// 変数testの値を表示
		System.out.println(testByte);
		System.out.println(testShort);
		System.out.println(testInt);
		System.out.println(testLong);
		System.out.println(testFloat);
		System.out.println(testDouble);
		System.out.println(testBoolean);
		System.out.println(testString);
		System.out.println(testChar);
	}

}
