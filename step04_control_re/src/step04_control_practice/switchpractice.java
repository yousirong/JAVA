package step04_control_practice;

import java.util.Random;

public class switchpractice {

	public static void main(String[] args) {
		//���� �߻� ���� ��ǻ�Ͱ� �������� �߻������ִ°�.
		
		// Math.random() , Random
		
		// 1~ 10 �� ���� �� �����ϰ� �߻�
		
		Random random1 = new Random();
		
		int random = random1.nextInt(10)+1;
		//random = (int)(Math.random()*10) + 1;  0���� �����ϱ� ������ 0���� 10������ �߻���Ű�� ������� �̹Ƿ� 1�� ������ߵ�.
		System.out.println(random);
		
		
		
		Random random2 = new Random();
		int worldrandom = random2.nextInt(4)+1;
		
		String world;
		switch(worldrandom)
		{
		case 1:
			world = "������";
			break;
		case 2:
			world = "ũ�ξ�Ƽ��";
			break;
		case 3:
			world = "���⿡";
			break;
		default:
		world= "�ױ۷���";
		break;
		}
		System.out.println("������ ������"+worldrandom+"��"+world);
		
		
		Random random3 = new Random();
		
		int month = random3.nextInt(12)+1;
		
		String mone1;
		
		switch(month)
		{
		case 12:
		case 1:
		case 2:
			mone1 ="�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			mone1= "��";
			break;
		case 6:
		case 7:
		case 8:
			mone1= "����";
			break;
		case 9:
		case 10:
		case 11:
			mone1= "����";
			break;
		}
	}
}