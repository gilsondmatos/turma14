package b2bank;

import java.util.Scanner;

public class ContaUniversitaria extends ContaEspecial {

	private double emprestimoUniversitario;

	public double getEmprestimoUniversitario() {
		return emprestimoUniversitario;
	}

	public void setEmprestimoUniversitario(double emprestimoUniversitario) {
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
	
	
}
	/*
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double valorASerSacado = 0.00;
		double valorASerDepositado = 0.00;
		int opcao = 0;
		String numeroConta;
		char continuar = '0';

		Conta contaGilson = new Conta();
		contaGilson.titular = new Cliente();
		contaGilson.titular.nome = "Gilson";

		System.out.print("Digite o n�mero da sua conta: ");
		numeroConta = leia.next();
		contaGilson.setNumero(numeroConta);
		System.out.println("Saldo Atual: " + contaGilson.getSaldo());

		System.out.println("Digite o n�mero da conta: ");

		do {
			for (int transacao = 0; transacao < 10; transacao++) {
				System.out.println("Digite a op��o de transa��o");
				System.out.println("1 - Cr�dito ");
				System.out.println("2 - D�bito ");
				System.out.println("3 - Saldo ");
				System.out.println("0 - Sair");
				opcao = leia.nextInt();

				if (opcao == 1) {

					System.out.println("Digite o valor a ser creditado: ");
					valorASerDepositado = leia.nextDouble();
					contaGilson.deposita(valorASerDepositado);

				} else if (opcao == 2) {

					if (contaGilson.getSaldo() <= 0.0) {

						System.out.println("N�o � poss�vel realizar o saque!");

					} else if (contaGilson.getSaldo() >= valorASerSacado) {

						System.out.println("Digite o valor a ser debitado:");
						valorASerSacado = leia.nextDouble();
						contaGilson.saca(valorASerSacado);

						if (contaGilson.getSaldo() < 0) {
							System.out.println("N�o � poss�vel realizar este d�bito. O saldo n�o pode ser nagativo.");

						}

						System.out.println("Saldo: R$ " + contaGilson.getSaldo());
					}
				} else if (opcao == 3) {

					System.out.println("Saldo: R$ " + contaGilson.getSaldo());

				} else if (opcao == 0) {
					System.out.println("Encerrando acesso a conta");
					System.exit(0);
				}
			}

			System.out.println(
					"Voc� realizou todas as poss�veis transa��es em Conta Universitaria, deseja continuar? (S/N)");
			continuar = leia.next().toUpperCase().charAt(0);

		} while (continuar == 'S');

	}
*/

