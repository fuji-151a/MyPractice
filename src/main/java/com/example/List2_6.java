package com.example;

import java.util.Set;
import java.util.TreeSet;

public class List2_6 {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		int i = 1;
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		
		for(String s : words) {
			if (i == words.size()) {
				System.out.println(s);		// アルファベット順
			} else {
				System.out.print(s + "→");	// アルファベット順
			}
		}
	}

}
