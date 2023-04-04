package Minigame;


import java.util.Scanner;


public class BaskinRobbins {
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
		System.out.println("⠀  ⠀⠀⠀⠀⠀⢀⣠⡴⠖⣛⠛⠉⠉⠙⠛⠳⠦⣤⡀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀  ⠀⠀⠀⢀⡴⢛⣅⠀⠀  ⠀⠀⠀⡜⡝⠀⠀⠙⢷⣄⠀⠀⠀⠀");
		System.out.println("  ⠀⠀⠀⢠⠟⣴⡫⠚⠀⠀   ⠀⠘⠜⠀⠀  ⡻⠙⣦⠀⠀⠀");
		System.out.println("  ⠀⠀⢠⠏⠀⠀⠀⠀⠀⢀⡀⠀⠀ ⠀⠀⠀⠀   ⠀⠀⠘⣇⠀⠀");
		System.out.println("  ⠀⠀⣿⣤⣖⣺⠇⠀⡠⣫⠃⠀   ⠀⠀⣀⡀⠀⠯⣓⢤⢹⠀⠀");
		System.out.println("  ⠀⢰⡇⠈⠁⠀⠀⠀⠙⠁⠀⠀⠀⠀ ⠀ ⠀⢧⢧⠀⠀⠈⠉⢸⡇⠀");
		System.out.println("  ⢠⢟⡞⡷⠀  ⠀⠀⠀⢖⢦⠀⠀⠀ ⠀⠘⠚⠀⠀⠀⢾⢦⢳⡄");
		System.out.println("  ⡟⠸⠜⠁⠀⠀  ⠀⠀⠀⠳⠕⠀      ⠀⠀⠈⠯⠇⢻");
		System.out.println("  ⠳⣄⣀⣀⣤⣄⣀⣀⣀⣠⠤⠤⠤⣄⣀⠀⠀⣀⣠⠤⠤⣄⣀⣠⡞");
		System.out.println("⠀⠀  ⠀⠸⡆⠀⠀⠙⡇⠀⠀⠀⠀⡇⠈⠉⠉⢱⠃⠀⠀ ⢀⡟⠉⠁⠀");
		System.out.println("⠀⠀  ⠀⠀⢻⡤⠤⠤⣧⠤⠤⠤⠤⡧⠤⠤⠤⣼⠤⠤⠤⣼⠁⠀⠀⠀");
		System.out.println("⠀⠀  ⠀⠀⠈⣧⠀⠀⢸⠀⠀⠀⠀⡇⠀⠀⠀⡇⠀ ⠀⢰⠇⠀⠀⠀⠀");
		System.out.println("⠀⠀  ⠀⠀⠀⠸⡦⠤⠬⡧⠤⠤⠤⡧⠤⠤⢼⠥⠤⢤⡟⠀⠀⠀⠀⠀");
		System.out.println("=========================31게임=========================");
		System.out.println("먼저, 이 게임은 유저와 진행자(컴퓨터) 2명으로 진행됩니다.");
		System.out.println("< 진행방법 >");
		System.out.println("1. 유저와 진행자(컴퓨터)는 차례를 정해 1부터 31까지의 수를 순차적으로 부르세요.");
		System.out.println("2. 한번에 1~3개까지 수를 연달아 부를 수 있습니다.");
		System.out.println("3. 마지막 31을 부른 사람이 패배하는 게임입니다.");
		System.out.println("4. 승리를 위해 머리를 써보세용");
		System.out.println("=======================================================");
	}
	
	
	//게임 진행
	public static void play() {
		
		int[] game = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		int lastOrder=0; //게임진행 중 마지막으로 선언된 game[]의 번지수
		System.out.println("========================<게임 시작>=======================");
		System.out.println("유저 선입니다! 부를 숫자의 개수를 입력하시면 됩니당 > ");
		
		a:
		while(true) {
			int userNum = scan.nextInt();
			int comNum = (int)(Math.random()*3+1);
			
			
			//잘못된 값을 넣는 경우
			if(userNum<1 || userNum>3) {
				System.out.println("잘못된 값을 입력하셨습니다ㅠㅠ.1~3사이의 값을 넣어주세요");
				continue;
			} 
		
			//유저의 차례
			System.out.println(userNum+"개/"+ "부른 숫자:");
			for(int i=lastOrder; i<(lastOrder+userNum); i++) {
				if(i < 30) {
					System.out.print(game[i]+" ");
				} else if(i>=30){
					System.out.println(" ___  ___ ._ _ _  ___  ___  _ _  ___  _ _"); 
					System.out.println("/ . |<_> || ' ' |/ ._>/ . \\| | |/ ._>| '_>");
					System.out.println("\\_. |<___||_|_|_|\\___.\\___/|__/ \\___.|_|");  
					System.out.println("<___'");   
					System.out.println(game[i] + "! 유저가 패배하였습니다! 다음에 도전해보세요ㅠㅠ");
					break a;
				}
			
			} 
			lastOrder += userNum;	

			
			//컴퓨터의 차례
			System.out.println();
			System.out.println("컴퓨터의 차례 >");
			System.out.println(comNum+"개/부른 숫자:");
					
			for(int i=lastOrder; i<(lastOrder+comNum); i++) {
				if(i < 30) {
					System.out.print(game[i]+" ");
				} else if(i>=30){
					System.out.println(game[i] + "! 유저의 승리!축하합니당!");
					System.out.println(" _ _  _   __  ___   _   ___ __ __     ");
					System.out.println("| | || | / _||_ _| / \\ | o \\\\ V /  ");
					System.out.println("| V || |( (_  | | ( o )|   / \\ /     ");
					System.out.println(" \\_/ |_| \\__| |_|  \\_/ |_|\\\\ |_| ");
					break a;
				}
			}
			lastOrder += comNum;				
			
			System.out.println();
			System.out.println("-------------------------------");
			System.out.println("유저의 차례 > ");

		}
	}	
		
}
