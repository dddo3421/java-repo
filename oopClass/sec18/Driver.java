package oopClass.sec18;

public class Driver {
	//매개변수로 객체 Vehicle type을 받는 메소드
	//Vehicle : Bus, Taxi에 상속되었고 run 메소드는 재정의 되었음
	public void driver (Vehicle vehicle) {
		vehicle.run();
	}
}
