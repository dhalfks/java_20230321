package teamProject;

import java.util.Scanner;

public class Menu {
	private Scanner scanner;

	Pokedex pokedex = new Pokedex();
	Game game = null;

	public Menu(Scanner scanner) {
		this.scanner = scanner;
	}

	// 메인화면 UI
	public void mainUI() {
		this.clear_scroll();

		System.out.println("===================================================================");
		System.out.println("                                  ,'\\\r\n"
				+ "    _.----.        ____         ,'  _\\   ___    ___     ____\r\n"
				+ "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\r\n"
				+ "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\r\n"
				+ " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\r\n"
				+ "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\r\n"
				+ "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\r\n"
				+ "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\r\n"
				+ "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\r\n"
				+ "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\r\n"
				+ "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\r\n"
				+ "                                `'                            '-._|");
		System.out.println("===================================================================");
		System.out.println("1. 포켓몬 키우기 | 2. 포켓몬 도감 | 0. 종료");
		System.out.print("입력 : ");

		char choice = scanner.next().charAt(0);
		switch (choice) {
		case '1':
			this.gameStartUI();
			break;
		case '2':
			this.pokedexUI();
			break;
		case '0':
			System.out.print("게임을 종료하시겠습니까? (Y/N) : ");
			choice = scanner.next().charAt(0);
			switch (choice) {
			case 'Y':
			case 'y':
				System.out.println("게임이 종료되었습니다.");
				System.exit(0);
				break;
			case 'N':
			case 'n':
				this.mainUI();
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 이전화면으로 돌아갑니다.");
				this.wait_second();
				this.mainUI();
				break;
			}
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 이전화면으로 돌아갑니다.");
			this.wait_second();
			this.mainUI();
			break;
		}
	}

	// 포켓몬 키우기 UI
	public void gameStartUI() {
		this.clear_scroll();

		System.out.println("포켓몬 키우기입니다.");
		System.out.print("원하는 포켓몬 이름을 입력해주세요 : ");
		String choice_pokemon = scanner.next();

		for (Pokemon temp : pokedex.list) {
			if (temp.name.equals(choice_pokemon)) {
				System.out.printf("- 도감번호 : %s, 이름 : %s, 타입 : %s\n", temp.number, temp.name, temp.type);
				temp.print();
				System.out.print("선택하신 포켓몬이 맞나요? (Y/N) : ");
				char choice_check = scanner.next().charAt(0);
				switch (choice_check) {
				case 'Y':
				case 'y':
					game = new Game();
					this.clear_scroll();
					this.gameMainUI();
					break;
				case 'N':
				case 'n':
					this.clear_scroll();
					this.gameStartUI();
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 이전화면으로 돌아갑니다.");
					this.wait_second();
					this.clear_scroll();
					this.gameStartUI();
					break;
				}
			}
		}

		System.out.println("없는 포켓몬입니다. 이전화면으로 돌아갑니다.");
		this.wait_second();
		this.clear_scroll();
		this.gameStartUI();
	}

	public void gameMainUI() {
		if (game.end()) {
			this.wait_second();
			this.mainUI();
		}
		game.levelUp();
		game.printInfo();

		System.out.println("1. 밥먹기 | 2. 잠자기 | 3. 산책하기 | 0. 종료");
		System.out.print("입력 : ");
		char choice = scanner.next().charAt(0);

		this.clear_scroll();

		switch (choice) {
		case '1':
			game.eat();
			this.gameMainUI();
			break;
		case '2':
			game.sleep();
			this.gameMainUI();
			break;
		case '3':
			game.walk();
			this.gameMainUI();
			break;
		case '0':
			System.out.print("게임을 종료하시겠습니까? (Y/N) : ");
			char exit_check = scanner.next().charAt(0);

			switch (exit_check) {
			case 'Y':
			case 'y':
				System.out.println("게임이 종료되었습니다. 이전화면으로 돌아갑니다.");
				this.wait_second();
				this.mainUI();
				break;
			case 'N':
			case 'n':
				this.gameMainUI();
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 이전화면으로 돌아갑니다.");
				this.wait_second();
				this.gameMainUI();
				break;
			}
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 이전화면으로 돌아갑니다.");
			this.wait_second();
			this.gameMainUI();
			break;
		}
	}

	// 포켓몬 도감 UI
	public void pokedexUI() {
		this.clear_scroll();

		int flag = 0;

		System.out.println("포켓몬 도감입니다.");
		System.out.println("1. 전체 확인 | 2. 이름 검색 | 0. 뒤로가기");
		System.out.print("입력 : ");

		char choice = scanner.next().charAt(0);
		switch (choice) {
		case '1':
			this.clear_scroll();
			System.out.println("===== 포켓몬 도감 (전체 확인) =====");

			for (Pokemon temp : pokedex.list) {
				System.out.printf("- 도감번호 : %s, 이름 : %s, 타입 : %s\n", temp.number, temp.name, temp.type);
			}

			System.out.print("계속하려면 Enter를 눌러주세요.");
			pause();
			pokedexUI();
			break;
		case '2':
			this.clear_scroll();
			System.out.println("===== 포켓몬 도감 (이름 검색) =====");
			System.out.print("이름 검색 : ");
			String search_name = scanner.next();

			for (Pokemon temp : pokedex.list) {
				if (temp.name.equals(search_name)) {
					System.out.printf("- 도감번호 : %s, 이름 : %s, 타입 : %s\n", temp.number, temp.name, temp.type);
					temp.print();
					flag++;
				}
			}

			if (flag == 0) {
				System.out.println("검색 결과가 없습니다.");
			}

			System.out.print("계속하려면 Enter를 눌러주세요.");
			pause();
			pokedexUI();
			break;
		case '0':
			this.mainUI();
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 이전화면으로 돌아갑니다.");
			this.wait_second();
			this.pokedexUI();
			break;
		}
	}

	// 콘솔창 초기화
	public void clear_scroll() {
		for (int i = 0; i < 100; i++) {
			System.out.println("");
		}
	}

	// n초 일시 정지 (출처 : 구글)
	public void wait_second() {
		try {
			Thread.sleep(2000); // 2초
		} catch (InterruptedException e) {

		}
	}

	// Enter 입력시 계속되게 (출처 : 구글)
	public void pause() {
		try {
			System.in.read();
		} catch (Exception e) {

		}
	}
}
