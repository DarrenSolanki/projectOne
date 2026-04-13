package TestOrg.ProjectOne;

import org.testng.annotations.Test;

public class PatternLogic {
	
	@Test
	public void righTrianglePattern() {
		
		int n=6;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		    System.out.println();

		}
	}
	
	@Test
	public void diamondPattern() {
		
		int n=6;
		
		for (int i = 1; i <= n; i++) {

		    // spaces
		    for (int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }

		    // stars
		    for (int k = 1; k <= (2 * i - 1); k++) {
		        System.out.print("*");
		    }

		    System.out.println();
		}
	}

}
