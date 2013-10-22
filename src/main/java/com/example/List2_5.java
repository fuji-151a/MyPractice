package com.example;

import java.util.HashSet;
import java.util.Set;

public class List2_5 {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		int i = 1;
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		
		for(String s : colors) {
			if (i == colors.size()) {
				System.out.println(s);
			} else {
				System.out.print(s + "→");	// 入れた順番とは異なる順番で出力される
			}
			i++;
		}
	}

}
