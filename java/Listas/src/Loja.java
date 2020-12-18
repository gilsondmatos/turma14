import java.util.ArrayList;

public class Loja {
	
	private static ArrayList<Produto> listaProdutos = new ArrayList<>();

	//metodo get
	public static ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	//Adicionar um Produto
	static public void adicionar(Produto a) {
			listaProdutos.add(a);	
	}
	
	//Lista todos Produtos
	static public String listar() {
		String saida = "";
		
		int i =1;
		for(Produto a:listaProdutos) {
			saida+= "\n===== Produto Nº "+ (i++) + " ======\n";
			saida += a.imprimi() + "\n";		
					}
		return saida;
	}
	
	//Remover um produto
	static public boolean remover(String produto) {
		for(Produto a : listaProdutos) {
			if(a.getProduto().equalsIgnoreCase(produto)) {
				listaProdutos.remove(a);
				return true;
			}
		}
		return false;
	}

}
