package oopException.sec04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
		    System.out.print("정수 1 입력 : ");
	        int num1 = sc.nextInt(); 

	        System.out.print("정수 2 입력 : ");
	        int num2 = sc.nextInt(); 
	        
	        System.out.print("나누기 결과 : " + num1 / num2);
	        
		}catch(ArithmeticException e) { 
			System.out.print("0으로 나누는 것은 불가능합니다 "+ e);
		}catch(InputMismatchException e) { 
			System.out.print("정수를 입력해주세요 " + e);
		}catch(Exception e) { 
			System.out.print("오류 처리 " + e);
		}finally{
			sc.close();
		}
		
		
		
	}

}
