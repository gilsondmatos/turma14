package banco;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TesteMenuBanco {
		public static final int TOTAL_CLIENTE = 40;
		public static int contaDigitada;
		public static int conta [] = new int [TOTAL_CLIENTE];
		public static String clientes[] = {"Allen de Lima Vieira", "Andr� de Brito Silva da Costa","B�rbara Liboni Guerra",	
				"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
				"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
				"Ewerton Inacio Lima","Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco Jos� Pires",
				"Gabriel S�rgio Nascimento Santos Gon�alves", "Gide�o da Silva Idelfonso",
				"GILSON AMORIM DE MATOS","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles",
				"Heloisa Beatriz de Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
				"Jackeline Akemi de Moura","Jos� Jorge Hauck J�nior","Juliana Santos Andr�",
				"K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas anseloni barros",
				"Lucas Gon�alves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalh�es",
				"Marcos Eduardo Gomes Gon�alves","Micaely da Silva Lima","Rafaela Oliveira Silva",
				"Tiago dos Santos Martins","Ver�nica Navarro Almenara","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};
		public static char genero [] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','F','F','F','M','F',
				'M','F','M','M','M','M','M','F','F','M','F','M','M'};
		public static int tipo[] = new int[TOTAL_CLIENTE];
		public static double valor[] = new double[4];
		public static String nome;
		public static Scanner leia = new Scanner(System.in);
		public static double saldo[] = new double[TOTAL_CLIENTE];
		public static double saldoEmprestimo[] = new double[TOTAL_CLIENTE];
		public static int aniversario[] = new int[TOTAL_CLIENTE];
		
		
		public static void main(String[] args) {
			inicializarContas();
			while (true) {
				digitarConta(); 
				linha(50);
				saudacao();
				linha(50);
				if (tipo[contaDigitada] == 1) {
					contaPoupanca();
				} else if (tipo[contaDigitada] == 2) {
					contaCorrente();
				} else if (tipo[contaDigitada] == 3) {
					contaEspecial();
				} else if (tipo[contaDigitada] == 4) {
					contaEmpresarial();
				} else if (tipo[contaDigitada] == 5) {
					contaUniversitaria();
				}
			}
		}

		public static void contaPoupanca() {
			double credito = 0.0, debito = 0.0;
			int opcao;
			char continuar;
			
			int aniversarioDigitado;
			Scanner entrada = new Scanner(System.in);
			
			do {
				for (int transacao = 0; transacao < 10; transacao++) {
					System.out.println("Conta Poupan�a");
					System.out.println("Digite a op��o de transa��o");
					System.out.println("1 - Cr�dito ");
					System.out.println("2 - D�bito ");
					System.out.println("3 - Saldo ");
					System.out.println("4 - Anivers�rio ");
					System.out.println("0 - Sair");
					opcao = entrada.nextInt();

					if (opcao == 1) {
						System.out.println("Digite o valor a ser creditado");
						credito = entrada.nextDouble();
						saldo[contaDigitada] = saldo[contaDigitada] + credito;
						mostrarSaldo(saldo[contaDigitada]);
					} else if (opcao == 2) {
						if (saldo[contaDigitada] <= 0.0) {
							System.out.println("N�o � poss�vel realizar o saque!");
						} else if (saldo[contaDigitada] >= debito) {
							System.out.println("Digite o valor a ser debitado");
							debito = entrada.nextDouble();
							saldo[contaDigitada] -= debito;
							if (saldo[contaDigitada] < 0) {
								System.out.println(
										"N�o � poss�vel realizar este d�bito. O saldo final n�o pode ser negativo");
								saldo[contaDigitada] = saldo[contaDigitada] + debito;
							}
							mostrarSaldo(saldo[contaDigitada]);
						}				
					} else if (opcao == 3) {
						System.out.println("Saldo: R$ " + saldo[contaDigitada]);
					}else if(opcao == 4) {
						System.out.println("Digite o anivers�rio da conta");
						aniversarioDigitado = entrada.nextInt();
						if(aniversarioDigitado == aniversario[contaDigitada]) {
							saldo[contaDigitada] = saldo[contaDigitada] +(saldo[contaDigitada] * 0.05);
							System.out.print("\nO sistema atribuiu data de anivers�rio dia "+ aniversario[contaDigitada]+"\n\n");
							System.out.println("Saldo atualizado\n");
							System.out.print("Novo saldo ");
							mostrarSaldo(saldo[contaDigitada]);
							System.out.println();
						}else if(aniversarioDigitado != aniversario[contaDigitada]) {
							System.out.println("N�o houve reajuste de 0.5% no saldo");
							System.out.print("\nO sistema atribuiu data de anivers�rio dia "+ aniversario[contaDigitada]+"\n\n");
						}	
					} else if (opcao == 0) {
						System.out.println("Encerrando acesso a conta");
						return;
					}

				}
				System.out
						.println("Voc� realizou todas as poss�veis transa��es em Conta Poupan�a, deseja continuar? (S/N)");
				continuar = entrada.next().toUpperCase().charAt(0);
			} while (continuar == 'S');
		}
		
		public static void contaCorrente() {
			double saldo = 0.0, credito = 0.0, debito = 0.0;
			int opcao;
			char continuar;
			Scanner entrada = new Scanner(System.in);

			do {

				for (int transacao = 0; transacao < 10; transacao++) {
					System.out.println("Conta Corrente");
					System.out.println("Digite a op��o de transa��o");
					System.out.println("1 - Cr�dito ");
					System.out.println("2 - D�bito ");
					System.out.println("3 - Saldo ");
					System.out.println("0 - Sair");
					opcao = entrada.nextInt();

					if (opcao == 1) {
						System.out.println("Digite o valor a ser creditado");
						credito = entrada.nextDouble();
						saldo = saldo + credito;
						mostrarSaldo(saldo);
					} else if (opcao == 2) {
						if (saldo <= 0.0) {
							System.out.println("N�o � poss�vel realizar o saque!");
						} else if (saldo >= debito) {
							System.out.println("Digite o valor a ser debitado");
							debito = entrada.nextDouble();
							saldo -= debito;
							if (saldo < 0) {
								System.out.println(
										"N�o � poss�vel realizar este d�bito. O saldo final n�o pode ser negativo");
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
				System.out
						.println("Voc� realizou todas as poss�veis transa��es em Conta Corrente, deseja continuar? (S/N)");
				continuar = entrada.next().toUpperCase().charAt(0);
			} while (continuar == 'S');

		}

		public static void contaEspecial() {
			double saldo = 0.0, credito = 0.0, debito = 0.0;
			int opcao;
			char continuar;
			Scanner entrada = new Scanner(System.in);

			do {
				for (int transacao = 0; transacao < 10; transacao++) {
					System.out.println("Conta Especial");
					System.out.println("Digite a op��o de transa��o");
					System.out.println("1 - Cr�dito ");
					System.out.println("2 - D�bito ");
					System.out.println("3 - Saldo ");
					System.out.println("0 - Sair");
					opcao = entrada.nextInt();

					if (opcao == 1) {
						System.out.println("Digite o valor a ser creditado");
						credito = entrada.nextDouble();
						saldo = saldo + credito;
						mostrarSaldo(saldo);
					} else if (opcao == 2) {
						if (saldo <= 0.0) {
							System.out.println("N�o � poss�vel realizar o saque!");
						} else if (saldo >= debito) {
							System.out.println("Digite o valor a ser debitado");
							debito = entrada.nextDouble();
							saldo -= debito;
							if (saldo < 0) {
								System.out.println(
										"N�o � poss�vel realizar este d�bito. O saldo final n�o pode ser negativo");
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
				System.out
						.println("Voc� realizou todas as poss�veis transa��es em Conta Especial, deseja continuar? (S/N)");
				continuar = entrada.next().toUpperCase().charAt(0);
			} while (continuar == 'S');

		}

		public static void contaEmpresarial() {
			int opcao;
			char continuar;
			do {
				for (int transacao = 0; transacao < 10; transacao++) {
					System.out.println("Conta Empresarial");
					System.out.println("Digite a op��o de transa��o");
					System.out.println("1 - Movimento ");
					System.out.println("2 - Saldo ");
					System.out.println("3 - Empr�stimo ");
					System.out.println("0 - Sair");
					opcao = leia.nextInt();
					if (opcao == 1) {
						menuMovimento();
					} else if (opcao == 2) {
						System.out.println("Saldo: R$ " + saldo[contaDigitada]);
					} else if (opcao == 3) {
						solicitarEmprestimo();
					} else if (opcao == 0) {
						System.out.println("Encerrando acesso a conta");
						return;
					}
				}
				System.out.println(
						"Voc� realizou todas as poss�veis transa��es em Conta Empresarial, deseja continuar? (S/N)");
				continuar = leia.next().toUpperCase().charAt(0);
			} while (continuar == 'S');
		}
		


		public static void contaUniversitaria() {
			double saldo = 0.0, credito = 0.0, debito = 0.0;
			int opcao;
			char continuar = ' ', condicao = ' ';
			int i = 0;
			int maxMovimentacao = 1;
			double movimentaConta;
			
			Scanner entrada = new Scanner(System.in);

			do {
				for (int transacao = 0; transacao < 10; transacao++) {
					System.out.println("Conta Universitaria");
					System.out.println("Digite a op��o de transa��o");
					System.out.println("[1] - MOVIMENTA��O ");
					System.out.println("[2] - SALDO ");
					System.out.println("[3] - SAIR ");
					opcao = entrada.nextInt();

					if (opcao == 1) {
						System.out.println("Deseja iniciar um movimento S/N:");
						continuar = leia.next().toUpperCase().charAt(0);
						while (continuar !='S' && continuar != 'N') {
							System.out.println("Op��o inv�lida. Voc� quer ininiar (S ou N)?");
							continuar = entrada.next().toUpperCase().charAt(0);
							
						}
						while (continuar == 'S' && i < maxMovimentacao) {
							
							i++;
							System.out.println("Voc� quer [C] Creditar | [D] Debitar");
							condicao = entrada.next().toUpperCase().charAt(0);
							while(condicao !='C' && condicao != 'D') {
								System.out.println("Op��o Invl�ida. Voc� quer [C] Creditar | [D] Debitar ? ");
								condicao = entrada.next().toUpperCase().charAt(0);
							}
							if (condicao == 'C') {
								System.out.println("Qual o valor do dep�sito: R$ ");
								movimentaConta = entrada.nextDouble();						
								
							}
							
						}
						
						
						credito = entrada.nextDouble();
						saldo = saldo + credito;
					} else if (opcao == 2) {
						if (saldo <= 0.0) {
							System.out.println("N�o � poss�vel realizar o saque!");
						} else if (saldo >= debito) {
							System.out.println("Digite o valor a ser debitado");
							debito = entrada.nextDouble();
							saldo -= debito;
							if (saldo < 0) {
								System.out.println(
										"N�o � poss�vel realizar este d�bito. O saldo final n�o pode ser negativo");
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
						"Voc� realizou todas as poss�veis transa��es em Conta Universitaria, deseja continuar? (S/N)");
				continuar = entrada.next().toUpperCase().charAt(0);
			} while (continuar == 'S');

		}

		public static void linha(int tamanho) {
			for (int x = 0; x < tamanho; x++) {
				System.out.print("-");
			}
			System.out.println();
		}

		public static void mostrarSaldo(Double saldo) {
			System.out.println("Saldo: R$ " + saldo);
		}

		public static String opcaoGenero(char genero) {
			if (genero == 'M') {
				return "AAA";
			} else if (genero == 'F') {
				return "BBB";
			} else {
				return "CCC";
			}
		}
		
		private static void digitarConta() {
			while (true) {
				System.out.println("Digite o n�mero da sua conta: ");
				contaDigitada = leia.nextInt();
				if (contaDigitada < 1 || contaDigitada > TOTAL_CLIENTE + 1) {
					System.out.println("Voc� n�o possui uma conta no banco");
				} else {
					contaDigitada -= 1;
					break;
				}
			}
		}
		
		public static void saudacao() {
			if (genero[contaDigitada] == 'M') {
				System.out.println("Bem vindo ao Banco G2! Sr. " + clientes[contaDigitada]);
			} else if (genero[contaDigitada] == 'F') {
				System.out.println("Bem vinda ao Banco G2! Sra. " + clientes[contaDigitada]);
			} else {
				System.out.println("Bem vindo(a) ao Banco G2! Sr(a). " + clientes[contaDigitada]);
			}
		}
		
		private static void inicializarContas() {
			for (int i = 0; i < TOTAL_CLIENTE; i++) {
				conta[i] = i;
				tipo[i] = ThreadLocalRandom.current().nextInt(1, 6);
				saldo[i] = 0.0;
				if (tipo[i] == 1) {
					aniversario[i] = ThreadLocalRandom.current().nextInt(1, 31);
				}
				if (tipo[i] == 4) {
					saldoEmprestimo[i] = 10000;
				}
			}
		}
		
		private static void perguntarEmprestimo() {
			char opcao;
			if (saldoEmprestimo[contaDigitada] > 0) {
				System.out.println("Deseja realizar o empr�stimo? (S/N)");
				opcao = leia.next().toUpperCase().charAt(0);
				if (opcao == 'S') {
					solicitarEmprestimo();
				}
			}
		}
		
		private static void solicitarEmprestimo() {
			double valorEmprestimo;
			if (saldoEmprestimo[contaDigitada] == 0) {
				System.out.println("Saldo do empr�stimo zerado!");
				return;
			}
			do {
				System.out.println("Seu saldo atual de empr�stimo � de: R$ " + saldoEmprestimo[contaDigitada]);
				System.out.println("Quanto deseja retirar do empr�stimo?");
				valorEmprestimo = leia.nextDouble();
				if (valorEmprestimo > saldoEmprestimo[contaDigitada]) {
					System.out.println("Valor de empr�stimo ultrapassou o saldo de empr�stimo!");
				}
				if (valorEmprestimo < 0) {
					System.out.println("Valor de empr�stimo n�o pode ser negativo!");
				} 
			} while(valorEmprestimo > saldoEmprestimo[contaDigitada] || valorEmprestimo < 0);
			saldoEmprestimo[contaDigitada] -= valorEmprestimo;
			saldo[contaDigitada] += valorEmprestimo;
			System.out.println("Saldo atual do empr�stimo: R$ " + saldoEmprestimo[contaDigitada]);
			System.out.println("Saldo atual da conta: R$ " + saldo[contaDigitada]);
		}

		private static void menuMovimento() {
			int opcao;
			double credito, debito;
			System.out.println("Digite a op��o de transa��o");
			System.out.println("1 - Cr�dito ");
			System.out.println("2 - D�bito ");
			System.out.println("0 - Sair");
			opcao = leia.nextInt();
			if (tipo[contaDigitada] == 1) {
				
			} else if (tipo[contaDigitada] == 2) {
				
			} else if (tipo[contaDigitada] == 3) {
				
			} else if (tipo[contaDigitada] == 4) {
				if (opcao == 1) {
					mostrarSaldo(saldo[contaDigitada]);
					perguntarEmprestimo();
					System.out.println("Digite o valor a ser creditado");
					credito = leia.nextDouble();
					saldo[contaDigitada] = saldo[contaDigitada] + credito;
					mostrarSaldo(saldo[contaDigitada]);
				} else if (opcao == 2) {
					perguntarEmprestimo();
					System.out.println("Digite o valor a ser debitado");
					debito = leia.nextDouble();
					if (saldo[contaDigitada] - debito <= 0.0 && (saldo[contaDigitada] - debito > saldoEmprestimo[contaDigitada])) {
						mostrarSaldo(saldo[contaDigitada]);
						System.out.println("N�o � poss�vel realizar o saque, seu saldo est� negativo!");
					} else if (saldo[contaDigitada] - debito <= 0.0 && (saldo[contaDigitada] - debito <= saldoEmprestimo[contaDigitada])) {
						System.out.println("Seu saldo � insuficiente para esta transa��o");
						perguntarEmprestimo();
						if (saldo[contaDigitada] - debito < 0) {
							System.out.println("N�o foi poss�vel realizar o saque!");
							return;
						} else {
							saldo[contaDigitada] -= debito;
							mostrarSaldo(saldo[contaDigitada]);
						}
					} else {
						saldo[contaDigitada] -= debito;
						mostrarSaldo(saldo[contaDigitada]);
					}
				} else {
					return;
				}
			} else if (tipo[contaDigitada] == 5) {
				
			} else {
				System.out.println("Op��o inv�lida!");
			}
		}
	}


