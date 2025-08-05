package oopApi.sec01;

public class FinalizeEx {

	public static void main(String[] args) throws InterruptedException {
		// System.gc() 활용 클래스의 finalize() 메소드 호출 예제
		Count count = null;
		for(int i=1; i<=50; i++) {
			count = new Count(i); // 생성된 객체가
			count = null; //객체 참조를 잃어버림 -  쓰레기 객체가 됨
			System.gc(); //가비지 콜렉터를 JVM에게 요청 - 메모리가 모자라거나 CPU가 여유가 있으면 gc는 cpu에 의해 자동 호출
		}
		Thread.sleep(10); // 프로그램이 너무 빨리 종료되서 gc가 실행되지 않는 걸 방지하기 위해 여유시간을 줌
		//gc()는 가비지 콜렉터 수행하기 바로 전에 소멸자 호출
	}

}
