package text.section_12;

public class Array_3 {
	public static void main(String[] args) {
	
		int[] scoreArray = { 70, 85, 80, 95, 90 }; // 点数
		
		// 拡張for文（scoreArrayの各要素を順番に表示）
		for (int score : scoreArray ) {
			System.out.println(score);
		}
	}
}

// ①配列scoreArrayの要素を1つ取り出し、ループ用変数scoreに代入
// ②データを代入した変数scoreを用いて、反復処理を行う
// ③1に戻り、次の要素をループ用変数scoreに代入
//Point：無限ループのおそれがない！

