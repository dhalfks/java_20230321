package istp_project;

public class Account {
private String aNum;
private String name;
private int balance;


public Account(String aNum, String name, int balance) { // 생성자
	this.aNum = aNum;
	this.name = name;
	this.balance = balance;
	System.out.println(name+" 계좌 개설이 완료되었습니다.");
	System.out.println("> 계좌번호 : "+ aNum);
	System.out.println("  잔고 : "+ balance);
}

public String getaNum() {
	return aNum;
}

public void setaNum(String aNum) {
	this.aNum = aNum;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public void deposit(int amount) { // 입금
	this.balance+=amount;
}


public int withdraw(int amount) throws Exception { //출금
	if(this.balance < amount) {
		throw new Exception("[ERROR] 잔액이 부족합니다");
	} else {
		this.balance-=amount;
		return balance;
		}
	}
}