package LacoRepeticao;

import java.util.Scanner;

public class LeituraSucessiva {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		/*Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
		apresente no final o total do somat�rio, a m�dia e o total de valores lidos. 
		O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo 
		valores positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor 
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

			System.out.println("A soma dos valor �: "+ soma);

			System.out.println("A m�dia dos valores digitados �: "+ media);

			System.out.println("Foram contabilizados: "+ contador + " valores");
		
		}
	}
}