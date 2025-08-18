package game_project.start;

import java.util.Scanner;

import game_project.controller.MemberController;
import game_project.member.DAO;
import game_project.member.DTO;
import game_project.game.GaBaBo;
import game_project.game.Guess;
import game_project.info.AppInfo;
import game_project.view.DeleteMemberView;
import game_project.view.LoginView;
import game_project.view.MemberListView;
import game_project.view.RegisterView;
import game_project.view.UpdateMemberView;

public class Menu {

    private Scanner sc = new Scanner(System.in);          
    private MemberController controller;                  // 회원 관련 컨트롤러
    private DTO loggedInUser = null;                      // 로그인한 사용자 정보

    // 외부에서 DAO를 주입받는 생성자
    public Menu(DAO dao) {
        this.controller = new MemberController(dao);
    }

    // 내부에서 DAO를 생성하는 기본 생성자
    public Menu() {
        DAO dao = new DAO();
        this.controller = new MemberController(dao);
    }

    // 로그인 사용자 설정
    public void setLoggedInUser(DTO user) {
        this.loggedInUser = user;
    }

    // 로그인 사용자 가져오기
    public DTO getLoggedInUser() {
        return loggedInUser;
    }

    // 메뉴 실행
    public void showMenu() {
        int menuNum = 0;
        boolean input;

        do {
            System.out.println("*********************************");
            System.out.println("               메뉴               ");
            System.out.println("---------------------------------");
            System.out.println("1. 애플리케이션 정보");           // 앱 정보
            System.out.println("2. 가위바위보 게임");             // 가위바위보
            System.out.println("3. 숫자 알아맞히기 게임");        // 숫자 맞추기
            System.out.println("4. 회원가입");                     // 신규 회원 등록
            System.out.println("5. 회원목록");                     // 모든 회원 조회
            System.out.println("6. 로그인");                       // 로그인
            System.out.println("7. 회원정보 수정");                 // 비밀번호 수정
            System.out.println("8. 회원 탈퇴");                    // 회원 삭제
            System.out.println("9. 종료");                         // 프로그램 종료
            System.out.println("---------------------------------");

            // 메뉴번호 입력
            do {
                System.out.print("메뉴 번호를 입력 : ");
                if (sc.hasNextInt()) {
                    menuNum = sc.nextInt();
                    System.out.println("*********************************");
                    if (menuNum >= 1 && menuNum <= 9) {
                        input = true;
                    } else {
                        System.out.println("잘못된 입력입니다. 1~9 사이 숫자를 입력하세요.");
                        input = false;
                    }
                } else {
                    System.out.println("숫자를 입력하세요.");
                    sc.next();
                    input = false;
                }
            } while (!input);

            // 메뉴 실행
            switch (menuNum) {
                case 1: // 앱 정보
                    new AppInfo().appinfo();
                    break;
                case 2: // 가위바위보
                    new GaBaBo().gababo();
                    break;
                case 3: // 숫자 맞추기 게임
                    new Guess().guess();
                    break;
                case 4: // 회원가입
                    new RegisterView(controller).register();
                    break;
                case 5: // 회원목록 
                        new MemberListView(controller).showAllMembers();
                
                    break;
                case 6: // 로그인
                    // LoginView에 Menu를 전달하여 로그인 성공 시 loggedInUser 세팅
                    LoginView loginView = new LoginView(controller, this);
                    loginView.login();
                    break;
                case 7: // 회원정보 수정 - 로그인 필요
                	//회원정보 수정에 본인 아이디만 수정하는 작업 필요
                    if (loggedInUser != null) {
                        new UpdateMemberView(controller).update();
                    } else {
                        System.out.println("로그인 후 이용 가능합니다.");
                    }
                    break;
                case 8: // 회원 탈퇴 - 로그인 필요 
                	//회원 탈퇴에 본인 아이디만 수정하는 작업 필요
                    if (loggedInUser != null) {
                        new DeleteMemberView(controller).delete();
                        loggedInUser = null; // 탈퇴 후 로그아웃 처리
                    } else {
                        System.out.println("로그인 후 이용 가능합니다.");
                    }
                    break;
                case 9: // 종료
                    System.out.println("종료합니다!");
                    System.out.println("*********************************");
                    break;
            }

        } while (menuNum != 9);

        sc.close();
    }
}
