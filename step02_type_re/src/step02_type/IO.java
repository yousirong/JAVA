package step02_type;


import java.util.Scanner;

public class IO {

	public static void main(String[] args) {
        int a =1;
        System.out.println(a);
        String b = "123";
        System.out.println(b+a);  //����� �ƴ� �������ٰ� �ٰ� ��.
        
        Scanner sc = new Scanner(System.in);
        //int c =sc.nextInt();  //�Է¹޴� �κ�
        //System.out.println(c);  // ����Ʈ �ϴ� �κ�
        String d = sc.nextLine();
        System.out.println(d);
	}

}
