package Team;

import java.util.Scanner;

public class TeamMain {
	
	public static void main(String[] args) {
	
		CafeInfo ca = CafeInfo.getCafeInfo();
		Cafe cafe; //cafe객체 선언만 해줌.
		Play p = new Play();
				
		RestaurantList restaurantList = new RestaurantList();
		Restaurant restaurant = restaurantList.getRandomRestaurant();
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘 데이트 장소는 어디인가요?(ㅇㅇ동)");
		String dong = sc.next();
		int b = dong.length()-1;
		if (dong.charAt(b) !='동') {
			dong= dong+"동";
		}
	
		int c= (int)(Math.random()*10);
		boolean tt = false;
		String w;
		switch (c) {
			case 1: case 2:
				w="비가 내리네요";
				break;
			case 3:
				w="눈이 오네요";
				break;
			case 4:
				w="구름이 많네요";
				break;
			default :
				w="화창하네요";
				tt= true;
		}
		
		System.out.println("오늘 "+dong+"은 "+w);
		if(tt == true) {
			System.out.println("실외 데이트를 추천드려요");
		}else {
			System.out.println("실내 데이트를 추천드려요");
		} 
		System.out.println();
		System.out.println("데이트 코스를 짜려면 아무키나 눌러주세요");
		String rarara = sc.next();
		String re="1";
		String tt1 ,tt2,tt3;
		
		while (!re.equals("0")) {
			
			System.out.println("---------------------------------");
			restaurant = restaurantList.getRandomRestaurant();			
			System.out.println(dong+" 인기 맛집");
			System.out.println("["+restaurant.RestaurantName+"]");
			System.out.println("대표메뉴 : "+restaurant.RestaurantMenu);
			System.out.println();

			System.out.println(dong+" 인기 카페");
			cafe = ca.random();  //계속해서 새로운 값을 가져오기 위해서 random 메서드 호출
			
			System.out.println("["+cafe.getName()+"]");
			System.out.println("대표메뉴 : " +cafe.getMenu()+" "+cafe.getPrice()+"원");
			System.out.println();
			
			
			tt1 = p.getPlay(tt);
			do {
				tt2 = p.getPlay(tt);
				tt3 = p.getPlay(tt);	
			}
			while (tt1.equals(tt2)||tt2.equals(tt3)||tt3.equals(tt1));
			
			System.out.println("맛집 주변 놀거리!");
			
			System.out.println(tt1+" ("+(int)(Math.random()*5+1)+"분거리)");
			System.out.println(tt2+" ("+(int)(Math.random()*4+5)+"분거리)");
			System.out.println(tt3+" ("+(int)(Math.random()*5+9)+"분거리)");
			
			System.out.println();
			System.out.println("다른 맛집을 원하시면 아무키나 눌러주세요 (종료:0)");
			re = sc.next();
		}
		
		sc.close();
		
	}

}