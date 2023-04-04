package day08;

public class 클래스02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : color, power, speed
		 * 메서드 : powerOn, powerOff, speedUp +10, speedDown -10
		 * 멤버변수 : private
		 * 멤버변수를 확인/수정 => getter/setter 필요
		 * */
		Car c = new Car("빨강",2);
		System.out.println(c.getColor());
		System.out.println(c.getDoor());
		System.out.println(c.getSpeed());
		System.out.println(c.isPower());
		//c.setColor("노랑");
		System.out.println(c.getColor());
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.powerOff();
		c.speedUp();
		c.powerOn();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		
		Car c2 = new Car("노랑이");
		System.out.println("-----다른 자동차 --");
		System.out.println(c2.getColor());
		System.out.println(c2.getDoor());
		System.out.println(c2.isPower());
		System.out.println(c2.getSpeed());
		//c2.setColor("빨강이");
		System.out.println(c2.getColor()); //컬러 출력
		c2.powerOn();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		
		c.speedUp();
		c.speedUp();
		
	}

}

class Car{
	//멤버변수 선언
	private String color; //null
	private int door; //0
	private boolean power; //false
	private int speed; //0
	
	//생성자 : 없으면 기본생성자가 자동 추가된다.
	//생성자 위치
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, int door) {
		//this(color);  //생성자 호출
		this.color = color;
		this.door = door;
	}
	public Car() {} //기본생성자
	
	//멤버메서드
	public void powerOn() {
		System.out.println("시동이 켜졌습니다.");
		 power = true;
	}
	
	public void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
		power = false;
	}
	
	public void speedUp() {
		
		if(power) {
			speed = speed+10;  //
			System.out.println(color+"속도 : "+speed);
			
		}else {
			System.out.println("시동이 꺼져있습니다. ");
			System.out.println("시동을 켜주세요.");
		}
	}
	
	public void speedDown() {
		if(speed <=0) {
			speed = 0;
		}else {
			speed = speed-10;			
		}
		
		System.out.println("속도 : "+ ((speed<=0) ? 0 : speed));
		
	}
	//getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
}
