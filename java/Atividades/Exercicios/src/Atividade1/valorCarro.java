package Atividade1;

import java.util.Scanner;

public class valorCarro {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double porcDistribuidor = 0.28;
		double impostos = 0.45;
		double valorCarro = 0, totalImpostos;

		mostra("|||||||CONCESSIONÁRIO QUEBRA-GALHO||||||||||||");
		mostra("-----------------------------------------------");

		mostra("Digite o valor do carro: ");
		valorCarro = leia.nextDouble();

		totalImpostos = (valorCarro * (porcDistribuidor + impostos));
		valorCarro = (valorCarro + totalImpostos);

		mostra("Valor do carro para o Comsumidor: " + (valorCarro));

		mostra("||||||||||||||||||| OBRIGADO |||||||||||||||||||");

	}
	
	public static void mostra(String frase) {
		
		System.out.println(frase);
		
	}

}
