package javaInterface;

public interface Interface1 {
	
	//int a;   NOT ALLOWED, Have to initialize the value
	static final int a=100;
	int b=100;   //all are final cannot be changed in other classes
	
	void doThis();
	
	/*
	 * All method are abstact method inside interface 
	 * except static and default methods
	 */
	
	//Interface can contain staic and default method
	static void xyz() {
		System.out.println("Static xyz from Interface1");
	}
	default void uvw() {
		System.out.println("Default uvw from Interace1");
	}
}
