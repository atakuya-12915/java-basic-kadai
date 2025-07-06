package text.section_17;

// クラスの継承
public class Keisyo_Kato2 extends Keisyo_Human2 {
	//オーバーライド
	public void output ( int katoAge, double katoWeight ) {
		System.out.println( "加藤の年齢は" + katoAge );
		System.out.println( "加藤の体重は" + katoWeight );
	}
}
