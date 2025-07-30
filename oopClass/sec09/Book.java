package oopClass.sec09;

public class Book {
	private String title;
	private String author;
	private int price;
	
	//생성자 오버로딩 - 같은 이름의 메서드를 여러개 구현하는 것, 매개변수의 개수, 매개변수의 타입등으로 메서드를 구분해서 호출
	public Book() {
		//this() : 생성자에서 다른 생성자 호출할 수 있는 메서드
		this("자바 스크립트","이몽룡",12000); //매개변수로 생성자를 구분
		
				
	}
	
	public Book(String t,String au,int p) {
		title=t;
		author=au;
		price=p;
	}
	
	public void show() {
		System.out.println("도서명 : "+ title);
		System.out.println("저자명 : "+ author);
		System.out.println("가격 : "+ price);
		
		
	}
	
	
	
	
	
}
