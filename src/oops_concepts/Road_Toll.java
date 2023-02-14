package oops_concepts;

public class Road_Toll {
	String type;
	int tyres;
	
	public void calculate_toll() {
		if(tyres==2) {
			System.out.println("Your toll amount is Rs 0");
		}
		else if(tyres==4) {
			System.out.println("Your toll amount is Rs 10");
		}
		else if(tyres>4) {
			System.out.println("Your toll amount is Rs 40");
		}
		else {
			System.out.println("INCORRECT VEHICLE");
		}
	}
	
	//DEFAULT CONSTRUCTOR
	public Road_Toll() {
		System.out.println("Constructor is executed");
	}
	
	public Road_Toll(String type, int tyres) {
		this.type=type;
		this.tyres=tyres;
	}
}
