package Exercicio1;

public class Cliente {
	
	 String nomeCliente;
	 String cpf;
	 char genero;
	 String email;
	 String telefone;
	
	public void cadastroNome(String nome) {
	  this.nomeCliente = nome;
	}
	public void cadastroCpf(String cpf) {
		this.cpf = cpf;
	}
	public void cadastroEmail(String email) {
		this.email = email;
	}
	public void cadastroTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String limitaString(String texto, int maximo){
		   if (texto.length() <= maximo){
		      return texto;
		   }else{
		      return texto.substring(0, maximo);
		   }
		}

}
	
	
