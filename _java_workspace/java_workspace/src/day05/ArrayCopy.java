package day05;

public class ArrayCopy {

	public static void main(String[] args) {
		/* 3개의 값을 담을수 있는 String 배열 생성후 
		 * 국어, 영어, 수학이라는 글자를 담은 후 출력(향상된 for문으로 출력)
		 * */
		/* 배열은 길이를 가지고 있음. 
		 * 한번 정해진 길이는 이후 추가/삭제가 불가능.
		 * 배열의 길이를 늘리거나, 줄이고 싶을 경우 배열복사 ArrayCopy를 이용
		 * */
		//arr[0]="국어";
		
		//int arr[] = new int[3]; //숫자배열
		String arr[] = new String[3];
		arr[0]="국어";
		arr[1]="영어";
		arr[2]="수학";
		
		for(String tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		//사회, 과학 추가
		String arr2[] = new String[6];
		for(String tmp : arr2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println(arr);
		System.out.println(arr2);
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		for(String tmp : arr2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		//arrayCopy를 이용한 방법
		String arr3[] = new String[arr.length*2]; //기존 arr배열보다 2배 많은 크기
		//System.arraycopy(복사할 배열, 시작번지, 새배열, 시작번지, 개수);
		System.arraycopy(arr, 0, arr3, 1, arr.length);
		for(String tmp : arr3) {
			System.out.print(tmp+" ");
		}
		
	}

}
