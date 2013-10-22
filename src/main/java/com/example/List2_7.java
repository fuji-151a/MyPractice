package com.example;

import java.util.HashMap;
import java.util.Map;

public class List2_7 {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府",255);		// Key Value追加
		prefs.put("東京都", 1261);	// Key Value追加
		prefs.put("熊本県", 181);	// Key Value追加
		
		int tokyo = prefs.get("東京都");		// Keyを指定し値を取得
		System.out.println("東京都の人口は" + tokyo);
		
		prefs.remove("京都府");		// 京都府を削除
		prefs.put("熊本県", 182);	// 熊本県のValueを変更
		
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は" + kumamoto);
	}

}
