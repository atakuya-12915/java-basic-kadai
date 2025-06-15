package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	// searchDictionaryメソッドを定義（引数：key）
	public static void searchDictionary () {
		// 辞書コレクションを定義
		HashMap<String, String> dictionary = new HashMap<String, String>();
		//  英単語と意味を追加
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	
		// 検索対象を配列化
		String words[] = {
				"apple",
				"banana",
				"grape",
				"orange"
		};
		
		// 検索して出力（辞書コレクションの中から、key（調べたい英単語）に対応する意味を探す）
		for ( String key : words ) {
			String result = dictionary.get(key);
			// 辞書に英単語があるか判定
			if ( result != null ) {
				System.out.println(key + "の意味は" + result);
			} else {
				System.out.println(key + "は辞書に存在しません");
			}
		}
	}
}		
	