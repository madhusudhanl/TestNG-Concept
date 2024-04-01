package inheritanceConcept;

public class PS2 extends PS3{
	
	int a;
	
	public PS2(int a) { // parameterized constructor
		super(a); // by calling super, the parent class constructor is invoked, so value of a in parent class is also set.
		this.a = a;
	}

	public int increment() {
		a = a+1;
		return a;
	}

}
