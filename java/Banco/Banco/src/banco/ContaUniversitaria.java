package banco;

import java.util.Scanner;

public class ContaUniversitaria {
	
	public static void main(String[] args) {
			
	Scanner entrada = new Scanner(System.in);
	
			double saldo = 0.0, credito = 0.0, debito = 0.0;
			int opcao;
			char continuar = ' ', condicao = ' ';
			int i = 0;
			int maxMovimentacao = 2;
			double movimentaConta = 0.0;
			

			do {
				for (int transacao = 0; transacao < 10; transacao++) {
					System.out.println("Conta Universitaria");
					System.out.println("Digite a opção de transação");
					System.out.println("[1] - MOVIMENTAÇÃO ");
					System.out.println("[2] - SALDO ");
					System.out.println("[3] - SAIR ");
					opcao = entrada.nextInt();

					if (opcao == 1) {
						System.out.println("Deseja iniciar um movimento S/N:");
						continuar = entrada.next().toUpperCase().charAt(0);
						while (continuar !='S' && continuar != 'N') {
							System.out.println("Opção inválida. Você quer iniciar (S ou N)?");
							continuar = entrada.next().toUpperCase().charAt(0);
							
						}
						while (continuar == 'S' && i < maxMovimentacao) {
							
							i++;
							System.out.println("\nVocê quer [C] Creditar | [D] Debitar");
							condicao = entrada.next().toUpperCase().charAt(0);
							while(condicao !='C' && condicao != 'D') {
								System.out.println("Opção Inválida. Você quer [C] Creditar | [D] Debitar ? ");
								condicao = entrada.next().toUpperCase().charAt(0);
								
							}
							if (condicao == 'C') {
								System.out.println("Qual o valor do depósito: R$ ");
								movimentaConta = entrada.nextDouble();	
								System.out.println("Deseja continuar (S ou N) ");
								continuar = entrada.next().toUpperCase().charAt(0);
								
								saldo += movimentaConta;
								System.out.printf("Saldo Atual: R$ %.2f", saldo,"\n");
							}					
							
							else if(condicao == 'D') {
								System.out.println("Qual o valor de saque: R$ ");
								movimentaConta = entrada.nextDouble();
								System.out.println("Deseja continuar (S ou N) ");
								continuar = entrada.next().toUpperCase().charAt(0);
								saldo -= movimentaConta;
								System.out.printf("Saldo Atual: R$ %.2f", saldo,"\n");
							}
							
							
						}
					
								while (continuar != 'S' && continuar != 'N') {
									System.out.println("Opção Inválida. Deseja continuar?");
									continuar = entrada.next().toUpperCase().charAt(0);
									
								}
						
						
						credito = entrada.nextDouble();
						saldo = saldo + credito;
					} else if (opcao == 2) {
						if (saldo <= 0.0) {
							System.out.println("Não é possível realizar o saque!");
						} else if (saldo >= debito) {
							System.out.println("Digite o valor a ser debitado");
							debito = entrada.nextDouble();
							saldo -= debito;
							if (saldo < 0) {
								System.out.println(
										"Não é possível realizar este débito. O saldo final não pode ser negativo");
								saldo = saldo + debito;
							}
							mostrarSaldo(saldo);
						}
					} else if (opcao == 3) {
						System.out.println("Saldo: R$ " + saldo);
					} else if (opcao == 0) {
						System.out.println("Encerrando acesso a conta");
						return;
					}

				}
				System.out.println(
						"Você realizou todas as possíveis transações em Conta Universitaria, deseja continuar? (S/N)");
				continuar = entrada.next().toUpperCase().charAt(0);
			} while (continuar == 'S');


	}

		private static void mostrarSaldo(double saldo) {
			// TODO Auto-generated method stub
			
		}
		}


