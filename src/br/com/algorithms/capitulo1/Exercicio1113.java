package br.com.algorithms.capitulo1;

import edu.princeton.cs.introcs.StdOut;

/**
 * Classe com métodos para a resolução do exercício 1.1.13
 *
 */
public class Exercicio1113 {
	
	/**
	 * Dada uma matriz, imprime sua transposta na tela.
	 * 
	 * @param matriz genérica cuja transposta será impressa.
	 * */
	public static <T> void printTransposta(T[][] matriz){
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				StdOut.print(matriz[j][i].toString() + " ");
			}
			StdOut.print("\n");
		}
	}
	
	public static void main(String[] args) {
		Integer[][] matriz = {{1, 2, 3},
						  {4, 5, 6},
						  {7, 8, 9}};
		
		printTransposta(matriz);
	}
}
