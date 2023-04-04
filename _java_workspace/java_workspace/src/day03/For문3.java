package day03;

import java.util.Scanner;

public class For문3 {

	public static void main(String[] args) {
		//1부터 100까지의 합계
		int sum=0;
		//int i=1;
		for(int i=1 ;i<=100;) {
			sum = sum+i; //누적 => 내변수 = 내변수 + sum대상  (sum+=i)
			// 0+1+2+3+.....+99+100
			i = i + 1;
		}
		//System.out.println(i);
		System.out.println(sum);
		
		/* 약수구하기.
		 * 약수 : 나누어서 떨어지는 수들의 모임.
		 * 12의 약수 : 1, 2, 3, 4, 6, 12
		 * num =12;
		 * 1부터 num까지의 수를 num와 나누어 떨어지는(나머지가 0이되는)수를 출력
		 * 초기값 : 1부터
		 * 조건식 : num까지
		 * 증감식 : 1씩증가
		 * 실행문 : 나머지가 0이되는 수를 출력
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(); //줄바꿈
		
		
	}

}
