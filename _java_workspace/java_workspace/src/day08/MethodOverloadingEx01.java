package day08;

public class MethodOverloadingEx01 {

	public static void main(String[] args) {
		/* calc(1,2,"+")
		 * calc(1,"+",2)
		 * calc("+",1,2)
		 * 메서드 오버로딩을 이용하여 두 정수와 연산자를 입력받아 연산자의 위치에 상관없이
		 * 연산의 결과가 출력되는 calc 메서드를 완성
		 * 잘못된 연산자가 들어오면 잘못된 연산자입니다. 출력
		 * */
		calc('+', 10, 20);
		calc(20, '-', 10);
		calc(10, 20, '*');
		

	}
	
	public static void calc(int num1, int num2, char op) {
		switch(op) {
		case '+': 
			System.out.println(num1 + num2);
			break;
		case '-': 
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '%':
			System.out.println(num1 % num2);
			break;
		default:
			System.out.println("올바른 연산자가 아닙니다.");
		}
	}
	public static void calc(int num1, char op, int num2) {
		switch(op) {
		case '+': 
			System.out.println(num1 + num2);
			break;
		case '-': 
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '%':
			System.out.println(num1 % num2);
			break;
		default:
			System.out.println("올바른 연산자가 아닙니다.");
		}
	}
	public static void calc(char op, int num1, int num2) {
		switch(op) {
		case '+': 
			System.out.println(num1 + num2);
			break;
		case '-': 
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '%':
			System.out.println(num1 % num2);
			break;
		default:
			System.out.println("올바른 연산자가 아닙니다.");
		}
	}

}
