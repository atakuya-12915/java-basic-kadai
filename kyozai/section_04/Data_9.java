package text.section_04;

public class Data_9 {

	public static void main(String[] args) {
		 System.out.println("侍テラコヤ" + 123 + 654); // パターン1
		 System.out.println(123 + 654 + "侍テラコヤ"); // パターン2
		 System.out.println("侍テラコヤ" + (123 + 654) ); // (123 + 654)が先に計算される
	}
}
