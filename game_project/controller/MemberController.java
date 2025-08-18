package game_project.controller;

import java.util.Vector;
import game_project.member.DAOinterface;
import game_project.member.DTO;

public class MemberController {

    private DAOinterface dao;

    // 인터페이스 타입으로 주입받음
    public MemberController(DAOinterface dao) {
        this.dao = dao;
    }

    public boolean register(DTO dto) {  // 회원가입
        try {
            return dao.registerMember(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public DTO login(String id, String pwd) {  // 로그인
        try {
            return dao.login(id, pwd);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Vector<DTO> getAllMembers() {  // 회원 목록 조회
        try {
            return dao.getAllMembers();
        } catch (Exception e) {
            e.printStackTrace();
            return new Vector<>();
        }
    }

    public boolean update(DTO dto) {  // 회원 정보 수정
        try {
            return dao.updateMember(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String id, String pwd) {  // 회원 탈퇴
        try {
            return dao.deleteMember(id, pwd);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
