package game_project.view;

import java.util.Scanner;

import game_project.controller.MemberController;
import game_project.member.DTO;

public class RegisterView {
    private Scanner sc = new Scanner(System.in);
    private MemberController controller;

    public RegisterView(MemberController controller) {
        this.controller = controller;
    }

    public void register() {
        System.out.print("아이디 입력: ");
        String id = sc.next();
        System.out.print("비밀번호 입력: ");
        String pwd = sc.next();

        DTO dto = new DTO(id, pwd);
        if(controller.register(dto)) {
            System.out.println("회원가입 성공!");
        } else {
            System.out.println("회원가입 실패!");
        }
    }
}
