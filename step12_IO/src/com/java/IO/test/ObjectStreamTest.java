package com.java.IO.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) {
		//objectInputStream, ObjectOutputStream = 객체를 입출력
		
		String file = "C:\\JAVA10_ljy\\2.data\\step12_IO\\src\\com\\java\\IO\\data\\test3.txt";
		
		FileOutputStream fos = null;
		ObjectOutputStream oos=null;
		
		FileInputStream fis = null;
		ObjectInputStream ois=null;
		
		try {
			fos= new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new Integer(100));
			oos.writeObject("hello");
			int[] nums = {1,2,3,4,5};
			oos.writeObject(nums);
			
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			int num1= (int ) ois.readObject();
			String str =(String)ois.readObject();
			int[] nums1 =(int[])ois.readObject();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
			oos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	}

}
