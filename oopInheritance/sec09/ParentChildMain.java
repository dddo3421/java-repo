package oopInheritance.sec09;

public class ParentChildMain {

	public static void main(String[] args) {
		Child child = new Child(); //Child 타입 객체
		
		//자동타입변환과 다형성
		//부모 클래스 타입의 참조변수 선언
		Parent parent ;
		//Parent 타입 객체 인스턴스 참조를 child 타입 인스턴스로 연결
		parent = child; //자동타입변환 -> subclass의 객체가 superclass의 객체로 자동타입변환
		//parent 변수는 child 객체 참조하지만
		//사용가능한 멤버는 Parent것만 사용 가능
		parent.method1(); // Parent 클래스의 method 사용 가능
		
		//parent.method3(); // Child 클래스의 method 사용 불가능
		
		//예외적으로 subclass가 superclass의 메소드 재정의했으면 subclass의 메소드가 호출이 되게 됨
		
		parent.method2(); //subclass의 메소드가 호출되게 됨

	}

}
