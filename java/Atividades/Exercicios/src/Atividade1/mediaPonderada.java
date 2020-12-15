package Atividade1;

import java.util.Scanner;
import java.text.DecimalFormat;


public class mediaPonderada {
	


	public static void main(String[] args) {
	
		
		/*
		 * 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		 * calcule a seguinte expressão.
		 */

		Scanner leia = new Scanner(System.in);

		double nota1, nota2, nota3, mediaPonderada;

		System.out.println("Digite a primeira nota:");
		nota1 = leia.nextDouble();

		System.out.println("Digite a segunda nota:");
		nota2 = leia.nextDouble();

		System.out.println("Digite a terceira nota:");
		nota3 = leia.nextDouble();

		mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);

		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("A média do aluno é: " + df.format(mediaPonderada));

	}

}
