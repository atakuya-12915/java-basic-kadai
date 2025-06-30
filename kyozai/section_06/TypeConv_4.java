package text.section_06;

public class TypeConv_4 {
	public static void main(String[] args) {
		
		int		price = 298;	// 価格(円)
		double	  tax = 0.1;	// 消費税(%)
		
		// 税込価格(円)を計算　→小数点切り捨てたいケース
		int charge = (int) (price + (price * tax) );
		System.out.println("料金：" + charge + "円");
	}
}
