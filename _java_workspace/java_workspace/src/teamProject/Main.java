package teamProject;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Menu Menu = new Menu(scanner);
		Menu.clear_scroll();
		Menu.mainUI();
		
		scanner.close();
	}
}
