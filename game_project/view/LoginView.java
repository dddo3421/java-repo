package game_project.view;

import java.util.Scanner;
import game_project.controller.MemberController;
import game_project.member.DTO;
import game_project.start.Menu;

public class LoginView {
    private Scanner sc = new Scanner(System.in);
    private MemberController controller;
    private Menu menu;
    
    public LoginView(MemberController controller, Menu menu) {
        this.controller = controller;
        this.menu = menu; // 로그인 상태를 Menu에 저장하기 위해 필요
    }
    
    public void login() {
        System.out.print("아이디 입력: ");
        String id = sc.next();
        System.out.print("비밀번호 입력: ");
        String pwd = sc.next();

        DTO user = controller.login(id, pwd); // DTO 반환
        if(user != null) {
            System.out.println("로그인 성공!");
            menu.setLoggedInUser(user); // Menu에 로그인한 사용자 저장
        } else {
            System.out.println("로그인 실패!");
        }
    }
}
