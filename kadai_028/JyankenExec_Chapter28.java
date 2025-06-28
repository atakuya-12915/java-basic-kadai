package kadai_028;
import java.util.Scanner;
public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		
		// インスタンス化
		Jyanken_Chapter28 game = new Jyanken_Chapter28();
		// Scannerクラスから標準入力 / インスタンス生成
		Scanner scanner = new Scanner(System.in);
		
		// メソッドを呼び出し、自分の手をmyChoiceに、相手の手をrandomChoiceに代入する
		String myChoice = game.getMyChoice(scanner);
		String randomChoice = game.getRandom();
			
		// 自分の手と相手の手を表示する
		System.out.println("自分の手：" + myChoice);
		System.out.println("自分の手：" + randomChoice);

		// playGameメソッドを呼び出し、勝敗結果を表示する
		game.playGame(myChoice, randomChoice);

		// scannerのクローズ
		scanner.close();
	}
}
