package step05_practice;
import java.util.Scanner;
public class sequential_search {

	public static void main(String[] args) {
		

			     int s[] = { 8, 30, 1, 9, 40, 11, 60, 19, 3, 17, 27 };
			     int value, index = -1;

			     Scanner scan = new Scanner(System.in);
			     System.out.print("탐색할 값을 입력하시오: ");
			     value = scan.nextInt();

			     for (int i = 0; i < s.length; i++) {
				      if (s[i] == value)
					        index = i;
			     }

			     if (index < s.length && index >= 0)
				       System.out.println("" + value + "값은 " + index + "위치에 있습니다.");
			     else
			    	   System.out.println("" + value + " 값을 찾지 못하였습니다.");  
			     scan.close();
					
				}
			}