package text.section_027;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExec_Test4 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("ab","ac","bc","cd","de"));
		
		list.stream()	// Streamを生成する
			.filter(param -> param.startsWith("a"))	// 絞り込みの中間処理を行う
			.forEach(System.out::println);	// 結果取得の終端処理を行う
	}

}
