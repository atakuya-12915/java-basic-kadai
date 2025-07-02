package text.section_11;

public class WhileSyntax {
	public static void main(String[] args) {
		
		int dice = 1;	// サイコロの目

		// 6が出るまでサイコロを振り続ける
		while (dice != 6) {
			// サイコロをふる（1~6の目をランダムで生成
			dice = (int)( Math.ceil( Math.random() * 6) );
			System.out.println("サイコロの目は" + dice);
		}
	}
}
