package practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassThree {
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("@BeforeClass -- Class Three");

	}
	@Test
	public void Login() {
		
		System.out.println("From Login");
	}
	
	@Test
	public void StaffSignUp() {
		
		System.out.println("From StaffSignUp");
	}
	
	@Test
	public void StaffLogin() {
		
		System.out.println("From StaffLogin");
	}
	
	@Test(groups = "smoke")
	public void LogOut() {
		
		System.out.println("From LogOut");
	}
	

	@AfterTest
	private void StaffSignout() {
		
		System.out.println("@AfterTest-AfterTestMethod--StaffSignout");
		
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("@BeforeSuite - Executing before any test class");
		
	}
	
	@AfterSuite
	public void Aftersuite() {
		System.out.println("@AfterSuite-Executing after all test class");

	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("@AfterClass -- Class Three");

	}
}
