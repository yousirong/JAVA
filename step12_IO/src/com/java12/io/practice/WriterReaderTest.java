package com.java12.io.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterReaderTest {

	public static void main(String[] args) {
		//2byte 단위 문자 입출력에 사용.
		  
		  String inFile = "C:\\JAVA10_ljy\\2.data\\step12_IO\\src\\com\\java\\IO\\data\\test2.txt";
		  String outFile = "C:\\JAVA10_ljy\\2.data\\step12_IO\\src\\com\\java\\IO\\data\\test3.txt";

		  FileReader input = null;
		  FileWriter output = null;
		  BufferedReader bufInput = null;
		  BufferedWriter bufOutput = null;
		   
		  try {

		   input = new FileReader(inFile);
		   output = new FileWriter(outFile);
		   bufInput = new BufferedReader(input);
		   bufOutput = new BufferedWriter(output);
		   String line;
		   line = bufInput.readLine();
		   while ( line != null ) {
//		    bufOutput.write(line, 0, line.length());
		    bufOutput.write(line);
		    bufOutput.newLine();
		    line = bufInput.readLine();
		   }
		   System.out.println(inFile + " >> " + outFile);
		  } catch (IOException e) {
		   e.printStackTrace();
		  } finally {
		   if(bufInput != null)
		    try {bufInput .close();} catch (IOException e) {}
		   if(bufOutput != null)
		    try {bufOutput.close();} catch (IOException e) {}
		  }
		 }
		}

	


