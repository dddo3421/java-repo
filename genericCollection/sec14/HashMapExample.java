package genericCollection.sec14;

import java.util.*;


public class HashMapExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//1. 사용자로부터 영문단어=한글단어 형태의 entry를 입력받아 HashMap에 저장하는 로직 구현
		Map<String,String> map = new HashMap<String,String>();//해시맵 생성
		
		//map에 entry 저장
		//map.put("candy", "사탕");
		
		//입력 진행 exit가 입력되면 종료
		while(true) {
			System.out.print("영단어를 입력하세요. 단, 종료는 exit 입력 ");
			String e = sc.nextLine();
			if(e.equals("exit")) {
				break;
			}
			System.out.print("한글단어를 입력하세요. ");
			String k = sc.nextLine();
			map.put(e, k);
			
			
		}
		
		
//        // candy=사탕, candy = 사탕
//        String[] w = input.split("=");
//        map.put(w[0].trim(), w[1].trim());
		
		//2. HashMap에 입력된 영단어를 검색할 수 있는 로직을 구현
		// exit 입력되면 종료
		//없는단어 검색 시 "사전에 없는 단어입니다" 출력
		
		
		
		
		
//		map.put("apple", "사과");
//		map.put("summer", "여름");
//		map.put("candy", "사과");
//		map.put("school","학교");
//		map.put("water","물" );
		
		 while (true) {
	            System.out.print("찾고 싶은 단어는? ");
	            String input = sc.nextLine().trim();

	            	
	            if (input.equals("exit")) {
		            System.out.println(" 종료합니다...");
		            break;
	            }
	            

		            
		            
		            
		            
		            
		            if (map.containsKey(input)) {
		                System.out.println(map.get(input));
		            } else {
		                System.out.println(input + "는 없는 단어입니다.");
	                }
		 			
		 }
		 

	        sc.close();

	}

}
