package game_project.member;

import java.util.Vector;

public interface DAOinterface {

    boolean registerMember(DTO dto) throws Exception;   // 회원가입
    Vector<DTO> getAllMembers() throws Exception;       // 회원 목록 조회
    DTO login(String id, String pwd) throws Exception;  // 로그인
    boolean updateMember(DTO dto) throws Exception;     // 회원 정보 수정
    boolean deleteMember(String id, String pwd) throws Exception; // 회원 탈퇴
}