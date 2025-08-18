package game_project.view;

import java.util.Scanner;

import game_project.controller.MemberController;

public class DeleteMemberView {
    private Scanner sc = new Scanner(System.in);
    private MemberController controller;

    public DeleteMemberView(MemberController controller) {
        this.controller = controller;
    }

    public void delete() {
        System.out.print("탈퇴할 아이디 입력: ");
        String id = sc.next();
        System.out.print("비밀번호 입력: ");
        String pwd = sc.next();

        if(controller.delete(id, pwd)) {
            System.out.println("회원 탈퇴 성공!");
        } else {
            System.out.println("회원 탈퇴 실패! 아이디 또는 비밀번호 확인하세요.");
        }
    }
}
