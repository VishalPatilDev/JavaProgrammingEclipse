package com.pac.demo.entity;

public class Product {
	int id;
	int qty;
	public Product() {
		
	}
	public Product(int id, int qty) {
		super();
		this.id = id;
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	

}
