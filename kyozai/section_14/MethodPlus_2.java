package text.section_14;

public class MethodPlus_2 {

	public static void main(String[] args) {
		
		final int postage1 = 500;		//送料1
		final int postage2 = 800;		//送料1
		
		// 1,000円に送料1を加算して表示
        addPostage( 1000, postage1 );

        // 1,000円に送料2を加算して表示
        addPostage( 1000, postage2 );
	}
	
	// 送料を追加した料金を表示するメソッド
	public static void addPostage( final int price, final int postage ) {
		int total = price + postage;		// 価格に送料を加算
		System.out.println("送料込みの料金は" + total + "円");
	}
}

//引数priceは「final」で書き換えできないようにしている
//変数addPostageを2回呼び出しているが、引数の値を変更すると、渡したデータに応じて戻り値も変化している
//（1度目は「1000」、2回目は「1200」を渡して、メソッドを呼び出している）
//送料（=postage）も引数にすると、postage1=500,postage2=800のように場合わけが可能