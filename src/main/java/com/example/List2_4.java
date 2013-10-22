package com.example;

import java.util.Set;
import java.util.HashSet;

public class List2_4 {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");	// 重複は意味なし
		
		System.out.println("色は" + colors.size() + "種類");
	}

}
