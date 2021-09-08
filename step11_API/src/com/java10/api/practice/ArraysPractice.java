package com.java10.api.practice;

import java.util.ArrayList;

public class ArraysPractice extends Person{

	public ArraysPractice(String name, int number) {
		super(name, number);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Person[] person = new Person[] {
				new Person("김춘자", 74),
				new Person("김말자", 20),
				new Person("김영자",56)
		};
		ArrayList<Person> personList = new ArrayList<>();
		
		personList.add(new Person("김춘자", 74));
		personList.add(new Person("김말자", 20));
		personList.add(new Person("김영자", 56));
		
		PersonComparator cpt = new PersonComparator();
		personList.sort(cpt);
		System.out.println("_________사람 리스트_________");
		for(Person person1 : personList) {
			System.out.println(person1);
		}
		
		
		System.out.println("_________사람 리스트_________");
		String str = "김춘자,74;김말자,92;김영자,56;";
		String[] words= str.split("[;]");
		
		for(String word : words) {
			//word.split(word); ->> ?
			System.out.println(word);
		}
		
	}

}
