package step04_control;
public class Switch {

	public static void main(String[] args) {
		//Switch
		
		System.out.println("===Switch===");
		int rank =4;
		switch(rank)
		{
		case 1:
			System.out.println("1�� Ȳ����");
			break;
		case 2:
			System.out.println("2�� �ƽþ� ����");
			break;
		case 3:
			System.out.println("3�� �̰���");
			break;
		default:
			System.out.println("�����ϴ�.");
			break;
		}

		char grade = 'C';
		
		double score;
		
		switch(grade) {
		case 'A':
			score =4.0;
			break;
		case 'B':
			score = 3.0;
			break;
		case 'C':
			score = 2.0;
			break;
		case 'D':
			score = 1.0;
			break;
		default:
				score = 0;
			break;
		}
		
	    System.out.println(grade + "�� ������ "	+score);
	    
	    //String
	    
	    
	    String coffee = "ī���";
	    int price =0;
	    switch(coffee) 
	    {
	    case "�Ƹ޸�ī��":
	    	price = 3000;
	    	break;
	    case "ī���":
	    	price = 5100;
	    	break;
	    case "īǪġ��":
	    	price = 5100;
	    	default:
	    		price= 0;
	    		break;
	    }
	    System.out.println(coffee+"�� ������"+ price);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
