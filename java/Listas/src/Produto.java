
public class Produto {
	
	private String produto;
	private double preco;
	private int quantidade;
	
	public Produto () {
		
	}
	
	public Produto(String produto, int quantidade, double preco) {
		super();
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getProduto() {
		return produto;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public String imprimi() {
		return "Item: " + produto + "\nQNTD: " + quantidade +
				String.format("\nPreço R$ %.2f \n", preco);
	}
	
	
}
