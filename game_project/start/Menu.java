package game_project.start;

import java.util.Scanner;

import game_project.game.GaBaBo;
import game_project.game.Guess;
import game_project.info.AppInfo;
import game_project.member.DAO;
import game_project.member.Login;

public class Menu { //메뉴 실행
	
	   private DAO dao;  // 필드로 선언

	    
	    public Menu(DAO dao) { // 생성자에서 DAO 주입
	        this.dao = dao;
	    }
	
    public void showMenu() { // 메뉴 실행하는 반복 메서드
    	Scanner sc = new Scanner(System.in); 
    	int menuNum = 0 ; //메뉴번호 초기화
        boolean input; // 메뉴번호의 옳바른 입력 확인값

        do {
            
            System.out.println("*********************************");
            System.out.println("               메뉴               ");
            System.out.println("---------------------------------");
            System.out.println("1.애플리케이션 정보");
            System.out.println("2.가위바위보 게임");
            System.out.println("3.숫자 알아맞히기 게임");
            System.out.println("4.회원가입");
            System.out.println("5.회원목록");
            System.out.println("6.로그인");
            System.out.println("7.숫자 알아맞히기 통계 보기");
            System.out.println("8.종료");
            System.out.println("---------------------------------");
            
            do {
                System.out.print("메뉴 번호를 입력 : ");
                if (sc.hasNextInt()) {
                	 menuNum = sc.nextInt();  // 메뉴번호 입력
                	 System.out.println("*********************************");
                    if (menuNum >= 1 && menuNum <= 8) {
                        input = true;  // 올바른 입력
                    } else {
                        System.out.println("잘못된 입력입니다. 1~8 사이 숫자를 입력하세요.");
                        input = false; // 재입력 요구
                    }
                } else {
                    System.out.println("숫자를 입력하세요.");
                    sc.next();  // 잘못된 입력 버리기
                    input = false;
                }
            } while (!input);  // 올바른 입력을 받을 때까지 반복

            switch (menuNum) { // 각 번호를 실행하고 실행이 종료되면 다시 메뉴 실행 
                case 1:
                    new AppInfo().appinfo(); // 앱 정보 출력    
                    break;
                case 2:
                    new GaBaBo().gababo(); // 가위바위보 게임 실행	            
                    break;
                case 3:
                    new Guess().guess(); // 숫자 알아맞히기 게임 실행	       
                    break;
                case 4: // 회원가입 실행
                	dao.registerMember();                   	
                    break;
                case 5: // 모든 회원 출력     
                	dao.showAllMembers();               	                       
                    break;
                case 6: // 로그인 실행        
                	new Login().login(dao);                       
                    break;
                case 7: // 숫자 알아맞추기 통계보기 (로그인 해야 볼 수 있음)     
                	dao.showGuessStats();                       
                    break;
                case 8: // 프로그램 종료
                    System.out.println("종료합니다!");
                    System.out.println("*********************************");                                 
                    break;             
            }
        } while (menuNum != 8); // 8번을 입력받아 종료되지 않으면 메뉴 반복 실행
        
        sc.close();
    }


}
