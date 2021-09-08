package com.java.IO.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import com.java12.io.practice.Computer;
import com.java12.io.practice.NameCard;

public class NameCardTest implements Serializable{

	public static void main(String[] args) {
		String file = "C:\\JAVA10_ljy\\2.data\\step12_IO\\src\\com\\java\\IO\\data\\Namecard.csv";
		
		FileReader input = null;
		  FileWriter output = null;
		  BufferedReader bufInput = null;
		  BufferedWriter bufOutput = null;
		
		  List<NameCard> namecard = new LinkedList<>();
		  namecard.add(new NameCard("회사원1","회사","공무원","010-1111-1111"));
		  namecard.add(new NameCard("회사원2", "회사","공무원","010-2222-2222"));
		  
		  try {
			   output = new FileWriter(file);
			   bufOutput = new BufferedWriter(output);
			   for (NameCard nc : namecard) {
			    bufOutput.write(nc.toCSV());
			    bufOutput.newLine();
			   }

			  } catch (IOException e) {
			   e.printStackTrace();
			  } finally {

			   if (bufOutput != null)
			    try {
			     bufOutput.close();
			    } catch (IOException e) {
			    }
			  }
		
		  namecard.clear();
		  
		  try {
			   input = new FileReader(file);
			   bufInput = new BufferedReader(input);
			   String inputString;
			   while ((inputString = bufInput.readLine()) != null) {
			    String[] tokens = inputString.replace("\"", "").split(",");
			    namecard.add(new NameCard(tokens[0], tokens[1],tokens[2],tokens[3]	));
			    
			   }
			  } catch (IOException e) {
			   e.printStackTrace();
			  } finally {
			   if (bufInput != null)
			    try {
			     bufInput.close();
			    } catch (IOException e) {
			    }
			  }
		  for(NameCard namecard1 : namecard) {
			   System.out.println(namecard1);
			  }
	}

}
