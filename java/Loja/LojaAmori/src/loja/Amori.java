package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Amori {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();
		int carrinhoCompra[] = new int[10];
		int opcao, anoNascimento, quantidadeProdutos;
		double somaTotal, valorProduto;
		String nome, codUser;
		char continuar = 'S', genero;
		
		produtos.add(new Produto("BOL-100", "BOLO DE CENOURA", 30, 10));
		produtos.add(new Produto("BOL-101", "BOLO DE MANDIOCA", 25, 10));
		produtos.add(new Produto("BOL-102", "BOLO DE COCO", 24, 10));
		produtos.add(new Produto("BOL-103", "BOLO DE ABACAXI", 60, 10));
		produtos.add(new Produto("BOL-104", "BOLO DE CHOCOLATE", 25, 10));
		produtos.add(new Produto("BOL-105", "BOLO DE NOZES", 75, 10));
		produtos.add(new Produto("BOL-106", "BOLO DE KITKAT", 70, 10));
		produtos.add(new Produto("BOL-107", "BOLO DE PREST�GIO", 55, 10));
		produtos.add(new Produto("BOL-108", "BOLO RED VELVET", 72, 10));
		produtos.add(new Produto("BOL-109", "BOLO MARMORE", 30, 10));
		
		do {
			menuInicial();
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				somaTotal = 0;
				sc.nextLine();
				System.out.println("Digite seu nome: ");
				nome = sc.nextLine();
				do {
					System.out.println("[M] para Masculino, [F] para feminino: ");
					genero = sc.next().toUpperCase().charAt(0);
				} while ((genero != 'M') && (genero != 'F'));
				
				do {
					System.out.println("Digite seu ano de nascimento (AAAA): ");
					anoNascimento = sc.nextInt();
				
				} while (anoNascimento < 1900);
				Cliente cliente = new Cliente(nome, genero, anoNascimento);
				System.out.printf("Seja bem vind%s, %s\n\n", cliente.retornaGenero(), cliente.getNome());
				for (int i = 0; i < 10; i++) {
					carrinhoCompra[i] = 0;
				}
				do {
					mostrarProdutos(produtos);
					System.out.print("Digite o c�digo do produto desejado.\nBOL-10");
					int cod = sc.nextInt();
					cod -= 1;
					for (Produto i : produtos) {
						if (produtos.indexOf(i) == cod) {
							System.out.println("Quantas unidades voc� quer?");
							int qtd = sc.nextInt();
							if (qtd <= i.getEstoque()) {
								carrinhoCompra[cod] += qtd;
							}
							i.retiraEstoque(qtd);

						}
					}
					do {
						System.out.println("Voc� gostaria de comprar outro produto (S ou N)?");
						continuar = sc.next().toUpperCase().charAt(0);
					} while ((continuar != 'S') && (continuar != 'N'));
				} while (continuar == 'S');
				System.out.println("\nCarrinho de compras");
				linha(80);
				System.out.println();
				System.out.println("QTD.\t\tPRE�O UN.\tPRE�O TOTAL\tNOME DO PRODUTO");
				linha(80);
				System.out.println();
				for (int i = 0; i < produtos.size(); i++) {
					if (carrinhoCompra[i] != 0) {
						System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%s\n", 10 - produtos.get(i).getEstoque(),
								produtos.get(i).getPreco(),
								((10 - produtos.get(i).getEstoque()) * produtos.get(i).getPreco()),
								produtos.get(i).getNome());
						somaTotal += (10 - produtos.get(i).getEstoque()) * produtos.get(i).getPreco();
					}
				}
				linha(80);
				System.out.println("\nForma de pagamento: ");
				System.out.println("[1] - Pagamento dinheiro com 10% de desconto");
				System.out.println("[2] - Pagamento no d�bito");
				System.out.println("[3] - Pagamento cart�o de cr�dito (1x) +5% juros");
				System.out.println("[4] - Pagamento no credito parcelado (at� 3x) +10% juros");
				System.out.println("\n\nPre�o total: " + somaTotal);
				double imposto = 0.09 * somaTotal;
				System.out.println("Valor do imposto: " + imposto);
				System.out.println("Pre�o total com imposto: " + (somaTotal + imposto));
				break;
			case 2:
				linha(80);
				System.out.println("\nAtualiza��o de produtos");
				linha(80);
				System.out.println("\n[1] - Atualizar nome");
				System.out.println("[2] - Atualizar pre�o");
				System.out.println("[3] - Manuten��o de estoque");
				System.out.println("[4] - Lista de produtos");
				do {
					System.out.println("Digite a op��o desejada: ");
					opcao = sc.nextInt();
				} while (opcao < 1 || opcao > 5);
				if (opcao == 1) {
					sc.nextLine();
					System.out.println("Digite o c�digo de produto que quer alterar o nome: ");
					codUser = sc.next();
					for (Produto p : produtos) {
						if (codUser.equals(p.getCodigo())) {
							System.out.println("O produto selecionado foi: ");
							System.out.println("\nC�d.\t\tEstoque\t\tPre�o\t\tDescri��o");
							System.out.println(p.getCodigo() + "\t\t" + p.getEstoque() + "\t\t" + p.getPreco() + "\t\t"
									+ p.getNome());
							do {
								System.out.println("Digite 1 para confirmar a altera��o de nome, 2 para cancelar");
								opcao = sc.nextInt();
							} while (opcao < 1 || opcao > 2);
							if (opcao == 1) {
								sc.nextLine();
								System.out.println("Digite o novo nome: ");
								nome = sc.nextLine();
								p.atualizaNome(nome);

							} else {
								System.out.println("Altera��o cancelada.");
							}
						}
					}
				} else if (opcao == 2) {
					sc.nextLine();
					System.out.println("Digite o c�digo de produto que quer alterar o pre�o: ");
					codUser = sc.next();
					for (Produto p : produtos) {
						if (codUser.equals(p.getCodigo())) {
							System.out.println("O produto selecionado foi: ");
							System.out.println("\nC�d.\t\tEstoque\t\tPre�o\t\tDescri��o");
							System.out.println(p.getCodigo() + "\t\t" + p.getEstoque() + "\t\t" + p.getPreco() + "\t\t"
									+ p.getNome());
							do {
								System.out.println("Digite 1 para confirmar a altera��o de pre�o, 2 para cancelar");
								opcao = sc.nextInt();
							} while (opcao < 1 || opcao > 2);
							if (opcao == 1) {
								System.out.println("Digite o novo pre�o: ");
								valorProduto = sc.nextDouble();
								p.atualizaPreco(valorProduto);

							} else {
								System.out.println("Altera��o cancelada.");
							}
						}
					}
				} else if (opcao == 3) {
					sc.nextLine();
					System.out.println("Digite o c�digo de produto que quer atualizar estoque: ");
					codUser = sc.next();
					for (Produto p : produtos) {
						if (codUser.equals(p.getCodigo())) {
							System.out.println("O produto selecionado foi: ");
							System.out.println("\nC�d.\t\tEstoque\t\tPre�o\t\tDescri��o");
							System.out.println(p.getCodigo() + "\t\t" + p.getEstoque() + "\t\t" + p.getPreco() + "\t\t"
									+ p.getNome());
							do {
								System.out.println(
										"Digite 1 para adicionar estoque, 2 para retirar estoque, 3 para cancelar");
								opcao = sc.nextInt();
							} while (opcao < 1 || opcao > 3);
							if (opcao == 1) {
								do {
									System.out.println("Digite a quantidade a ser adicionada: ");
									quantidadeProdutos = sc.nextInt();
								} while (quantidadeProdutos < 0);
								p.addEstoque(quantidadeProdutos);
							} else if (opcao == 2) {
								do {
									System.out.println("Digite a quantidade a ser retirada: ");
									quantidadeProdutos = sc.nextInt();
								} while (quantidadeProdutos < 0);
								p.retiraEstoque(quantidadeProdutos);
							} else {
								System.out.println("Altera��o cancelada.");
							}
						}
					}
				} else {
					linha(80);
					System.out.println("\nLista de produtos");
					linha(80);
					System.out.println("\nC�d.\t\tEstoque\t\tPre�o\t\tDescri��o");
					for (Produto p : produtos) {
						System.out.println(
								p.getCodigo() + "\t\t" + p.getEstoque() + "\t\t" + p.getPreco() + "\t\t" + p.getNome());
					}
				}
				break;
			case 3:
				System.out.println("Agradecemos pelo interesse, volte sempre!");
				break;
			default:
				//
			}
			do {
				sc.nextLine();
				System.out.println("Voc� deseja fazer outra opera��o S ou N");
				continuar = sc.next().toUpperCase().charAt(0);
			} while ((continuar != 'S') && (continuar != 'N'));
		} while (continuar != 'N');
		sc.close();

	}

	static void linha(int tam) {
		for (int i = 1; i <= tam; i++) {
			System.out.print("-");
		}
	}

	static void menuInicial() {
		linha(50);
		System.out.println("\n  	AMORI DOCES E BRIGADEIROS");
		System.out.println("              FEITO COM AMOR");
		linha(50);
		System.out.println("\n[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		System.out.println("Digite a op��o desejada: ");
	}

	static void mostrarProdutos(List<Produto> produtos) {
		linha(60);
		System.out.println("\nC�D.\t\tPRE�O\t\tNOME DO PRODUTO");
		linha(60);
		System.out.println();
		for (Produto i : produtos) {
			System.out.printf("%s\t\t%.2f\t\t%s\n", i.getCodigo(), i.getPreco(), i.getNome());
		}
	}
}
