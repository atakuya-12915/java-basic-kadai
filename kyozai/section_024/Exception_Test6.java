package text.section_024;

public class Exception_Test6 {

	public static void main(String[] args) {
		// 体重を表す変数
		double weight = -10.0;
		// 体重がマイナス値の場合に、「意図的に」例外を発生させる
		if (weight < 0) {
			throw new IllegalArgumentException ("体重は入力された" + weight + "のようにマイナスの値になりません");
		}
	}
}
