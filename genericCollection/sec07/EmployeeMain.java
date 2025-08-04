package genericCollection.sec07;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMain {

	public static void main(String[] args) {
		// 사용자 정의 클래스 타입 사용
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee(100, "김사원", 3000);
		Employee e2 = new Employee(101, "이대리", 5000);
		
		list.add(e1);
		list.add(e2);
		list.add(new Employee(102,"박과장",7000 ));
		
		for(int i=0; i<list.size();i++) {
			Employee emp = list.get(i);
			System.out.println(emp);
		}
		
		System.out.println("");
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		System.out.println();
		//Iterator 사용해서 출력
		Iterator<Employee> it = list.iterator(); // iterator로 배열전체 반복
		while(it.hasNext()) { // 다음 요소가 존재하는 동안 반복 
			System.out.println(it.next()); // 다음 요소를 꺼내 출력
		}
	}

}
