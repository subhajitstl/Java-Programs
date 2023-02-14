package oops_concepts;

public class Road_Toll_Main {

	public static void main(String[] args) {
		
		Road_Toll r1 = new Road_Toll();
		r1.type="Sedan";
		r1.tyres=4;
		r1.calculate_toll();
		
		Road_Toll r2= new Road_Toll("SUV",4);
		r2.calculate_toll();
		
		Road_Toll r3= new Road_Toll("TRUCK",8);
		r3.calculate_toll();
		

	}

}
