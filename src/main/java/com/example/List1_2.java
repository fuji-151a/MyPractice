package com.example;

public class List1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Java and JavaScript Java";
		
		if(s1.contains("Java")) {
			System.out.println("文字列s1は，Javaを含んでいる");
		}
		
		if(s1.endsWith("Java")) {
			System.out.println("文字列s1は，Javaが末尾にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));		// 0
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));	// 9
	}

}
