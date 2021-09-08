package com.java10.api.practice;

import java.util.Comparator;



class PersonComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		if(p1.number < p2.number) {
			return-1;	
		}else if(p1.number == p2.number)
		{
			return 0;
		}else {
			return 1;
		}
		
	}
}
public class Person implements Comparable<Person> {
	String name;
	int number;
	public Person(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", number=" + number + "]";
	}
	
	@Override
	public int compareTo(Person comperson) {
		int comNum=comperson.number;
		if(number < comNum) {
			return -1;
		} else if (number==comNum) {
			return 0;
		} else {
			return 1;
		}
		
	}
	
}
