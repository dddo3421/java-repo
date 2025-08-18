package game_project.game;

import java.util.Random;
import java.util.Scanner;

public class Guess { //숫자 알아맞히기 게임

    public void guess() {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        String retry = "y"; // 계속할지 여부
        int rdNum; // 랜덤숫자 
        int Num; // 입력받을 숫자 저장 

        System.out.println("         숫자 알아맞히기 게임          ");

        do {
            rdNum = rd.nextInt(10) + 1; // 1~10 랜덤 숫자
            System.out.println("=================================");
            System.out.println("어떤 숫자일까요? 알아 맞혀보세요~ (1~10)");
            System.out.println("=================================");

            while (true) {
                System.out.print("숫자 입력 : ");       

                try {         // 숫자 입력 체크
                    Num = sc.nextInt();
                    System.out.println("=================================");
                } catch (Exception e) {            
                    System.out.println("\n숫자만 입력하세요!");
                    System.out.println("=================================");
                    sc.nextLine(); 
                    continue;
                }

                if (Num < 1 || Num > 10) {  		//1~10 입력했는지 체크 
                    System.out.println("1~10 중에서 골라주세요.");
                    continue;
                }

                if (rdNum == Num) {		// 입력한 값이 랜덤숫자와 같으면 while 탈출
                    System.out.println("맞혔습니다!");
                    sc.nextLine(); 
                    break; 
                } else {
                    System.out.println("아닙니다. 다시 맞혀보세요~");
                }
            }

            // 계속할지 물어봄
            while (true) {
                System.out.print("계속하시겠습니까? (y/n) : ");
                retry = sc.nextLine();
                if (retry.equals("y") || retry.equals("n")) {
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. y 또는 n을 입력하세요.");
                }
            }

        } while (retry.equals("y")); // y 면 숫자 맞추기 계속

        System.out.println("게임을 종료하고 메뉴로 돌아갑니다.");
    }
}
