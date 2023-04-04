package day04;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		/* 1~50사이의 랜덤수 하나를 생성 후 맞추는 게임.
		 * 예) 컴퓨터가 랜덤수를 생성했습니다. :45
		 * 사용자 입력: 20
		 * up!
		 * 사용자 입력: 30
		 * up!
		 * 사용자 입력: 49
		 * down!
		 * 사용자 입력: 45
		 * 정답입니다.!!
		 * 클럽에 제출
		 * */
		//스케너열기
		Scanner scan = new Scanner(System.in);
		//랜덤수 결정하기 0~50
		int random = (int)(Math.random()*50)+1;
		int num=0, count=0;
		System.out.println("컴퓨터가 랜덤수를 결정했습니다. (1~50까지)");
		String str ="가나다";
		String str1 = new String();
		str1="홍길동";
		
		System.out.println(str1.charAt(2));
		//반복문 열기
		while(num != random) {
			System.out.println("입력: ");
			num = scan.nextInt();
			count++;  //사용자가 입력했을 때 1증가
			//비교
			if(num <1 || num >50) {
				System.out.println("입력 범위를 벗어났습니다. (1~50)");
			}else {
				if(num > random) {
					System.out.println("down~!!");
				}else if(num < random) {
					System.out.println("up~!!");
				}else {
					System.out.println("정답입니다.~!!");
				}
			}
			System.out.println("게임횟수 : "+count);
			
		}
		
		
		scan.close();

	}

}
