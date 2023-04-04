package day05;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 5개 값을 가지는 배열을 생성 후 
		 * 1~50사이의 랜덤값을 저장 후 출력
		 * */
		
		//1. 배열을 정의
		int arr[] = new int[6];
		
		//for 배열의 index 탐색
		for(int i=0; i<arr.length; i++) {
			//랜덤값 배열에 저장
			arr[i] = (int)(Math.random()*45)+1;
			//랜덤값 출력
			System.out.print(arr[i]+" ");
			
		}
		System.out.println(); //줄바꿈. 
		System.out.println("오름차순 정렬 후 >> ");
		
		for(int i=0; i<arr.length-1; i++) {  // 0 1
			for(int j=i+1; j<arr.length; j++) { // 1~ 2~
				if(arr[i] > arr[j]) { //오름차순
					//교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("향상된 for문 >> ");
		//향상된 for문
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}

	}

}
