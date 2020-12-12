package Revisao;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LojaRoupas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Locale real = new Locale("pt", "BR");
		NumberFormat n = NumberFormat.getCurrencyInstance(real);

		double valorDesconto = 0.0;
		double valorNormal = 0.0;
		double valorTotal = 0.0;
		char opcao = ' ';

		System.out.println(" QUAL A FORMA DE PAGAMENTO:");
		System.out.println("[1] À vista ou cheque - 20% Desconto");
		System.out.println("[2] À vista no cartão de crédito 15% Desconto");
		System.out.println("[3] 2 x Preço Normal (Sem juros)");
		System.out.println("[4] 3 x Será acrescido - 10% JUROS");

		opcao = entrada.next().toUpperCase().charAt(0);

		if (opcao == '1') {

			System.out.print("Digite o valor do produto R$ ");
			valorNormal = entrada.nextDouble();

			valorDesconto = valorNormal * 0.20;
			valorTotal = (valorNormal - valorDesconto);

			System.out.println("Desconto " + n.format(valorDesconto));
			System.out.println("Valor à pagar " + n.format(valorTotal));

		} else if (opcao == '2') {
			System.out.print("Digite o valor do produto R$ ");
			valorNormal = entrada.nextDouble();

			valorDesconto = valorNormal * 0.15;
			valorTotal = (valorNormal - valorDesconto);

			System.out.println("Desconto " + n.format(valorDesconto));
			System.out.println("Valor à pagar " + n.format(valorTotal));

		} else if (opcao == '3') {
			System.out.print("Digite o valor do produto R$ ");
			valorNormal = entrada.nextDouble();

			System.out.println("Desconto " + n.format(valorDesconto));
			System.out.println("Valor à pagar " + n.format(valorNormal));

		} else if (opcao == '4') {
			System.out.print("Digite o valor do produto R$ ");
			valorNormal = entrada.nextDouble();

			valorDesconto = valorNormal * 0.10;
			valorTotal = (valorNormal + valorDesconto);

			System.out.println("Juros " + n.format(valorDesconto));
			System.out.println("Valor à pagar " + n.format(valorTotal));
		}

	}
}
