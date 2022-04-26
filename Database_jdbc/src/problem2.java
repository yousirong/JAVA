import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.io.*;

public class problem2 {  // problem2클래스에 위에 import한 java class들을 private으로 명명 
 private static Scanner scn;   
 private static Connection con;
 private static PreparedStatement psmt;
 private static PreparedStatement psmt1;
 private static ResultSet rset;
 private static ResultSet rset1;
 public static void main(String args[]) {
	 scn = new Scanner(System.in); //main 함수에서 problem_2()함수 돌림
	 problem_2();
	 scn.close(); // 함수 main에서 실행 후 닫음 메인메모리에서 데이터 누수 방지
	 }

 private static String readEntry(String prompt) {
	 try {
		 StringBuffer buffer = new StringBuffer();
		 System.out.print(prompt);
		 System.out.flush();
		 int c = System.in.read();
		 while (c != '\n' && c != -1) {
			 buffer.append((char)c);
			 c = System.in.read();
			 }
		 return buffer.toString().trim();
		 } catch (IOException e) {
			 return "";
		 }
	 }
 private static String getPassword() {
	 final String password, message = "Enter password";
	 if(System.console() == null) {
		 final JPasswordField pf = new JPasswordField(); 
		 password = JOptionPane.showConfirmDialog(null, pf, message,
				 JOptionPane.OK_CANCEL_OPTION,
				 JOptionPane.QUESTION_MESSAGE ) == JOptionPane.OK_OPTION ? 
						 new String(pf.getPassword()) : "";
		 }
	 else 
		 password = new String(System.console().readPassword("%s> ", message ));
	   return password;
	   }
 private static void problem_2() {
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String host = "dm.hufs.ac.kr:3306/";
		 String db= "s201904458db";
		 String user = "s201904458";
		 String password = "01053847822";//getPassword();  // String password = "01053847822";
		 Connection con = DriverManager.getConnection("jdbc:mysql://" 
		 + host + db + "?useSSL=false&serverTimezone=Asia/Seoul", user, password);
		 String drp = "DROP TEMPORARY TABLE IF EXISTS tempssn;";
		 psmt = con.prepareStatement(drp);
		 psmt.executeUpdate();
		 String query =
				 "	CREATE TEMPORARY TABLE tempssn("    // tempssn temporary table 만들어서 
				 + " essn char(9)"
						 + " )ENGINE=MEMORY;";
		 psmt = con.prepareStatement(query);
		 int ret = psmt.executeUpdate();
//   System.out.println(ret);   // tempssn 안에 들어있는 튜플 개수 출력
		 String inst="INSERT INTO tempssn values (?)";   // tempssn 갱신
		 psmt = con.prepareStatement(inst);
		 System.out.print("Enter a ssn: ");   // 처음 입력 받기
		 String ssn = scn.next(); // TEST CASE : 888665555 , 453453453 , 999887777, 333445555
		 psmt.setString(1,ssn);
		 ret = psmt.executeUpdate();
//   System.out.println(ret);   // 입력 받은후 tempssn update되고 난후 튜플개수 출력
		 for(int i=1;i<9; i++) {
			 String rst = "SELECT essn FROM tempssn;";
			 psmt = con.prepareStatement(rst);
			 rset = psmt.executeQuery();  //rset에는 tempssn에 들어있는 튜플이 리턴됨
			 int cnt =0; 
			 while(rset.next()) {
				 cnt = rset.getInt(1);
//			   System.out.println("cnt   "+cnt);
				 String query1 = "SELECT a.Ssn"
						 + " FROM EMPLOYEE a join tempssn ON a.Superssn=?";
				 psmt1 = con.prepareStatement(query1);
				 psmt1.setString(1,rset.getString(1));
				 rset1 = psmt1.executeQuery();  
				 int num =0;
				 while(rset1.next()) {//rset1이 있을 경우 tempssn에 튜플이 있을경우
					 num = rset1.getInt(1);
//				   System.out.println("num    "+num);
					 if(num>0) {
						 System.out.println(rset1.getString(1) + " at level "+ i);
						 }else {
							 
						 }
					 psmt = con.prepareStatement(drp);
					 psmt.executeUpdate();
					 psmt = con.prepareStatement(query);
					 psmt.executeUpdate();
					 String ins = "INSERT into tempssn values (?)";
					 psmt = con.prepareStatement(ins);
					 psmt.setString(1, rset.getString(1));
					 psmt.executeUpdate();
					 String upd= "UPDATE tempssn SET essn=? WHERE essn=?";
					 psmt = con.prepareStatement(upd);
					 psmt.setString(1,rset1.getString(1));
					 psmt.setString(2, rset.getString(1));
					 psmt.executeUpdate();
					 }
				 }
			 }
		 System.out.println("END OF LIST");
		 con.close();
		 rset.close();
		 } catch (SQLException ex) {
			 System.out.println("SQLException" + ex);
			 } catch (Exception ex) {
				 System.out.println("Exception:" + ex);
				 }
	 }
 }