package Exercicio1;

import java.util.Scanner;

public class ClientesAmori {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente01 = new Cliente();
		
		System.out.println("Digite o nome do cliente: ");
		String nome = leia.nextLine();
		cliente01.cadastroNome(nome);
		
		System.out.println("Digite seu CPF: ");
		String cpf = leia.nextLine();
		cliente01.cadastroCpf(cpf);
		
		System.out.println("Telefone para contato: ");
		String telefone = leia.nextLine();
		cliente01.cadastroTelefone(telefone);
		
		System.out.println("E-mail: ");
		String email = leia.nextLine();
		cliente01.cadastroEmail(email);
		
		System.out.println("--------------------------------");
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("--------------------------------");
		System.out.println("Nome: " + cliente01.nomeCliente);
		System.out.println("CPF: " + cliente01.cpf);
		System.out.println("Contato: " + cliente01.telefone);
		System.out.println("E-mail: " + cliente01.email);
			
		
		
		
		
		
		
	}

}
