package practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassFour {

	@Test
	public void ClassFourSignUp() {

		System.out.println("ClassFourSignUp");
	}

	@Test(timeOut = 4000)
	public void ClassFourLogin() {

		System.out.println("ClassFourLogin");
	}
	
	@Parameters({"URL","URL2"})
	@Test(dependsOnMethods = {"ClassFourSignUp","ClassFourLogin"})
	public void ClassFourAddUser(String url,String url2) {

		System.out.println("Using this URL"+ url);
		System.out.println("Using this URL"+ url2);
		System.out.println("ClassFourAddUser");
	}
	
	@Test(dependsOnMethods = {"ClassFourAddUser"})
	public void ClassFourLogout() {

		System.out.println("ClassFourLogout");
	}
	
	@Test(enabled = false)
	public void ClassFourEditUser() {

		System.out.println("ClassFourEditUser");
	}

}
