package realTimeProgrammingProblems;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class LoginSystem_UsernameAndPasswordValidation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		String User ="user1";
		String pass ="12345";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter USername and Password");
		String userName = sc.nextLine();
		String passwor = sc.nextLine(); 
		
		
		if(userName.equalsIgnoreCase(User) && passwor.equals(pass)) 
			System.out.println("Logged in successfully.\nHome page is displayed");
		else
			System.out.println("Password or username entered is wrong. Please retry with valid credentials");
		
		//--------------------------------------------------
		
		

        // Step 2: Load file
        FileInputStream fis = new FileInputStream("config.properties");
     // Step 1: Create object of Properties class
        Properties prop = new Properties();
        prop.load(fis);

        // Step 3: Read values
        String user = prop.getProperty("user");
        String url = prop.getProperty("url");
        String password = prop.getProperty("password");
        String table = prop.getProperty("table");
        String columnOne = prop.getProperty("columnOne");
        String columnTwo = prop.getProperty("columnTwo");


		//------------------------------------------------------------	      
	      try {
	            // Step 1: Create connection
	            Connection con = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to DB");

	            // Step 2: Create statement
	            Statement stmt = con.createStatement();

	            // Step 3: Execute query
	            ResultSet rs = stmt.executeQuery("select * from "+table+";");

	            // Step 4: Process result
	            while (rs.next()) {
	                int id = rs.getInt(columnOne);
	                String name = rs.getString(columnTwo);
	                if(name.equals(userName))
	        			System.out.println("Logged in successfully.\nHome page is displayed");


	                System.out.println(id + " " + name);
	            }

	            // Step 5: Close connection
	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
			
	
	}
	
	

}
