package text.section_06;

public class TypeConv_2 {
    public static void main(String[] args) {

        // short型の値をbyte型にキャスト(型変換)
        short valShort = 32767;
        byte  valByte  = (byte)valShort; // byte型に収まらず不正値となる
        System.out.println(valByte);

        // double型の値をint型にキャスト
        double valDouble = 123.456;
        int    valInt    = (int)valDouble; // 小数部分はカットされる
        System.out.println(valInt);
    }
}

// キャスト演算子(キャスト＝型変更)で手動で型変換
	// (変換したいデータ型)[型変換したい変数や値]
		// (int)test

// byte型の範囲：-128~127
// short型の範囲：128~32,767
	// 大→小への型変換は、そのもののデータ以外にも周囲にも影響があるため注意！