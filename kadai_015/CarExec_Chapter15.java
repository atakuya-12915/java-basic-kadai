package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
	
		// Carインスタンス化
		Car_Chapter15 myCar = new Car_Chapter15 ();

		// runメソッドの呼び出し（速度を表示）
		myCar.gearChange(3);	// ギアを「3」に変更
		myCar.run();            // ギア切り替え後の状態を表示
	}
}
