package Minigame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Blackjack {
	
	public void exe() {
		
		Scanner scan = new Scanner(System.in);
		boolean a = false;
		boolean b = true;
		Card tmp = new Card();
		ArrayList<Card> P_cardlist = new ArrayList<Card>();
		ArrayList<Card> C_cardlist = new ArrayList<Card>();

		int p_sum=0;
		int c_sum=0; 
		
		
		System.out.println();
		System.out.println("-----블랙잭-----");
		System.out.println("==룰 설명==");
		System.out.println("딜러(CPU)에게 카드를 한장씩 받아 21에 가까운 수를 만들면 이기고");
		System.out.println("21을 초과하거나 딜러보다 숫자가 낮을경우 게임에서 지게됩니다.");
		System.out.println("플레이어는 Hit와 Stand를 선택할 수 있으며");
		System.out.println("Hit 선택시 카드를 한장 추가하고 Stand 선택시 카드를 받지않습니다.");
		System.out.println("이 게임 한정 A카드는 1로 취급됩니다.");
		
		while(b) {
		while(true) {
			CardPack cardpack = new CardPack();
			cardpack.Shuffle();
			a=false;
			c_sum=0;
			p_sum=0;
			P_cardlist.clear();
			C_cardlist.clear();
			
		System.out.println();
	      System.out.println(" 게임시작 ! ");
	      System.out.println();
		
		System.out.print("플레이어의 카드 : ");
		P_cardlist.add(cardpack.pick());
		P_cardlist.add(cardpack.pick());		

		for(int i = 0 ; i<P_cardlist.size(); i++) {
			tmp = P_cardlist.get(i);
			p_sum += tmp.getNumber();
			tmp.Print();
		}
		
		System.out.println();
		
		System.out.print("딜러의 카드 : ");
		C_cardlist.add(cardpack.pick());
		C_cardlist.add(cardpack.pick());		

		for(int i = 0 ; i<C_cardlist.size(); i++) {
			tmp = C_cardlist.get(i);
			c_sum += tmp.getNumber();
			tmp.Print();
		}
		
		System.out.println();
		System.out.println("플레이어의 카드 합 : "+p_sum);
		
		if(p_sum<=21) {
			a=true;
		}
		else {
			System.out.println("플레이어 버스트!");
			System.out.println("플레이어의 패배입니다.");
			System.out.println();
			
			System.out.println("한판 더 하기 (Y/y) / 메뉴로 나가기 (N/n)");
			String abc = scan.next();
			
			if(abc.equals("N") || abc.equals("n")) {
				return;
			}
			else {
				a=false;
				break;
			}
		}
		
		System.out.println();
		
		while(a) {
		System.out.println("1. Hit (1장 더 받기)");
		System.out.println("2. Stand (안받기)");
		System.out.println("Hit 와 Stand 중 선택해주세요.");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Hit 선택, 카드를 받습니다.");
			tmp = cardpack.pick();
			P_cardlist.add(tmp);
			p_sum += tmp.getNumber();
			tmp.Print();
			System.out.println();
			break;
		case 2:
			System.out.println("Stand 선택, 이대로 진행합니다.");
			a=false;
			break;
		default :
			System.out.println("Hit 1번, Stand 2번 중 골라주세요.");
			break;
		}
		System.out.print("플레이어의 카드 : ");
		for(int i = 0; i<P_cardlist.size(); i++) {
			P_cardlist.get(i).Print();
//			System.out.print(" ");
		}
		System.out.println();
		System.out.println("플레이어의 카드 합 : "+p_sum);
		
		if(p_sum>21) {
		System.out.println("플레이어 버스트!");
		System.out.println("플레이어의 패배입니다.");
		System.out.println();
		System.out.println("한판 더 하기 (Y/y) / 메뉴로 나가기 (N/n)");
		String abc = scan.next();
		
		if(abc.equals("N") || abc.equals("n")) {
			return;
		}
		else {
			break;
		}
		}
		
		System.out.println();
		}
		
		while(c_sum <= 16) {
			System.out.println("딜러의 패 합이 16이하여서 패를 한장 추가합니다.");
			tmp = cardpack.pick();
			C_cardlist.add(tmp);	
			c_sum += tmp.getNumber();
			tmp.Print();
			System.out.println();
		}
		
		System.out.print("딜러의 카드 : ");
		for(int i = 0; i<C_cardlist.size(); i++) {
			C_cardlist.get(i).Print();
//			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("딜러의 카드 합 : "+c_sum);
		System.out.println();
		
		if(c_sum>21) {
			System.out.println("딜러 버스트!!");
			System.out.println("****플레이어의 승리입니다.****");
		}
		else if(c_sum <= 21 && c_sum>p_sum) {

			System.out.println("****딜러의 승리입니다.****");
		}
		
		else if(p_sum <= 21 && p_sum>c_sum) {
			System.out.println("****플레이어의 승리입니다.****");
		}
		
		else if(p_sum==c_sum) {
			System.out.println("****무승부 입니다.****");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("한판 더 하기 (Y/y) / 메뉴로 나가기 (N/n)");
		String abc = scan.next();
		
		if(abc.equals("N") || abc.equals("n")) {
			return;
		}

		}
	}
	}
	
}

class Card{
	String symbol;
	private int number;
	/*
	 * 모양 : ♥♠♣◆ 숫자 : 1~10 j(11) q(12) k(13)
	 */
	public Card(){
		symbol = "♥"; 
		number = 1;
	}
	
	public Card(String symbor, int number){
		this.symbol = symbol;
		this.number = number;
	}
	
	public void Draw() {
		int r_symbol = (int) (Math.random() * 4 + 1);
		int r_number = (int) (Math.random() * 13 + 1);
		switch(r_symbol) {
		case 1:
			symbol = "♥";
			break;
		case 2:
			symbol = "♠";
			break;
		case 3:
			symbol = "♣";
			break;
		case 4:
			symbol = "◆";
			break;
		default:
			break;
		}
		number = r_number;
	}
	

	public void Print() {
		switch(number) {
		case 11:
			System.out.print(symbol+"J"+" ");
			break;
		case 12:
			System.out.print(symbol+"Q"+" ");
			break;
		case 13:
			System.out.print(symbol+"K"+" ");
			break;
		default :
			System.out.print(symbol+""+number+" ");
			break;
		}
		
	}
		
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(int a) {
		switch(a) {
		case 0:
			symbol = "♥";	
			break;
		case 1:
			symbol = "♠";	
			break;
		case 2:
			symbol = "♣";	
			break;
		case 3:
			symbol = "◆";	
			break;
		default :
			break;
		}
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		if(number < 1 || number > 13) {
			this.number = 1;
		}
		else {
			this.number = number;
		}
	}
	
	
}

class CardPack {

	/* CardPack 클래스
	 * 카드팩 = 52장의 카드들
	 * 1. 카드 셔플 기능
	 * 2. 드로우 기능
	 * 3. 카드 초기화 기능
	 * 4. 출력기능 - 카드 클래스에서 가져옴
	 * 
	 * 생성자 - 52장의 카드를 모두 생성
	 * 
	 */

	private Card[] pack = new Card[52];
	private int cnt = 0;
	
	public CardPack() {
			for(int i=1; i<=4; i++){
				for(int j=1; j<=13; j++) {
				Card c = new Card(); // 카드 1장 생성
				c.setSymbol(i);
				c.setNumber(j);
				pack[cnt] = c;
				cnt++;
			}
		}
	}

	
	public void Shuffle(){
		int min =0;
		int max =pack.length-1;
		for(int i = 0; i<pack.length;i++) {
			int random = (int)(Math.random()*(max-min+1))+min;
			Card tp = pack[i];
			pack[i]=pack[random];
			pack[random]=tp;
		}	
	}
	
	public Card pick() {
		if(cnt>0) {
			cnt--;
			return pack[cnt]; 
		}
		else {
			System.out.println("카드가 없습니다.");
			return null;
		}
	}
	
	public void init() {  // 카드 기본상태로 초기화
		cnt = 52;
	}


	public Card[] getPack() {
		return pack;
	}
	
	
	
}