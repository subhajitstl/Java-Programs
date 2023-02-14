package oops_concepts;

public class Employee {
	String Employee_Name ="";
	int Employee_Id = 0;
	int Employee_Sal =0;
	
	public void displayEmployee() {
		
		System.out.println("Employee with employee ID " +  Employee_Id + " and Name " + Employee_Name + " gets bonus of Rs" +  (Employee_Sal*0.20));
		
	}
	

}
