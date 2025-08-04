package genericCollection.sec08;

import java.util.LinkedList;

public class ProductMain {

	public static void main(String[] args) {
		
		LinkedList<Product> prdList = new LinkedList<>();

		
		prdList.add(new Product(1001, "콜라", 1500));
		prdList.add(new Product(1002, "사이다", 1300));
		prdList.add(new Product(1003, "밀크티", 2500));

		
		for (Product p : prdList) {
			System.out.println(p);  
		}
	}
}