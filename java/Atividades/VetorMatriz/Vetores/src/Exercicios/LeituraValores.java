package Exercicios;

import java.util.Scanner;

public class LeituraValores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] valores = new int[5];
		int maiorValor = 0;

		for (int i = 0; i < valores.length; i++) {

			System.out.println("Digite um Valor: ");
			valores[i] = leia.nextInt();
			
		}

		// encontra o maior valor
		maiorValor = valores[0];

		for (int i = 1; i < valores.length; i++) {
			if (valores[i] > maiorValor);
				
			{
				maiorValor = valores[i];
			}
		}
		System.out.println("Maior Valor: " + maiorValor);
	}
}


