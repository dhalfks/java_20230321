package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성 <String>으로 생성
		 * */
		ArrayList<String> list = new ArrayList<>();
		list.add("기상");
		list.add("출근");
		list.add("공부하기");
		list.add("점심시간");
		list.add("공부하기");
		list.add("퇴근");
		list.add("저녁시간");
		list.add("잠자기");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------");
		for(String tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("------------");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
			
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		list.sort(new Test());
		System.out.println(list);
		

	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//compareTo 메서드 활용
		return o2.compareTo(o1);
	}
	
}