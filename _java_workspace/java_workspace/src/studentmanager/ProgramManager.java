package studentmanager;

import java.util.Scanner;

public class ProgramManager implements Program{
	
	//멤버변수 student class , stdCount변수
	private Student[] std = new Student[5];
	private int stdCount;  //등록한 학생 카운트

	@Override
	public void printStudent() {
		System.out.println("-----전체 학생 정보-----");
		for(int i=0; i<stdCount; i++) {
			std[i].stdPrint(); //학생정보만 출력
			//printStudentOne(std[i]); //학생정보+수강정보
			System.out.println("---------------------");
		}
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 1명의 학생정보 값을 입력받아 객체를 생성한 후 std 배열에 등록
		// 학번, 이름, 주민번호, 학부, 학과
		System.out.println("--학생정보 입력--");
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("학번>");
		String sNum = scan.next();
		System.out.println("주민번호>");
		String rNum = scan.next();
		System.out.println("학부>");
		String faculy = scan.next();
		System.out.println("학과>");
		String major = scan.next();
		System.out.println("-------------");
		
		//입력받은 값으로 객체를 생성
		Student s = new Student(sNum, name, rNum, faculy, major);
		//배열이 다 찼다면 더 큰 배열을 생성 후 배열복사
		if(stdCount == std.length) {
			Student[] tmp = new Student[stdCount+5];//새배열
			System.arraycopy(std, 0, tmp, 0, stdCount);
			std = tmp;
		}
		
		//std 배열에 등록
		std[stdCount]=s;
		stdCount++; //인원증가(배열 번지 증가)
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 검색할 학생이름을 입력받아 배열에서 탐색 후 있다면 
		//학생정보+수강정보 출력 => printStudentOne() 호출
		System.out.println("검색할 이름 입력>");
		String searchName = scan.next();
		int index =-1; //찾은 학생의 배열주소 입력
		//전체 탐색
		for(int i=0; i<stdCount; i++) {
			if(std[i].getStdName().equals(searchName)) {
				printStudentOne(std[i]);
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("검색한 이름이 없습니다.");			
		}
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 수강신청을 하고자하는 학생의 이름/학번을 입력받기
		int index = -1;
		System.out.println("수강신청 학생명>");
		String name = scan.next();
		// 그 학생의 배열에 위치 체크
		for(int i=0; i<stdCount; i++) {
			if(name.equals(std[i].getStdName())) {
				index = i;
				break;
			}
		}
		// 학번이 없다면...
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			// 신청할 과목의 객체 생성(과목정보 입력받기)
			System.out.println("수강신청 과목번호>");
			String sNum = scan.next();
			System.out.println("수강신청 과목명>");
			String sName = scan.next();
			System.out.println("수강신청 학점>");
			double sPoint = scan.nextDouble();
			//객체 생성
			Subject sb = new Subject(sNum, sName, sPoint);
			// 신청메서드 호출 insertSubject(객체)
			std[index].insertSubject(sb);	
		}
		
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		int index=-1;
		System.out.println("수강철회 학생명>");
		String name = scan.next();
		// 그 학생의 배열에 위치 체크
		for(int i=0; i<stdCount; i++) {
			if(name.equals(std[i].getStdName())) {
				index = i;
				break;
			}
		}
		// 학번이 없다면...
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			// 신청할 과목의 (과목명 입력받기)
			System.out.println("수강철회 과목>");
			String sName = scan.next();
			// 신청메서드 호출 deleteSubject(과목명)
			std[index].deleteSubject(sName);	
		}

	}
	
	//1명의 학생정보+수강정보를 같이 출력하고 싶을 때
	public void printStudentOne(Student s) {
		System.out.println("--학생정보--");
		s.stdPrint();
		System.out.println("--수강정보--");
		s.subPrint();
	}

}
