package text.section_023;

import java.util.Scanner;

public class Scanner_Test2 {

	public static void main(String[] args) {
		
		System.out.println("入力しましょう");
		
		// Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		
		// 入力した内容（改行まで）を取得する
		String input = scanner.nextLine(); // 改行までのデータを取得するメソッド(.nextLine)
		
		// 入力した内容を出力する
		System.out.println(input);
		
		// Scannerクラスのオブジェクトをクローズする
		scanner.close();
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
