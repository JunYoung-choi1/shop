package model;

public class Cart {
	private String name;
	private String img;
	private int order_num;
	private int total_price;
	
	public Cart() {
		super();
	}

	public Cart(String name, String img, int order_num, int total_price) {
		super();
		this.name = name;
		this.img = img;
		this.order_num = order_num;
		this.total_price = total_price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getOrder_num() {
		return order_num;
	}

	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	@Override
	public String toString() {
		return "Cart [name=" + name + ", img=" + img + ", order_num=" + order_num + ", total_price=" + total_price
				+ "]";
	}
	
	
}
