package game_project.start;

import game_project.member.DAO;

public class AppStart { //main 클래스 
	
	public static void main(String[] args) {	
		
		 System.out.println("*********************************");
         System.out.println("💜💜 게임에 오신 것을 환영합니다 💜💜");
        
         DAO dao = new DAO();
         Menu menu = new Menu(dao);
         menu.showMenu();
        // 메뉴 호출
         
	}
 }
	
