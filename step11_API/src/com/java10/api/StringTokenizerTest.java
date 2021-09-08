package com.java10.api;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	

	public static void main(String[] args) {
		//문자열 구분
		//split
		System.out.println("-------split-------");
		String sample = "동해물과 백두산이 마르고&닳도록$하느님이%";
		String[] words = sample.split("[ &$%]");
		for(String word : words) {
			System.out.println(word);
		}
		//StringTokenizer  -- 문자열
		System.out.println("------ST------");
		StringTokenizer st= new StringTokenizer(sample," $&%");
		System.out.println("총 토근의 개수:" +st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
