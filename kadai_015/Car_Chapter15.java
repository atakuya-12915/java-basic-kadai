package kadai_015;

public class Car_Chapter15 {

		// フィールド（内部データ）
			private int gear  = 0;	// ギア
			private int speed = 0;	// 速度
			
		
		// 引数なしコンストラクター
			public Car_Chapter15() {
		}
		// コンストラクタ（初期化処理）
//		public Car_Chapter15 ( int gear, int speed ) {
//			this.gear = gear;
//			this.speed = speed;　
			
//			System.out.println ( "現在のギアは" + this.gear );
//			System.out.println ( "現在の速度は" + this.speed );
//		}

		// メソッド①（ギアを変更して対応する指定した速度で返す）
		public int gearChange ( int afterGear ) {
			this.gear = afterGear;
			// ギアによって速度を変化させる
			switch ( gear ) {
			case 1 : speed = 10;
			break;
			case 2 : speed = 20;
			break;
			case 3 : speed = 30;
			break;
			case 4 : speed = 40;
			break;
			case 5 : speed = 50;
			break;
			default: speed = 10;	// 無効なギアは速度10
			break;
			}
			return speed;
		}
				
		// メソッド②（現在のギアに応じた速度を表示する）
		public void run () {
			System.out.print( "現在のギア：" + gear + "、速度：" + speed );
		}
	}