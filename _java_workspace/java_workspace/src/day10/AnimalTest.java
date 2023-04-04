package day10;

class Animal1{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		
	}
}

class Human extends Animal1{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tigerer extends Animal1{
	
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}


class Eagle extends Animal1{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
}



public class AnimalTest {

	public static void main(String[] args) {

		Animal1 hAnimal = new Human();
		Animal1 tAnimal = new Tigerer();
		Animal1 eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		Animal1[] animalList = new Animal1[10];
		int cnt=0;
		animalList[cnt]=hAnimal;
		cnt++;
		animalList[cnt]=tAnimal;
		cnt++;
		animalList[cnt]=eAnimal;
		cnt++;
		
		for(int i=0; i<cnt; i++ ) {
			animalList[i].move();
			
		}
		
		test.testDownCasting(animalList, cnt);
		
	}	
	
//	public void moveAnimal(Animal1 animal) {
//		animal.move();
//		
//	}
	public void testDownCasting(Animal1[] list, int cnt) {
		
		for(int i =0; i<cnt; i++) {
			Animal1 animal = list[i];
		
			if ( animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}
			else if( animal instanceof Tigerer) {
				Tigerer tiger = (Tigerer)animal;
				tiger.hunting();
			}
			else if( animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}
		
		}
	}
	
	
	public void moveAnimal(Animal1 animal) {
		animal.move();
		
	}
}
