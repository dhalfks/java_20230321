package day05;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		/* 5자리 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력 
		 * 각 자리수 합계 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1  
		 * ex) 19874 => 47891 => 4+7+8+9+1
		 * 클럽에 제출
		 * %, /
		 * 11456 % 10 = 6 => 배열에 저장
		 * 11456 / 10 = 1145
		 * */
		//1. 스케너열기
		Scanner scan = new Scanner(System.in);
		//2. 입력받기
		System.out.println("5자리 정수를 입력해주세요. ");
		int num = scan.nextInt();  // 11456
		//3. 배열 선언, 변수들 선언
		int arr[] = new int[5];
		int sum=0, i=0;
		//4. 반복문 이용하여 마지막자리가 없어질 때까지 배열에 저장 / 합계 
		// / % while문을 이용
 		
		while(num > 0) { //입력받은 num 가 0이 되기전까지 반복
			int b = num % 10; // 마지막 자리
			//System.out.print(b+" ");
			//System.out.println();
			arr[i] = b;
			sum = sum+b;
			num = num / 10; //몫 저장 => 소수점은 버려짐.
			System.out.print(arr[i]+" ");
			i++; 
		}
		System.out.println();
		System.out.println("sum : "+sum);
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
