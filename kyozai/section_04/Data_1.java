package text.section_04;

// 整数型の確認
public class Data_1 {
	public static void main(String[] args) {
	System.out.println(100);
	System.out.println(1);
	System.out.println(-123);
	System.out.println(2147483648L);	
	}
}

	// 整数型の4つのポイント
	// 「値の範囲」と「データ型」
	// データ型	値の範囲	サイズ
		//byte	-128～127	8ビット
		//short	-32,768～32,767	16ビット
		//int	-2,147,483,648～2,147,483,647	32ビット
		//long	-9,223,372,036,854,775,808～9,223,372,036,854,775,807	64ビット
	// ビットは情報の最小単位で、ビットごとに0か1が入ります。byte型なら、ビットが8ケタです。
	// たとえば、「123」を扱うならbyte型でOKですが、「1234」はshort〜long型でなければ扱えません。
