package step07_static;

public class Count {
		public int a= 0 ;	
		public static int b= 0;
		
		public static int doIt() {
			//return ++a;  //a는 간접 참조 불가능
			return ++b;
			
		}
}
