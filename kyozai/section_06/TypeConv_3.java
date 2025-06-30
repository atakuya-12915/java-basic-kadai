package text.section_06;

public class TypeConv_3 {
	public static void main(String[] args) {

		int distance = 120;	// 距離(m)　※int型(整数)　初期からfloat型で定義していれば下で変換は不要だが
		int time = 25;	// 所要時間(秒)　※int型(整数)　型を自己判断で変えられないケースもあるのでキャメルするのが無難
		
		// 距離と所要時間から速度(m/秒)を計算
		float speed = (float)distance / (float)time;	// distance, time を int型からfloat型に「キャメル」する
		System.out.println("速度" + speed + "m/秒");		// キャメルして計算しないと、int型での計算結果の「4」が「4.0」になるだけ
//															→正しい計算結果が戻ってこない（正当は 4.8）
	}
}
