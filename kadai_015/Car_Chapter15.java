package kadai_015;

public class Car_Chapter15 {

		// フィールド（内部データ）
		private int gear  = 0;	// ギア
		private int speed = 0;	// 速度
			
		// コンストラクタ(初期値の指定)
		public Car_Chapter15() {		// 修正点①：gearとspeedの値を初期化
			gear  = 1;	// 初期ギア
			speed = 10;	// 初期速度
		}
		
		// メソッド①（ギアを変更して速度に反映 (変更後のギア数×10で加速) ）
		public void gearChange ( int afterGear ) {
			this.speed = afterGear * 10;
			System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");	// 修正点②：ギア変更時のメッセージ追記
		}
		
		// メソッド②（切り替え後のギアに応じた速度を表示する）
		public void run ( ) {
			System.out.print(  "速度は時速：" + speed + "kmです。" );		// 修正点③：速度表示のメッセージ追記
		}
	}