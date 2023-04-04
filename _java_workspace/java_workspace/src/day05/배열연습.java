package day05;

import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아 배열에 저장하고,
		 * 점수의 합계, 평균, 최대, 최소값을 출력
		 * */
		//1. 스케너 열기
		Scanner scan = new Scanner(System.in);
		//2. 배열 선언, 변수들 선언
		int size = 5;
		int arr[] = new int[size];
		int sum=0; 
		double avg=0;
		int max=0;
		int min = 100;
		
		//3. for문을 사용하여 배열안을 탐색 index 번지에 값을 저장
		System.out.println("점수를 입력해주세요. (5명의 점수)");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			//4. 합계, 평균, 최대, 최소의 값을 구하기.
			sum = sum+ arr[i];
			//가능함.
			//max = Math.max(max, arr[i]);
			//min = Math.min(min, arr[i]);
			if(arr[i] > max) {  
				max=arr[i];
			}
			if(arr[i] < min) {
				min=arr[i];
			}
		}
		avg = (double)sum / arr.length;
		
		//5. 출력
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		scan.close();
		
		

	}

}
