package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	
	private ArrayList<Sale<String,Integer>> product = new ArrayList<>();
	private ArrayList<Sale<String,Integer>> order = new ArrayList<Sale<String,Integer>>();
	
	public void add(Scanner scan) {
		System.out.println("제품명:");
		String menu = scan.next();
		System.out.println("가격:");
		int price = scan.nextInt();
		Sale s = new Sale(menu, price);
		product.add(s);
	}
	
	public void printProduct() {
		System.out.println("--menu--");
		int index=1;
		for(int i=0; i<product.size(); i++) {
			System.out.println(index+". "+product.get(i));
			index++;
		}
		System.out.println("--------");
		
	}
	
	public void orderPick(Scanner scan) {
		int index = -1;
		System.out.println("주문메뉴 :");
		String orderMenu = scan.next();
		
		System.out.println("주문수량 :");
		int orderCount = scan.nextInt();
		for(int i=0; i<product.size(); i++) {
			if(product.get(i).getMenu().equals(orderMenu)) {
				index = i;
				int price = product.get(i).getPrice();
				Sale s = new Sale(orderMenu, orderCount*price);
				order.add(s);
			}
		}
		if(index ==-1) {
			System.out.println("찾는 메뉴가 없습니다.");
		}
	}
	
	public void printOrder() {
		int sum = 0;
		for(Sale s : order) {
			System.out.println(s);
			sum = sum+(Integer)s.getPrice();
		}
		System.out.println("지불하실 총 금액:"+sum);
	}
	
	public void printMenu() {
		System.out.println(">>ProgramList");
		System.out.println("1.제품추가");
		System.out.println("2.제품리스트보기");
		System.out.println("3.제품주문");
		System.out.println("4.주문내역");
		System.out.println("5.프로그램 종료");
		System.out.println(">>choose:");
	}
	
}
