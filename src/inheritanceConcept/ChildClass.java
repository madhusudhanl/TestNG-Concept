package inheritanceConcept;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass {

	@Test
	public void RunTest() {
		
//		ParentClass ps = new ParentClass();
//		ps.dothis(); calling parent class by creating object
		
		dothis(); // calling using Inheritance
		int a = 4;
		PS2 ps2 = new PS2(a); // creating object to class and calling and if your passing any parameter you have to create a 
								//construtor with parament. because when you create any new default constructor will be created with 
								// no parameters.
								
		System.out.println(ps2.increment());
		
		//PS3 ps3 = new PS3(a); this is by creating object of ps3 and calling it by sending parameter.
		//System.out.println(ps3.multipleBy2()); 
		
		System.out.println(ps2.multipleBy2()); // now we can directly call ps2 object, because ps2 class is extending ps3 class.
	}

}
