package com.java.IO.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import com.java12.io.practice.Computer;

public class CSVTest {

	public static void main(String[] args) {
		String file = "C:\\JAVA10_ljy\\2.data\\step12_IO\\src\\com\\java\\IO\\data\\Computer.csv";

		  FileReader input = null;
		  FileWriter output = null;
		  BufferedReader bufInput = null;
		  BufferedWriter bufOutput = null;

		  List<Computer> computers = new LinkedList<>();
		  computers.add(new Computer("삼성", 1000000, LocalDate.now()));
		  computers.add(new Computer("LG", 2000000, LocalDate.now()));

		  try {
		   output = new FileWriter(file);
		   bufOutput = new BufferedWriter(output);
		   for (Computer computer : computers) {
		    bufOutput.write(computer.toCSV());
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

		  computers.clear();
		  
		  try {
		   input = new FileReader(file);
		   bufInput = new BufferedReader(input);
		   String inputString;
		   while ((inputString = bufInput.readLine()) != null) {
		    String[] tokens = inputString.replace("\"", "").split(",");
		    computers.add(new Computer(tokens[0], Integer.parseInt(tokens[1]),
		      LocalDate.parse(tokens[2])));
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
		  
		  for(Computer cp : computers) {
		   System.out.println(cp);
		  }
	}

}
