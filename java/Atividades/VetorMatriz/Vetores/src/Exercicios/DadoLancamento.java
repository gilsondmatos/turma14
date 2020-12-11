package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class DadoLancamento {
	
	public static void main(String[] args) {
		/*
		 * 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado.] Fa�a um
		 * programa que gere um vetor com os lan�amentos, escreva esse vetor. A seguir
		 * determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e
		 * apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
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
			System.out.printf("Lancamento %d � igual %d\n", (x + 1), lancamentos[x]);
			total = lancamentos[x] + total;

			System.out.printf("Valor no random %.0f\n", Math.random() * 6);
		}

		media = total / VEZES;

		System.out.printf("M�dia %.2f", media);

	}
}