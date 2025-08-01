package oopInheritance.sec08;

public final class MyCar {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
		
	public void speedDown() {
		speed -= 1;
	}
	
	public final void stop() { // final 메소드는 sub class에서 재정의 불가능 
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
