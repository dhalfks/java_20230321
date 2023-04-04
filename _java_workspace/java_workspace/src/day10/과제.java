package day10;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* Product 클래스 : 상품을 등록하는 클래스
		 * 상품명, 가격
		 * 상품등록 메서드 => insertProduct
		 * 출력메서드
		 * */
		
		/* ProductMain
		 * product 배열 생성 [10]
		 * 
		 * 상품등록 후 리스트 출력
		 * * 스케너를 통해서 상품 등록.
		 * 
		 * 상품을 등록하시겠습니까? (y/n)
		 * y => 상품등록 반복  / n=> 그만
		 * 상품이름과 가격을 등록받아 상품 배열에 등록.
		 * 
		 * n => 등록된 제품 리스트 출력
		 * 클럽에 제출
		 * */
		
		Product[] p = new Product[10];
		Scanner scan = new Scanner(System.in);
		
		char menu = 'y';
		int cnt=0; // p객체의 index 핸들링하기 위한 변수
		int sum=0;
		while(menu != 'n') {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			menu = scan.next().charAt(0);
			
			if(menu == 'y') {
				System.out.println("상품명 > ");
				String name = scan.next();
				
				System.out.println("가격 > ");
				int price = scan.nextInt();
				//생성자를 이용하여 객체 생성 후 배열에 객체 담기
//				Product tmp = new Product(name, price);
//				p[cnt]= tmp;
				//입력받은 값을 바로 합계
//				sum = sum+ price;
				//insertProduct 메서드를 활용하여 객체 생성 후 등록
				p[cnt] = new Product();
				p[cnt].insertProduct(name, price);
				
				cnt++;  //index 증가				
			}else {
				if(menu == 'n') {
					System.out.println("상품등록 종료!!");
				}else {
					System.out.println("y/n만 입력가능합니다.");					
				}
			}
		}
		
		System.out.println("--등록된 제품 리스트--");
		for(int i=0; i<cnt; i++) {
			//toString 사용한 경우
			System.out.println((i+1)+"번째 상품 : "+p[i]);
			sum=sum+p[i].getPrice();
			//메서드 사용한 경우
			//p[i].출력 메서드명
		}
		
		System.out.println(cnt+"개의 상품 총 합계:"+sum+"원");
		
		
		
		
		
		scan.close();

	}

}
