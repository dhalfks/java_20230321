package day12;

public class 과제 {

	public static void main(String[] args) {
		/* TV의 채널은 0~10까지 있음. channel은 순환구조
		 * vol 0~20까지 있음. 0이되면 음소거라고 출력
		 * vol 0이하로 내려가지 않음. 20이상 올라가지 않음.
		 * 
		 * */
		Tv t = new Tv();
		t.powerOn();
		t.channelUp();
		t.channelUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.powerOff();
		
		t.channelDown();
		t.powerOn();
		t.channelDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.channelDown();
		t.channelDown();
		t.channelDown();

	}

}

interface Remocon{
	void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volUp();
	void volDown();
}

class Tv implements Remocon{

	private boolean power;
	private int ch;
	private int vol;
	
	@Override
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
		power=true;
		
	}

	@Override
	public void powerOff() {
		System.out.println("전원이 꺼졌습니다.");
		power=false;
	}

	@Override
	public void channelUp() {
		if(power) {
			ch++;
			if(ch>10) {
				ch=0;
			}
			System.out.println("channel:"+ch);
		}else {
			System.out.println("전원을 켜주세요.");
		}
		
	}

	@Override
	public void channelDown() {
		if(power) {
			ch--;
			if(ch<0) {
				ch=10;
			}
			System.out.println("channel:"+ch);
		}else {
			System.out.println("전원을 켜주세요.");
		}
		
	}

	@Override
	public void volUp() {
		if(power) {
			vol++;
			if(vol>20) {
				vol=20;
				System.out.println("최대볼륨!!! NO~~~");
			}
			System.out.println("vol:"+vol);
		}else {
			System.out.println("전원을 켜주세요.");
		}
		
	}

	@Override
	public void volDown() {
		if(power) {
			vol--;
			if(vol<=0) {
				vol=0;
				System.out.println("음소거");
			}else {
				System.out.println("vol:"+vol);
			}
			
		}else {
			System.out.println("전원을 켜주세요.");
		}
	}
	
}