package com.java10.api;

public class ClassTest {

	public static void main(String[] args) {
		//Class
		//클래스이름, 생성자정보, 메소드정보 저장
		// 객체를 만들어야지만 접근이 가능
		
		Flower f1 = new Flower("장미");
		Class fClass = f1.getClass();
		System.out.println("name    "+fClass.getName());
		System.out.println("simpleName=      "+fClass.getSimpleName());
		System.out.println("getPackage.getName     "+fClass.getPackage().getName());
		System.out.println("superClass.getSimpleName=     "+fClass.getSuperclass().getSimpleName());
	}

}
