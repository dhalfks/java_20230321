package Team;
import java.util.ArrayList;

class Restaurant {
	
	public String RestaurantName;
	public String RestaurantMenu;
	
	public Restaurant () {
		this.RestaurantName= "";
		this.RestaurantMenu= "";
	}
	
	public Restaurant(String RestaurantName, String RestaurantMenu) {
		this.RestaurantName= RestaurantName;
		this.RestaurantMenu= RestaurantMenu;
	}
	

}


class RestaurantList {
	public ArrayList<Restaurant> list = new ArrayList<Restaurant>();
	
	public RestaurantList() {
		this.list.add(new Restaurant("명초밥","연어롤"));
		this.list.add(new Restaurant("파스타조","명란파스타"));
		this.list.add(new Restaurant("할매국밥","돼지국밥"));
		this.list.add(new Restaurant("가츠동","치즈돈가스"));
		this.list.add(new Restaurant("마라영웅","마라탕"));
		this.list.add(new Restaurant("생각나족","족발"));
		this.list.add(new Restaurant("솥뚜껑삽겹살","삽겹살"));
		this.list.add(new Restaurant("이것이떢볶이","떢볶이"));
		this.list.add(new Restaurant("반했닭","반반치킨"));
		this.list.add(new Restaurant("숯불닭발","닭발"));
	}
	//원하는 index번지를 반환해주는 기능
	public Restaurant getRestaurant(int index) {
		return this.list.get(index);  
	}
	
	//랜덤으로 음식점을 반환해주는 기능
	public Restaurant getRandomRestaurant() {
		Restaurant res = new Restaurant();
		int index = (int)(Math.random()*list.size());
		res = this.list.get(index);
		return res;
	}
	
}