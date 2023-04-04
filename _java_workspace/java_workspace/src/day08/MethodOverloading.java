package day08;

public class MethodOverloading {

	public static void main(String[] args) {
		/* 메서드 오버로딩 (Method Overloading)
		 * - 동일한 이름을 가지는 메서드를 여러개 만드는 경우
		 * 1. 매개변수의 개수가 다르면 가능.
		 * 2. 매개변수의 종류(자료형)가 다르면 가능.
		 * 리턴타입은 상관없음. 매개변수 이름도 상관없음.
		 * */
		System.out.println(sum(1,2));
		System.out.println(sum(1.2, 3.4));
		System.out.println(sum(1, 5.4));
		System.out.println(sum(1,2,3,4,5,6,7));
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
		int arr[] = {78,45,89,68,94,51,85,71};
		System.out.println("arr 배열의 합 : "+sum(arr));
		
		/* 가변길이 메서드
		 * 1+2, 1+2+3, 45+78+78+89+75
		 * 피연산자의 값이 일정하지 않을경우 매개변수의 개수와 상관없이 매개값을 줄때 사용
		 * */

	}
	/* 더하기 하는 메서드 생성
	 * int num1, int num2를 매개변수로 받아 더한연산결과를 리턴
	 * 메서드 명 : sum
	 * */
	public static double sum(int num1, double num2) {
		return num1 + num2;
	}
	
	public static double sum(double num2, int num1) {
		return num1 + num2;
	}
	
	public static int sum(int num1,  int num2) {
		return num1 + num2;
	}
	
	/* 더하기 하는 메서드 생성
	 * 매개변수 : double 자료형으로
	 * 메서드명 : sum
	 * */
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	//가변길이 메서드
	public static int sum(int ...num) {
		int sum=0;
		//가변길이 num는 배열처럼 사용.
		for(int i=0; i<num.length; i++) {
			sum=sum+num[i];
		}
		return sum;
	}
	
	

}
