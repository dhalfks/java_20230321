package Minigame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
class Idiom {
	HashMap<String, String> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	int cont;
	int score = 0;
	public void put() {
		map.put("죽마", "고우");
		map.put("수어", "지교");
		map.put("각골", "난망");
		map.put("군계", "일학");
		map.put("격세", "지감");
		map.put("고진", "감래");
		map.put("환골", "탈태");
		map.put("괄목", "상대");
		map.put("과유", "불급");
		map.put("동분", "서주");
		map.put("금의", "환향");
		map.put("일자", "무식");
		map.put("노심", "초사");
		map.put("일석", "이조");
		map.put("다다", "익선");
		map.put("역지", "사지");
		map.put("주객", "전도");
		map.put("대기", "만성");
		map.put("대동", "소이");
		map.put("마이", "동풍");
		map.put("우이", "독경");
		map.put("화룡", "점정");
		map.put("사필", "귀정");
		map.put("오합", "지졸");	
		map.put("청천", "벽력");	
	}
	public void  exe() {
		System.out.println("사자성어 게임입니다. 제시어가 나오면 뒷 글자 2개를 이어 입력해주세요.");
		System.out.println("1. 게임 시작");
		System.out.println("2. 게임 종료");
		cont = sc.nextInt();
		switch(cont) {
		case 1:
			while(cont == 1) {
				System.out.println(" ___    _                _   ");
				System.out.println("/ __> _| |_  ___  _ _  _| |_ ");
				System.out.println("\\__ \\  | |  <_> || '_>  | |  ");
				System.out.println("<___/  |_|  <___||_|    |_|  ");
				score = 0;
				map.clear();
				put();
				idiomGame();
			}	
		case 2:
			System.out.println("게임을 종료합니다.");
			break;
		}
		if(score == map.size()) {
			System.out.println("만점입니다!!");
		} else {
			System.out.println("점수는: " + score);
		}
		
	}
	  public int idiomGame() {
		List keys = new ArrayList(map.keySet());
		Collections.shuffle(keys);
		for (Object o : keys) {
		    map.get(o);
		    System.out.print(o + " O O: ");
			String ans = sc.next();
			if(map.get(o).equals(ans)) {
				score += 1;
			} else {
				System.out.println(" ___  ___ ._ _ _  ___  ___  _ _  ___  _ _"); 
				System.out.println("/ . |<_> || ' ' |/ ._>/ . \\| | |/ ._>| '_>");
				System.out.println("\\_. |<___||_|_|_|\\___.\\___/|__/ \\___.|_|");  
				System.out.println("<___'");        
				System.out.println(o + map.get(o));
				break;
			}
		}
		System.out.println("총 점수는: " + score + "입니다. 다시 게임을 시작하시겠습니까?");
		System.out.println("1. 게임 시작");
		System.out.println("2. 게임 종료");
		cont = sc.nextInt();
		return score;
	}
}
