package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// map에 상품명과 가격을 입력받고, 출력 
		// 총 지불가격 출력
		// 입력 -> 메서드로, 출력 ->메서드로 구현
		HashMap<String, Integer> map = new HashMap<>();
		MapEx02 ex02 = new MapEx02();
		ex02.make(map);
		ex02.print(map);
		
	}
	//입력메서드
	public void make(HashMap<String, Integer> map) {
		int size = 3;
		while(map.size()<size) {
			System.out.println("상품명:");
			String product = scan.next();
			System.out.println("가격:");
			int price = scan.nextInt();
			
			map.put(product, price);
		}
	}
	
	
	//출력메서드
	public void print(HashMap<String, Integer> map) {
		
		Iterator<String> it = map.keySet().iterator();
		int sum=0;
		while(it.hasNext()) {
			String key = it.next(); // key반환
			Integer value = map.get(key); //value반환
			sum+=value;
			System.out.println(key+":"+value);
		}
		System.out.println("합계:"+sum);
	}
	
}
