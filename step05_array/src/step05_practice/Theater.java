package step05_practice;

import java.util.Scanner;

public class Theater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] movieseat = new int[10][10];
		int cnt = 1;
		
		
		for(int i=0; i<10; i++)
		{
		   for(int j=0; j<10; j++)
		   {
			   movieseat[i][j] = cnt++;
		   }
		}
		
		Scanner sc = new Scanner(System.in);
		int user;
		System.out.println("숫자를 적어서 0으로 만드는 프로그램");
		do {
		for(int[] seat : movieseat)
		{
			for(int number : seat) {
		System.out.print(number+"\t");
		}
		System.out.println();
		}
		// 사용자 입력
	    user = sc.nextInt();
	    
	    if(user != 0) {
	    
		int index = user -1;      // -1을 한 이유는 indexing부분에서 그 수와 [][]의 수가 1차이 나기 때문
		movieseat[ index / 10][index %10] =0;  // ->> 완전 중요~!!!!!
	    }
		}while(user !=0);
		sc.close();
	}

}
