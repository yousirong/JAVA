package step09_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

	public static void main(String[] args) {
		read();
		String fileName = " abcd1.txt";
		try {
			read(fileName);
		}catch (FileNotFoundException e ) {
			System.out.println("FileNotFoundExeption 발생!" + fileName);
			e.printStackTrace();
		}catch ( IOException e ) {
			System.out.println("IOException 발생");
			e.printStackTrace();
		}
		
		int a =3;
		int b = 0 ;
		int c = 0 ;
		try { 
			c= a/b;   //RuntimeException에 해당하므로 try catch문 지워도 실행되지 않음.
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(c);
	}
	public static void read(String fileName) 
				throws IOException, FileNotFoundException	{
		FileReader in = new FileReader(fileName);
		BufferedReader br =new BufferedReader(in);
		System.out.println(br.readLine());
	}

	public static void read() {
		String fileName = "abc1.txt";
		try {
			FileReader in = new FileReader(fileName);
			BufferedReader br = new BufferedReader(in);
			System.out.println(br.readLine());
		}catch (FileNotFoundException fe) {
			System.out.println(fileName + "파일이 존재하지 않습니다.");
		}catch (IOException ioe) {
			System.out.println("예기치 않은 예외입니다.");
		}
	}
}
