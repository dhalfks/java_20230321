package istp_project;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountAll {
Scanner scan = new Scanner(System.in);

ArrayList<String> list = new ArrayList<>();
Account[] accountArray = new Account[50];
int seq, sum=0;
boolean isCreated = false;
boolean run = true;

public void accountSelec() {


	Membership exit = new Membership();

	while(Membership.id == true) { // 로그인 완료 시 메뉴 선택

		ChooseThing();
		System.out.println("> 원하시는 메뉴를 입력해 주세요");
		String selecNum = scan.next();

		switch(selecNum) {
		case "1": createAccount(); break;
		case "2": aBalance(); break;
		case "3": deposit(); break;
		case "4": withdraw(); break;
		case "5": allList(); break;
		case "6": flagMoney(); break;
		case "7": exit.exit2(); return;
		default: System.out.println("잘못입력하셨습니다"); break;
		}
	}
}

public void ChooseThing() { // 로그인 후 메뉴 선택 print

   	  System.out.println("------------------MENU-------------------");
      System.out.println("[1] 계좌생성 [2] 계좌잔고조회 [3] 입금 [4] 출금 \n"
    		  +"[5] 입출금내역 [6] 플래그머니 [7] 종료");
      System.out.println("-----------------------------------------");
   }

public boolean isRegistered() { // 계좌등록 유무 판단 메서드
	return isCreated;
}

public void createAccount () { // 계좌생성

	String aNum = Membership.brand+String.format(new DecimalFormat("0000").format(++seq));
	System.out.println("> 계좌 이름 : ");
	String user = scan.next();
	System.out.println("> 초기 입금액 :");
	String amount = scan.next();

	for(int i =0; i< accountArray.length;i++) { // 여러개의 계좌 생성 가능
		if(accountArray[i] == null ) {
			accountArray[i] = new Account(aNum, user, Integer.parseInt(amount));
			list.add("생성입금 : "+amount);
			isCreated= true;
			sum+= accountArray[i].getBalance();
			break;
		}
	}
}


private void aBalance() { // 계좌 잔고

	if(!isRegistered()) {
		System.out.println("[ERROR] 등록된 계좌가 없습니다\n"
				+"[1번] 메뉴에서 계좌를 생성해 주세요.\n");
		return; }
	for(int i=0; i< accountArray.length; i++) {
		if(accountArray[i] != null) { // Account객체배열이 null이 아니라면
			System.out.println("["+(i+1)+" 번] 계좌번호 : "+accountArray[i].getaNum()+"\n"
					+"> 계좌이름 : "+accountArray[i].getName()+" ($잔고 : "+accountArray[i].getBalance()+")");
		}
	}
}

public void deposit() {

	while(run) {
		if(!isRegistered()) {
			System.out.println("[ERROR] 등록된 계좌가 없습니다\n"
					+"[1번] 메뉴에서 계좌를 생성해 주세요.\n");
			return;
		}
		aBalance(); // 계좌선택 계좌번호 입력
		System.out.println("> 입금 계좌번호를 입력해 주세요.");
		System.out.println("  입금을 종료하시려면 [0번] 입력\n");
		String aNum = scan.next();

		Account account;
		account = findAccount(aNum);

		if(aNum.equals("0")) {
			System.out.println("> 입금 종료");
			break;
		} else if(account == null) {
			System.out.println("[ERROR] 해당 계좌는 존재하지 않습니다\n"
					+"다시 입력해 주세요.\n");
					continue; }

	System.out.println("> 거래구분 입력 (ex: 월급)");
	String category = scan.next();
	System.out.println("> 입금할 금액 입력");
	String amount = scan.next();

	try {
	account.deposit(Integer.parseInt(amount));
	list.add("(입금)"+category+" : "+amount);
	sum+=Integer.parseInt(amount);
	System.out.println("입금이 완료되었습니다.");
	System.out.println("> 입금액 : "+ amount+"\n");
	continue;
	} catch (NumberFormatException e) { // 예외처리..ㅠ
		System.out.println("[ERROR] 숫자만 입력하세요.");
		}
	}
}

public void withdraw() {

	if(!isRegistered()) { // 계좌생성 이 false인 경우
		System.out.println("[ERROR] 등록된 계좌가 없습니다.\n"
				+"[1번] 메뉴에서 계좌를 생성해 주세요.\n");
				return;
			}
	while(run) {

		aBalance(); // 계좌 리스트 출력
		System.out.println("> 출금할 계좌번호를 입력해 주세요");
		System.out.println("> 출금을 종료하시려면 [0]번 입력\n");

		Account account; // Account Class 객체 account

		String aNum = scan.next();
		account = findAccount(aNum); // 계좌찾는 메서드
		if(aNum.equals("0")) {
			System.out.println("> 출금 종료");
			break;
		} else if(account == null) {
			System.out.println("[ERROR] 해당 계좌는 존재하지 않습니다\n");
			continue;
			}
		System.out.println("> 거래구분 입력 (ex: 월세)");
		String category = scan.next();
		System.out.println("> 출금할 금액을 입력하세요 ");
		String amount = scan.next();


		try {
			int result = account.withdraw(Integer.parseInt(amount));
			sum-=(Integer.parseInt(amount));
			System.out.println("> 출금액 : "+ amount+"\n");
			list.add("(출금)"+category+" : "+amount);
			continue;
		} catch(NumberFormatException e) {
			System.out.println("[ERROR] 숫자만 입력하세요");
		} catch(Exception e) {
				System.out.println(e.getMessage()); // 잔고부족 문구
		}
	}
}

public void allList() {

	if(!isRegistered()) {
		System.out.println("[ERROR] 등록된 계좌가 없습니다\n"
				+"[1번] 메뉴에서 계좌를 생성해 주세요.\n");
				return;
	} else {
		System.out.println("[INFO] 입출금 내역 ");
		for(String tmp : list) {
		System.out.println(tmp+" 원");
		}
	}
}

public void flagMoney() { // 목표금액 설정

	int goal;

	if(!isRegistered()) {
		System.out.println("[ERROR] 등록된 계좌가 없습니다\n"
				+"[1번] 메뉴에서 계좌를 생성해 주세요.\n");
		return; }

	System.out.println("[INFO] 목표 금액을 입력해 주세요.");

	goal = scan.nextInt();

	if(goal <= 0) {
		System.out.println("[ERROR] 1부터 입력가능\n");
	}

	try {
		System.out.println("> 총 자산: " + sum + "원");
		System.out.println("> 목표 금액: " + goal + "원");
	 if (sum >= goal) {
		System.out.println("> 목표 금액을 달성하였습니다!");
	} else {
		System.out.println("  목표 금액까지 " + (goal - sum) + "원 남았습니다.");
			}
		} catch (InputMismatchException e) {
		System.out.println("[ERROR] 숫자만 입력하세요.\n");
	}
}

public Account findAccount (String aNum) { // 계좌번호를 입력받아, 계좌번호 반환 메서드
	Account account = null;
	for(int i=0; i<accountArray.length; i++) {
		if(accountArray[i] != null)
			if(accountArray[i].getaNum().equals(aNum)) {
				account= accountArray[i];
		}
	} return account;
}
}