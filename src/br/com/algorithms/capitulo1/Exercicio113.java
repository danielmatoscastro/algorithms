package br.com.algorithms.capitulo1;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Exercicio113 {
	
	public static void main(String[] args) {
		StdOut.print("Digite o primeiro número: ");
		double n1 = StdIn.readDouble();
		
		StdOut.print("Digite o segundo número: ");
		double n2 = StdIn.readDouble();
		
		StdOut.print("Digite o terceiro número: ");
		double n3 = StdIn.readDouble();
		
		if (n1 == n2 && n2 == n3) {
			StdOut.print("Iguais");
		}else {
			StdOut.print("Diferentes");
		}
		
	}
}
