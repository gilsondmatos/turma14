package LacoRepeticao;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// PARA
		// 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		// coletando dados sobre o salário e número de filhos. A prefeitura deseja
		// saber:

		// a) média do salário da população;
		// b) média do número de filhos;
		// c) maior salário;

		int habitante = 2;
		String respFamiliar;
		double salario = 0.0, maiorSalario = 0.0, percSalario = 0.0;
		double mediaSalarios = 0.0, somaSalario = 0.0, contaCem = 0.0;
		int filhos = 0, mediaFilhos = 0, somaFilhos = 0;

		for (int i = 1; i <= habitante; i++) {
			System.out.print("Digite o nome do responsável Familiar: ");
			respFamiliar = entrada.next();

			System.out.print("Digite o valor do seu salário: ");
			salario = entrada.nextDouble();

			System.out.print("Quantos filhos você tem: ");
			filhos = entrada.nextInt();
			pulaLinha();

			// Soma dos Salário
			somaSalario = (somaSalario + salario);
			mediaSalarios = (somaSalario / habitante);

			// Soma dos Filhos
			somaFilhos = (somaFilhos + filhos);
			mediaFilhos = (somaFilhos / habitante);

			// Maior Salário
			if (salario > maiorSalario) {

				maiorSalario = salario;
			}

			if (salario <= 100) {
				contaCem++;
			}

			percSalario = ((contaCem / habitante) * 100);
		}

		System.out.println("A média de Salarios é R$: " + mediaSalarios);
		System.out.println("A média de Filhos é: " + mediaFilhos);
		System.out.println("O maior Salario é: " + maiorSalario);
		System.out.println("Percentual de pessoas com salário até R$100,00: " + percSalario + "%");

	}

	public static void pulaLinha() {
		System.out.println();
	}

}
