package com.java10.api;

import java.util.HashSet;

class Flower {
	String name;
	
	public Flower(String name) {
		super();
		this.name= name;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Flower) {
			Flower compareObj = (Flower)obj;
			if(name.equals(compareObj.name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
public class ObjectTest {

	public static void main(String[] args) {
		//Object
		Object obj1= new Object();
		Object obj2 = new Object();
		
		//equals(Object) : boolean
		boolean result = obj1.equals(obj2);
		boolean result1 = (obj1 == obj2);
		System.out.println(result+ "," + result1);

		Flower f1 =new Flower("튤립");
		Flower f2 = new Flower("튤립");
		
		System.out.println("튤립 == 튤립   "+(f1==f2));   //주소값 비교
		System.out.println("튤립.equals(튤립)   "+f1.equals(f2));   // 값 비교
		
		//hashCode() : 객체를 식별할 수 있는 정수 값
		//메모리 위치를 이용해서 해시코드 만들어서 리턴, 객체마다 각자 다른 값
		System.out.println("===========");
		System.out.println("f1의 toString값:"+f1);
		System.out.println("f1의 hashCode:"+f1.hashCode());
		System.out.println("f1의 hashCode(16진수):" + String.format("%x", f1.hashCode()));

		
		//toString = 클래스@HashCode(16진수)
		System.out.println("===========");
		System.out.println(obj1);
		System.out.println(obj2.toString());
		
		//HashSet<Flower>
		System.out.println("===========");
		HashSet<Flower> fSet = new HashSet<>();
		fSet.add(f1);
		fSet.add(f2);
		for(Flower flower : fSet) {
			System.out.println(flower);
		}
		}

}
