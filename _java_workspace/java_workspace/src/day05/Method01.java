package day05;

public class Method01 {

	public static void main(String[] args) {
		/* 메서드 : 기능 / 함수 p.230
		 * 접근제한자 : 접근할수 있는 주체의 제한범위
		 * 리턴타입 : 메서드의 실행 결과로 받을 수 있는 정보의 값(자료형)
		 * 메서드명 : 메서드 이름: 소문자로시작
		 * 매개변수 : 메서드를 실행하기위해서 필요로하는 값
		 * 메서드 선언 및 구현
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 기능구현;
		 * }
		 * 메서드를 선언하는 위치
		 * 클래스 안, 메서드 밖
		 * */
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
		int hap = sum(500, 200);
		System.out.println(hap);

	}
	
	//메서드 위치
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 합을 알려줌 (int)
	 * 메서드명 : sum
	 * 매개변수 : 두 정수(int num1, int num2)
	 * */
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	

}
