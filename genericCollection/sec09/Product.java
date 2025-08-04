package genericCollection.sec09;

public class Product { // sec08 연습문제 리뷰 
	private int prdNo;
	private String prdName;
	private int prdPrice;
	
	
	public Product(int prdNo, String prdName, int prdPrice) {
		this.prdNo = prdNo; /// 0001
		this.prdName = prdName; /// 새우깡 
		this.prdPrice = prdPrice; /// 1500
	}
	
	@Override
	public String toString() {
		return "상품 번호 : " + prdNo + 
				"\n상품명 : " + prdName + 
				"\n상품 가격 : " + prdPrice + 
				"\n-----------------";
	}

	public int getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(int prdNo) {
		this.prdNo = prdNo;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}
	
	
	
}
