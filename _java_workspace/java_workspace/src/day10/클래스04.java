package day10;

public class 클래스04 {

	public static void main(String[] args) {
		// 생성자를 이용하여 객체 생성
		Car c = new Car();
		c.setColor("빨강이");
		c.setDoor(4);
		c.setAirback(true);
		c.print();
		System.out.println(c);
		
		Car c2 = new Car("노랑이", 2, false);
		c2.print();
		c2.powerOn();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		System.out.println(c2);

	}

}

class Car{
	//멤버변수 : color, door, airback, power, speed
	private String color;
	private int door;
	private boolean airback;
	private boolean power;
	private int speed;
	
	//생성자 : 빈생성자, color, (color, door), (color, door, airback), 전체 생성자
	public Car() {} //기본 생성자
	public Car(String color) {
		//this 멤버변수를 의미
		// 멤버변수와 매개변수의 이름이 같을 경우 멤버변수라는 것을 표시하기 위해 사용
		this.color = color;
	}
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}
	public Car(String color, int door, boolean airback) {
		//생성자 호출
		this(color, door);
		this.airback = airback;
	}
	//생성자 자동생성
	public Car(String color, int door, boolean airback, boolean power, int speed) {
		//super(); //부모의 생성자를 호출
		this.color = color;
		this.door = door;
		this.airback = airback;
		this.power = power;
		this.speed = speed;
	}
	
	
	//method : print, powerOn, powerOff, speedUp, speedDown
	public void print() {
		//멤버변수는 내클래스에서 모든 메서드에서 공유되는 변수
		//멤벼변수를 매개변수로 받을 필요가 없음.
		System.out.println("--MyCar--");
		System.out.println(color);
		System.out.println("door:"+door);
		System.out.println("airback유무:"+airback);
		System.out.println("---------");
	}
	//toString : 멤버변수들을 출력해주는 메서드
	@Override
	public String toString() {
		return "MyCar [color=" + color + ", door=" + door + ", airback=" + airback + "]";
	}
	
	
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
		
		System.out.println("속도 : "+ speed);
		
	}
	
	//getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public boolean isAirback() {
		return airback;
	}
	public void setAirback(boolean airback) {
		this.airback = airback;
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
	
	
}