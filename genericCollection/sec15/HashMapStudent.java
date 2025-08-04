package genericCollection.sec15;

import java.util.*;

public class HashMapStudent {

	public static void main(String[] args) {
		//3명의 학생 점수를 Map에 저장
		//Student 클래스르 key로 점수를 value로 저장
		
		//Map<Student, Integer> map = new HashMap<Student, Integer>(); // 입력순서 보장되지 않음
		Map<Student, Integer> map = new LinkedHashMap<Student, Integer>(); // 입력순서가 보장됨
		
		
		
		//map에 entry 저장 시 key가 사용자정의 클래스 인스턴스인 것 제외하고는 동일
		map.put(new Student(1,"홍길동"), 90);
		map.put(new Student(2,"홍길동"), 85);
		map.put(new Student(3,"성춘향"), 95); // 학생 번호로 학생을 구분 : 번호가 같은 학생은 존재하지 않는다느 규칙이 있음
		//key가 중복되면 value를 update 진행함
		//Student 클래스가 상속받은 hasCode(), equals()메소드 재정의해서 객체필드값이 동일하면 동일한 객체로 처리되게끔 구현
		// HashSet()과 같은 내용
		map.put(new Student(3,"성춘향"), 100);
		
		
		
		
		//4명의 학생의 data가 출력 - 순서를 보장하지 않음(순서가 보장되게 하고자 하면 LinkedHashMap 사용)
		for(Student k : map.keySet()) {
			System.out.println(k.getStdNo()+" " + k.getStdName() + " " + map.get(k));
			
		}
		
		
		
	}

}
