package step05_practice;

import java.util.Random;



public class arraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		Random random = new Random();
		int randNum = random.nextInt(10) + 1;
		
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = random.nextInt(100) + 1;
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		//1)
		
		System.out.println();
		long sum=0;
		for(int i =0 ; i <arr.length; i++)
		{
			sum+=arr[i];
		}
		System.out.println("총합: "+sum);
		
		long mean=0;
		for(int i=0; i< arr.length; i++)
		{
			mean= sum/arr.length;
		}
		System.out.println("평균:"+mean);
		
		long mul=1;
		for(int i=0; i< arr.length; i++)
		{
			mul *=arr[i];
		}
		System.out.println("곱:"+mul);
		
		
		//2)
		int save =0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; i<arr.length+1; i++)
			{
				if(arr[i]>arr[i+1])
				{
				save= arr[i+1];
				arr[i+1] = arr[i];
				arr[i]= save;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		//3)
		
		
		int a=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==100)
			break;
			else
			{
				System.out.println(false);
			}
			
		}
		System.out.println("100존재 여부"+true);
		
	}
}
