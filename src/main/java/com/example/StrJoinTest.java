package com.example;

public class StrJoinTest {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = "test\n";
		for(int i = 0; i < 10000; i++) {
			str += "test\n";
		}
		long stop = System.currentTimeMillis();
		System.out.println(stop - start);
	}

}
