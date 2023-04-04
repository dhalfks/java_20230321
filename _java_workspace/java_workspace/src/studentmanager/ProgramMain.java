package studentmanager;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		/* - 메뉴구성 
			1. 학생등록
			2. 학생확인(학생리스트)
			3. 학생검색(한학생의 정보가 출력 - 학생정보, 수강정보 같이 출력)
			4. 수강신청
			5. 수강철회
			6. 종료
		 * */
		
		ProgramManager pm = new ProgramManager();
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		do {
			
			//메뉴 넣기
			System.out.println();
			System.out.println("--menu--");
			System.out.println("1.학생등록|2.학생확인|3.학생검색");
			System.out.println("4.수강신청|5.수강철회|6.종료");
			System.out.println("메뉴선택>");
			//메뉴 값 입력받기
			menu = scan.nextInt();
			
			//메뉴에 대한 분기 구현
			switch(menu) {
			case 1: pm.insertStudent(scan);
				break;
			case 2: pm.printStudent();
				break;
			case 3: pm.searchStudent(scan);
				break;
			case 4: pm.registerSubject(scan);
				break;
			case 5: pm.deleteSubject(scan);
				break;
			case 6:	break;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu!=6);
		
		System.out.println("프로그램 종료");
		scan.close();

	}

}
