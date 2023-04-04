package 조별과제;

import java.text.SimpleDateFormat;
import java.util.Date;

public class colorFortune {

	public colorFortune() {}
	
	public void todayColoFortune(String fortuneBrithdate, int birthSum) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		String dateString = sdf.format(date);					//오늘 일자를받음
		
		int today = Integer.parseInt(dateString);
		int month = Integer.parseInt(fortuneBrithdate.substring(4,6));
		
		int todayColor = 0 ;
		
		todayColor = (birthSum % today) + month ;
		
		while(todayColor > 15) {
			todayColor = todayColor - 5;
		}
		
		System.out.print("♥ 오늘의 색 : ");
		switch(todayColor) {
		case 1 :
			System.out.println(" 갈색 "); break;
		case 2 :
			System.out.println(" 검정 ");break;
		case 3 :
			System.out.println(" 빨강 ");break;
		case 4 :
			System.out.println(" 노랑 ");break;
		case 5 :
			System.out.println(" 파랑 ");break;
		case 6 :
			System.out.println(" 보라 ");break;
		case 7 :
			System.out.println(" 라벤더 ");break;
		case 8 :
			System.out.println(" 베이지 ");break;
		case 9 :
			System.out.println(" 분홍 ");break;
		case 10 :
			System.out.println(" 연두 ");break;
		case 11 :
			System.out.println(" 주황 ");break;
		case 12 :
			System.out.println(" 하늘 ");break;
		case 13 :
			System.out.println(" 민트 ");break;
		case 14 :
			System.out.println(" 회색 ");break;
		case 15 :
			System.out.println(" 흰색 ");break;
			
		}
	}
}
