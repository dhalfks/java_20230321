package day10;

public class 클래스05 {

	public static void main(String[] args) {
		/* static이 붙은 멤버 변수/메서드들을 클래스 멤버변수/메서드 라고 한다.
		 * static이 안붙은 멤버변수.메서드들을 객체(인스턴스) 멤버변수/메서드라고 한다.
		 * 
		 *  - 객체 멤버변수/메서드는 객체를 통해 사용되고, 생성된다.
		 *  - 각 객체마다 독립적인 변수/메서드가 된다.
		 *  
		 *  - 클래스 멤버변수/메서드는 클래스를 통해 사용된다.
		 *  - 클래스명.메서드호출
		 *  - (객체를 통해 호출되는것이 가능하나 일반적이지 않다.)
		 *  - 클래스 멤버변수는 하나의 멤버변수를 모든 객체가 공유(사용)한다.
		 *  
		 *  - 클래스/객체 변수의 생성시점이 달라서 메서드에 사용될 수 있는 환경이 다르다.
		 *  - 객체 멤버는 이미 클래스가 생성된 후에 생성 / 클래스의 멤버 메서드를 객체에서 사용할수 있다.
		 *  - 클래스 멤버 변수는 클래스/객체 멤버에서 모두 사용할 수 있다.
		 *  - 클래스 멤버 메서드는 클래스/겍체 멤버에서 모두 사용할 수 있다.
		 *  - 객체 멤버 변수는 클래스 멤버 메서드에서 사용할 수 없다.
		 *  - 객체 멤버 메서드는 객체멤버 메서드에서만 사용할 수 있다.
		 * */
		
		TV t = new TV();
		//객체 멤버 메서드 접근방식 : 객체생성 후 객체명.메서드명()
		t.printPower();
		System.out.println(TV.brand); 
		
		//클래스 멤버 메서드 접근방식 : 클래스명.메서드명()
		TV.printBrand();

	}

}

 class TV{
	 private boolean power;
	 public final static String brand = "Samsung"; // final : 최종 수정할수 없는 상수 
	 
	 public void printPower(){
		 if(power) {
			 System.out.println("tv가 켜졌습니다.");
		 }else {
			 System.out.println("tv가 꺼졌습니다.");
		 }
		 //객체 메서드에 클래스 변수를 사용 가능
		  System.out.println("제조사:"+brand); //가능
	 }
	 public static void printBrand() {
		 System.out.println("제조사:"+brand);
		 //클래스 메서드에 객체 변수를 사용 불가능
		 //System.out.println(power); //불가능
	 }
	 public void powerOn() {
		 power = true;
	 }
	 public void powerOff() {
		 power=false;
	 }
 }
