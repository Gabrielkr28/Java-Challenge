package br.com.gabriel.services;

import br.com.gabriel.entities.Cart;
import br.com.gabriel.entities.Product;

public class CartService {

	private Cart cart;

	public CartService(Cart cart) {
		this.cart = cart;
	}

	public void addProduct(Product product) {
		cart.getProducts().add(product);
	}
	
	public void removeProduct(Product product) {
		cart.getProducts().remove(product);
	}

	public Integer totalValue() {
		Integer total = 0;
		for (Product product : cart.getProducts()) {
			total += product.getValueProduct();
		}
		return total;
	}

}
