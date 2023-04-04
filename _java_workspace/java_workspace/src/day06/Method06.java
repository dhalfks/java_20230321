package day06;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력 
		 * 구구단 1단을 출력(void)하는 메서드
		 * 7 단
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("출력할 단을 입력해주세요. > ");
		int dan = scan.nextInt();
		gugudan(dan);
		scan.close();

	}
	
	/* 구구단 출력
	 * 매개변수 : 단 => int num
	 * 리턴 : void
	 * 메서드명 : gugudan 
	 * */
	public static void gugudan(int num) {
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(i*num));
		}
	}

}
