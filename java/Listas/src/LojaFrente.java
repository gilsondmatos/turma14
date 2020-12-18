import java.util.Scanner;

public class LojaFrente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Scanner leiaString = new Scanner(System.in);
		
		int menu = 0;
		
		Produto objProduto;
		
		String produto = " ";
		double preco = 0.00;
		int quantidade=0;
		
		do {
			
			exibirMenu();
			menu = leia.nextInt();
			
			switch(menu) {
			case 1: // Cadastrar
				System.out.println("Digite o nome do produto: ");
				produto = leiaString.nextLine();
				System.out.println("Digite a quantidade: ");
				quantidade = leia.nextInt();
				System.out.println("Valor do Produto: ");
				preco = leia.nextDouble();
				
				//Objeto da Classe
				objProduto = new Produto(produto, quantidade, preco);
				
				//Guardar no ArraList
				Loja.adicionar(objProduto);
				
				break;
			case 2:
				System.out.println("===== Excluir Produtos =====");
				System.out.println("Digite o nome do Produto");
				produto = leiaString.nextLine();
				
				if(! (Loja.getListaProdutos().isEmpty())) { 
					if(Loja.remover(produto)) {
						System.out.println("Produto Removido com sucesso!");
					}
				}else {
					System.out.println("Não existe produtos na loja");
				}
				
				
				break;
			case 3:
				System.out.println("===== Lista de Produtos =====");
				System.out.println(Loja.listar());
				break;
			case 4:
				System.out.println("Obrigado!");
				break;
							
				default:
					System.out.println("Opção Inválida!!!");
			
			
			}
			
		}while (menu !=4);

	}
	
	static void exibirMenu() {
		
		System.out.println("===== DOCERIA AMORI =====");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - EXCLUIR ");
		System.out.println("3 - LISTAR ");
		System.out.println("4 - SAIR");
		System.out.println("Escolha uma opção: ");
		
	
	}

}
