package LacoRepeticao;

import java.util.Scanner;

public class MultiplicaPorTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		/*
		 * 2- Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar
		 * ele por tr�s (imprimindo o novo valor) at� que ele seja maior do que 100.
		 * Ex.: se o usu�rio digita 5, deveremos observar na tela a seguinte sequ�ncia:
		 * 5 15 45 135.
		 */

		int numero = 0;

		System.out.println("Digite um n�mero:");
		numero = entrada.nextInt();

		while (numero <= 100) {

			numero = (numero * 3);
			System.out.println("Multiplica��o do n� digitado: " + numero);

		}

	}

}