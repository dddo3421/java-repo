package arrayType;
import java.util.Scanner;
public class ArrayInputEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = new String[5];
		
		System.out.println("숫자 입력 : ");
		for(int i=0; i<num.length; i++) {
			System.out.printf("num[%d] :", i);
			num[i] = sc.next();
		}
		
		System.out.println("숫자 입력");
		System.out.print( "입력된 값 : ");
		
		for(int i=0; i<num.length; i++) {
			System.out.printf("%s ",  num[i]);
		}
		
		int max = Integer.parseInt(num[0]);

		for (int i = 1; i < num.length; i++) {
		    if (Integer.parseInt(num[i]) > max) {
		        max = Integer.parseInt(num[i]);
		    }
		}
		
		System.out.println( "\n최대값 : " + max);
	}

}
