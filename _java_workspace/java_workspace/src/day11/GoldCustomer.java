package day11;

public class GoldCustomer extends Customer{

	//할인율 saleRatio
	double saleRatio;
	
	public GoldCustomer() {}
	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade="Gold";
		bonusRatio=0.02;
		saleRatio=0.1;
	}
	@Override
	public int calcPrice(int price) { //10000 - 1000 = 9000
		bonusPoint += (int)(price * bonusRatio);
		return price-(int)(price*saleRatio);
	}
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	
}
