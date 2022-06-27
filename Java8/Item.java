package com.yash.assignment;

public class Item {

	int ItemId;
	String ItemName, Category;
	int Price;
	String DOM, DOE;

	public Item(int itemId, String itemName, String category, int price, String dOM, String dOE) {
		super();
		ItemId = itemId;
		ItemName = itemName;
		Category = category;
		Price = price;
		DOM = dOM;
		DOE = dOE;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getItemId() {
		return ItemId;
	}

	public void setItemId(int itemId) {
		ItemId = itemId;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getDOM() {
		return DOM;
	}

	public void setDOM(String dOM) {
		DOM = dOM;
	}

	public String getDOE() {
		return DOE;
	}

	public void setDOE(String dOE) {
		DOE = dOE;
	}

}
