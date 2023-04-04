package Team;
import java.util.ArrayList;

class CafeInfo{
	private ArrayList<Cafe> menu = new ArrayList<Cafe>();
	
	private static CafeInfo cm = new CafeInfo();
	
	private CafeInfo() {
		cafeMenuList();
	}
	
	public static CafeInfo getCafeInfo() {
		return cm;
	}
	
	private void cafeMenuList() {
		menu.add(new Cafe("Cafe_Soon", "소금라떼", 6000));
		menu.add(new Cafe("갸또드레드", "갸또드레브", 8000));
		menu.add(new Cafe("랑데쟈뷰", "랑데쟈뷰", 7000));
		menu.add(new Cafe("에키노마에", "딸기생크림소보루", 2000));
		menu.add(new Cafe("오니너리", "오렌지크림라떼", 5500));
		menu.add(new Cafe("랑드힐", "푸딩빙수", 19000));
		menu.add(new Cafe("하이테이블", "에그타르트", 4100));
		menu.add(new Cafe("올드타운", "올드커피" ,5000));
		menu.add(new Cafe("이삼옥", "바스크치즈케이크", 6000));
		menu.add(new Cafe("크림380", "카이막세트", 9000));
	}
	
	public Cafe random() {
		int idx = (int)(Math.random()*getSize());
		return menu.get(idx);
	}
	
	private int getSize() {
		return menu.size();
	}

}