package Atividade1;

import java.util.Scanner;

public class anoNascimento {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idadeAtual;

		mostra("DIGITE O ANO DO SEU NASCIMENTO: ");
		idadeAtual = leia.nextInt();
		mostra("A idade atual �: " + leitorIdade(idadeAtual));

		if (leitorIdade(idadeAtual) < 18) {

			mostra("Infanto-Juvenil");

			// else if ((leitorIdade(idadeAtual) >= 18) && (leitorIdade(idadeAtual) <= 60))
		} else if ((leitorIdade(idadeAtual) <= 60)) {

			mostra("Adulto");

		} else {

			mostra("Idoso");
		}

	}

	public static int leitorIdade(int anoNascimento) {

		int idade = 2020 - anoNascimento;

		return idade;

	}

	public static void mostra(String frase) {

		System.out.println(frase);

	}
}
