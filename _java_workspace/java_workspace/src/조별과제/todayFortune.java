package 조별과제;



import java.util.Calendar;
import java.util.Scanner;

public class todayFortune {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		cBirthNumber bN = new cBirthNumber();//
		zodiacFortune zF = new zodiacFortune();
		starFortune sF = new starFortune();
		retalFortune rF = new retalFortune();
		moneyFortune mF = new moneyFortune();
		loveFortune lF = new loveFortune();
		colorFortune cF = new colorFortune();
		birthNum bs = new birthNum(); 
		
		Calendar now = Calendar.getInstance();
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		
		System.out.println("===============================================");
		System.out.println("생년월일을 입력해주세요 (ex : 19800121)");
		String fortuneBrithdate = scan.next();
		System.out.println("이름을 입력해주세요 :");
		String name = scan.next();
		System.out.println("===============================================");
		 
		 
		if(fortuneBrithdate.length()!=8) {
			System.out.println("잘못된 생년월일입니다");	
		}
		else if (fortuneBrithdate.charAt(1)!='9' && fortuneBrithdate.charAt(1) != '0') {
			System.out.println("잘못된 생년월일입니다.");
		}
		
		int createBirthsum = 0;
		
		createBirthsum = bs.birthNumCreate(fortuneBrithdate);
		cF.todayColoFortune(fortuneBrithdate, createBirthsum);
		bN.fortuneBirithNum(fortuneBrithdate,name);	
		zF.todayZodiacFortune(fortuneBrithdate, name);//
		sF.todayStarFortune(fortuneBrithdate, name);
		
		System.out.println("===============================================");
		System.out.println(month+"월 " +day+"일 " +name+"님의 운세");
		
		rF.todayRetalFortune(fortuneBrithdate, createBirthsum);
		mF.todayMoneyFortune(fortuneBrithdate, createBirthsum);
		lF.todayLoveFortune(fortuneBrithdate, createBirthsum);
		
		scan.close();

	}
	
	

}
