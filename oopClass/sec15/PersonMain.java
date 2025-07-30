package oopClass.sec15;

public class PersonMain {

	public static void main(String[] args) {
		// final 필드 사용
		Person p1 = new Person("1234-5678","계백","abc");
		
		System.out.println(p1.nation); // 읽기전용 필드
		System.out.println(p1.name); // 일반필드
		System.out.println(p1.ssn); // 읽기전용 필드
		
//		p1.nation = "USA"; // final 필드 수정 불가
		p1.name = "을지문덕";
//		p1.ssn = "222222-22222222"; // final필드 대입연산자 사용불가
//		p1.tmp = "tmp";
	}

}
