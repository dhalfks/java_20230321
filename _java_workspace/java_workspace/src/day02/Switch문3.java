package day02;

public class Switch문3 {

	public static void main(String[] args) {
		/* 계절을 출력
		 * 1~12월까지 랜덤으로 생성 후  월과 계절을 출력
		 * 3~5:봄, 6~8:여름, 9~11:가을, 12~2:겨울
		 * 
		 * case가 여러가지일 경우 case 1: case2: case3: =>  가능
		 * (1) || (2)  => or 둘중 하나의 조건만 맞으면 true
		 * (1) && (2)  => and 둘다 맞아야 true
		 *  !(true)  => not 조건의 반대 
		 * */
		
		int month = (int)(Math.random()*12)+1; // +1이 없으면 0~11
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println(month+"월의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(month+"월의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month+"월의 계절은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println(month+"월의 계절은 겨울입니다.");
			break;
		}
		
		
		if(month >=3 && month <=5) {
			System.out.println(month+"월의 계절은 봄입니다.");
		}else if(month >=6 && month <=8) {
			System.out.println(month+"월의 계절은 여름입니다.");
		}else if(month>=9 && month <=11) {
			System.out.println(month+"월의 계절은 가을입니다.");
		}else if(month==12 || month ==2 || month ==1) {
			System.out.println(month+"월의 계절은 겨울입니다.");
		}else {
			System.out.println(month+"그런 월은 없네요.");
		}
		

	}

}
