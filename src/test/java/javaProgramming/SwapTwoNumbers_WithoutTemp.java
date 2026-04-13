package javaProgramming;

public class SwapTwoNumbers_WithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =25; int b=120;
		
		a = a+b;
		b = a-b;
		a = a-b;

        System.out.println("a=" + a + ", b=" + b);

	}

}
