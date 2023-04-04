package day15;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleManager sm = new SaleManager();
		Scanner scan = new Scanner(System.in);
		int menu =-1;
		do {
			sm.printMenu();
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: sm.add(scan);  break;
			case 2: sm.printProduct();  break;
			case 3: sm.orderPick(scan);  break;
			case 4: sm.printOrder();  break;
			case 5:   break;
			default:
				System.out.println("메뉴 오류~!!");
				
			}
		}while(menu!=5);
		System.out.println("종료~!!");
	}

}
