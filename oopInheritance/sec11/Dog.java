package oopInheritance.sec11;

public class Dog extends Animal{
	@Override
	public void show() {
		System.out.println("강아지입니다.");
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	//Dog 클래스 전용 메서드
	public void dogMethod() {
		System.out.println("dogMethod 입니다");
	}
}

