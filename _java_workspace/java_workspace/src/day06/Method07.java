package day06;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력(void)
		 * 숫자와 기호는 스케너로 입력받기.
		 * ex) 3, * => ***
		 * ex) 5, O => OOOOO
		 * ex) 7, ♥ => ♥♥♥♥♥♥♥
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자와 기호를 입력해주세요. : ");
		int num = scan.nextInt();
		String st = scan.next();
		
		symbol(num, st);
		
		scan.close();
		
	}
	public static void symbol(int num, String st) {
		for(int i=1; i<=num; i++) {
			System.out.print(st);
		}
	}

}
