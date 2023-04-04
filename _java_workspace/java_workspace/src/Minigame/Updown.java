package Minigame;

import java.util.Scanner;

public class Updown {
	Scanner scan = new Scanner(System.in);

	public void exe() {
		System.out.println();
		System.out.println("-----Updown게임-----");
		
		System.out.println("==룰 설명==");
		System.out.println("컴퓨터가 1~50사이의 랜덤숫자를 생성합니다.");
		System.out.println("플레이어는 숫자를 입력하여 컴퓨터가 만든 숫자를 맞춥니다.");
		System.out.println("플레이어의 숫자가 컴퓨터의 숫자보다 클 경우 Up");
		System.out.println("플레이어의 숫자가 컴퓨터의 숫자보다 낮을 경우 Down을 출력합니다");
		System.out.println("7번안에 맞추지못하면 플레이어의 패배입니다.");
		System.out.println();
		
		while(true) {
		int num = (int) (Math.random()*50+1);
		int sc = 0, count = 0;
		System.out.println("게임시작!");
		System.out.println("컴퓨터가 랜덤 수를 생성하였습니다. ");
		do {
			System.out.print("1~50사이 숫자를 입력해주세요 : ");
			sc = scan.nextInt();
			count ++;
			if(sc<0 || sc>50) {
				System.out.println("1~50사이 숫자가 아닙니다.");
			}
			else if(num > sc) {
				System.out.println("UP");
				System.out.println("총 입력한 횟수 : "+count);
			}
			else if(num < sc){
				System.out.println("DOWN");
				System.out.println("총 입력한 횟수 : "+count);

			}
			else {
				System.out.println("입력한 "+ num + "이(가) 정답입니다.");
				System.out.println("총 입력한 횟수 : "+count);
				break;
			}
			if(count>6) {
				System.out.println("7회를 넘겨 플레이어의 패배입니다.");
				break;
			}
		}
		while(sc!=num);
		System.out.println();
		System.out.println("한판 더 하기 (Any key) / 메뉴로 나가기 (N/n)");
		String abc = scan.next();
		if(abc.equals("N") || abc.equals("n")) {
			return;
			}
		}
	}

}