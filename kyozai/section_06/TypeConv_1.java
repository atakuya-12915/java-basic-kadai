package text.section_06;

public class TypeConv_1 {
	public static void main(String[] args) {
		
		// [範囲の狭いデータ型]→[広範囲なデータ型]の自動型変換
		long  valLong = 123;		// int型の[123]をlong型に代入して型変換実行　→[100億までOKな型に入った]
		float valFloat = 123;		// int型の[123]をfloat型(浮動小数点型)に型変換　→[123.0に変換された]　※若干の誤差あり
		double valDouble = 123.4F;	// float型の[123.4F]をdouble型に型変換　→[123.4000015258789に変換された]　※若干の誤差あり
		
		System.out.println(valLong);
		System.out.println(valFloat);
		System.out.println(valDouble);
	}
}
