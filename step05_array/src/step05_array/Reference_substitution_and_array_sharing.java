package step05_array;
import java.util.Arrays;
public class Reference_substitution_and_array_sharing {

	public static void main(String[] args) {
		// 레퍼런스 치환과 배열 공유
	
				int[] intArray = {2, 3, 1, 5, 10};      // 배열의 선언과 생성
				int[] myArray = {10, 13, 11, 15, 20};   // 배열의 선언과 생성
				
				System.out.print("0:intArray : ");
				for(int i=0; i<intArray.length; i++)
					System.out.print(intArray[i] + " "); // 배열에 저장된 정수 값을 출력
				
				System.out.print("\n" + "1:myArray : ");
				for(int i=0; i<myArray.length; i++)
					System.out.print(myArray[i] + " "); // 배열에 저장된 정수 값을 출력
				
				myArray = intArray;        // 레퍼런스 치환과 배열 공유
				
				System.out.print("\n" + "2:myArray : ");
				for(int i=0; i<myArray.length; i++)
					System.out.print(myArray[i] + " "); // 배열에 저장된 정수 값을 출력
				
				for (int i = 0; i < intArray.length; i++)     
				     ++intArray[i];
				
				System.out.print("\n" + "3:intArray : ");
				for(int i=0; i<intArray.length; i++)
					System.out.print(intArray[i] + " "); // 배열에 저장된 정수 값을 출력

				System.out.print("\n" + "4:myArray : ");
				for(int i=0; i<myArray.length; i++)
					System.out.print(myArray[i] + " ");  // 배열에 저장된 정수 값을 출력
				
				System.out.println();
				System.out.println("-----------배열의 복사------------");
				int[] intArra = {2, 3, 1, 5, 10};   // 배열의 선언과 생성
						
				System.out.print("intArray : ");
				for(int i=0; i<intArra.length; i++)
					System.out.print(intArra[i] + " "); // 배열에 저장된 정수 값을 출력
						
				int[] myArra = new int[intArra.length];   // 배열의 선언과 생성
						
				for (int i = 0; i < intArra.length; i++)     // 배열의 모든 요소를 복사
					myArra[i] = intArra[i];

				System.out.print("\n" + "myArray : ");
				for(int i=0; i<myArray.length; i++)
					System.out.print(myArray[i] + " "); // 배열에 저장된 정수 값을 출력
				System.out.println();
				System.out.println("-----------배열의 복사 copyOf()메소드 이용------------");

				int[] intArray1 = {2, 3, 1, 5, 10};   // 배열의 선언과 생성
						
				System.out.print("intArray : ");
				for(int i=0; i<intArray1.length; i++)
					System.out.print(intArray1[i] + " "); // 배열에 저장된 정수 값을 출력
						
				int[] myArray1 = new int[intArray1.length];   // 배열의 선언과 생성
						
				for (int i = 0; i < intArray1.length; i++)     // 배열의 모든 요소를 복사
					myArray1[i] = intArray1[i];

				System.out.print("\n" + "myArray : ");
				for(int i=0; i<myArray1.length; i++)
					System.out.print(myArray1[i] + " "); // 배열에 저장된 정수 값을 출력
						
					}
				}
		
