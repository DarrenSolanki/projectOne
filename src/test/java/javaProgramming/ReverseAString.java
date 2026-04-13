package javaProgramming;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		String s = "Dharm";
		System.out.println("Length of string is : "+s.length());
		
		for(int i =s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));

		}
	}

}
