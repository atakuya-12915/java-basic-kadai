package text.section_024;

import java.util.Scanner;

public class Exception_Test4 {

	public static void main(String[] args) {
		System.out.println("入力しましょう");
		
		// 初期値(null=未入力の場合を想定)		
		String input = null;
		
		// Scannerクラスのオブジェクトを生成する
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力した内容を取得する
			input = scanner.next();
		};	
		
		// 自動で処理が自動的にクローズ
		
		// 入力した内容を出力する
		System.out.println("入力した内容は" + input);
	}
}
