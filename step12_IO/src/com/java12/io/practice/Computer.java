package com.java12.io.practice;

import java.io.Serializable;
import java.time.LocalDate;

public class Computer implements Serializable{
	String name;
	int i;
	LocalDate now;
	

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public LocalDate getNow() {
		return now;
	}


	public void setNow(LocalDate now) {
		this.now = now;
	}


	public char[] toCSV() {
		
		return null;
	}


	public Computer(String name, int i, LocalDate now) {
		super();
		this.name = name;
		this.i = i;
		this.now = now;
	}


	

}
