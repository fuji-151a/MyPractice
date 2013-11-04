package com.example;

public class StrBuildJoinTest {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		StringBuilder strbr = new StringBuilder("test\n");
		for(int i = 0; i < 1000000; i++) {
			strbr.append("test\n");
		}
		long stop = System.currentTimeMillis();
		
		System.out.println(stop - start);
		
	}

}
