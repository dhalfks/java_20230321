package day07;

public class Method08 {

	public static void main(String[] args) {
		/* 배열이 주어졌을 때 배열을 출력하는 메서드 생성
		 * */
		int arr[] = new int[] {1,3,5,4,9,7,8,2,11,16,15,6,10,13,14};
		System.out.println("---정렬 전---");
		printArray(arr);
		sortArray(arr);
		System.out.println();
		System.out.println("---정렬 후---");
		printArray(arr);
		
		System.out.println();
		System.out.println("---random 배열 출력---");
		
		int arr2[] = randomArray(15); //배열을 리턴
		System.out.println(arr2); //객체의 주소
		printArray(arr2);
		System.out.println();
		System.out.println("---랜덤배열 정렬 후 출력---");
		sortArray(arr2);
		printArray(arr2);
	}
	/* 기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 정수배열 => int arr[]
	 * 리턴타입 : void
	 * 메서드명 : printArray
	 * 옆으로 출력 / 5개씩 한줄에 나열
	 * */
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(i%5==0 && i !=0) {
				System.out.println();
			}
			System.out.printf("%3d",arr[i]);
		}
	}
	
	
	/* 기능 : 주어진 정수 배열을 정렬하는 기능
	 * 매개변수 : 정수배열 => int arr[]
	 * 리턴타입 : void
	 * 메서드명 : sortArray
	 * i =2, j=3  tmp = 3
	 * */
	public static void sortArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { //오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	 * 랜덤수 범위 (1~100까지)
	 * 매개변수 : 사이즈 => int size
	 * 리턴타입 : 배열 => int[]
	 * 메서드명 : randomArray
	 * */
	public static int[] randomArray(int size) {
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	

}
