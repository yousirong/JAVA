package com.java12.io.practice;

public class NameCard {
	String name; 
	String company;
	String job;
	String callnumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getCallnumber() {
		return callnumber;
	}
	public void setCallnumber(String callnumber) {
		this.callnumber = callnumber;
	}
	public NameCard(String name, String company, String job, String callnumber) {
		super();
		this.name = name;
		this.company = company;
		this.job = job;
		this.callnumber = callnumber;
	}
	public NameCard() {
		super();
	}
	@Override
	public String toString() {
		return "NameCard [name=" + name + ", company=" + company + ", job=" + job + ", callnumber=" + callnumber + "]";
	}
	public char[] toCSV() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
