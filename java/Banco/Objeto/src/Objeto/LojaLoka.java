package Objeto;

import java.util.Scanner;

public class LojaLoka {

	public static void main(String[] args) {
	
				Scanner leia = new Scanner(System.in);
				Pessoa cliente = new Pessoa();
				
				Pessoa clienteAvulso = new Pessoa();
				Produto vestido = new Produto();
				Produto blusa = new Produto();
				Produto camiseta = new Produto();
				
				vestido.nomeProduto = "Vestido";
				vestido.qtdeEstoque = 3;
				vestido.valorUnitario = 100;
				
				blusa.nomeProduto = "Vestido";
				blusa.qtdeEstoque = 1;
				blusa.valorUnitario = 50;
				
				camiseta.nomeProduto = "Vestido";
				camiseta.qtdeEstoque = 1;
				camiseta.valorUnitario = 50;
				
				
					
				
				
							
			
				
								
				System.out.println("Bom dia, digite o seu nome: ");
				cliente.nome = leia.next().toUpperCase();
				System.out.println("Vc é Masculuno, Feminino ou Outros: [M/F/O");
				cliente.genero = leia.next().toUpperCase().charAt(0);
				
				System.out.printf("Bom dia %s !!!\n", cliente.nome);
				//System.out.println("PRODUTO DISPONIVEL NO MOMENTO:");
				//System.out.printf("PRODUTO: %s, qtde: %d, valor R$: %.2f\n", produto, qtde, valorProduto);
				
				System.out.println(cliente.nome);
				System.out.println(clienteAvulso.nome);
				
			}
		}

	}

}
