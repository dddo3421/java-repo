package game_project.member;

import java.util.Scanner;

public class Login {  // 로그인 기능 구현

    private Scanner sc = new Scanner(System.in);
    
    public static DTO loginUser = null;

   
    public void login(DAO dao) {
        System.out.println("----- 로그인 -----");

        System.out.print("아이디 입력 : ");
        String inputId = sc.nextLine();

        System.out.print("비밀번호 입력 : ");
        String inputPass = sc.nextLine();

        DTO member = dao.findById(inputId);

        if (member != null && member.getPassword().equals(inputPass)) { // 로그인 성공 확인
            System.out.println("로그인 성공! " + member.getName() + "님 환영합니다.");
            dao.setLoggedInUser(member); // 로그인 성공하면 로그인 상태로 설정
        } else {
            System.out.println("로그인 실패. 아이디 또는 비밀번호가 일치하지 않습니다.");
        }
    }
}
