package randomEx;

public class RandomNum1 {

	public static void main(String[] args) {
		// 랜덤숫자 생성 - 1.Math.random() : 0 < 난수 < 1 -> 실수값으로 반환
		// Math 클래스 기본 라이브러리 : import 없이 사용 가능
		for(int i=1;i<=10;i++) {
			
			double num = Math.random() * 10; // 0.xxxxxx ~ 9.99999
			System.out.println(num);
			
			int num1 = (int)(Math.random() * 10); // 0~9
			System.out.println(num1);
			
			int num2 = (int)(Math.random() * 10) + 1; // 1~10
			System.out.println(num2);
			
			
		}
	}

}
