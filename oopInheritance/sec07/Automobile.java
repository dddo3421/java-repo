package oopInheritance.sec07;

public class Automobile extends Car {
	public String autoManual; 
	
	public Automobile (String carNo, String carName, String carMaker, int carYear, String autoManual) {
		super(carNo, carName, carMaker, carYear); 
		this.autoManual = autoManual;
	}
	
	@Override
	public String toString() {
		return super.toString() + "기어변속 : " + autoManual;
	}
	
	
	
		
		
	
	
}
