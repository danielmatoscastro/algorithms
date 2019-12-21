package br.com.algorithms.capitulo1;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * Classe com métodos para a resolução do exercício 1.1.9
 * */
public class Exercicio119 {
	
	/**
	 * Constrói a representação em  binário de um inteiro positivo.
	 * 
	 * @param n inteiro positivo a ser convertido para binário.
	 * @return a representação de n em binário.
	 * */
	public static String int2String(int n) {
		StringBuilder sb = new StringBuilder();
		
		while (n > 0) {
			sb.append(n % 2);
			n = n / 2;
		}
		
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		StdOut.print("Digite um inteiro positivo: ");
		int n = StdIn.readInt();
		
		StdOut.print("Em binário: ");
		StdOut.print(int2String(n));
	}

}
