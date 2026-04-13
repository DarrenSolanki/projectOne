package javaProgramming;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "rar";
		String rev = "";
		
		for(int i =s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("It's a palindrome");
		}else {
			System.out.println("It's not a palindrome");
		}

	}

}
