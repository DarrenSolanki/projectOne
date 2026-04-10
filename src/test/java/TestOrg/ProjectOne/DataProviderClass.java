package TestOrg.ProjectOne;
import org.testng.annotations.*;

public class DataProviderClass {

	@DataProvider
	public Object getData() {
		Object[][] data = new Object[4][2];
		
		data[0][0]="user one";
		data[0][1]="password one";
		
		data[1][0]="user two";
		data[1][1]="password two";
		
		data[2][0]="user three";
		data[2][1]="password three";
		
		data[3][0]="user three";
		data[3][1]="password three";
		
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void printData(String user, String password) {
		System.out.println("User : "+ user);
		System.out.println("Password : "+ password);

	}

}
