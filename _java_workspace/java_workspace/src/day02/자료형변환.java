package day02;

public class 자료형변환 {

	public static void main(String[] args) {
		/* 자료형변환 : 변수의 값과 리터럴의 값의 자료형이 맞지 않으면 오류
		 * 변수 = a 저장하려고하는 값이 자료형이 일치하지 않는경우 형을 맞추기 위해 형변환을 함. 
		 * casting
		 * 기본 타입 허용 범위 : byte < short , char < int < long < float < double
		 * 자동 자료형 변환 : 자료형변환시 생략해도 문제가 없는 경우. 
		 * 변수 > 값 : 변수의 범위가 더 넓은 경우. 
		 * 
		 * 명시적 자료형 변환 : 필요에 의해 형변환이 필요한 경우
		 * 리터럴 값 앞에 (타입)  => (int)Math.random();
		 * */
		int num = (int)Math.random(); //결과는 무조건 0
		double num1 = 10;
		byte num2 = 1;
		int num3 = num2;
		
		int num4 = (int)num1;

	}

}
