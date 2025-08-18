package game_project.start;

import game_project.member.DAO;

public class AppStart { // main 클래스, 프로그램 시작점
	
	public static void main(String[] args) {	
		
        // 시작 메시지 출력
        System.out.println("*********************************");
        System.out.println("💜💜 게임에 오신 것을 환영합니다 💜💜");
        
        // DAO 객체 생성 (회원 관련 DB 처리용)
        DAO dao = new DAO();
        
        // Menu 객체 생성, DAO 전달
        Menu menu = new Menu(dao);
        
        // 메뉴 실행
        menu.showMenu();
	}
}
