package br.com.algorithms.capitulo1;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdOut;

/**
 * Classe com métodos para a resolução do exercício 1.1.15
 *
 */
public class Exercicio1115 {

	/**
	 * Calcula o histograma de um array de inteiros não negativos.
	 * 
	 * @param a array de inteiros não negativos cujo histograma será calculado.
	 * @return histograma do array a.
	 * */
	public static int[] histograma(int[] a) {
		int max = Arrays.stream(a).max().getAsInt();
		int[] histograma = new int[max+1];
		
		for (int i : a) {
			histograma[i]++;
		}
		
		return histograma;
	}
	
	public static void main(String[] args) {
		int[] a = {0, 0, 0, 1, 1, 1, 2, 3, 3, 5, 5, 5, 7, 7, 7, 7, 7, 8, 10};
		
		int[] histograma = histograma(a);
		
		for (int i = 0; i < histograma.length; i++) {
			StdOut.printf("%d: %d\n", i, histograma[i]);
		}
	}
}
