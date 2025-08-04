package genericCollection.sec09;

import java.util.*;

public class LinkedListprdMain {

	public static void main(String[] args) {
		Product p1 = new Product(1000, "마우스" , 20000);
		Product p2 = new Product(1001, "키보드" , 80000);
		Product p3 = new Product(1002, "모니터" , 220000);

		//ArrayList : Array의 특징을 포함하고 있음, 크기가 고정되는 Array의 단점을 해결 크기를 가변으로 운경 가능
		//idx로 운영가능
		//삽입삭제가 빈번한 경우 이동연산으로 인해 성능이 떨어질 수 있음
		//타입고정을 위한 제네릭 제공
		//ArrayList<Product> list = new ArrayList<Product>(); // Object type으로 구성됨
		
		//삽입삭제가 빈번한 data인 경우에는 LinkedList를 활용하는것이 효율성이 있음
		//물리적인 구조가 다를뿐이지 기능은 동일한 기능을 갖고 있음 
		//List<Product> list1 = new LinkedList<Product>()
		LinkedList<Product> list = new LinkedList<Product>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		for(Product prd : list) {
			System.out.println(prd.toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
