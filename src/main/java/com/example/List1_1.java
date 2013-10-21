package com.example;

public class List1_1 {

	public static void main(String[] args) {
		String s1 = "JavaScript";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "Java";
		
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		
		if(s2.equals(s4)) {
			System.out.println("s2とs4は等しい");
		}
		
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3は大文字，小文字を区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		
		if(s1.isEmpty()) {
			System.out.println("s1は空文字列です");
		}
	}

}
