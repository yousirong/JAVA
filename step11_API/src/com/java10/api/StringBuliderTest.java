package com.java10.api;

public class StringBuliderTest {

	public static void main(String[] args) {
		String str = "abc";
		str+="defg";
		
		StringBuffer buf = new StringBuffer("abc");
		buf.append("defg");
	}

}
