package model;

import java.sql.Date;

public class Orders {
	private int num;
	private String name;
	private String img;
	private int order_num;
	private int total_price;
	private Date o_date;
	
	public Orders() {
		super();
	}

	public Orders(int num, String name, String img, int order_num, int total_price, Date o_date) {
		super();
		this.num = num;
		this.name = name;
		this.img = img;
		this.order_num = order_num;
		this.total_price = total_price;
		this.o_date = o_date;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	@Override
	public String toString() {
		return "Orders [num=" + num + ", name=" + name + ", img=" + img + ", order_num=" + order_num + ", total_price="
				+ total_price + ", o_date=" + o_date + "]";
	}
	
}
