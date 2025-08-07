package game_project.game;

import java.util.*;

public class GaBaBo { // 가위바위보 게임

    public void gababo() {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

       

        String[] gbb = {"가위", "바위", "보"}; //가위 바위 보 선택지 배열
        String retry = "y"; //계속 계속할지 묻는 변수 

      
        System.out.println("         가위 바위 보 게임            ");

        do {

            System.out.println("가위 바위 보 게임 : 1.가위, 2.바위, 3.보");
            System.out.println("=================================");
            System.out.print("번호 입력 : ");

            int gbbNum;

            try {			// 숫자 입력 체크
                gbbNum = sc.nextInt();
            } catch (Exception e) {
                System.out.println("숫자만 입력하세요!");
                sc.nextLine();
                continue; // 처음으로 돌아감
            }

            if (gbbNum < 1 || gbbNum > 3) {			// 1~3 입력했는지 체크 
                System.out.println("1~3 중에서 골라주세요.");
                continue;
            }

            int gbbCom = rd.nextInt(3) + 1; // 컴퓨터의 가위바위보 랜덤 결정 

            System.out.println("당신은 " + gbb[gbbNum - 1] + "입니다");
            System.out.println("컴퓨터는 " + gbb[gbbCom - 1] + "입니다");

            int result = gbbNum - gbbCom; // 계산식으로 가위 바위 보의 승패 판단 
            if (result == 0) {
                System.out.println("무승부입니다");
            } else if (result == -1 || result == 2) {
                System.out.println("당신이 졌습니다...");
            } else {
                System.out.println("당신이 이겼습니다!");
            }

            sc.nextLine();

            do {
                System.out.print("계속하시겠습니까? (y/n) : ");
                retry = sc.nextLine();
                if (retry.equals("y") || retry.equals("n")) {
                    break; // y나 n 입력받으면 반복문 빠져나감 
                } else {
                    System.out.println("잘못된 입력입니다. y 또는 n을 입력하세요.");
                }
            } while (true);

        } while (retry.equals("y")); //답이 y면 게임을 재진행 

        System.out.println("게임을 종료하고 메뉴로 돌아갑니다");
        
    }
}
