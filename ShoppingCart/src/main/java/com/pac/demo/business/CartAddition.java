package com.pac.demo.business;

import java.util.ArrayList;
import java.util.List;

import com.pac.demo.dataaccess.CartAccess;
import com.pac.demo.entity.Product;
import com.pac.demo.persistance.DatabasePersistance;

public class CartAddition {
	List<Product>  cart = new ArrayList<>();
	public String addToCart(Product info) {
		cart.add(info);
		return "continue";
	}
	public boolean checkOut() {
		CartAccess dao = new DatabasePersistance();
		return dao.storedProducts(cart);
	}

}
