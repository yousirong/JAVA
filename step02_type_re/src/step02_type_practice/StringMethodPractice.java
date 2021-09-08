package step02_type_practice;


public class StringMethodPractice {

	public static void main(String[] args) {
				String sunshine ="You are my sunshine, my only sunshine\r\n" + 
						"You make me happy when skies are gray\r\n" + 
						"You'll never know dear, how much I love you\r\n" + 
						"Please don't take my sunshine away";
				
				sunshine = sunshine.trim();
				sunshine =sunshine.replace("\r"	,"");
				System.out.println(sunshine);
				
				//1)
				String sub = sunshine.substring(0, 76);
				System.out.println("1. 2�� ���� (indexOf, substring) \n" +sub);
				
				//2)
				int indexOfchar = sunshine.indexOf('k');
				System.out.println("2. ù ��° k�� index :\n "+ indexOfchar);
				
				//3)
				char charAt= sunshine.charAt(9);
				System.out.println("3. 10��° ��ġ�� ����:\n" + charAt);
				
				//4)
				int length = sunshine.length();
				System.out.println("4. ���ڿ��� �� ���̴� :\n"+length);
				
				//5)
				String toUpperCase =sub.toUpperCase();
				System.out.println("5. 2���� ��� �빮�ڷ� ��ȯ\n "+ toUpperCase);
				
				//6)
				String str1 = new String("love");
				String str2 = new String("Love");
				boolean equals = str1.equals(str2);
				System.out.println("6. love�� Love�� ��ġ?\n"+equals);
				
			    //7)
				String[] words = sunshine.split(" ");
				int cntYou =0;
				for(int idx =0;idx < words.length;idx++) {
					if(words[idx].toLowerCase().indexOf("you") > -1) {
						cntYou = cntYou +1;
					}
				}
				
				System.out.println("7. you ���Ե� �ܾ� ����(��ҹ��� ���� x): \n"+ cntYou);
				
	}

}
