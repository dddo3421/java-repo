package game_project.member;

//DAO가 구현해야 할 회원 관련 기능 인터페이스
public interface DAOinterface { 
    void registerMember(); // 회원가입
    DTO findById(String id); // ID로 회원 찾기
    void showAllMembers(); // 모든 회원 출력
    void showGuessStats(); // 로그인한 계정의 숫자 알아맞추기 통계
    
    
}