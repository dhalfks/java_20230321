package day02;

public class 과제 {

	public static void main(String[] args) {
		/* 1~100까지 2의 배수(짝수)를 출력
		 * 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 ...
		 * 
		 * */
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
				//줄바꿈
				if(i % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		

	}

}
