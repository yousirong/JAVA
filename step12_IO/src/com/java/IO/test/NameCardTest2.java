package com.java.IO.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


import com.java12.io.practice.NameCard;

public class NameCardTest2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String file = "C:\\JAVA10_ljy\\2.data\\step12_IO\\src\\com\\java\\IO\\data\\Namecard.data";
		FileOutputStream fos = null;
		ObjectOutputStream oos=null;
		
		FileInputStream fis = null;
		ObjectInputStream ois=null;
		
		 List<NameCard> namecard = new LinkedList<>();
		 List<NameCard> readnamecard = new ArrayList<>();
		  NameCard namecard1=(new NameCard("회사원1","회사","공무원","010-1111-1111"));
		  NameCard namecard2 =(new NameCard("회사원2", "회사","공무원","010-2222-2222"));
		  namecard.add(namecard1);
		  namecard.add(namecard2);
		  
		  //리스트 객체 자체를 파일에 입출력하고
		  //화면에 출력
		  try {
				fos= new FileOutputStream(file);
				oos = new ObjectOutputStream(fos);

				oos.writeObject(namecard);
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);

				readnamecard=(List<NameCard>)ois.readObject();
				
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
			
			for(NameCard nc : namecard) {
				   System.out.println(nc);
				  }
	}

}
