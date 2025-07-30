package package2;
import java.util.Scanner;

public class Reap {

	public static void main(String[] args) {
		// for : 반복 횟수를 알고 있을 때 주로 사용
		int sum = 0;
		int i;
		for (i=1; i<=100; i++) {
			System.out.println(i);
			sum += i;
			System.out.println(sum);
		}
		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		for ( i=1; i<=9; i++) {
			System.out.println(dan + " x " + i + " = " + dan * i);
		}
		
		sc.close();
	}

}
