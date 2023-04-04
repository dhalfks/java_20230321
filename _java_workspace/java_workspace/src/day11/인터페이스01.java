package day11;

public class 인터페이스01 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수로만 이루어진 것.
		 * 추상메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 추상클래스 : 추상메서드 + 일반메서드 + 멤버변수 + 상수(final)
		 * 추상클래스 : 미완성 클래스 => 객체를 생성할수 없다.
		 * 키워드 : abstract
		 * abstract 클래스명 앞 / 메서드 앞에 추가
		 * abstract 리턴타입 메서드명(매개변수);
		 * - 부모 클래스에서 상속 받았을 때 특정 메서드가 자식 클래스에 자주 오버라이딩 될 때
		 * 해당 메서드를 추상 메서드로 작성
		 *  - 상속을 받은 클래스에서는 추상메서드가 있다면 반드시 구현해야 한다.
		 * 
		 *  인터페이스 : 상수와 추상메서드만으로 구성
		 *  키워드 : interface
		 *  - 기능요약서
		 *  - 자체적으로는 사용할수 없고, 인터페이스를 구현한 클래스로 활용
		 *  - 구현 키워드 : implements
		 *  - 인터페이스는 멤버변수가 없음. 항상 이 부분을 염두에 두고 메서드 정리를 해야 함.
		 * */
		Tv t = new Tv();
		t.trunOn();
		t.chUp();
		t.chUp();
		t.ch = 99;
		t.chUp();
		t.chUp();
		t.chUp();
		t.chDown();
		t.chDown();
		t.trunOff();

	}

}

interface Power{
	abstract void trunOn();
	abstract void trunOff();
}

interface Remocon{
	void chUp();
	void chDown();
}
//구현과 상속은 둘다 한번에 할 수 있음.
class Tv implements Power, Remocon{ //구현은 다중구현이 가능.
	boolean power;
	int ch;
	
	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		ch++;
		if(ch > 100) {
			ch=0;
		}
		System.out.println(ch);
	}
	
	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		ch--;
		if(ch <0) {
			ch=100;
		}
		System.out.println(ch);
	}
	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv가 켜졌습니다.");
		power = true;
	}
	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv가 꺼졌습니다.");
		power = false;
	}
	
	
}
