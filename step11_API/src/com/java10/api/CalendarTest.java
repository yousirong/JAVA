package com.java10.api;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.omg.Messaging.SyncScopeHelper;

public class CalendarTest {

	public static void main(String[] args) {
		//Date 클래스	
		Date date = new Date();	 //컴퓨터의 현재 날짜를 객체로
		System.out.println(date);
		
		
		//Calendar : 달력 클래스 . 추상클래스
		//컴퓨터 시간대를 기준으로 객체를 만들어서 반환
		Calendar cal = Calendar.getInstance();
		System.out.println("====우리나라====");
		System.out.print(cal.get(Calendar.YEAR)+"년");
		System.out.print(cal.get(Calendar.MONTH)+1 + "월");
		System.out.print(cal.get(Calendar.DAY_OF_WEEK)+"요일");
		System.out.print(cal.get(Calendar.AM_PM)==0?"오전":"오후");
		System.out.print(cal.get(Calendar.HOUR)+"시");
		System.out.print(cal.get(Calendar.MINUTE)+"분");
		System.out.print(cal.get(Calendar.SECOND)+"초");
		
		
		String[] ids = TimeZone.getAvailableIDs();
		
//         for(String id : ids ) {
//			System.out.println(id);
//		}
		String idJapan = "Japan";
		TimeZone tz = TimeZone.getTimeZone(idJapan);
		cal = Calendar.getInstance(tz);
		
		System.out.println("===일본===");
		System.out.print(cal.get(Calendar.YEAR)+"년");
		System.out.print(cal.get(Calendar.MONTH)+1 + "월");
		System.out.print(cal.get(Calendar.DAY_OF_WEEK)+"요일");
		System.out.print(cal.get(Calendar.AM_PM)==0?"오전":"오후");
		System.out.print(cal.get(Calendar.HOUR)+"시");
		System.out.print(cal.get(Calendar.MINUTE)+"분");
		System.out.print(cal.get(Calendar.SECOND)+"초");
		
		
	}
}
