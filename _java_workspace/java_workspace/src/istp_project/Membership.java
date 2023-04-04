package istp_project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class Membership {
Scanner scan = new Scanner(System.in);
HashMap<String, String> memberMap = new HashMap<>();
public static LocalDateTime today= LocalDateTime.now(); // 로그인 날짜.시간 입력
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");

public static boolean  id = false;
public final static String brand = "JavaBank";


	public boolean statusId() { // 로그인 완료시 true 리턴
		id = true;
		return id;
	}

	public void InfoSelec() { // 첫화면 선택

	existingId(); // 기존 유저id 저장

	String selecNum;

	   while(id == false) { // 로그인= true일시 빠져나옴
    	  System.out.println("\n[INFO] 안녕하세요. "+ brand+ " 입니다.\n"
    	  		  + " APP 이용시 회원가입이 필요합니다.\n"
    			  +"☞        종료를 원하시면 [0번]\n"
    			  +"☞  회원가입을 진행하시려면 [1번]\n"
    			  +"기존 회원 로그인을 하시려면 [2번]\n");

    	  System.out.println("> 입력 : ");
    	  selecNum =  scan.next();

    	  	switch(selecNum) {
    	  	case "0": exit(); return; // 어플종료
    	  	case "1": memberJoin(); break;
    	  	case "2": login();  break;
    	  	default: System.out.println("[ERROR] 잘못 입력하셨습니다. 다시 입력해 주세요.\n"); break;
    	  	}
	   }
}

public HashMap<String,String> existingId() { // 기존 회원 id pw put

	memberMap.put("a", "1");
	memberMap.put("b", "2");
	memberMap.put("c", "3");
	memberMap.put("b", "4");
	memberMap.put("e", "5");

	return memberMap;
}

public void exit() {

	System.out.println(" App이 종료되었습니다.\n"
					+" 저희 "+ brand+ "를 이용해 주셔서 감사합니다.\n");
	}

public void exit2() {

		System.out.println(brand+" App이 종료되었습니다.\n"
				+"( "+dtf.format(today)+" )"+" 로그아웃\n"
				+" 저희 "+ brand+ " 를 이용해 주셔서 감사합니다.\n");
}

public void memberJoin( ) { // 회원가입

	String userid;

	while(true) {
	System.out.println("[INFO] 회원가입을 위한 ID와 PW을 입력해 주세요\n"
			+"☞ 뒤로가기[0번]");
	System.out.println("> ID를 입력해 주세요 (대소문자 구분)");
	 userid = scan.next();

	 if(userid.equals("0")) { // 0번 입력시 뒤로가기
		 break;
	 }

	System.out.println("> 비밀번호를 입력해 주세요 (대소문자 구분)");
	String pw = scan.next();

	if(memberMap.containsKey(userid)) {
		System.out.println("[ERROR] 이미 존재하는 ID입니다.\n"
				+"다시 입력해주세요\n ");
		} else {
		memberMap.put(userid, pw);
		System.out.println(" 안녕하세요. "+ userid+ " 님\n"
				+" 회원가입이 완료되었습니다.\n"
				+" 이제 "+ brand + " App을 이용하실 수 있습니다.\n"
				+"[INFO] 로그인을 해주세요.\n ");
				login();
				break;
		}
	}
}

public void login() { // 로그인 메서드


	String userid=null;

	while(true) {
		System.out.println("> ID 입력 (대소문자 구분) :\n"
				+"☞ 뒤로가기[0번]");
		userid = scan.next();
		if(userid.equals("0")) { // 0번 입력시 뒤로가기
			break;
		}
		System.out.println("> PW 입력 :");
		String pw = scan.next();

		if(!memberMap.containsKey(userid)) {
			System.out.println("[ERROR] 입력하신 ID는 존재하지 않습니다. 다시 입력해 주세요.");
			continue;
		} else {
			if(!(memberMap.get(userid)).equals(pw)) {
			System.out.println("[ERROR] PW 불일치. 다시 입력해 주세요");
			} else {
				System.out.println("\n[INFO] 안녕하세요. "+ userid + " 님\n"
				+"("+dtf.format(today)+") 로그인 완료\n"
				+"저희 "+ brand+ "를 이용해 주셔서 감사합니다.\n");
				statusId(); // 로그인 true 메서드
				break;
		}
	}
}
}
}// Membership class