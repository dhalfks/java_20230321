package teamProject;

interface Move {
	void eat();       // 밥먹기
	void sleep();     // 잠자기
	void walk();      // 산책하기
	boolean end();       // 게임 끝
	void levelUp();   // 레벨업
	void printInfo(); // 정보창
}

public class Game implements Move {
	private int energy=50;
	private int experience=0;
	private int level=1;

	@Override
	public void eat() {
		if(energy>=50) {
			System.out.println("배불러서 먹이를 거부합니다.");
		} else {
			energy += 10;
			System.out.println("냠냠~ 밥을 맛있게 먹었습니다.");
			System.out.println("에너지 10 증가!");
		}
		
	}

	@Override
	public void sleep() {
		if(energy>=70) {
			System.out.println("에너지가 넘쳐 잠을 자지 않습니다.");
		} else {
			energy += 20;
			System.out.println("꿀잠을 자고 일어났습니다.");
			System.out.println("에너지 20 증가!");
		}
		
	}

	@Override
	public void walk() {
		energy -= 30;
		experience += 30;
		System.out.println("산책을 매우 즐거워합니다.");
		System.out.println("에너지 30 감소!");
		System.out.println("경험치 30 증가!");
		
	}

	@Override
	public boolean end() {
		if(energy<0) {
			System.out.println("당신의 포켓몬이 가혹하게 죽었습니다.....");
			return true;
		}			
		return false;
	}

	@Override
	public void levelUp() {
		if(experience>=70) {
			experience -= 40;
			level++;
			System.out.println("레벨 업!!!!!!");
			System.out.println("레벨 : "+level);
		}
	}

	@Override
	public void printInfo() {
		System.out.println("==================");
		System.out.println("에너지 : "+energy);
		System.out.println("경험치 : "+experience);
		System.out.println("레 벨 : "+level);
		System.out.println("==================");
	}
}