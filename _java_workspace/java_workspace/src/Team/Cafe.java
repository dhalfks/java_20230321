package Team;
public class Cafe {
	private String name;
	private String menu;
	private int price;
	
	public Cafe(String name, String menu, int price) {
		this.name = name;
		this.menu = menu;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cafe [name=" + name + ", menu=" + menu + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}