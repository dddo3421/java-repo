package oopApi.sec02;

import java.io.IOException;

public class KeyBoardToStringEx {

	public static void main(String[] args) throws IOException  {
		// 사용자로부터 키코드 입력받고 문자열로 출력
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes); // IOException 이 throws 처리되어 있음 -> main에서 예외처리를 호출측으로 던짐
		//키보드로부터의 입력은 입력종료기호인 enter까지 전달됨
		// enter는 \r\n 의 두 키 신호가 조합됨 - 아스키 코드로 13 10
		System.out.println(readByteNo + "바이트");
		String str = new String(bytes,0,(readByteNo-2));
		System.out.println(str);

	}

}
