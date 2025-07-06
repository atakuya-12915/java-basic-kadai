package text.section_14;

public class MethodPlus_1 {
	public static void main(String[] args) {
	
		// 1,000円を送料込みの料金にして表示	
		addPostage(1000);
			
		// 1,200円を送料込みの料金にして表示
		addPostage(1200);
	}

	// 送料を追加した料金を表示するメソッド
	public static void addPostage( final int price ) {
		int total = price + 500; // 価格に送料を加算
		System.out.println("送料込みの料金は" + total + "円");
	}
}

// 引数priceは「final」で書き換えできないようにしている
// 変数addPostageを2回呼び出しているが、引数の値を変更すると、渡したデータに応じて戻り値も変化している
//（1度目は「1000」、2回目は「1200」を渡して、メソッドを呼び出している）
//送料（=postage）も引数にすると、postage1=500,postage2=700のように場合わけが可能