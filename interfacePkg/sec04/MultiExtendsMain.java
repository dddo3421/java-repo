package interfacePkg.sec04;

public class MultiExtendsMain {

	public static void main(String[] args) {
		// interface 활용
		ImpelementationC c = new ImpelementationC(); //구현클래스 객체 생성
		
		// InterfaceA : c 참조변수는 InterfaceA타입으로 자동형변환
		InterfaceA ia = c;
		ia.methodA();
		
		// InterfaceB : c 참조변수는 InterfaceB타입으로 자동형변환
		InterfaceB ib = c;
		ib.methodB();
		
		//InterfaceC :
		InterfaceC ic = c;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
