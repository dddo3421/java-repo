package oopClass.sec14;

public class Singleton {
	//싱글톤 패턴의 클래스 구현
	//하나의 애플리케이션 내에서 객체가 하나만 생성되도록 하는 것
	// 클래스 내부에서 클래스 자신의 객체 한 번 생성하고 필요해지면 생성해놓은 객체 참조를 반환
	//자기자신 클래스 타입으로 static 필드 생성 - Singleton 클래스의 객체 생성
	private static Singleton singleton = new Singleton();
	
	// 생성자를 클래스 외부에서 사용할 수 없도록 private 으로 접근제한
	private Singleton () {};
	
	//static으로 위에서 생성한 객체 참조 변수를 반환하는 메소드를 구현
	static Singleton getInstance() {
		return singleton; // 위에서 생성한 객체의 참조 변수가 반환
	}
	
}
