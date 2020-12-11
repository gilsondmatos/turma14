package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class DadoLancamento {
	
	public static void main(String[] args) {
		/*
		 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado.] Faça um
		 * programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir
		 * determine e imprima a média aritmética dos lançamentos, contabilize e
		 * apresente também quantas foram as ocorrências da maior pontuação.
		 *
		 */
		Scanner leia = new Scanner(System.in);
		
		Random numeroRandomico = new Random(); // objeto
		final int VEZES = 10;
		double media = 0;
		double total = 0;
		int lancamentos[] = new int[VEZES];

		for (int x = 0; x < VEZES; x++) {

			lancamentos[x] = numeroRandomico.nextInt(6) + 1;
			System.out.printf("Lancamento %d é igual %d\n", (x + 1), lancamentos[x]);
			total = lancamentos[x] + total;

			System.out.printf("Valor no random %.0f\n", Math.random() * 6);
		}

		media = total / VEZES;

		System.out.printf("Média %.2f", media);

	}
}