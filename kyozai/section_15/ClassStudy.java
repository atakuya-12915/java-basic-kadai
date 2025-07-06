package text.section_15;

public class ClassStudy {
	public static void main(String[] args) {
		
		// 商品データを生成
		Product shampoo = new Product( "シャンプー", 800, 10 );
		Product coffee = new Product( "コーヒー", 500, 5 );
		
		// シャンプーを7点注文
		shampoo.takeOrder(7);
		
		// コーヒーを3点注文
		coffee.takeOrder(3);
		
		// シャンプーを5点注文
		shampoo.takeOrder(5);
	}
}
