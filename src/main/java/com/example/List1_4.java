package com.example;

public class List1_4 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			// バッファにJava\nを追加
			sb.append("Java\n");
		}
		
		// 完成した連結済み文字列を取り出す．
		String s = sb.toString();
		System.out.println(s);
	}

}
