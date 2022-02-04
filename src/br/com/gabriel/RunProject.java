package br.com.gabriel;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.gabriel.entities.Cart;
import br.com.gabriel.entities.Product;
import br.com.gabriel.services.CartService;
import br.com.gabriel.util.CountCash;

public class RunProject {

	public static void main(String[] args) {

		Product product;
		Cart cart = new Cart();
		CartService cartService = new CartService(cart);
		Integer option;
		Boolean tes = false;
		do {
			if (cart.getProducts().size() == 10) {
				JOptionPane.showMessageDialog(null, "Lista completa!");
				break;
			}

			JOptionPane.showMessageDialog(null, "Olá, informe um produto para cadastro!");

			String name = JOptionPane.showInputDialog("Nome:");
			String value = JOptionPane.showInputDialog("Valor:");

			while (!tes) {
				try {
					Integer.parseInt(value);
					tes = true;
				} catch (NumberFormatException exception) {
					tes = false;
					value = JOptionPane.showInputDialog("Valor:");
				}
			}

			product = new Product(name, Integer.parseInt(value));

			cartService.addProduct(product);

			option = menuOptions();

			while (option != 1 && option != 2) {
				option = menuOptions();
			}

		} while (option == 1);

		printProducts(cart.getProducts());

		JOptionPane.showMessageDialog(null, "Valor total dos produtos: ");

		JOptionPane.showMessageDialog(null, cartService.totalValue());

		printCells(CountCash.countCash(cartService.totalValue()));

	}

	private static Integer menuOptions() {
		return Integer.parseInt(JOptionPane.showInputDialog("Comprar mais produtos? \n 1- Sim \n 2- Finalizar Compra"));
	}

	private static void printProducts(List<Product> products) {
		JOptionPane.showMessageDialog(null, "Produtos do carrinho: ");
		String namesProduct = "";
		for (Product product : products) {
			namesProduct += product.getName().concat("\n");
		}
		JOptionPane.showMessageDialog(null, namesProduct);
	}

	private static void printCells(List<String> cells) {
		JOptionPane.showMessageDialog(null, "Minimo de notas: ");
		String cellFormat = "";
		for (String cell : cells) {
			cellFormat += cell.concat("\n");
		}
		JOptionPane.showMessageDialog(null, cellFormat);
	}
}
