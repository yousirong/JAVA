package com.java10.api.practice;

import java.util.HashMap;
import java.util.StringTokenizer;

public class STPractice {

	public static void main(String[] args) {
		String treeString = "은행나무,물푸레나무,느티나무";
		HashMap<String, Tree> treeMap = new HashMap<>();
		
		//StringTokenizer통해서 나눠서 Tree 객체 생성해서 Map에 넣기
		
		//작성
		
		StringTokenizer st = new StringTokenizer(treeString," ,,,");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			Tree tree = new Tree(token);
			treeMap.put (token, tree);
		}
		for(String key : treeMap.keySet()) {
			System.out.println(key + "," + treeMap.get(key));
		}
	}

}
