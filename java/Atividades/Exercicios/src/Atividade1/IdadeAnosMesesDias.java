package Atividade1;

import java.util.Scanner;

public class IdadeAnosMesesDias {

	public static void main(String[] args) {

		/*
		 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		 * expressa em anos, meses e dias.
		 */

		Scanner leia = new Scanner(System.in);

		int idade, totalDias, meses, dias;
		int diasAno = 365;
		int diasMes = 30;

		System.out.println("Digite sua idade em dias: ");
		totalDias = leia.nextInt();

		idade = totalDias / diasAno;
		meses = (totalDias / 365) % diasMes;
		dias = (totalDias % 365) % 30;

		System.out.println("Você tem " + idade + " anos " + meses + " meses e " + dias + " dias");

	}

}

