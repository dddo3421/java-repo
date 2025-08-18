package game_project.view;

import java.util.Scanner;

import game_project.controller.MemberController;
import game_project.member.DTO;

public class UpdateMemberView {
    private Scanner sc = new Scanner(System.in);
    private MemberController controller;

    // Controller를 주입받아 DAO 접근
    public UpdateMemberView(MemberController controller) {
        this.controller = controller;
    }

    public void update() {
        System.out.println("--------- 회원 정보 수정 ---------");
        System.out.print("수정할 아이디 입력: ");
        String id = sc.next();
        System.out.print("새 비밀번호 입력: ");
        String newPwd = sc.next();

        // DTO에 아이디와 새 비밀번호 세팅
        DTO dto = new DTO();
        dto.setUserId(id);
        dto.setUserPwd(newPwd);

        // Controller를 통해 DAO 호출
        if(controller.update(dto)) {
            System.out.println("회원 정보가 성공적으로 수정되었습니다!");
        } else {
            System.out.println("회원 정보 수정 실패! 아이디를 확인하세요.");
        }
    }
}
