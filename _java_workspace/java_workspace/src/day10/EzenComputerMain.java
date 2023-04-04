package day10;

public class EzenComputerMain {

	public static void main(String[] args) {
		EzenComputer ec = new EzenComputer();
		ec.setName("홍길동");
		ec.setAge(20);
		ec.setBirth("2002-01-01");
		ec.setPhone("010-1111-1111");
		ec.setBranch("incheon");
		ec.printInfo();
		ec.printCompany();
		ec.insertCourse("java", "6개월");
		ec.insertCourse("html", "1개월");
		ec.insertCourse("DB", "1개월");
		ec.printCourse();
		System.out.println();
		
		EzenComputer ec1 = new EzenComputer("홍길순", "2001-01-01", 22, 
				"010-2222-2222", "seoul");
		ec1.printInfo();
		ec1.printCompany();
		ec1.insertCourse("java", "5개월");
		ec1.insertCourse("java 단과", "1개월");
		ec1.printCourse();
		
		/* 배열로 5명의 학생을 등록 후 
		 * - 학생 이름으로 검색
		 * - 지점명으로 검색
		 * */
		EzenComputer[] std = new EzenComputer[7];
		std[0]= new EzenComputer("홍길동", "010-777-1111", "인천");
		std[1]= new EzenComputer("홍길순", "010-333-1111", "서울");
		std[2]= new EzenComputer("강감찬", "010-222-1111", "인천");
		std[3]= new EzenComputer("유관순", "010-666-1111", "부천");
		std[4]= new EzenComputer("홍길동", "010-555-1111", "서울");
		std[5]=ec;
		std[6]=ec1;
		
		String searchName = "홍길동";  //홍길동의 지점정보 출력/개인정보 출력
		System.out.println(searchName+" search 정보 -------------------");
		for(int i=0; i<std.length; i++) {
			if(searchName.equals(std[i].getName())) {
				std[i].printInfo();
				std[i].printCompany();
			}
		}
		
		
		String searchBranch="서울"; //지점정보 / 개인정보 출력
		System.out.println(searchBranch+" Search 정보 -------------------");
		for(EzenComputer tmp : std) {
			if(tmp.getBranch().equals(searchBranch)) {
				tmp.printInfo();
				tmp.printCompany();
			}
			
		}
	}

}
