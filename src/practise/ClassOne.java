package practise;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ClassOne {
	
	@Test(groups = "smoke")
	public void TestCaseFour() {
		
		System.out.println("From TestCaseFour");
	}
	
	@Parameters("URL")
	@Test
	public void TestCaseOne(String url) {
		
		System.out.println("From TestCaseOne");
		System.out.println(url);
	}
	
	@Test
	public void TestCaseTwo() {
		
		System.out.println("From TestCaseTwo");
	}
	
	@Test
	public void TestCaseThree() {
		
		System.out.println("From TestCaseThree");
	}
	
	@BeforeTest
	public void BeforeTest() {
		
		System.out.println("@BeforeTest - Before Test of Class One");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println(" @Before Method-Before executing any Methods in this class one ");

	}
}
