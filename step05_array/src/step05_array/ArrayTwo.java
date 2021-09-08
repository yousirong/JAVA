package step05_array;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class ArrayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 
		//한 사람당 영어, 수학, 국어 점수 
		int[][] scores = new int[2][3];
		int studentList1[][] = {{10,20,30},{40,50,60}};
		int studentList2[][] = new int[][]{{10,20,30},{40,50,60}};
		
		for(int student =0; student <2 ; student++) {
			System.out.print(student + "번째 학생: ");
			for(int score =0; score <3; score++) {
				System.out.print(studentList1[student][score]+" ");
			}
			System.out.println();
		}
		System.out.println("학생의 길이 "+ studentList1.length);   //배열 가로 길이
		System.out.println("학생1의 점수 길이 "+ studentList1[0].length);  // 배열 세로 길이
		
		System.out.println("------------------------------------------------------------------------------");
		
		int[][] studentList3 = new int [2][];
		
		studentList3[0] = new int[] {10,20,30}; // 3개
		studentList3[1] = new int[] {40,50}; //2개
		
		
		for(int student =0; student <2; student ++) {
			System.out.print(student + "번째 학생 : ");
			for(int score=0; score < studentList3[student].length;score++) {
				System.out.print(studentList3[student][score]+ " ");
				
			}
			System.out.println();
		}
		System.out.println("학생1의 점수 길이 "+ studentList3[1].length); 
		System.out.println();
		
		
		//향상된 for문 - for each문
		String[] names = {"서강준","공승연","설현","지창욱"};
		
		for(String name :  names) {    //지금 name 부분에는 어떠한 변수이름을 지정해도 상관없다.
			System.out.print(name + " ");
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		for(int[] scores1   :   studentList3)	{
			for(int score : scores1 ) {
				System.out.print(score+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
