package LacoRepeticao;

import java.util.Scanner;

public class ContagemTela {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int inicioContagem = 233;
		int parametro = 5;

		do {

			System.out.println(inicioContagem);
			inicioContagem = inicioContagem + parametro;

			if (inicioContagem >= 300 && inicioContagem <= 400) {

				parametro = 3;
			} else {
				parametro = 5;
			}
		} while (inicioContagem <= 456);

	}

}
