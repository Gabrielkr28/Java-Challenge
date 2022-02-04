package br.com.gabriel.util;

import java.util.ArrayList;
import java.util.List;

public class CountCash {

	private CountCash() {
	}

	/**
	 * Metodo responsavel pelo calculo de notas necessarias de um determinado valor
	 * informado.
	 * 
	 * @param valor Double - referente ao valor de notas.
	 * @return List<String> - Referente a lista de celulas calculadas no metodo.
	 *         Ex(5 notas de 100).
	 * @author Gabriel Krzizanowski gabrielkrzizanowski@gmail.com
	 * 
	 */
	public static List<String> countCash(Integer valor) {
		Integer[] cedulas = { 100, 50, 25, 10, 5, 2, 1 };
		List<String> usedCells = new ArrayList<>();

		for (Integer cedula : cedulas) {
			if (valor >= cedula) {
				String cellsQuantity = valor / cedula + " notas de " + cedula;
				usedCells.add(cellsQuantity);
				valor = valor % cedula;
			}
		}
		return usedCells;
	}
}