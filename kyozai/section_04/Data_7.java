package text.section_04;

public class Data_7 {
	public static void main(String[] args) {
		System.out.println(45 + 1.8); // 加算
        System.out.println(3 - 1.2);  // 減算
        System.out.println(15 * 0.6); // 乗算
        System.out.println(3 / 0.3);  // 除算
        System.out.println(45 % 0.8); // 剰余演算
	}
}

// Java他、CPは小数点の計算が苦手。
// たとえば99.9という小数は、コンピュータの内部的には99.90000000000000568434…という近似値になっています。
// コンピュータは小数の扱いが苦手なため、誤差が生じるのです。→切り捨てなどの処理が必要！
