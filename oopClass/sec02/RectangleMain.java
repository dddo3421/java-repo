package oopClass.sec02;

public class RectangleMain {

	public static void main(String[] args) {
		// 사각형 면적 계산
		Rectangle rec = new Rectangle();
		rec.input(); //사각형 가로길이 세로길이를 입력받아 저장
		rec.area(); // 사각형 면적 출력
		
		Rectangle rec1 = new Rectangle();
		//멤버필드 접근제한자 생략되어 있음 - 동일 패키지 내 클래스 멤버변수일 경우 객체 통해 접근(.)
		rec1.width = 100;
		rec1.height = 200;
		rec1.area();

	}

}
