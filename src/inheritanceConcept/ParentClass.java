package inheritanceConcept;

import org.testng.annotations.BeforeMethod;

public class ParentClass {
	
	public void dothis()
	{
		System.out.println("DOTHIS from Parent class");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		
		System.out.println("Before Method running from Parent class");
	}
}
