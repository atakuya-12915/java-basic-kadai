package text.section_12;

public class Array_1 {
	public static void main(String[] args) {
		
		// new演算子での宣言Ver.（箱数を先に定義）
		String[] nameArray = new String[5];			 // 氏名（new演算子）：String型の箱を[5]個 準備した
		int[] 	scoreArray = { 70,85, 80, 95, 90 };	 // 点数（初期化）　 ：int型で[5つの値]を代入した箱を[5]個 準備した
		
		// 氏名を代入（new演算子の場合は後から代入）
		nameArray[0] = "侍太郎";
        nameArray[1] = "侍一郎";
        nameArray[2] = "侍二郎";
        nameArray[3] = "侍三郎";
        nameArray[4] = "侍四郎";
        
        // 氏名を出力
		System.out.println(nameArray[0]);
		System.out.println(nameArray[1]);
        System.out.println(nameArray[2]);
        System.out.println(nameArray[3]);
        System.out.println(nameArray[4]);
		
		// 点数を出力（初期化した場合はそのままindex指定で出力）
        System.out.println(scoreArray[0]);
        System.out.println(scoreArray[1]);
        System.out.println(scoreArray[2]);
        System.out.println(scoreArray[3]);
        System.out.println(scoreArray[4]);
	}
}

// ここが違う！Javaでの配列宣言の仕方（new演算子＝必要な箱数を「先に」定義）
//	使用例：名前の箱を準備　→　点数を初期化した配列から値を代入
	// データ型[] 配列名 = new データ型[要素数];		⇦行頭を見れば配列と認識しやすい書き方　　※非推奨な書き方：データ型 配列名[];
	// 例：int[] scoreArray = new int[5];

// JavaScript同様に、「初期化」での書き方もOK
	// int scoreArray = { 70,85, 80, 95, 90 };		⇦この記法なら、自動的に要素数と同数の箱が作成され、その箱に値を代入できる

