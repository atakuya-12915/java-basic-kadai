package text.section_023;

import java.util.Scanner;

public class Scanner_Test5 {

	public static void main(String[] args) {
		
		System.out.println("入力しましょう");
		
		// Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		
		// 入力した内容（真偽値）を取得する
		boolean input = scanner.nextBoolean(); // 真偽値を取得するメソッド(.nextBoolean)
		
		// 入力した内容を出力する
		System.out.println("入力した真偽値は" + input);
		
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
