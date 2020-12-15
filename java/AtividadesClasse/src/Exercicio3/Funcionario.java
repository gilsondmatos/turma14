package Exercicio3;

public class Funcionario {
	
	String nome;
	String cpf;
	double salario;
	
	public double bonificacao() {
		return this.salario * 0.1;
	}
	public void nome(String nome) {
		this.nome = nome;
	}
	public void cpf(String cpf) {
		this.cpf = cpf;
	}
	public void salario (double salario) {
		this.salario = salario;
	}

}
