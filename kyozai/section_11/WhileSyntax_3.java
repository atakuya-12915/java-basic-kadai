package text.section_11;

public class WhileSyntax_3 {
	public static void main(String[] args) {
		
		int dice = 1;	// サイコロの目
		int sum  = 0;	// 出た目を加算した合計
	
		// 出た目の合計が10以上になるまで繰り返す（sumが10より小さい間=tureは繰り返す）
		while ( sum < 10 ) {

			// サイコロを振る（1～6の目をランダムで生成）
			dice = (int) ( Math.ceil( Math.random() * 6 ) );
			System.out.println("サイコロの目は" + dice);
			
			// 出た目が4のときは加算せずに次のループに進む 
			if (dice == 4) {
				System.out.println("4は加算しません");
				continue;
			}
			
			// 出た目を変数sumに加算
			sum += dice;
			System.out.println(dice + "を加算：現在の合計は" + sum);	// 加算するごとに表示
		}	// while文終了
		
		// 最終合計値を表示
		System.out.println("最終合計値は" + sum);
	}
}