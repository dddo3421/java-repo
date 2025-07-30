package oopClass.sec06;

public class Circle {
	//멤버변수
	int radius;
	
	//멤버 메서드
	public void setCircle(int r) {
		radius = r;
		
	}
	
	public float area() {
		this.setCircle(5);
		return radius * radius * 3.14f; // 연산 결과는 float
	}
}
