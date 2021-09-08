package com.java.IO.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.java12.io.practice.Computer;

public class ObjectStreamTest2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//objectInputStream, ObjectOutputStream = 객체를 입출력
		
				String file = "C:\\JAVA10_ljy\\2.data\\step12_IO\\src\\com\\java\\IO\\data\\test3.txt";
				
				FileOutputStream fos = null;
				ObjectOutputStream oos=null;
				
				FileInputStream fis = null;
				ObjectInputStream ois=null;
				
				List<Computer> computers = new ArrayList<>();
				List<Computer> readComputers = new ArrayList<>();
				Computer computer=(new Computer("삼성", 1000000, LocalDate.now()));
				Computer computer1=(new Computer("LG", 2000000, LocalDate.now()));
				  computers.add(computer);
				  computers.add(computer1);
				  
				try {
					fos= new FileOutputStream(file);
					oos = new ObjectOutputStream(fos);
					// 쓰는부분
//					for(Computer tmpComputer : computers) {
//						oos.writeObject(tmpComputer);
//					}
					oos.writeObject(computers);
					fis = new FileInputStream(file);
					ois = new ObjectInputStream(fis);
					//읽어오는 부분
//					for(int i=0; i <computers.size() ; i++) {
//						Computer computer2 =(Computer)ois.readObject();
//						readComputers.add(computer2);
//								
//					}
					readComputers=(List<Computer>)ois.readObject();
					
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
					try {
						ois.close();
					}catch (IOException e) {
						e.printStackTrace();
					}
			}
				
				for(Computer cp : computers) {
					   System.out.println(cp);
					  }
	}

}
