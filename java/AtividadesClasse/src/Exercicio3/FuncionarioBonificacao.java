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
		System.out.println("Funcionário: " + funcionario.nome);
		System.out.println("Sua bonificação é de R$ : " + funcionario.bonificacao());
		System.out.println("Esse mês irá receber R$ " + (funcionario.salario + funcionario.bonificacao()));
		
		
		
		
		
		
		
		

	}

}
