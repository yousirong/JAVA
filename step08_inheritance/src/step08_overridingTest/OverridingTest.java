package step08_overridingTest;

//메소드 재정의 = 오버라이딩

class Parent extends Object{
	int p1;
	private int p2;
	
	public Parent(int p1 , int p2)
	{
		this.p1= p1;
		this.p2 = p2;
	}
	public int getP2() {
		return p2;
	}
	public void setP2(int p2) {
		this.p2 = p2;
	}
	
	void method() {
		System.out.println("부모 메소드");
	}
	
}

class Child extends Parent{
	int p3;
	Child(int p1, int p2 , int p3){
		super( p1, p2);
		this.p3= p3;
	}
	void method() {
		super.method();
		System.out.println("자식 메소드");
	}
	
	
	
}



public class OverridingTest {
	public static void main(String[] args) {
		Parent p = new Parent(1,2);
		p.method();
		Child c = new Child(1,2,3);
		c.method();
		
		
		
		
		
		
		
		
		
		
		
	}

}
