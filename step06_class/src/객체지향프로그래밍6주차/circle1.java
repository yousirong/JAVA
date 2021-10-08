package 객체지향프로그래밍6주차;
// 객체 배열 

public class circle1 {
	int radius;
	public circle1(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		circle1 [] c;
		c =new circle1[5];
		
		for(int i = 0; i<c.length; i++) 
			c[i] = new circle1(i);
		
		for(int i = 0; i < c.length; i++) 
			System.out.print((int)(c[i].getArea())+ " ");
		}

}


