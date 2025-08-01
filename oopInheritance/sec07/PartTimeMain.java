package oopInheritance.sec07;

public class PartTimeMain {

	public static void main(String[] args) {
		// PartTime 클래스 사용
		PartTime pt1 = new PartTime("991111-1234567","홍길동",60,15000);
		System.out.println(pt1); // pt1의 toString() 자동호출

		Worker wk = pt1; //subclass 객체 참조를 super class 참조 변수에 대입
		System.out.println(wk);
	}

}
