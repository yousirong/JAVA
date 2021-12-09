package step05_practice;
class SelectionSort {
	  /** The method for sorting the numbers */
	  void selectionSort(int[] list) {
	    for (int i = 0; i < list.length - 1; i++) {
	      // Find the minimum in the list[i..list.length-1]
	      int currentMin = list[i];
	      int currentMinIndex = i;

	      for (int j = i + 1; j < list.length; j++) {
	        if (currentMin > list[j]) {
	          currentMin = list[j];
	          currentMinIndex = j;
	        }
	      }
	      // Swap list[i] with list[currentMinIndex] if necessary;
	      if (currentMinIndex != i) {
	        list[currentMinIndex] = list[i];
	        list[i] = currentMin;
	      }
	    }
	  }
}

public class selection_sort {
	public static void main(String[] args) {
				int[] list = { 69, 10, 30, 2, 16, 8, 31, 22};
				
				System.out.print("original list : ");
				for(int i=0; i<list.length; i++)
					System.out.print(list[i] + " "); // 배열에 저장된 정수 값을 출력
				
				SelectionSort ss = new SelectionSort();
				ss.selectionSort(list);
				
				System.out.print("\n" + "sorted list : ");
				for(int i=0; i<list.length; i++)
					System.out.print(list[i] + " "); // 배열에 저장된 정수 값을 출력
				
			}
		}
