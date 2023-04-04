package day04;

public class 배열2 {

	public static void main(String[] args) {
		/* 5개 값을 담는 배열을 생성하여 1~5까지의 값을 입력하고 출력
		 * 입력과 출력은 for문을 활용하여...
		 * 출력모양 => 배열이름[번지]=값
		 * arr[0]=1 
		 * */
		int size = 5;
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) { //0~4 index 범위
			arr[i] = (i+1);
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		}
		System.out.println();
		
		/* 10개 값을 갖는 배열을 생성하고, 짝수만을 저장하고 출력
		 * */
		size = 10;
		int arr1[] = new int[size];
		for(int i=0; i<arr1.length; i++) { //0~4 index 범위
			arr1[i] = (i+1)*2;
			System.out.printf("arr1[%d]=%d\n",i,arr1[i]);
		}
		System.out.println();

	}

}
