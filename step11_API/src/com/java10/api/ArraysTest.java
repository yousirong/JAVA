package com.java10.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import javax.rmi.ssl.SslRMIClientSocketFactory;

class PhoneComparator implements Comparator<Phone>{

	@Override
	public int compare(Phone p1, Phone p2) {
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

class Phone implements Comparable<Phone>{
	String name;
	int number;
	public Phone(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return name + ", " + number ;
	}
	//오름차순	
	//자신 < 비교대상 : 음수(-1)
	//자신 ==비교대상 :  0
	//자신 >비교대상 :양수 (+1)
	@Override
	public int compareTo(Phone comPhone) {
		int comNum = comPhone.number;
		if(number < comNum) {
			return -1;
		}else if(number == comNum) {
			return 0;
		} else {
			return 1;
		}
	}
}

public class ArraysTest {

	public static void main(String[] args) {
		//배열 조직 클래스 - 복사  , 정렬, ...,...
		
		//Arrays   -   모든 메소드 static
		
		int[] nums = {1,2,3,4,5};
		
		
		//복사
		int[] numsCopy = Arrays.copyOf(nums, 5);
		
		//프린트 
		System.out.println("numsCopy: "+Arrays.toString(numsCopy));
		
		//비교 : Arrays.equals(배열1, 배열2)
		System.out.println("equals(nums, numsCopy):   "+Arrays.equals(nums, numsCopy));
		
		//값을 채우기 :  Arrays.fill(배열, 값)
		Arrays.fill(numsCopy, 1);
		System.out.println("numsCopy:  "+Arrays.toString(numsCopy));
		
		//검색 : Arrays.binarySearch(배열, 값)
		//nums에서 숫자 3의 위치
		int index = Arrays.binarySearch(nums, 3);
		System.out.println("nums에서 3의 위치:  "+index);
		
		//정렬
		int[] nums2 = {5,4,3,2,1};
		Arrays.sort(nums2);
		System.out.println("nums:  "+ Arrays.toString(nums2));
		
		
		
		Phone[] phones = new Phone[]{
		new Phone("갤럭시",30),
		new Phone("아이폰",20),
		new Phone("LG",25)
		};
		
		Arrays.sort(phones);
		System.out.println("----폰 배열----");
		for(Phone phone : phones) {
			System.out.println(phone);
		}
		
		//ArrayList
		ArrayList<Phone> phoneList =new ArrayList<>();
		//add
		phoneList.add(new Phone("갤럭시",30));
		phoneList.add(new Phone("아이폰",20));
		phoneList.add(new Phone("LG",25));

		PhoneComparator cpt = new PhoneComparator();
		phoneList.sort(cpt);
		System.out.println("-----폰 리스트 ----");
		for(Phone phone : phoneList) {
			System.out.println(phone);
		}
		
	}
}
