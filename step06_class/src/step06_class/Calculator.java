package step06_class;

public class Calculator {

	
		//멤버 변수
		int x;
		int y;
		int x1;
		int y1;
		int nums;
		//생성자
		public Calculator() {
		
	    }
		public Calculator(int x, int y) {
			this.x =x;
			this.y =y;
		}
		
		//메소드
		int add() {
			int sum = x+y;
			return sum;
			
		}
		
		int add(int x, int y) {
			return x+y;
		}
		
		int sub() {
			int sub1 = x-y;
			return sub1;
			
		}
		
		int mul() {
			int mul1 = x*y;
			return mul1;
		}
		
		int  div() {
			int div1 = x/y;
			return div1;
		}
		
		int min(int x1,int y1)
		{
			if(x1>y1)
			{
				int min1 = y1;
				return min1;
			}
			else
			{
				int min1 = x1;
				return min1;
			}
		}
		
		int max(int x1,int y1)
		{
			if(x1>y1)
			{
				int max1 = x1;
				return max1;
			}
			else
			{
				int max1 = y1;
				return max1;
			}
		}
		int temp;
		int max(int[] nums)
		{
			for(int i=0;i<nums.length;i++)
			{
				for(int j=0;j<nums.length -1;j++)
				if(nums[i]>nums[j])
				{
					temp = nums[i];
					nums[i]=nums[j];
					nums[j] = temp;
					
				}
			}
			return nums[0];
		}
		
		int min(int[] nums)
		{
			for(int i=0;i<nums.length;i++)
			{
				for(int j=0;j<nums.length -1;j++)
				if(nums[i]>nums[j])
				{
					temp = nums[i];
					nums[i]=nums[j];
					nums[j] = temp;
					
				}
			}
			return nums[4];
		}
		
		int pow(int x1,int y1)
		{
			int pow1= 1;
			for(int i=0; i<=y1;i++)
			{
				pow1 = x1*x1;
			}
			return pow1;
		}
		
		int abs(int x, int y)
		{
			
			int abs1 = x*y;
			if(abs1>0)
			{
				return abs1;
			}
			else
			{
				return (-1)*abs1;
			}
		}
		
		
		
		
		
		
}
