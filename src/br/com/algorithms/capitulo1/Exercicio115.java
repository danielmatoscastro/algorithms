package br.com.algorithms.capitulo1;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * Classe com métodos para a resolução do exercício 1.1.5
 * */
public class Exercicio115 {

	public static void main(String[] args) {
		StdOut.print("Digite o primeiro número: ");
		double n1 = StdIn.readDouble();
		
		StdOut.print("Digite o segundo número: ");
		double n2 = StdIn.readDouble();
		
		boolean resultado = 0 < n1 && n1 < 1 && 0 < n2 && n2 < 1;
		StdOut.print(resultado);
	}

}
