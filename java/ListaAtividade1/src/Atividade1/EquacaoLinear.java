package Atividade1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EquacaoLinear {

	//7. Um sistema de equações lineares do tipo: 
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double A, B, C, D, E, F, X, Y;

		System.out.println("Digite valor de C:");
		C = leia.nextDouble();

		System.out.println("Digite valor de E:");
		E = leia.nextDouble();

		System.out.println("Digite valor de B:");
		B = leia.nextDouble();

		System.out.println("Digite valor de F:");
		F = leia.nextDouble();

		System.out.println("Digite valor de A:");
		A = leia.nextDouble();

		System.out.println("Digite valor de D:");
		D = leia.nextDouble();

		DecimalFormat df = new DecimalFormat("##.##");
		X = (((C * E) - (B * F) / (A * E) - (B * D)));
		System.out.println("O Valor de X é: "+ df.format(X));

		Y = (((A * F) - (C * D)) / ((A * E) - (B * D)));
		System.out.println("O valor de Y é: " + df.format(Y));

	}

}
