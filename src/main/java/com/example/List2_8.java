package com.example;

import java.util.HashMap;
import java.util.Map;

public class List2_8 {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府",255);		// Key Value追加
		prefs.put("東京都", 1261);	// Key Value追加
		prefs.put("熊本県", 182);	// Key Value追加
		
		for (String key : prefs.keySet()) {	// 格納されているKeyをkeyという一時変数に代入
			int value = prefs.get(key);
			System.out.println(key + "の人口は" + value);
		}
	}

}
