package practise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassTwo {
	
	@Test
	public void Login() {
		
		System.out.println("From Login");
	}
	
	@Test
	public void StudentSignUp() {
		
		System.out.println("From StudentSignUp");
	}
	
	@Test
	public void StudentLogin() {
		
		System.out.println("From StudentLogin");
	}
	
	@Test(groups = "smoke")
	public void StudentLogOut() {
		
		System.out.println("From StudentLogOut");
	}
	
	@AfterMethod
	public void AfterMethod() {
		
		System.out.println("Executing After every Method in this classtwo");
		

	}
	
}
