package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - * / % 를 작성하여 출력
		 * 두 수를 입력받아서 연산. 연산자를 입력받아 메서드를 활용하여 연산
		 * 
		 * */
		//1. 스케너 열기
		//2. 각 메서드 정의
		//3. 메인에서 값 입력받기 (정수 2개, 연산자 1개)
		//4. switch()문을 통해 각 연산자마다 메서드 호출 / 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("==계산기를 만들어 보자==");
		System.out.println("연산자를 입력해주세요 > ");
		String op = scan.next();   // char op = scan.next().charAt(0);
		
		System.out.println("첫번째 숫자 >");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자 >");
		int num2 = scan.nextInt();
		
		//다른 클래스 만든 메서드 사용법 
		Method02 m2 = new Method02();
		System.out.println("Method02 class에서 작성된 Method");
		m2.sumPrint(num1, num2);
		
		switch(op) {
		case "+" : 
			addition(op, num1, num2);
			break;
		case "-" : 
			//int sub = substration(num1, num2);
			System.out.println(num1+op+num2+"="+substration(num1, num2));
			break;
		case "*" : 
			mutipulication(num1, op, num2);
			
			break;
		case "/" :
			System.out.println(num1+op+num2+"="+division(num1, num2, op));
			break;
		case "%" :
			//리턴을 배열로 리턴 : 몫, 나머지 double로 리턴
			double[] arr = rem(num1, num2);
			System.out.println("/ 의 결과 : "+ arr[0]); //해당 배열의 0번지
			System.out.println("/ 의 나머지 : "+ arr[1]); //해당 배열의 1번지
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
		}
		System.out.println("계산기 종료");
		
		
		scan.close();
	}
	
	//메서드 정의
	public static void addition(String op, int num1, int num2) {
		System.out.println(num1+ op +num2+ "="+(num1 + num2));
	}
	
	public static int substration(int num1, int num2) {
		return num1 - num2;
	}
	
	public static void mutipulication(int num1, String op, int num2) {
		System.out.println(num1+ op +num2+ "="+(num1 * num2));
	}
	
	public static double division(int num1, int num2, String op) {
		return (double)num1 / num2;
	}
	
	/* 기능 : 두 정수를 입력받아 두정수를 나눈 몫과 나머지를 double[] 배열로 리턴
	 * 리턴타입 : double[] 배열
	 * 매개변수 : int num1, int num2
	 * 변수명 : rem
	 * 
	 * */ 
	public static double[] rem(int num1, int num2) {
		double[] res = new double[2];
		res[0] = (double)num1 / num2;
		res[1] = num1 % num2;
		
		return res;
	}

}
