package super_keyword;

public class B extends A{
	
	int num1=200;
	public void doThis() {
		System.out.println("Called from class B");
	}
	
	public void xyz() {
		System.out.println(super.num1);
		super.doThis();
		System.out.println("XYZ method executed");
	}
}
