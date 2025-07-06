package text.section_18;
import java.util.ArrayList;

public class Collection_Test1 {

	public static void main(String[] args) {
		// ArrayaListの宣言(ジェネリクス)
		// クラス名 <型指定>　変数名 = new ArrayList<型指定>();
		ArrayList<String> humanList = new ArrayList<String>();
		// addメソッド（作成した変数[humanList]に値を追加）
		humanList.add("Kato");
		humanList.add("Tanaka");
		humanList.add("Yamada");
		
		// removeメソッド（変数[humanList]から値を1つ削除）
		humanList.remove(0);	// ()内に削除対象の要素番号を記述

		// [getメソッド] でArrayListから要素を取得
		for ( int i = 0; i < humanList.size(); i++ ) {
			System.out.println(humanList.get(i));
		}
	}
}
