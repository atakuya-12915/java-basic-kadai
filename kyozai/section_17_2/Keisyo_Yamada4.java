package text.section_17_2;

import text.section_17.Keisyo_Human4;

public class Keisyo_Yamada4 extends Keisyo_Human4 {

	// 異なるパッケージだが、継承された子クラスのため、protectedのフィールドにアクセスできている
	public static void main(String[] args) {
		System.out.println(Keisyo_Human4.weight);
	}
}
