package ExerciciosLacoCondicional;

import java.util.Scanner;

public class clubNatacao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade;
		String nomeAluno;

		System.out.println("▓▓▓▓▓▓▓▓▓ CLUB DE NATAÇÃO  ▓▓▓▓▓▓▓▓▓▓\n");
		System.out.print("Digite seu nome: ");
		nomeAluno = leia.next();

		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();

		if (idade <= 7) {

			System.out.print("Você é da categoria Infantil A");

		} else if (idade <= 11) {
			System.out.print("Você é da categoria Infantil B");

		} else if (idade <= 13) {
			System.out.print("Você é da categoria Juvenil A");

		} else if (idade <= 17) {
			System.out.print("Você é da categoria Juvenil B");

		} else {
			System.out.print("Você é da categoria Adulto");
		}

	}
}
