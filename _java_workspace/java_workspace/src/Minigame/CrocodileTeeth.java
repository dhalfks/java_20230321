package Minigame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrocodileTeeth {
	static Scanner scan = new Scanner(System.in);
 
	public void exe() {
		int cho=1;
		
		printExplan();
		while(cho != 2) {
			System.out.println("1. 🎲 게임 시작");
			System.out.println("2. 🖐 게임 종료");
			
			cho = scan.nextInt();
			switch(cho) {
			case 1 : 
				System.out.println(" ___    _                _   ");
				System.out.println("/ __> _| |_  ___  _ _  _| |_ ");
				System.out.println("\\__ \\  | |  <_> || '_>  | |  ");
				System.out.println("<___/  |_|  <___||_|    |_|  ");
				play(); break;
			case 2 : System.out.println("전체 메뉴로 돌아갑니다. 다음에 또 만나용~! 🖐"); break;
			default :System.out.println("잘못된 값을 넣으셨습니다. 1~2중 선택해주세용"); continue;
			}
		}
	}
	//게임 설명
		public static void printExplan() {
			System.out.println("⠀  ⠀⠀⠀⣠⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀　　　　　");
			System.out.println("⠀⠀  ⠀⣰⣿⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀　　　　　");
			System.out.println("⠀  ⠀⢰⣿⡟⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀　　　　　　　　　　　　　　　　");
			System.out.println("⠀  ⠀⣾⣿⡿⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀　　　　　　");
			System.out.println("  ⠀⠀⣿⣿⣿⡶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣶⣶⠀⠀　 ");
			System.out.println("⠀  ⠀⢻⣿⣿⣿⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡟⠋⠀ 　");
			System.out.println("  ⠀⠀⠈⢿⣿⣿⣿⣦⣴⠀⠀⠀⠀⠀⠀⠀⠀⣀⢀⣄⢀⣿⣿⣿⣿⡛⡟⠻⠋⠙⠁⠉⠀⠀⠀ 　");
			System.out.println("⠀⠀  ⠀⠨⢿⣿⣿⣿⣿⣶⣾⣧⣼⣧⣤⣿⣶⣿⣾⣿⣿⣿⣿⢿⣿⣷⣶⣤⣄⢀⡀⠀⠀⠀⠀　");
			System.out.println("  ⢀⣴⣝⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣀⠈⠉⠛⠛⠻⠿⠷⠿⠶⠀　   ");
			System.out.println("⠀  ⠙⠛⠿⠟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⡗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀　　   ");
			System.out.println("⠀⠀  ⠀⠀⠀⢽⣿⣿⡿⠋⠙⠛⠛⠛⠛⠛⠋⠉⠀⠙⠿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀　　　");
			System.out.println("⠀⠀  ⠀⠀⠀⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀　　　　");
			System.out.println("========================악어의 이빨를 눌러라!=========================");
			System.out.println("먼저, 이 게임은 유저와 진행자(컴퓨터) 2명으로 진행됩니다.");
			System.out.println("< 진행방법 >");
			System.out.println("1. 1부터~입력한 이빨의 수 까지의 이빨 중 랜덤으로 하나의 꽝 이빨이 정해집니다.");
			System.out.println("2. 유저와 진행자(컴퓨터)는 차례를 정해 순서대로 1부터 30까지의 숫자 중 하나의 숫자를 누릅니다.");
			System.out.println("3. 꽝 이빨을 누르는 사람이 패배합니다.");
			System.out.println("4. 단! 한번 불렀던 이빨의 번호를 다시 부를수는 없습니다.");
			System.out.println("   (부른 이빨은 0으로 표시 됩니다)");
			System.out.println("=============================================================");
		}

		//게임 진행
		public static void play() {
			
			//악어 이빨 수 넣기
			System.out.println("악어의 총 이빨 수를 입력해주세용!");
			int size = scan.nextInt();
			ArrayList<Integer> game = new ArrayList<>();
			for(int i=1; i<=size; i++) {
				game.add(i);
			}
			
			//당첨 악어이빨번호
			int goalNum = (int)(Math.random()*size+1);
			
			//첫번째 유저 넘버 오류 방지
			System.out.println("유저 선! 이빨의 숫자중 하나를 눌러주세요 > ");
			int userNum;
			while(true) {
				userNum = scan.nextInt();
				if(userNum>size || userNum<1) {
					System.out.println("1~"+size+" 안의 숫자를 다시 입력해주세요.");
					continue;
				} else {break;}
			}
			
			//진행
			a:
			while(true) {
				//컴퓨터 숫자 오류 방지
				int comNum = (int)(Math.random()*size+1);
				if (game.contains(comNum)==false) {
					continue;
				} else if (comNum == userNum) {
					continue;
				}	
				
				//유저 이빨 누르기
				System.out.println("🐊 "+userNum + "번의악어 이빨을 누릅니다! 꾸욱 ");
				if(userNum == goalNum) {
					System.out.println(" ___  ___ ._ _ _  ___  ___  _ _  ___  _ _"); 
					System.out.println("/ . |<_> || ' ' |/ ._>/ . \\| | |/ ._>| '_>");
					System.out.println("\\_. |<___||_|_|_|\\___.\\___/|__/ \\___.|_|");  
					System.out.println("<___'");   
					System.out.println("!!!꽝💣!!! 꽝이빨을 누르셨습니다. 유저의 패배!");
					System.out.println("다음에 한번 더 도전해 보실꺼죠~?");
					break a;
				} else {
					System.out.println("휴~ 패스~");
					game.set(userNum-1, 0);
				}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
				
				//컴퓨터 이빨 누르기
				System.out.println("🐊 컴퓨터는 " + comNum + "번의 악어 이빨을 눌렀습니다.");
				if(comNum == goalNum) {
					System.out.println(" _ _  _   __  ___   _   ___ __ __     ");
					System.out.println("| | || | / _||_ _| / \\ | o \\\\ V /  ");
					System.out.println("| V || |( (_  | | ( o )|   / \\ /     ");
					System.out.println(" \\_/ |_| \\__| |_|  \\_/ |_|\\\\ |_| "); 
					System.out.println("!!!꽝💣!!! 컴퓨터가 꽝이빨을 눌렀습니다.");
					System.out.println("유저의 승리입니다! 축하합니다!!");
					break a;
				} else {
					System.out.println("컴퓨터도 패스~");
					game.set(comNum-1, 0);
				}
				
				//턴 종료
				System.out.println("-------------------------------------");
				System.out.println("남은 이빨의 숫자:");
				for (int tmp : game) {
		            System.out.print(tmp + "  ");
		        }
				System.out.println();
				System.out.println("유저의 차례입니다. 남은 이빨의 숫자중 하나를 눌러주세요 > ");
				
				
				//유저 숫자 오류 방지
				while(true) {
					userNum = scan.nextInt();
					if(userNum <1 || userNum > size) {
						System.out.println("잘못입력하셨습니다.1~"+size+"까지의 수 중 입력해주세요.");
						continue;
					} else if(game.contains(userNum)==false){ 
						System.out.println("입력했던 이빨의 숫자입니다! 다시 입력해주세요");
						continue;
					} else {
						break;
					}
				}
				
			}
		}
}