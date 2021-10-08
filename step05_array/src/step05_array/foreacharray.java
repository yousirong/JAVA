package step05_array;

public class foreacharray {
	enum Week { 월, 화, 수, 목, 금, 토, 일}
	
	public static void main(String[] args) {
		// for-each 문
		// 배열이나 열거(enumeration)의 각 원소를 순차적을 접근하는데 유용
		// 반복 실행 위해 루프 카운터 변수나 증감식 사용X
		
		
		//  1)
		int[] num = {1,2,3,4,5};
		int sum = 0;
		
		for(int k : num)	 	// 반복될 때마다 k는 num[0], num[1], ... , num[4]값으로 설정
			sum+=k;
		System.out.println("합은" + sum);
		
		// 2)
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		for (String s : names)	// 반복 할 때마다 s 는 names[0], names[1], ... , names[5]로 설정
			System.out.print(s + " ");
		System.out.println();
		
		//3)
		for (Week day : Week.values())
			System.out.print(day + "요일 ");
		System.out.println();
	}

}
