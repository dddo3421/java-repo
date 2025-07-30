package oopClass.sec10;

public class Reservation {
	String plane;
	String name;
	String departure;
	String arrival;
	int price;
	String seat;
	
	public Reservation() {
		this("KE1001","홍길동","인천","뉴욕",160000,"A38");
	}
	
	
	public Reservation(String p, String n,String d, String a, int p2, String s) {
		plane = p;
		name = n;
		departure = d;
		arrival = a;
		price = p2;
		seat = s;
	}
	
	
	public void showRsvInfo() {
		System.out.println("**항공권 예약 정보**");
		System.out.println("항공기 : "+ plane);
		System.out.println("예약자 : "+ name);
		System.out.println("출발지 : "+ departure);
		System.out.println("도착지 : "+ arrival);
		System.out.println("금액 : "+ price);
		System.out.println("좌석번호 : "+ seat);
		
	}
	
}
