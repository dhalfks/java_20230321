package day04;

public class 이중For문 {

	public static void main(String[] args) {
		/* 다음을 출력하시오.
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * */
		
		// cnt++ : 표현하고 증가  , ++cnt : 증가하고 표현    
		int cnt=0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				//cnt++;
				System.out.print(++cnt+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------");
		for(int i=1; i<=9; i++) {
			System.out.print(i+" ");
			if(i%3==0) {
				System.out.println();
			}
		}

	}

}
