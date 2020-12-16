package ExercicioEncapsulamento;

public class Pessoa {
	
	private String nome;
	private String endere�o;
	private String telefone;
	
	//CONSTRUTORES
	
	//CONSTRUTOR - NOME / ENDERE�O / TELEFONE
	public Pessoa(String nome, String endere�o, String telefone) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}
	
	//CONSTRUTOR - NOME / TELEFONE
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	//CONSTRUTOR - NOME 
	public Pessoa(String nome) {
		this.nome = nome;
	}


	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
