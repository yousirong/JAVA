package step05_practice;

import java.util.Random;

public class week {

	public static void main(String[] args) {
		int num[] = new int [50];
		int cnt[] = new int[9];
		
		Random random = new Random();
		
		
		for(int i =0; i<50; i++) //50번 반복
		{
			num[i] = random.nextInt(9)+1; //index =1 번째 배열에 랜덤값 대입 	
			System.out.print(num[i]);
			cnt[num[i]-1]++;   //카운트 배열 숫자 -1
		}
		
		System.out.println();
		for(int i=0;i<cnt.length; i++)
		{
			System.out.println((i+1)+": "+cnt[i]);
		}
	}

}
