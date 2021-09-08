package com.java10.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

	public static void main(String[] args) {
		//java 8 날짜관련 클래스들
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		
		LocalDate specificDate = LocalDate.of(2020, 12, 31);
		System.out.println("특정 날짜 :  "+ specificDate);
		
		LocalTime cTime = LocalTime.now();
		System.out.println("현재 시간 :  "+cTime);
		
		LocalTime sTime = LocalTime.of(23, 0);
		LocalTime sTime1 = LocalTime.of(23 , 0,59,1);
		System.out.println("특정 시간: "+ sTime1);
		
		LocalDateTime cDT = LocalDateTime.now();
		System.out.println("현재 날짜시간:  "+cDT);
		
		LocalDateTime sDT = LocalDateTime.of(2030,5, 8,13,45);
		System.out.println("특정 날짜 시간:  "+ sDT);
		
		//값 가져오기
		System.out.print(cDT.getYear()+"년");
		System.out.print(cDT.getMonthValue()+"월");
		System.out.print(cDT.getDayOfMonth()+"일");
		System.out.print(cDT.getHour()+"시");
		System.out.print(cDT.getMinute()+"분");
		System.out.print(cDT.getSecond()+"초");
		System.out.println();
		//윤년인지 아닌지	
		if(currentDate.isLeapYear()) {
			System.out.println("윤년입니다.");	
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		
		//시간조작	
		sDT=sDT.plusYears(100).minusDays(3).plusMonths(1);
		System.out.println(sDT);
		
		sDT = sDT.withYear(2020).withMonth(12).withMinute(31);
		System.out.println(sDT);
		
		//날짜들을 비교 - isBefor, equals,isAfter
		if(currentDate.isBefore(specificDate)) {
			System.out.println(currentDate+"가"+ specificDate+"보다 더 이릅니다.");
		}
		//기간 ~~~~~ period
		System.out.println(currentDate+"-"+specificDate);
		Period period = Period.between(currentDate, specificDate);
		System.out.println(period.getYears()+"년"+period.getMonths()+"달"+period.getDays()+"일");
		
		//포맷형식 출력
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy년  MM월 dd일");
		String formatDate = specificDate.format(dateFormat);
		System.out.println(formatDate);
		
		//입력받는 형식
		LocalDate date1 = LocalDate.parse("2019-02-10");
		System.out.println(date1);
		
		//2010/12/31
		DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("yyyy/MM/dd/");
		LocalDate date2 = LocalDate.parse("2010/12/31", dateFormat1);
		System.out.println(date2);
		
		
		
		
		
	}

}
