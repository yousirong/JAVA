package step05_practice;
import java.util.Arrays;
public class binary_search {

	public static void main(String[] args) {
		class BinarySearch {
			  /** Use binary search to find the key in the list */
			  int binarySearch(int[] list, int key) {
			    int low = 0;
			    int high = list.length - 1;

			    while (high >= low) {
			      int mid = (low + high) / 2;
			      if (key < list[mid])
			        high = mid - 1;
			      else if (key == list[mid])
			        return mid;
			      else
			        low = mid + 1;
			    }
			    return -low - 1;          // Now high < low
			  }
			}
				 int[] list = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };
				 
				 BinarySearch bs = new BinarySearch();
				 
				 System.out.println(bs.binarySearch(list, 2));
				 System.out.println(bs.binarySearch(list, 11));
				 System.out.println(bs.binarySearch(list, 1));
				 System.out.println(bs.binarySearch(list, 69));
				 System.out.println(bs.binarySearch(list, 63));
				
				 	 	 
				 	 System.out.println("1. Index is " + Arrays.binarySearch(list, 2));
				 	 System.out.println("2. Index is " + Arrays.binarySearch(list, 11));
				 	 System.out.println("3. Index is " + Arrays.binarySearch(list, 1));
				 	 System.out.println("4. Index is " + Arrays.binarySearch(list, 69));
				 	 System.out.println("5. Index is " + Arrays.binarySearch(list, 63));
				   }
			
	}	


	
