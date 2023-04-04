package geine;
import java.util.*;
public class Netflix {
	HashMap<String, String> map = new HashMap<String, String>();
	Scanner scan = new Scanner(System.in);

	public Netflix() {
		print();
		a: while (true) {
			System.out.print("[NETFLIX]▶ 메뉴를 선택하세요 >> ");
			String num = scan.next();
			switch (num) {
			case "A":
				Top10();
				break;
			case "B":
				fullview();
				break;
			case "C":
				add();
				break;
			case "D":
				modify();
				break;
			case "E":
				delete();
				break;
			case "END":
				System.out.println("넷플릭스가 종료되었습니다.");
				break a;
			default:
				System.out.println("잘못된 버튼입니다.");
			}
		}
	}
	public void print() {
		System.out.println("----------Netflix-----------");
		System.out.println("A : 오늘 대한민국의 TOP 10 시리즈");
		System.out.println("B : 시청중인 콘텐츠");
		System.out.println("C : 시리즈 추가");
		System.out.println("D : 시리즈 수정");
		System.out.println("E : 시리즈 삭제");
		System.out.println("END : 넷플릭스 종료");
		System.out.println("----------------------------");
	}
	public void Top10() {
		System.out.println("----오늘 대한민국의 TOP 10 시리즈----");
		System.out.println("1.일타스캔들·유쾌발랄");
		System.out.println("2.나는신이다·범죄실화");
		System.out.println("3.철인왕후·유쾌발랄");
		System.out.println("4.더글로리·드라마");
		System.out.println("5.신성한이혼·드라마");
		System.out.println("6.빨간풍선·드라마");
		System.out.println("7.미스터선샤인·사극");
		System.out.println("8.용감한형사들·토크쇼");
		System.out.println("9.연애대전·로맨틱");
		System.out.println("10.나는SOLO·리얼리티시리즈");
		System.out.println("------------------------------");
	}
	// 시리즈 추가
	public void add() {
		System.out.println(">> 시리즈 제목과 장르를 입력해주세요. (ex: 더글로리 한국드라마 )");
		String contents = scan.next();
		String genre = scan.next();
		if (map.get(contents) == null) {
			map.put(contents, genre);
		} else {
			System.out.println(contents + "는 이미 존재합니다.");
		}
	}
	// 전체출력
	public void fullview() {
		System.out.println(">> 사용자님이 시청중인 콘텐츠");
		// 계정마다 다른 콘텐츠가 나왔으면 좋겠다.
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String contents = it.next();
			String genre = map.get(contents);
			System.out.println(contents + "·" + genre);
		}
	}
	// 시리즈 수정
	public void modify() {
		System.out.println(">> 수정할 시리즈 제목의 장르를 입력해주세요. ");
		String contents = scan.next();
		String genre = scan.next();
		map.put(contents, genre);
		System.out.println(contents + "가(이)" + genre + "로 변경되었습니다.");
	}
	// 성적 삭제
	public void delete() {
		System.out.println(">> 삭제할 시리즈를 입력해주세요.");
		String contents = scan.next();
		if (map.get(contents) == null) {
			System.out.println(contents + "는 없는 시리즈 입니다.");
		} else {
			map.remove(contents);
			System.out.println(contents + "시리즈가 삭제되었습니다.");
		}
	}
}