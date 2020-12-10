package LacoRepeticao;

import java.util.Scanner;

public class LeituraSucessiva {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
		apresente no final o total do somatório, a média e o total de valores lidos. 
		O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo 
		valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor 
		negativo*/

		int numero = 0;
		double media = 0.0;
		double soma = 0.0;
		int contador = 0;

		while (numero >= 0) {
			System.out.println("Digite um valor para soma: ");
			numero = entrada.nextInt();

			if (numero >= 0){
				soma = soma + numero;
				contador++;
			}
		}

		if (contador > 0){
			
			media = (soma / contador);

			System.out.println("A soma dos valor é: "+ soma);

			System.out.println("A média dos valores digitados é: "+ media);

			System.out.println("Foram contabilizados: "+ contador + " valores");
		
		}
	}
}