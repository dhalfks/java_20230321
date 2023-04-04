package day05;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 1~10까지 담고있는 배열 arr 를 생성 후 출력 */
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) { //0 1 2 3 4 5 6 7 8 9
			arr[i]=i+1;
			System.out.print(arr[i]+ " ");
		}
		System.out.println(); //줄바꿈
		
		//배열을 섞는 코드 random을 활용하여 
//		int a = 10;
//		int b = 20;
//		int c = a;
//		a = b;
//		b = c;
//		System.out.println("a :"+a+", b :"+b);
		
		//방법 : 랜덤한 번지(0~arr.length)를 선택해서 다른 번지와 교환
		//(int)(Math.random()*개수)+시작값
		int min = 0; //시작번지
		int max = arr.length; //개수
		
		//배열 섞기
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*max)+min; //0~ 10개
			//arr[0] , arr[random] 번지 교환
			int tmp = arr[i];  //0번지의 값 tmp 이동
			arr[i] = arr[random];
			arr[random] = tmp;
			
		}
		System.out.println("--- 섞은 후 ---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();//줄바꿈
		
		//오름차순 정렬 : 작은수부터 앞으로 오게 정렬 
		//내림차순 정렬 : 큰 수부터 앞으로 오게 정렬
		// 5 3 9 6 1 4 7 8 2 10
		// 3 5 9 6 1 4 7 8 2 10
		// 1 5 9 6 3 4 7 8 2 10 pass1
		// 1 3 9 6 5 4 7 8 2 10
		// 1 2 9 6 5 4 7 8 3 10 pass2
		// 1 2 6 9 5 4 7 8 3 10
		// 1 2 5 9 6 4 7 8 3 10
		// 1 2 4 9 6 5 7 8 3 10
		// 1 2 3 9 6 5 7 8 4 10 pass3
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("--오름차순정렬 후--");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("--내림차순정렬 후--");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
