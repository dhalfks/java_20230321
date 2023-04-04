package day02;

public class Switch문2 {

	public static void main(String[] args) {
		/* 주사위의 값을 출력하는 예제
		 * 주사위는 1~6까지의 랜덤수로 결정됨. 
		 * 
		 * */
		int num = (int)(Math.random()*13)-6; // -6~-1 0 1 ~6
		
		System.out.println(num);
		
		//switch문을 이용하여 num수만큼 전진
		
		//if문을 이용하여 랜덤수 -6 ~ 6까지 값을 출력 
		// -값은 후진으로 표시, +값은 전진으로 표시
		// -는 절대값으로 표현하시오.
		
		int num1 = (int)(Math.random()*13)-6;
		
		System.out.println(num1);
		if(num1<0) {
			System.out.println(Math.abs(num1)+"만큼 후진");
		}else {
			System.out.println(num1+"만큼 전진");
		}

	}

}
