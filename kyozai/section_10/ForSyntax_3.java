package text.section_10;

public class ForSyntax_3 {

	public static void main(String[] args) {
		
		// 変数i＝1～10の範囲で繰り返す
        for( int i = 1; i < 11; i++ ) {
            
            // ループカウンタが3の時に繰り返し処理をスキップ
            if (i == 3) {
            	System.out.println("次の繰り返し処理に進みます");
            	continue;	// スキップのコマンド
            }
            System.out.println(i);
        }
	}
}