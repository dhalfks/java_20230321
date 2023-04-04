package geine;
import java.util.Scanner;
public class Tv {
	boolean power;
	int vol;
	int ch;
	public Tv() {
		System.out.println("---MENU---");
		System.out.println("1.VOL UP");
		System.out.println("2.VOL DOWN");
		System.out.println("3.CH UP");
		System.out.println("4.CH DOWN");
		System.out.println("5.TV OFF");
		System.out.println("----------");
		turnOn();
		a:while (true) {


			System.out.print("[TV]▶ 메뉴를 선택해주세요 >> ");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			switch (n) {
			case 1:
				volUp();
				break;
			case 2:
				volDown();
				break;
			case 3:
				chUp();
				break;
			case 4:
				chDown();
				break;
			case 5:
				turnOff();
				break a;
			}
		}
	}
	public void volUp() {
// TODO Auto-generated method stub
		vol++;
		if (vol > 20) {
			vol = 0;
		}
		System.out.println("볼륨:" + vol);
	}
	public void volDown() {
// TODO Auto-generated method stub
		vol--;
		if (vol < 0) {
			vol = 20;
		}
		System.out.println("볼륨:" + vol);
	}
	public void chUp() {
		ch++;
		if (ch > 99) {
			ch = 0;
		}

		System.out.println("채널:" + ch);
	}
	public void chDown() {
		ch--;
		if (ch < 0) {
			ch = 99;
		}
		System.out.println("채널:" + ch);
	}
	public void turnOn() {
// TODO Auto-generated method stub
		System.out.println("TV가 켜졌습니다.");
		power = true;
	}
	public void turnOff() {
// TODO Auto-generated method stub
		System.out.println("TV가 꺼졌습니다.");
		power = false;
	}
}