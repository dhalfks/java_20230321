package day04;

public class 배열1 {

	public static void main(String[] args) {
		/* 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집합 (참조변수)
		 * - 배열 선언 방법
		 * 타입[] 배열이름;
		 * 타입 배열이름[];
		 * - 선언 & 초기화
		 * 타입[] 배열이름 = new 타입[길이]; //가장 일반적인 방법
		 * 타입[] 배열이름 = new 타입[]{값, 값, 값, 값, 값};
		 * 타입[] 배열이름 = {값, 값, 값, 값}; //선언과 동시에 초기화 할때만 가능
		 * - 배열의 길이는 0이상이여야 한다. -는 안됨.
		 * - 배열의 시작번지는 0부터 시작
		 * 배열[3] => 0 1 2
		 * 
		 * */
		
		int[] arr1;
		arr1=new int[3]; //초기값 0
		int[] arr2 = new int[5]; //초기값 0
		int arr3[];
		arr3 = new int[] {1,2,3,4,5};
		
		int arr4[]= {1,2,3,4,5};
		
		/* 배열을 사용하는 이유 
		 * 반복문을 이용할 수 있기 때문에 편리함
		 * 관리가 쉽다.
		 * 배열의 마지막 번지는 총길이 -1
		 * 배열의 총길이를 구하는 메서드 .length
		 * */
		System.out.println(arr3); //주소가 찍힘.
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println("--arr2 출력");
		arr2[0]=10;
		System.out.println(arr2[0]);
		arr2[1]=20;
		System.out.println(arr2[1]);
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=(i*10)+10;
			System.out.print(arr2[i]+" ");
		}
		
		//arr1배열에 1,2,3값을 저장하고, 출력하시오.
		arr1[0]=1; //배열에 값을 저장
		arr1[1]=2;
		arr1[2]=3;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=i+1;
			System.out.println(arr1[i]);
		}
		
	}

}
