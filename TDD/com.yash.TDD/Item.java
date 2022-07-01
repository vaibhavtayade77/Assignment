package com.yash.TDDprograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {

	int itemid;
	String itemname;
	double cost_price, sell_price;
	String date_of_manufacturing, date_of_expiring;

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getCost_price() {
		return cost_price;
	}

	public void setCost_price(double cost_price) {
		this.cost_price = cost_price;
	}

	public double getSell_price() {
		return sell_price;
	}

	public void setSell_price(double sell_price) {
		this.sell_price = sell_price;
	}
}

 
