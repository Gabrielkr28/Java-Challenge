package br.com.gabriel.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<Product> products = new ArrayList<Product>();

	public Cart() {

	}

	public Cart(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

}
