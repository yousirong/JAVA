package step05_array;

import java.util.Arrays;

public class ArrayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열
		
		int scores[];
		String[] names;
		
		//생성 - 공간 만들기
		scores = new int [5];
		names = new String[5];
		
		//선언 &공간 만들기
		int scores1[] = new int [5];
		String[] names1 = new String[5];
		
		int[] scores2 = new int[] {1,2,3,4,5};
		int[] scores3 = {1,2,3,4,5};
		
	
	    String[] names2 = new String[] {"순이", "민정", "민지"};
	    String[] names3 = {"순이", "민정","민지"};
	    
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
