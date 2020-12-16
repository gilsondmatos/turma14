package ExercicioEncapsulamento;

public class Pessoa {
	
	private String nome;
	private String endereço;
	private String telefone;
	
	//CONSTRUTORES
	
	//CONSTRUTOR - NOME / ENDEREÇO / TELEFONE
	public Pessoa(String nome, String endereço, String telefone) {
		this.nome = nome;
		this.endereço = endereço;
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
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
