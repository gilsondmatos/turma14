package Atividade1;

import java.util.Scanner;
import java.text.DecimalFormat;


public class mediaPonderada {
	


	public static void main(String[] args) {
	
		
		/*
		 * 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
		 * calcule a seguinte express�o.
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
		System.out.println("A m�dia do aluno �: " + df.format(mediaPonderada));

	}

}
