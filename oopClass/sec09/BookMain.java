package oopClass.sec09;

public class BookMain {

	public static void main(String[] args) {
		// 객체 인스턴스 생성
		Book bk = new Book("java","홍길동",20000);
		Book bk1 = new Book(); //정해진 값으로 멤버필드에 값을 초기화하는 생성자 명시되어 있음

		
		bk.show();
		bk1.show();
		//bk.book(); 생성자는 객체를 통한 호출불가		
	}

}
