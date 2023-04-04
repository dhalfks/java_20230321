package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class TestFood {

	public static void main(String[] args) {
		FoodManager1 fm = new FoodManager1();
		ArrayList<Integer> order = new ArrayList<>();
		// 1 3   3 3
		fm.add(); //값 추가하는 add 호출
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		do {
			fm.printMenu(); //메뉴출력
			menu = scan.nextInt(); //메뉴입력받기
			//1~5까지는 일반메뉴, 6 프로그램종료, 0메뉴선택끝
			if(menu==6) {
				System.out.println("프로그램 종료");
				break;
			}
			if(menu !=0) {
				if( menu < 6) {
					System.out.println("수량 : ");
					int count = scan.nextInt();
					fm.sale(menu, count);
					order.add(menu);
					order.add(count);
					System.out.println("주문 종료 => 0번");
					
				}else {
					System.out.println("잘못된 메뉴~!!");
				}
			}
		}while(menu!=0);
		//햄버거 2개, 음료 2개 선택 총 지불금액 : ?
		System.out.println("--주문확인--");
		for(int i=0; i<order.size(); i=i+2) {
			//1 2  3 2
			//int index = i+1;
			System.out.print(fm.getList1().get(order.get(i)-1) + " ");
			System.out.print(order.get(i+1)+"개 ");
			
		}
		System.out.println();
		System.out.println("계산하실 금액은 "+fm.getTotSum()+"입니다.");

	}

}
class FoodManager1{
	//멤버변수
	//메뉴에 대한 List<String>, List<Integer>
	private ArrayList<String> list1 = new ArrayList<>(); //메뉴
	private ArrayList<Integer> list2 = new ArrayList<>(); //가격
	private int sum;
	private int totSum;
	
	public void printMenu() {
		System.out.println("---menu---");
		System.out.println("1.햄버거 : 15,000원");
		System.out.println("2.피자 : 20,000원");
		System.out.println("3.음료 : 2,000원");
		System.out.println("4.과자 : 1,000원");
		System.out.println("5.사탕 : 500원");
		System.out.println("메뉴 선택 : ");
	}
	
	public void add() {
		//list에 값 추가
		list1.add("햄버거"); //0  -> 1번메뉴
		list1.add("피자");
		list1.add("음료");
		list1.add("과자");
		list1.add("사탕");
		
		list2.add(15000);
		list2.add(20000);
		list2.add(2000);
		list2.add(1000);
		list2.add(500);
	}
	
	public void sale(int menu, int count) {
		//list2.get(menu-1) : 메뉴에 대한 가격
		sum = list2.get(menu-1) * count;
		totSum+=sum;
		System.out.println("--------------");
		System.out.print("주문하신 메뉴는 "+list1.get(menu-1)+" ");
		System.out.println(count + "개 입니다.");
		System.out.println("금액 : "+sum);	
	}

	public int getSum() {
		return sum;
	}

	public int getTotSum() {
		return totSum;
	}

	public ArrayList<String> getList1() {
		return list1;
	}

	public void setList1(ArrayList<String> list1) {
		this.list1 = list1;
	}

	public ArrayList<Integer> getList2() {
		return list2;
	}

	public void setList2(ArrayList<Integer> list2) {
		this.list2 = list2;
	}
	
	
}