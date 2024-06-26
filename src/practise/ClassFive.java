package practise;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassFive {

	@Test
	public void ClassFiveSignUp() {

		System.out.println("ClassFiveSignUp");
	}

	@Test
	public void ClassFiveLogin() {

		System.out.println("ClassFiveLogin");
	}

	@Test(dataProvider = "getData")
	public void ClassFiveAddUser(String val,String pass) {

		System.out.println("ClassFiveAddUser");
		System.out.println(val);
		System.out.println(pass);
	}

	@Test
	public void ClassFiveLogout() {

		System.out.println("ClassFiveLogout");
		Assert.assertTrue(false);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		
		data[0][0]="firstVal";
		data[0][1]="firstpass";
		
		data[1][0]="SecondVal";
		data[1][1]="SecondPass";
		
		return data;
	}
}
