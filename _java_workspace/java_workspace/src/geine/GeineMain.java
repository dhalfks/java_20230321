package geine;
import java.util.*;
public class GeineMain {
	public static void main(String[] args) {
		System.out.println(" _________");
		System.out.println("/    |    \\");
		System.out.println("|    |    |	1.날씨");
		System.out.println("|    |    |	2.Netflix");
		System.out.println("|    |    |	3.TV채널");
		System.out.println("|    |    | 	4.종료");
		System.out.println(" GiGA Genie");
		System.out.println("\\_________/");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		a:while (true) {
			System.out.print("[GiGA Genie]▶ 메뉴를 선택해주세요 >>");
			int n = scan.nextInt();

			switch (n) {
			case 4: break a;
			case 1:
				Weather w = new Weather();
				break;
			case 2:
				Netflix net = new Netflix();
				break;
			case 3:
				Tv tv=new Tv();
				break;
			}
		}
		System.out.println("GiGA Genie를 종료하겠습니다.");
	}
}