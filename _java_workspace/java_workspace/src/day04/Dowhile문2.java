package day04;

import java.util.Scanner;

public class Dowhile문2 {

	public static void main(String[] args) {
		/* ------menu------
		 * 1.저장|2.출력|3.종료
		 * ----------------
		 * 입력 : 1
		 * 저장되었습니다.
		 * ------menu------
		 * 1.저장|2.출력|3.종료
		 * ----------------
		 * 입력 : 2
		 * 출력되었습니다.
		 * ------menu------
		 * 1.저장|2.출력|3.종료
		 * ----------------
		 * 입력 : 3
		 * 종료되었습니다. 반복문종료
		 * */
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("------menu------");
			System.out.println("1.저장|2.출력|3.종료");
			System.out.println("----------------");
			System.out.println("입력 : ");
			
			menu = scan.nextInt();
			
			//실제 기능 처리
			switch(menu) {
			case 1:
				System.out.println("저장되었습니다.");
				break;
			case 2:
				System.out.println("출력되었습니다.");
				break;
			case 3:
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못입력되었습니다.");
				break;	
			}
			
		}while(menu!=3); //true
		System.out.println("프로그램 종료!!");
		
		scan.close();

	}

}
