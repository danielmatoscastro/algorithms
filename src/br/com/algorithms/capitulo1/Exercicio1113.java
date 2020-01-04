package br.com.algorithms.capitulo1;

import edu.princeton.cs.introcs.StdOut;

public class Exercicio1113 {
	
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
