package text.section_023;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_Test7 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(new File("src/text/section_023/faile.txt"));
		
		// ファイルの読み込みが続く場合、処理を続ける
		while(scanner.hasNext()) {
			// 改行までの入力を受け取る
			String input = scanner.nextLine();
			System.out.println(input);
		}
	}
}

// メソッド		用途
//next			区切り文字までの入力を取得する(デフォルトの区切り文字は空白)　テスト Testなら、「テスト」が出力
//nextLine		改行までの入力を取得する
//nextInt		整数の入力を取得する
//nextDouble	小数点を含む数値の入力を取得する
//nextBoolean	真偽値の入力を取得する
//useDelimiter	区切り文字を指定する
//hasNext		入力の読み込みが続くか判定する
