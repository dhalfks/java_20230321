package day06;

public class Method05 {

	public static void main(String[] args) {
		/* 2~100까지의 소수를 출력
		 * */
		
		/* 2~100까지 for문을 돌려서 isPrime 호출 후 true라면 출력
		 * */
		int sum=0;
		for(int i=2; i<=100; i++) {
			if(isPrime(i)) { // true / false
				System.out.print(i+" ");
				sum+= i;
			}
		}
		System.out.println();
		System.out.println("---소수의 합계---");
		System.out.println(sum);
	}
	
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판별 (true / false)
	 * 소수 : 1과 자기자신만을 약수로 가지는 수
	 * 리턴타입 : boolean
	 * 매개변수 : 숫자 => int num
	 * 메서드명 : isPrime 
	 * */
	public static boolean isPrime(int num) {
		int cnt = 0; //개수
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				cnt++;  //약수의 개수
			}
		}
		
		if(cnt == 2) {
			return true;
		}
		return false;
	}
	

}
