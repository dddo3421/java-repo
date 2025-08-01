package interfacePkg.sec03;

public class SmartRemotControlMain {

	public static void main(String[] args) {
		
		//2개 인터페이스의 기능 구현
		SmartTelevision stv = new SmartTelevision();
		stv.turnOn();
		stv.setVolume(4);
		stv.search("www.naver.com");
		
		//interface 활용
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		Isearchable se = new SmartTelevision();
		se.search("www.daum.net");
		
		
	}

}
