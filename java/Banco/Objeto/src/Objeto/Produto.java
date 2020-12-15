package Objeto;

public class Produto {
	

	// a classe se chamar Produto
	public String nomeProduto;
	public int qtdeEstoque;
	public double valorUnitario;
	
	public Produto() {
			
	}

	public Produto(String nomeProduto, int qtdeEstoque, double valorUnitario) {
		super();
		this.nomeProduto = nomeProduto;
		this.qtdeEstoque = qtdeEstoque;
		this.valorUnitario = valorUnitario;
	}
	
	
	
	
	//tres produtos no programa
	// vestido - 100,00 - 3 estoque
	// blusa - 50,00 - 1 estoque
	// camise - 20,00 - 20 em estoque
	// escolhe, dizer a quantidade  e  vai mostrar o total a pagar
	

}
