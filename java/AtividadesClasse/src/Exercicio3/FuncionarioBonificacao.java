package Exercicio3;

import java.util.Scanner;

public class FuncionarioBonificacao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Gilson Amorim de Matos";
		funcionario.salario = 2500;
			
		System.out.println("Digite seu CPF: ");
		String cpf = leia.nextLine();
		funcionario.cpf(cpf);
		System.out.println("Funcion�rio: " + funcionario.nome);
		System.out.println("Sua bonifica��o � de R$ : " + funcionario.bonificacao());
		System.out.println("Esse m�s ir� receber R$ " + (funcionario.salario + funcionario.bonificacao()));
		
		
		
		
		
		
		
		

	}

}
