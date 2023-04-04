package day11;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer[] customerList = new Customer[10];
		//업캐스팅 => 묵시적인 형변환이 가능
		Customer cLee = new Customer(10001, "홍길동");
		Customer gHong = new GoldCustomer(10002,"홍길순");
		Customer vHong = new VIPCustomer(10003, "홍순길", 1111);
		
		//다운캐스팅 => 반드시 명식적으로 형변환 해야함.
		//instanceof : 원래 인스턴스의 형이 맞는 여부를 체크하는 명령어 맞으면 true/false
		System.out.println(vHong instanceof GoldCustomer);
		if(vHong instanceof VIPCustomer) {
			
			VIPCustomer vCustomer = (VIPCustomer)vHong;
			System.out.println(vCustomer.getAgentID()); 
			
		}else if(vHong instanceof GoldCustomer){
			GoldCustomer vCustomer = (GoldCustomer)vHong;
			System.out.println(vCustomer.getSaleRatio());
		}else {
			System.out.println("error");
		}
		
		int cnt=0;
		customerList[cnt] = cLee;
		cnt++;
		customerList[cnt] = gHong;
		cnt++;
		customerList[cnt] = vHong;
		cnt++;
		
		System.out.println("----고객 정보 출력---");
		//for문을 활용해서 고객정보 출력
		for(int i=0; i<cnt; i++) {
			System.out.println(customerList[i].customerInfo());
		}
		
		System.out.println("---할인율과 포인트 계산---");
		int price=100000;
		//for문을 활용하여 할인율과 포인트 계산 내역 출력
		for(int i=0; i<cnt; i++) {
			System.out.println(customerList[i].getCustomerName()+"님이 지불하실 금액은 "+
					customerList[i].calcPrice(price) +"원입니다.");
			System.out.println(customerList[i].getCustomerName()+"님의 현재 보너스 포인트는"
					+customerList[i].bonusPoint+"점 입니다.");
		}
		
//		cLee.calcPrice(1000000);
//		System.out.println(cLee.customerInfo());
//		cLee.calcPrice(10000);
//		System.out.println(cLee.customerInfo());
//		System.out.println(gHong.customerInfo());
		//다운캐스팅을 통해 접근할 수 있다.
		//System.out.println(vCustomer.get);
//		
//		System.out.println("=== 할인율과 포인트 계산===");
//		int price = 100000;
//		int cost = cLee.calcPrice(price);
//		System.out.println(cLee.getCustomerName()+"님이 지불하실 금액은"+ cost+"원입니다." );
//		System.out.println(cLee.getCustomerName()+"님의 현재 포인트는 "+cLee.bonusPoint+"점입니다.");
//		int cost1 = gHong.calcPrice(price);
//		System.out.println(gHong.getCustomerName()+"님이 지불하실 금액은"+ cost1+"원입니다." );
//		System.out.println(gHong.getCustomerName()+"님의 현재 포인트는 "+gHong.bonusPoint+"점입니다.");
//		int cost2 = vHong.calcPrice(price);
//		System.out.println(vHong.getCustomerName()+"님이 지불하실 금액은"+ cost2+"원입니다." );
//		System.out.println(vHong.getCustomerName()+"님의 현재 포인트는 "+vHong.bonusPoint+"점입니다.");
	}

}
