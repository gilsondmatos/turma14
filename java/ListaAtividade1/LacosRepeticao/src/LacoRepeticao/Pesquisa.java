package LacoRepeticao;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// PARA
		// 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		// coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja
		// saber:

		// a) m�dia do sal�rio da popula��o;
		// b) m�dia do n�mero de filhos;
		// c) maior sal�rio;

		int habitante = 2;
		String respFamiliar;
		double salario = 0.0, maiorSalario = 0.0, percSalario = 0.0;
		double mediaSalarios = 0.0, somaSalario = 0.0, contaCem = 0.0;
		int filhos = 0, mediaFilhos = 0, somaFilhos = 0;

		for (int i = 1; i <= habitante; i++) {
			System.out.print("Digite o nome do respons�vel Familiar: ");
			respFamiliar = entrada.next();

			System.out.print("Digite o valor do seu sal�rio: ");
			salario = entrada.nextDouble();

			System.out.print("Quantos filhos voc� tem: ");
			filhos = entrada.nextInt();
			pulaLinha();

			// Soma dos Sal�rio
			somaSalario = (somaSalario + salario);
			mediaSalarios = (somaSalario / habitante);

			// Soma dos Filhos
			somaFilhos = (somaFilhos + filhos);
			mediaFilhos = (somaFilhos / habitante);

			// Maior Sal�rio
			if (salario > maiorSalario) {

				maiorSalario = salario;
			}

			if (salario <= 100) {
				contaCem++;
			}

			percSalario = ((contaCem / habitante) * 100);
		}

		System.out.println("A m�dia de Salarios � R$: " + mediaSalarios);
		System.out.println("A m�dia de Filhos �: " + mediaFilhos);
		System.out.println("O maior Salario �: " + maiorSalario);
		System.out.println("Percentual de pessoas com sal�rio at� R$100,00: " + percSalario + "%");

	}

	public static void pulaLinha() {
		System.out.println();
	}

}
