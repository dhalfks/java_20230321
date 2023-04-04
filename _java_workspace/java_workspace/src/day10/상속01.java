package day10;

public class 상속01 {

	public static void main(String[] args) {
		/* 상속 : 부모의 것을 자식에게 물려주는 것
		 * 클래스 상속 : 부모 클래스의 멤버 변수/멤버 메서드를 물려주는 것
		 * 상속을 하는 이유 : 재사용을 해서 중복 코드를 줄이는 것.
		 * class A (부모클래스) / class B (자식클래스)
		 * 
		 * class B extends A{
		 * 
		 * }
		 * 상속 키워드 : extends
		 * 
		 * 상속을 받으면 부모의 멤버변수와 메서드를 사용할 수 있다.
		 * 접근제한자 private은 자식클래스에서 접근 불가능.
		 * 접근제한자 protected : 상속받는 자식에게 허용하는 제어자
		 * */
		A a = new A();
		a.setA(10);
		a.print();
		
		System.out.println("------");
		
		B b = new B();
		b.setB(20);
		System.out.println(b.getB());
		System.out.println("-------");
		b.print();
		b.num= 100; //제어자가 protected이기 때문에 직접접근 가능.
		System.out.println("-------");
		b.print();
		

	}

}

class A{  //부모 클래스
	private int a, b, c; //나만 사용
	protected int num;  //상속 가능.
	
	public void print() {
		System.out.println("a:"+a+" b:"+b+" c:"+c);
		System.out.println("num:"+num);
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

class B extends A{  // a,b,c,num,d,e,f 모두 사용가능.
	private int d,e,f;

	
	//오버라이드 : 부모의 메서드를 재정의하여 사용하는 것을 의미
	@Override
	public void print() {
		super.print(); // super : 부모의 값을 가져올 때
		System.out.println("d:"+d+" e:"+e+" f:"+f);
	}

//	public void print1() {
//		super.print(); 
//		System.out.println("d:"+d+" e:"+e+" f:"+f);
//	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
	
}