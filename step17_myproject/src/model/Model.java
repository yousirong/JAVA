package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import domain.NameCard;

public class Model {
	private static String file = "namecard.csv";
	private static ArrayList<NameCard> namecardList = new ArrayList<>();

	static {
		loadFile();
	}
	
	public static ArrayList<NameCard> getNamecardList() {
		return namecardList;
	}

	public static void setNamecardList(ArrayList<NameCard> namecardList) {
		Model.namecardList = namecardList;
	}

	public static NameCard getNameCard(String name) {
		for(NameCard namecard : namecardList) {
			if(namecard.getName().equals(name)) {
				return namecard;
			}
		}
		return null;
	}

	public static boolean deleteNameCard(String name) {
		for(NameCard namecard : namecardList) {
			if(namecard.getName().equals(name)) {
				namecardList.remove(namecard);
				return true;
			}
		}
		return false;
	}

	public static void saveFile() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw  = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			for(NameCard namecard : namecardList) {
				bw.write(namecard.toCSV());
				bw.newLine();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw != null)
					bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void loadFile() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr  = new FileReader(file);
			br = new BufferedReader(fr);
			String bufLine = "";
			while((bufLine = br.readLine()) != null) {
				String[] words = bufLine.replace("\"", "").split(",");
				namecardList.add(new NameCard(words[0], words[1], words[2], words[3]));
			}
			
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
