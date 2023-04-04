package day01;

public class IF문1 {

	public static void main(String[] args) {
		/* 조건문 : 주어진 조건에 맞을 경우 실행문을 처리하는 구문
		 * if / switch문
		 * if문 : if, if~else, if~else if
		 * 
		 * if(조건식){
		 * 실행문;
		 * }
		 * 실행문이 하나일경우 { } 생략가능.
		 * */
		/* num1의 값을 주고, num1이 0이면 "num1은 0입니다."라고 출력
		 * */
		
		int num1 = 0;
		if(num1 == 0) {
			System.out.println("num1은 0입니다.");
		}
		
		/* num1의 값을 주고, num1이 0이 아니면 "num1은 0이 아닙니다."라고 출력
		 * != 같지않다. == 같다
		 * */
		if(num1 != 0) {
			System.out.println("num1은 0이 아닙니다.");
		}
		
		/* num1이 0이면 0입니다.라고출력, 0이 아니면 0이 아닙니다라고 출력
		 * */
		
		if(num1 == 0) {
			System.out.println("num1은 0입니다.");
		} else if( num1 != 0){ //여러조건을 나열할 수 있음. 
			System.out.println("num1은 0이 아닙니다.");
		} else { //마지막에 한번만 가능.
			
		}
		
		/* num1이 양수이면 양수라고 출력 (0을 포함하지 않는경우 > )
		 * num1이 0이면 0이라고 출력 아니면 음수라고 출력
		 * */
		num1 = 1;
		
		if(num1 > 0) {
			System.out.println("양수");
		}else if(num1 == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		/* num2가 짝수인지 홀수인지 판별 나머지 (num2 % 2)
		 * num2가 짝수이면 "짝수", 아니면 "홀수" 출력
		 * */
		int num2 = 3;
		if(num2 % 2 == 0) { // (조건식)은 반드시 true(참) / false(거짓) 로 표현되어야 함.
			System.out.println(num2 + " : 짝수~!!");
		}else {
			System.out.println(num2 + " : 홀수~!!");
		}
		

	}
	

}
