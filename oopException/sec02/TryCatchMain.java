package oopException.sec02;

public class TryCatchMain {

	public static void main(String[] args) {
		String data1 = "3";
		String data2 = "a";
		// 라이브러리 클래스 존재 확인시 발생하는 오류
		try {
			Class.forName("java.lang.String2"); //문자열로 전잘된 클래스가 없으면 오류 발생
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
		//오류 발생하더라도 catch에서 정상실행을 진행했기 때문에 try ~ catch블럭 아래 코드는 실행됨
		
		// 문자열 정수로 변환 - 문법적 오류 없음. 단, 문자열에 변환 불가능한 문자가 포함되어 있으면 오류 발생 가능
		try {
		int value1 = Integer.parseInt(data1); // 문자열 정수로 변환
		int value2 = Integer.parseInt(data2); // 문자열 정수로 변환 -> 변환 불가능한 문자로 인한 예외 발생
		}catch(NumberFormatException e){
			System.out.println("숫자로 변환할 수 없습니다");
		}finally {
			System.out.println("다시 실행하세요");
		}
		
		//int result = value1 + value2
		
		
	}
}
