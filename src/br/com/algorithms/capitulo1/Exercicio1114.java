package br.com.algorithms.capitulo1;

import edu.princeton.cs.introcs.StdOut;

/**
 * Classe com métodos para a resolução do exercício 1.1.14
 *
 */
public class Exercicio1114 {
	private static int lg(int n, int aproxAtual, int expoenteAtual) {
		if (2 * aproxAtual > n) {
			return expoenteAtual;
		}
		
		return lg(n, 2*aproxAtual, ++expoenteAtual);
	}
	
	/**
	 * Calcula o piso do logaritmo em base 2 de um inteiro positivo n.
	 * 
	 * @param n inteiro positivo cujo piso do logaritmo será calculado.
	 * @return piso do logaritmo em base 2 de n.
	 * */
	public static int lg(int n) {
		return lg(n, 1, 0);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			StdOut.printf("lg(%d) = %d\n", i, lg(i));
		}
	}
	
}
