package oopInheritance.sec10;

public class AnimalMain {

	public static void main(String[] args) {
		// 자동타입변환 사용가능 멤버 예외 예제
		Animal ani;
		ani = new Animal(); //자신 타입의 객체 참조
		ani.show(); //자신 클래스 메소드 호출
		ani.sound();
		
		//자동 타입 변환 : subclass가 superclass 타입으로 변환
		ani = new Cat(); //Cat 타입의 객체를 Animal 타입의 변수에 대입하면 타입 불일치가 발생하지만 Animal-Cat으로 상속관계이므로 자동 타입 변환이 발생함
		ani.show(); // 메소드가 subclass인 Cat에서 오버라이딩 되었으므로 cAt의 메소드가 호출됨
		ani.sound();
		
		ani = new Dog();
		ani.show(); //
		ani.sound();

	}

}
