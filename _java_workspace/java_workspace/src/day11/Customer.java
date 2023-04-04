package day11;

public class Customer {
	/* 일반고객 / Gold고객 / VIP고객
	 * 
	 * 고객ID : int customerID 
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스포인트적립비율 : double bonusRatio
	 * 
	 * - Customer 객체생성시 
	 * 기본 customerGrade = Silver
	 * 기본 bonusRatio = 0.01
	 * 
	 * - 메서드
	 * 
	 * - 보너스 적립 계산 메서드 (메서드명 : calcPrice(int price)) 
	 *   => 보너스를 적립하고, 할인여부를 체크하여 구매 price를 리턴
	 * - 구매금액을 주고, 적립보너스를 계산 bonusPoint에 누적
	 * 
	 * - 출력 메서드 (메서드명 : customerInfo())
	 * - 홍길동 님의 등급은 VIP이며, 보너스포인트는 1000 입니다.
	 * 
	 * - Gold 등급 
	 * - 제품을 살때 10%를 할인 / 보너스 포인트 2%적립
	 * 
	 * - VIP 등급 
	 * - 제품을 살때 10%를 할인 / 보너스 포인트 5%적립
	 * - 전담상담사를 갖는다.
	 * 
	 * */
	
	 protected int customerID;  //고객ID  => 1001
	 protected String customerName; //고객명
	 protected String customerGrade; //고객 등급
	 int bonusPoint; //포인트
	 double bonusRatio; //적립비율
	 
	 public Customer() {} //
	 
	 public Customer(int id, String name) {
		 customerID = id;
		 customerName = name;
		 initCustomer();
	 }
	 
	 private void initCustomer() {
		 customerGrade="Silver";
		 bonusRatio=0.01; 
	 }
	 public int calcPrice(int price) {
		 //가격을 매개변수로 받아 포인트를 적립
		 bonusPoint = bonusPoint+(int)(price*bonusRatio);
		 return price;
	 }
	 public String customerInfo() {
		 return customerName+"님의 등급은"+customerGrade+"이며, 보너스 포인트는"+
	 bonusPoint+"입니다.";
	 }

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	} 
	
}
