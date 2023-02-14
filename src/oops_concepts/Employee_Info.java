 package oops_concepts;

public class Employee_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		
		emp1.Employee_Name="Subhajit";
		emp1.Employee_Id=001;
		emp1.Employee_Sal=20000;
		
		emp1.displayEmployee();
		
		emp2.Employee_Name="SuBhanshu";
		emp2.Employee_Id=002;
		emp2.Employee_Sal=22000;
		
		emp2.displayEmployee();
	}

}
