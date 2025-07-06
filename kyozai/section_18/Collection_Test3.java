package text.section_18;

import java.util.HashMap;

public class Collection_Test3 {

	public static void main(String[] args) {

		// HashMapの宣言（ジェネリクス）
		// HashMap<キーの型,値の型> 変数 = new HashMap<キーの型,値の型>();
		HashMap<Integer, String> humanMap = new HashMap<Integer, String>();
		
		// putメソッド（要素を追加）
		humanMap.put(1, "Kato");
		humanMap.put(2, "Tanaka");
		humanMap.put(3, "Yamada");
		
		// removeメソッド（要素を削除）
		humanMap.remove(1);
		
		System.out.println("キーが1の人の値は" + humanMap.get(1));
		System.out.println("キーが2の人の値は" + humanMap.get(2));
		System.out.println("キーが3の人の値は" + humanMap.get(3));
	}
}
