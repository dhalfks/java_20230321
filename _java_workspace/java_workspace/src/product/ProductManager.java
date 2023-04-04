package product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements ProductInterface {

	private ArrayList<Product> menu = new ArrayList<>();
	private ArrayList<Order> order = new ArrayList<>();
	
	
	public void addMenu() {
		menu.add(new Product("햄버거",15000));
		menu.add(new Product("피자",20000));
		menu.add(new Product("음료",2000));
		menu.add(new Product("과자",1000));
		menu.add(new Product("사탕",500));
	}
	
	@Override
	public void add(Scanner scan) {
		System.out.println("추가할 메뉴를 입력하세요.");
		String menu = scan.next();
		System.out.println("메뉴의 가격을 입력하세요.");
		int price = scan.nextInt();
		this.menu.add(new Product(menu, price));
	}
	@Override
	public void printProduct() {
		System.out.println("----menu----");
		for(Product p : menu) {
			System.out.println(p);  //Product 클래스의 toString호출
			//메서드로 print를 만들어놓은 경우
			//p.메서드명();
		}
		System.out.println("------------");
		
	}
	@Override
	public void orderPick(String name, int count) { //메뉴명, 개수
		// 매게변수로 입력받을 경우 scan으로 입력받으면 됨.
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				int price= menu.get(i).getPrice();
				Order order = new Order();
				order.setMenu(name);
				order.setPrice(price);
				order.setCount(count);
				order.setTotal(price*count);
				this.order.add(order);
			}
		}
		
	}
	@Override
	public void printOrder() {
		int sum = 0;
		System.out.println("----주문내역----");
		for(int i=0; i<order.size(); i++) {
			order.get(i).print();
			sum += order.get(i).getTotal();
		}
		System.out.println("--------------");
		System.out.println("지불하실 총 금액 :"+sum);
		
		
	}

	@Override
	public void delete(Scanner scan) {
		// 메뉴 삭제
		System.out.println("삭제할 메뉴 입력:");
		String delMenu = scan.next();
		int index=-1;
		//menu List에서 menu를 찾아서 remove
		// remove(index), remove(Object)
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(delMenu)) {
				index = i;  //메뉴의 위치 추출
				//menu.remove(i); //index로 삭제
				menu.remove(menu.get(i)); //Object로 삭제
				System.out.println("삭제완료!!");
				return;
			}
		}
		if(index == -1) {
			System.out.println("찾는 메뉴가 없습니다.");
		}
		
		
	}

	@Override
	public void update(Scanner scan) {
		// 메뉴 수정
		System.out.println("수정할 메뉴 입력:");
		String upName = scan.next();
		int index = -1;
		System.out.println("가격:");
		int upPrice = scan.nextInt();
		
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(upName)) {
				//메뉴의 가격만 수정
				//menu.get(i).setPrice(upPrice);
				Product p = new Product(upName, upPrice);
				menu.set(i, p); //메뉴명, 가격을 둘다 수정가능.
				System.out.println("수정완료!!");
				return;
			}
		}
		if(index ==-1) {
			System.out.println("메뉴를 찾을수 없습니다.");
		}
	
	}

}
