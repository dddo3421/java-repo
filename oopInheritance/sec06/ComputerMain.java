package oopInheritance.sec06;

public class ComputerMain {

	public static void main(String[] args) {
		// 오버라이딩된 메서드 활용
		int r=10;
		
		//super 클래스의 메소드 호출
		Calculator cal = new Calculator();
		System.out.println("원의 넓이 : " + cal.areaCircle(r));
		
		//sub 클래스의 메소드 호출
		Computer com = new Computer();
		System.out.println("원의 넓이 : " + com.areaCircle(r)); //재정의하지 않으면  부모 메소드 호출
															// 재정의했으면 자식 메소드 호출

	}

}
