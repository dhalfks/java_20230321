package day08;

public class 클래스03 {

	public static void main(String[] args) {
		/* Card 클래스 생성
		 * */
		Card c = new Card();
		c.print();
		c.setShape('♣');
		c.setNum(5);
		c.print();
		//카드에 있지 않는 모양/숫자가 들어오면 무조건 => 1♥
		
		c.setShape('※');
		c.setNum(-1);
		c.print();

	}

}

/* Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : 하트(♥), 클로버(♣), 스페이드(♠), 다이아(◆)
 * 숫자 : 1~10 J(11) Q(12) K(13)
 * 
 * 클래스의 구성
 * - 멤버변수 : char shape, int num
 * - 메서드 : print(1♥)
 * - getter/setter
 * - 생성자 : 하트1 (1♥)
 * 
 * 생성자 선언 방법
 * public 클래스명(){  //매개변수는(필요하면 생성) 없을수도 있음. 
 * 초기값;
 * }
 * */
class Card{
	private char shape; //모양
	private int num; //숫자 1~10 J(11) Q(12) K(13)
	
	//생성자 : 객체의 초기값을 결정
	public Card() { 
		shape = '♥';
		num = 1;
	}
	
	//print 메서드
	//shape, num를 출력하는 메서드
	public void print() {
		switch(num) {
		case 11: 
			System.out.print("J");
			break;
		case 12: 
			System.out.print("Q");
			break;
		case 13: 
			System.out.print("K");
			break;
		default:
			System.out.print(num);
		}
		
		System.out.println(shape);  // 11♥  => J♥
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
		case '♥': case '♣': case '♠': case '◆':
			this.shape = shape;
			break;
			default:
				this.shape='♥';
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num <1 || num >13) {
			this.num = 1;
		}else {
			this.num = num;	
		}
	}	
	
}



