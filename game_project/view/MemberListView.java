package game_project.view;

import java.util.Vector;

import game_project.controller.MemberController;
import game_project.member.DTO;

public class MemberListView {
    private MemberController controller;

    public MemberListView(MemberController controller) {
        this.controller = controller;
    }

    public void showAllMembers() {
        Vector<DTO> list = controller.getAllMembers();
        System.out.println("===== 회원 목록 =====");
        for(DTO dto : list) {
        	System.out.println("ID : " + dto.getUserId()); //아이디만 출력
        }
    }
}
