package genericCollection.sec08;


public class Product {

	int prdNo;
	String prdName;
	int prdPrice;

	
	public Product(int prdNo, String prdName, int prdPrice) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}

	@Override
	public String toString() {
		return prdNo + " - " + prdName + " - " + prdPrice + "원";
	}


}