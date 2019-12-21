package br.com.algorithms.capitulo1;

import edu.princeton.cs.introcs.StdOut;

/**
 * Classe com métodos para a resolução do exercício 1.1.11
 *
 */
public class Exercicio1111 {
	
	/**
	 * Constrói a representação como string de uma matriz booleana, representando
	 * true como '*' e false como ' '. Também insere o número de cada linha e coluna.
	 * 
	 * @param matriz matriz booleana a ser representada como string.
	 * @return representação como string da matriz.
	 * */
	public static String matriz2String(boolean[][] matriz) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("  ");
		for (int i = 0; i < matriz[0].length; i++) {
			sb.append(i + " ");
		}
		sb.append("\n");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == 0) {
					sb.append(i + " ");
				}
				
				if (matriz[i][j]) {
					sb.append("* ");
				}else {
					sb.append("  ");
				}
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
	
		boolean[][] matriz = {{true, true, true}, 
							  {false, true, false}, 
							  {true, false, true}};
		
		StdOut.print(matriz2String(matriz));
	}

}
