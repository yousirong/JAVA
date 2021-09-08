package com.java.IO.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterReaderTest {

	public static void main(String[] args) {
		//2바이트 단위 문자 입출력에 사용	
		
		FileReader input = null;
		FileWriter output = null;
		BufferedReader bufInput = null;
		BufferedWriter bufOutput = null;
		
		String infile="C:\\JAVA10_ljy\\2.data\\step12_IO\\src\\com\\java\\IO\\data\\hellojava.txt";
		String outfile = "C:\\JAVA10_ljy\\2.data\\step12_IO\\src\\com\\java\\IO\\data\\hellojava.txt";
		
		try {
			input = new FileReader(infile);
			bufInput= new BufferedReader(input);
			
			output = new FileWriter(outfile);
			bufOutput = new BufferedWriter(output);
		
			String line;
			line = bufInput.readLine();
			while(line != null) {
				bufOutput.write(line, 0, line.length());
				bufOutput.newLine();
				line = bufInput.readLine();
			}
		}catch (FileNotFoundException e ) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
		if(bufOutput != null ) {
			try {
				bufOutput.close();
			}catch ( IOException e) {
				e.printStackTrace();
			}
		}
		if(bufOutput !=null) {
			try {
				bufOutput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
	}
