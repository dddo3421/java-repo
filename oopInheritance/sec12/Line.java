package oopInheritance.sec12;

public class Line extends DrawingObject {

	public Line() {
		penColor = "red"; // DrawingObject의 필드 penColor이므로 바로 접근 가능
	}
	@Override
	public void draw() {
		// 추상 메서드 구현
		System.out.println(penColor+ "색상으로 선 그리기");
		
	}
	
}
