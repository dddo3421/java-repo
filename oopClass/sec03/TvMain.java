package oopClass.sec03;

class Tv{ //class 접근제한 생략 : default(동일 패키지 내에서 접근 가능)
	String color; // 접근제한 생략 : default(동일 패키지 내에서 객체 통한 접근 가능)
	boolean power;
	int channel;
	
	//Tv 기능
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
	
}

public class TvMain {

	public static void main(String[] args) {
		// Tv class 사용
		Tv t; //참조변수만 선언
		t = new Tv(); //인스턴스 생성
		Tv t1 = new Tv();
		
		//멤버변수 접근
		t1.color = "red";
		System.out.println("색상 : " + t1.color);
		
		//멤버 메소드 접근
		System.out.println("전원 : " + t1.power);
		t1.power = true;
		System.out.println("전원 : " + t1.power);
		
		//멤버변수 접근
		t1.channel = 6;
		System.out.println("현재 채널은 " + t1.channel + " 입니다.");
		t1.channelUp();
		System.out.println("현재 채널은 " + t1.channel + " 입니다.");
		
		
		
	}

}
