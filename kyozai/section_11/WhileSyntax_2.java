package text.section_11;

public class WhileSyntax_2 {
	public static void main(String[] args) {
		
		int dice = 1;	// サイコロの目
		int cnt = 0;	// サイコロを振る回数
		
		// 6が出るまで実行
		while (dice != 6) {
			
			// サイコロを5回振ったら強制終了
			if (cnt >= 5) {
				System.out.println("5回に達したため強制終了します");
				break;
			}
			
			// サイコロを振る（1~6の目をランダムに生成）
			dice = (int) (Math.ceil( Math.random() * 6 ) );
			System.out.println("サイコロの目は" + dice);
			
			// サイコロを1回振るごとにカウント+1
			cnt++;
		}
	}
}

//
// サイコロのロジック
//	①　ダイス🎲の目をint変数「dice」で定義する
//	②　ランダムな整数を生成してint型に変換して、int変数「dice」に代入する　→　dice = (int) (Math.ceil( Math.random() * 6 ) );
//	③　指定した目（例えば6）が出るまで処理を繰り返す　→　while文　while (dice != 6) {・・・}
//	④　強制終了(break)やスキップ(continue)の条件を追加する　→if文　if (cnt >=5) {・・・ break;} // 5回振ったら強制終了