package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
	
		// Carインスタンス化
		Car_Chapter15 myCar = new Car_Chapter15 ();

		// ギア3に変更
		int speed = myCar.gearChange(3);
		System.out.println( "速度：" + speed );
		
		// 現在の速度を表示（runメソッドの呼び出し）
		myCar.run();
	}
}
