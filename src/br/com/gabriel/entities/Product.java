package br.com.gabriel.entities;

public class Product {

	private String name;
	private Integer valueProduct;

	public Product() {

	}

	public Product(String name, Integer valueProduct) {
		this.name = name;
		this.valueProduct = valueProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValueProduct() {
		return valueProduct;
	}

	public void setValueProduct(Integer valueProduct) {
		this.valueProduct = valueProduct;
	}

}
