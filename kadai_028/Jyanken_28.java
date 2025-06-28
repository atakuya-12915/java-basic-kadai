package kadai_028;
import java.util.HashMap;
import java.util.Scanner;
public class Jyanken_28 {

	// 自分のじゃんけんの手を入力する
		public String getMyChoice(Scanner scanner) {

			while (true) {
				System.out.println("自分のじゃんけんの手を入力しましょう");
				System.out.println("グーはrockのrを入力しましょう");
				System.out.println("チョキはscissorsのsを入力しましょう");
				System.out.println("パーはpaperのpを入力しましょう");

				// 入力した内容を取得する
				String choice = scanner.next();

				if (!(choice.equals("r") || choice.equals("s") || choice.equals("p"))) {
					// 正しいじゃんけんの手でない場合
					System.out.println("グーのr、チョキのs、パーのpのどれかを入力してください");
					continue;
				} else {
					
					// 自分のじゃんけんの手を返す
					return choice;
				}
			}
		}
		// 対戦相手のじゃんけんの手が乱数で選ばれる
		public String getRandom() {
			// 配列にじゃんけんの手をセットする
			String[] jyanken = { "r", "s", "p" };
			// 乱数で対戦相手のじゃんけんの手を選ぶ
			String choice = jyanken[(int) Math.floor(Math.random() * 3)];

			// 対戦相手の手を返す
			return choice;
		}
		
		// じゃんけんを行い、勝敗を戻り値とする
		public String playGame(String myChoice, String random) {
			String result = "";

			// じゃんけんの手を保持する
			HashMap<String, String> jyanken = new HashMap<>();
			jyanken.put("r", "グー");
			jyanken.put("s", "チョキ");
			jyanken.put("p", "パー");

			// 自分と対戦相手のじゃんけんの手を出力する
			System.out.println("自分の手は" + jyanken.get(myChoice) + ",対戦相手の手は" + jyanken.get(random));
			
			// 自分と対戦相手のじゃんけんの手の比較
			if (myChoice.equals(random)) {
				System.out.println("あいこです");
			} else if (myChoice.equals("r") && random.equals("s") ||
					myChoice.equals("s") && random.equals("p") ||
					myChoice.equals("p") && random.equals("r")) {
				System.out.println("じぶんの勝ちです");
				result = "勝利";
			} else {
				System.out.println("自分の負けです");
				result = "負け";
			}
			return result;
	}
}
