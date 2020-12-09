package loja;

import java.io.Console;
import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		char opcao = 0;
		String nomeCliente;
		char sexo;

		linha();
		mostra("           AMORI DOCES E BRIGADEIROS");
		mostra("                Feito com Amor");
		linha();

		mostra("        |   [1] - COMPRA PRODUTOS     |");
		mostra("        |   [2] - GERENCIAR ESTOQUE   |");
		mostra("        |   [3] - SAIR                |");

		pulaLinha();
		System.out.print("DIGITE A OPÇÃO:");
		opcao = leia.next().charAt(0);

		switch (opcao) {
		case '1': {

			mostra("Informe seu nome:");
			nomeCliente = leia.next().toUpperCase();
			mostra("Gênero [M] Masculino | [F] Feminino | [O] Outros");
			sexo = leia.next().toUpperCase().charAt(0);
			break;
		}
		case '2':
			mostra("WIP");
		}

	}

	public static void linha() {
		System.out.println("----------------------------------------------------");
	}

	public static void pulaLinha(){
		System.out.println("\n");
	}

	public static void mostra(String frase){
		 
		System.out.println(frase);
	}
	public static String voltaGenero(char genero) {
		
		String tipo;
		if (genero == 'M') {
			tipo = "Masculino";
		}
			
	}


