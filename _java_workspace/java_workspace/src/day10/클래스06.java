package day10;

public class 클래스06 {

	public static void main(String[] args) {
		/* final은 클래스, 변수, 메서드에 붙일 수 있음. 
		 * final : 수정할 수 없다. 
		 * final 멤버 변수 : 상수
		 * final 멤버 메서드 : 오버라이딩을 할 수 없다.
		 * final 클래스 : 상속 할 수 없다. 부모 클래스가 될 수 없다.
		 * */
		//setter를 이용한 객체 생성
		EzenStudent ez = new EzenStudent();
		System.out.println(ez);
		ez.setGigum("인천");
		ez.setName("홍길동");
		ez.setGroup("자바");
		ez.setPhone("010-1234-4567");
		System.out.println(ez);
		
		//생성자를 이용한 객체 생성
		EzenStudent ez2 = new EzenStudent("인천", "홍길순", "자바", "010-1111-2222");
		System.out.println(ez2);
		

	}

}
/* 초기화 방법 : 기본값, 명시적 초기값, 초기화 블럭, 생성자
 * 1. 명시적 초기화 : 멤버변수 선언과 동시에 초기값 지정
 * 2. 초기화 블럭 : { } 멤버변수 초기화
 * 3. 생성자 : 객체를 생성할 때 초기화 해서 생성
 * 초기값 우선순위
 * 기본값 -> 명시적초기값 -> 초기화블럭 -> 생성자
 * */

//멤버변수 : 지점, 이름, 반, 전화번호
//메서드 : 출력(print 메서드, toString가능)

class EzenStudent{
	private String gigum="인천";
	private String name;
	private String group;
	private String phone;  //연산에 사용될 값만 int
	{
		//초기화 블럭 : 멤버변수들을 초기화;
		gigum = "incheon";
		group = "미정";
	}
	
	//생성자
	public EzenStudent() { }
	
	public EzenStudent(String gigum, String name, String group, String phone) {
		this.gigum = gigum;
		this.name = name;
		this.group = group;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "EzenStudent [gigum=" + gigum + ", name=" + name + ", group=" + group + ", phone=" + phone + "]";
	}
	
	public String getGigum() {
		return gigum;
	}
	public void setGigum(String gigum) {
		this.gigum = gigum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}