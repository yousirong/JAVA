package com.java10.api.practice;

import java.time.LocalDate;
import java.time.Period;

class User {
	private String id;
	private LocalDate anniversary;


	
   public User(String id2, String anniversaryStr) {
		// TODO Auto-generated constructor stub
	   this.id = id;
		this.anniversary =LocalDate.parse(anniversaryStr);
	}


   public	String getRemainString() {
	   LocalDate curDate = LocalDate.now();
	   Period period = Period.between(curDate, anniversary);
	   StringBuilder sb = new StringBuilder();
	   if(curDate.isAfter(anniversary)) {
		   sb.append("기념일이 지났습니다.");
	   }else if(curDate.equals(anniversary)) {
		   sb.append("오늘이 기념일 입니다.");
	   }else	{
		   if(period.getYears() > 0) {
			   sb.append(period.getYears()+"년");
		   }
		   if(period.getDays()>0) {
			   sb.append(period.getDays()+"달");
		   }
		   if(period.getDays()>0) {
			   sb.append(period.getDays()+"일");
		   }
	   }
	   
		return sb.toString();
	}

	
	@Override
public String toString() {
	return "User [id=" + id + ", anniversary=" + anniversary + "]";
}


	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}


	public LocalDate getAnniversary() {
		return anniversary;
	}


	public void setAnniversary(LocalDate anniversary) {
		this.anniversary = anniversary;
		
	}
}
