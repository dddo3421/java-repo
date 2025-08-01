package interfacePkg.sec04;

public class ImpelementationC implements InterfaceC {
	//InterfaceC가 상속받은 InterfaceA와 InterfaceB에 대한 메소드까지 전부 구현
	@Override
	public void methodA() {
		System.out.println("CImlCasse methodA()실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("CImlCasse methodB()실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("CImlCasse methodC()실행");
		
	}

}
