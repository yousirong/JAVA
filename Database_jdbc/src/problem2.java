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

public class problem2 {  // problem2Ŭ������ ���� import�� java class���� private���� ��� 
 private static Scanner scn;   
 private static Connection con;
 private static PreparedStatement psmt;
 private static PreparedStatement psmt1;
 private static ResultSet rset;
 private static ResultSet rset1;
 public static void main(String args[]) {
	 scn = new Scanner(System.in); //main �Լ����� problem_2()�Լ� ����
	 problem_2();
	 scn.close(); // �Լ� main���� ���� �� ���� ���θ޸𸮿��� ������ ���� ����
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
				 "	CREATE TEMPORARY TABLE tempssn("    // tempssn temporary table ���� 
				 + " essn char(9)"
						 + " )ENGINE=MEMORY;";
		 psmt = con.prepareStatement(query);
		 int ret = psmt.executeUpdate();
//   System.out.println(ret);   // tempssn �ȿ� ����ִ� Ʃ�� ���� ���
		 String inst="INSERT INTO tempssn values (?)";   // tempssn ����
		 psmt = con.prepareStatement(inst);
		 System.out.print("Enter a ssn: ");   // ó�� �Է� �ޱ�
		 String ssn = scn.next(); // TEST CASE : 888665555 , 453453453 , 999887777, 333445555
		 psmt.setString(1,ssn);
		 ret = psmt.executeUpdate();
//   System.out.println(ret);   // �Է� ������ tempssn update�ǰ� ���� Ʃ�ð��� ���
		 for(int i=1;i<9; i++) {
			 String rst = "SELECT essn FROM tempssn;";
			 psmt = con.prepareStatement(rst);
			 rset = psmt.executeQuery();  //rset���� tempssn�� ����ִ� Ʃ���� ���ϵ�
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
				 while(rset1.next()) {//rset1�� ���� ��� tempssn�� Ʃ���� �������
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