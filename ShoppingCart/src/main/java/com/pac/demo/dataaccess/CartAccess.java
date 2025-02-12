package com.pac.demo.dataaccess;

import java.util.List;

import com.pac.demo.entity.Product;

public interface CartAccess {
	public boolean storedProducts(List<Product> cart);
}
