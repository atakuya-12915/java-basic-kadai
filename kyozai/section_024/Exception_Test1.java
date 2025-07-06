package text.section_024;

public class Exception_Test1 {

	public static void main(String[] args) {
		
		// 配列の宣言
		int[] number = new int[1];
		
		// try文（例外有無を確認）
		try {
			number[0] = 1;	// ①非例外：非該当 → "処理終了です" と表示（catch文を抜ける）
			number[1] = 2;	// ②例外：該当 → "配列のインデックスが範囲外です" と表示（catch文で処理)
		// catch文（例外クラス 変数名）
		} catch (ArrayIndexOutOfBoundsException e) {	// eは変数, 例外クラスはエラーの内容
			// ②例外時の処理内容（配列のインデックスが範囲外の場合）に行う処理
			System.out.println("配列のインデックスが範囲外です");			
		} finally {
		// ①非例外の場合の処理内容
		System.out.println("処理終了です");
		}
	}
}
