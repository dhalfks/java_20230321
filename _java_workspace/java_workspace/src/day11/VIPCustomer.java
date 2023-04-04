package day11;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {}
	public VIPCustomer(int id, String name,int agentid) {
		super(id, name);
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID = agentid;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; 
		return price - (int)(price*saleRatio);
	}
	
	
	@Override
	public String customerInfo() {
		// TODO Auto-generated method stub
		return super.customerInfo() + "담당 상담원 번호는 "+agentID+"입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	
	
	
}
