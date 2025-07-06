package text.section_14;

public class MethodPlus_3 {
	public static void main(String[] args) {
		test(123);        // test(1)を呼び出す
        test(1.23F);      // test(2)を呼び出す
        test(123, 1.23F); // test(3)を呼び出す
        test(1.23F, 123); // test(4)を呼び出す
	}
	
	// test(1)
	public static void test ( int i ) {
		System.out.println("(1)int型：" + i );
	}
	// test(2)
	public static void test ( float f ) {
		System.out.println("(2)float型：" + f );
	}
	// test(3)
	public static void test ( int i, float f ) {
		System.out.println("(3)int型：" + i + "／float型：" + f );
	}
	// test(4)
	public static void test ( float f, int i ) {
		System.out.println("(4)float型：" + i + "／int型：" + i );
	}

}
