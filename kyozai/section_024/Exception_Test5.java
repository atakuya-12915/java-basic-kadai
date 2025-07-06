package text.section_024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_Test5 {

	static void method1() throws FileNotFoundException {
		// Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(new File("method1.txt")); 
		
		// ファイルの読み込みが続く場合、処理を続ける
		while (scanner.hasNext()) {
			// 改行までの入力を受け取る
			String input = scanner.nextLine();
			System.out.println(input);
		}
	}
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (FileNotFoundException e) {
			// ファイルがみつからない場合に行う処理
			System.out.println("ファイルが見つかりません");
		}
	}
}
