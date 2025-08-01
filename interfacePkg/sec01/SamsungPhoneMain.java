package interfacePkg.sec01;

public class SamsungPhoneMain {

	public static void main(String[] args) {
		// interface 사용
		// 객체 종속되는 인스턴스 아용
		SamsungPhone sp = new SamsungPhone();
		sp.sendCall();
		
		
		// interface 참조변수 사용
		ISmartPhone isp = new SamsungPhone(); //구현 클래스 객체 
		isp.sendCall();
		//isp.name; // interface 필드가 아니므로 사용 불가능
		
		//interface 참조변수를 통해서 IPhone 객체를 사용
		ISmartPhone iip = new IPhone();
		iip.sendCall();
		
	}

}
