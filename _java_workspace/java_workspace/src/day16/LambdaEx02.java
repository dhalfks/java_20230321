package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class LambdaEx02 {

	public static void main(String[] args) {
		/* Stream(스트림) : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * 요소가 하나씩 흘러가는 형태로 처리
		 * 스트림을 생성하여 연산을 수행하면 스트림은 소모가 됨.
		 * 재사용 불가 -> 다른 연산을 하려면 스트림을 다시 생성해야 됨.
		 * 스트림 연산은 기존 자료를 변경하지 않음.
		 * 중간연산 : filter(조건에맞는 요소 추출), distinct(중복제거), sorted(정렬), map(추출) 
		 * 최종연산 : sum(), forEach(), reduce(계산)
		 * 
		 * */
		Stream<Integer> integerStream1 = Stream.of(1,2,3,4,5,6,7,8,9);
		
		int[] arr = {1,2,3,4,5};
		long cnt = Arrays.stream(arr).count();
		System.out.println(cnt);
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		OptionalDouble avg =  Arrays.stream(arr).average();
		System.out.println(avg);
		
		//성적배열 a에서 70점이상인 점수만 합계
		int[] a = {50, 78, 89, 68, 54, 94, 81};
		int sum1 = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>=70) {
				sum1 += a[i];
			}
		}
		System.out.println("java로 구현한 sum : "+sum1);
		
		int sum2 = Arrays.stream(a).filter(b->b>=70).sum();
		System.out.println("stream으로 구현한 sum : "+sum2);
		
		//리스트로 성적리스트를 생성하고
		//스트림을 생성한 후 70이상인 점수만 합계
		ArrayList<Integer> list = new ArrayList<>();
		list.add(78);
		list.add(89);
		list.add(94);
		list.add(50);
		list.add(30);
		
		int listSum = list.stream().filter(b->b>=70)
				.mapToInt(n->n.intValue()).sum();
		System.out.println("list 합계");
		System.out.println(listSum);
		
		Stream<Integer> s = list.stream();
		s.filter(b->b>=70).forEach(System.out::println);
		
		Stream<Integer> s1 = list.stream();
		int s1Sum = s1.mapToInt(n->n.intValue()).filter(b->b>=70).sum();
		System.out.println(s1Sum);
	}

}
