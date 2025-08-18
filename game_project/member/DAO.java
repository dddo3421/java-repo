package game_project.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//회원 데이터 저장 조회 관리 
public class DAO implements DAOinterface { 
    private List<DTO> memberList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private DTO loggedInUser = null;
    
    //로그인 성공시 DAO 내부의 loggedInUser 필드에 저장 
    public void setLoggedInUser(DTO user) {
        this.loggedInUser = user;
    }
    
    // 로그인된 사용자의 정보를 반환
    public DTO getLoggedInUser() {
        return loggedInUser;
    }
    
    //로그인되어 있는지 확인
    public boolean isLoggedIn() {
        return loggedInUser != null;
    }
    //로그인된 사용자를 로그아웃 처리
    public void logout() {
        loggedInUser = null;
    }
    
    @Override
    public void registerMember() {
        System.out.print("ID 입력: ");
        String id = sc.nextLine();

        System.out.print("비밀번호 입력: ");
        String password = sc.nextLine();

        System.out.print("이름 입력: ");
        String name = sc.nextLine();

        DTO newMember = new DTO(id, password, name);

        // 동일 회원 검사
        for (DTO member : memberList) {
            if (member.isSameMember(newMember)) {
                System.out.println(" 이미 가입된 회원입니다.");
                return;
            }
        }

        // 회원 목록에 추가
        memberList.add(newMember);
        System.out.println(" 회원가입이 완료되었습니다.");
    }

    @Override
    public void showAllMembers() { // 전체 회원목록 보여줌
        System.out.println(" 등록된 회원 목록:");
        for (DTO member : memberList) {
            System.out.println(member);
        }
    }
    
    @Override
    public DTO findById(String id) { //아이디 찾기
        for (DTO member : memberList) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    @Override // menu의 7번 숫자 맞추기 통계 보여주는 메서드 
    public void showGuessStats() {
        if (loggedInUser != null) {
            System.out.println("현재 로그인된 사용자: " + loggedInUser.getName());
            System.out.println("숫자 맞추기 게임 맞힌 횟수: " + loggedInUser.getGuessGameWinCount());
        } else {
            System.out.println("로그인되어 있지 않습니다. 먼저 로그인 해주세요.");
        }
    }

    
    
    
}
