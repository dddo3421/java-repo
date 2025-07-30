package package2;
import java.util.Scanner;
public class BreakEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 100000;
		int withdrawal;
		
		System.out.println("현재 잔액 : " + balance);
		
		
		while (true) {
            System.out.print("인출액 입력 : ");
            withdrawal = sc.nextInt();

            if (withdrawal > balance) {
                System.out.println("잔액 부족. 현재 잔액 : " + balance);
                System.out.println("프로그램을 종료합니다");
                break;
            }
                

            balance -= withdrawal;
            System.out.println("출금 완료 \n남은 잔액 : " + balance);
            if (balance == 0) {
                System.out.println("잔액이 0원이 되어 프로그램을 종료합니다.");
                break;
            }
        }
		
		sc.close();
	}
	
}
