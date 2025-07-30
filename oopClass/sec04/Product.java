package oopClass.sec04;

import java.util.Scanner;

public class Product {

	String prdName;
	int prdPrice;
	int prdSold;
	int Sold;
	
	public void innputPrdInfo() {
		System.out.println("****상품 정보 입력****");
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 : ");
		prdName = sc.nextLine();
		System.out.print("가격 : ");
		prdPrice = sc.nextInt();
		System.out.print("판매 수량 : ");
		prdSold = sc.nextInt();
		System.out.print("재고 수량 : ");
		Sold = sc.nextInt();
		sc.close();
		
		}
	
		public void showPrdInfo() {
			System.out.println("****상품 정보 출력****");
			System.out.println("상품명 : " + prdName);
			System.out.println("가격 : " + prdPrice);
			System.out.println("판매 수량 : " + prdSold);
			System.out.println("재고 수량 : " + Sold);
		}
		
		public void showSalesAmount() {
			System.out.println("매출액 : " + (prdPrice*prdSold));
		}
	
		public void showStockAmount() {	
			System.out.println("재고액 : " + (prdPrice*Sold));
		}
	
}
