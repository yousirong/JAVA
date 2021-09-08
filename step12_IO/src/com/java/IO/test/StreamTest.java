package com.java.IO.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest {

	public static void main(String[] args) {
		String infile="C:\\JAVA10_ljy\\2.data\\step12_IO\\src\\com\\java\\IO\\data\\hellojava.txt";
		String outfile = "C:\\JAVA10_ljy\\2.data\\step12_IO\\src\\com\\java\\IO\\data\\hellojava.txt";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(infile);
			fos = new FileOutputStream(outfile);
			int readByte = 0;
			while ((readByte = fis.read())!=-1) {
				fos.write(readByte);
			}
			
		}catch (FileNotFoundException e ) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null ) {
				try {
					fis.close();
				}catch ( IOException e) {
					e.printStackTrace();
				}
			}
			if(fos !=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
