package text.section_12;

public class PrimeNumbers {
	public static void main(String[] args) {
		
		// 1~100 の配列を宣言(index = 数値)
		boolean[] primeNumber = new boolean[101];		// 中身は[true] or [false]

		// 配列の全ての要素を素数として初期化 (素数：1とその数自身の他に約数を持たない自然数）
		for ( int i = 0; i < primeNumber.length; i++ ) {
			// 配列の全ての要素を素数と仮定して「true」で初期化
			primeNumber[i] = true;		// 配列の要素番号iを整数iとするため、i=素数の場合、promeNumber[i]にtrueが格納される
		}
		
		// 素数判定のロジック（ 素数=true / 素数でない=false ）
		// 割る数を変数divideで定義し、2~100まで順にチェックする
		int divide = 2;		
		while ( divide < primeNumber.length ) {
			for ( int i = divide + 1; i < primeNumber.length; i++ ) {		// iは0スタートのため、divide+1から開始
				if ( i % divide == 0 ) {
					primeNumber[i] = false;		// 変数divideで割り切れる（i % divide == 0）場合は「素数ではない」と判定
				}
			}
			divide++;
		}
			
		// 素数の出力
		for ( int i = 2; i < primeNumber.length; i++ ) {
			if ( primeNumber[i] ) {		// primeNumber[i]=trueの場合に、整数i（=素数）を出力
				System.out.println(i);
			}
		}
	}
}


//アルゴリズムの手順
//1から100までの各数が素数かどうかを保持するための配列primeNumberを作成。
	//配列の要素番号をそのまま整数として扱い、配列の要素番号iが実際にチェックしたい整数「i」に対応する。
	//配列の要素番号は常に 0 から始まるため、少なくとも101個の配列が必要。
//For文を使って配列のすべての要素に対してtrueで初期化する。
	//要素番号が素数の場合はtrue、素数でない場合はfalseを配列に格納。
	//つまり、整数「i」が素数である場合、primeNumber[i]に trueが格納される。
//下記手順で素数を判定する
	//while文で、変数divideを割る数として、2から100まで順にチェックしていく。
	//内側のfor文で、チェック対象の整数「i」が変数divideで割り切れるかどうかを順に調べる。
	//変数divideで割り切れる場合、その数を素数でないと判定して次の整数「i」をチェック。
//配列を順に読み込んで素数を出力する。素数と判定した整数は、primeNumber[i]が trueである整数「i」となる。