package text.section_11;

public class WhileSyntax_4 {
	public static void main(String[] args) {
		
		int dice = 1;	// サイコロの目
		
		// 1が出るまでサイコロを振り続ける（while文）
		while ( dice != 1 ) {	// dice=1でない場合は実行
			// サイコロを振る（1~6の目をランダムで生成）
			dice = (int) (Math.ceil(Math.random() * 6 ) );
			System.out.println("[Wile]サイコロの目は" + dice);		// 初期値がdice=1のため、while文は処理されない
		}
		
		// 1が出るまでサイコロを振り続ける（do-while文）
		do {
			// サイコロを振る（1~6の目をランダムで生成）
			dice = (int) (Math.ceil(Math.random() * 6 ) );
			System.out.println("[do-Wile]サイコロの目は" + dice);		// 初期値が1でも、必ず1回は処理される　→その後、while文スタート
		} while ( dice != 1);

////		
//		int headCount = 0 ; // 表がでた回数
//		int coin = (int) (Math.random() * 2 );
//		
//		while (coin == 1) {	
//			headCount++;
//			
//			// 変数coinを実行して、表裏の値をランダムに取得する（0 or 1）
//			coin = (int) (Math.random() * 2 );				
//		}	
//		
//		System.out.println("表が出た回数は" + headCount);
//			
//			int dice = 0; // サイコロの目(1～6)  
//			int sum = 0; // 出た目の合計
//
//			// 出た目の合計が20に到達するまでサイコロを振り続ける  
//			do {
//			    // サイコロを振る(1～6の目をランダムで生成)
//			    dice = (int)( Math.ceil( Math.random() * 6 ) );
//			    
//			    // 出た目を加算
//			    sum += dice;
//
//			    // 6が出たら終了
//			    if( dice == 6 ) {
//			        break;
//			    }  
//			} while( sum < 20 );
//
//			System.out.println("出た目の合計は" + sum);	
			}
	
}

