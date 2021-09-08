package step04_control;
public class OperatorThree {

	public static void main(String[] args) {
		//���׿�����
		//A ? B : C (A�� ���̸� B�ƴϸ� C ����)
		
		//String val1 = 10 > 0 ? "��" : "����" ;
		//System.out.println("10 > 0"+ val1);
		
		int val2 = 128;
		boolean range = val2 >= -128 && val2 <= 127 ? true :false;
		System.out.println(val2 + "�� -128 ~127���� �ΰ� = " + range);
		
		
		int score =80;
		int newScore = score > 50 ? score + 50  : score ;
		System.out.println(score + "�� ���� ��ȯ�� = "+ newScore);
		
		int yolo = 100;
	    boolean newyolo = yolo >50 || yolo <=150 ? true : false;
		System.out.println(yolo + "�� 50���� ũ�� 150���� ������? "+ newyolo);
		
		int score2 = 20;
		char grade = score2 > 90 ? 'A' : score2 > 80 ? 'B' : 'C';
		System.out.println(score2 + "�� ������ "+ grade);
	}

}
