package step05_array;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayOne {

	public static void main(String[] args) {
		//배열(array)
		// 인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료구조
		
		int scores[];
		String[] names;
		
		//생성 - 공간 만들기
		scores = new int [5];
//배열에대한 레퍼런스 변수, 배열생성 , 타입,	 원소 개수	
		names = new String[5];

		//선언 &공간 만들기
		int scores1[] = new int [5];
		// ** 배열요소개수 = scores1.length;
		String[] names1 = new String[5];
		
		int[] scores2 = new int[] {1,2,3,4,5};
		int[] scores3 = {1,2,3,4,5};
		
	
	    String[] names2 = new String[] {"순이", "민정", "민지"};
	    String[] names3 = {"순이", "민정","민지"};
	    // 배열요소개수 = 배열이름.length;
	    for( int i = 0 ; i <scores1.length ; i++) {
	    	System.out.print(scores[i]+" ");
	    }
	    System.out.println();
	    	for( int i = 0 ; i <scores2.length ; i++) {
		    	System.out.print(scores2[i]+" ");
	    }
	    System.out.println();
	    for( int i = 0 ; i <names2.length; i++) {
	    	System.out.print(names2[i] + " ");
	    }
	    
	    //socore1 에 1,2,3,4,5 대입
	    for(int i =0; i < scores1.length ; i++)
	    {
	    	scores[i] = i+1;
	    }
	    System.out.println();
	    System.out.println("scores1");
	    for(int i =0; i < scores1.length ; i++)
	    {
	    	System.out.print(scores[i]+ " ");
	    }
	    
	    //score1
	    int[] copyArray = new int[scores1.length];
	    
	    for(int i = 0 ; i< scores1.length; i++)
	    {
	    	copyArray[i] = scores1[i];
	    }
	    System.out.println();
	    System.out.println("----------배열의 크기, length 필드----------");
	    int aa[] = { 10 , 20 ,30 ,40, 50};
	    int count, size;
	    
	    count = aa.length;
	    size = count * Integer.BYTES;
	    
	    System.out.printf("배열 aa[]의 요소의 개수는 %d 개 입니다. \n", count);
	    System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트입니다.\n", size);
	    System.out.println();
	    System.out.println("---------배열의 저장된 정수 값 더하기 평균출력--------");
	     
	    int intArray[] = new int[5];
	    int sum = 0 ;
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.print(intArray.length + "개의 정수를 입력하세요>>");
	    	for(int i = 0; i<intArray.length; i++)
	    		intArray[i] = scanner.nextInt();  // 키보드에서 입력받은 정수 저장
	    	for(int i=0; i <intArray.length; i++)
	    		sum +=intArray[i];
	    	
	    	System.out.print("평균은 " + (double)sum/intArray.length);
	    	scanner.close();
	    	
	    	
	    System.out.println();
	    System.out.println("copyArray");
	    for(int i = 0 ; i <scores1.length;i++)
	    {
	    	System.out.print(copyArray[i]+" ");
	    }
	    
	    //System 복사
	    //copyArray1에 scores1 복사
	    int[] copyArray1 = new int[scores1.length];
	    System.arraycopy(scores1, 0, copyArray1, 0, scores1.length);
	    //Arrays 배열 프린트 함수 
	    System.out.println();
	    System.out.println("copyArray1");
	    
	    //배열을 이용하여 스트링 뽑기
	    String copyArray1ToString = Arrays.toString(copyArray1);
	    System.out.println(copyArray1ToString);
	    System.out.println();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
