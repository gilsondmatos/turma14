package Atividade1;

import java.util.Scanner;

public class valorCarro {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double porcDistribuidor = 0.28;
		double impostos = 0.45;
		double valorCarro = 0, totalImpostos;

		System.out.println("|||||||CONCESSIONÁRIO QUEBRA-GALHO||||||||||||");
		System.out.println("-----------------------------------------------");

		System.out.println("Digite o valor do carro: ");
		valorCarro = leia.nextDouble();

		totalImpostos = (valorCarro * (porcDistribuidor + impostos));
		valorCarro = (valorCarro + totalImpostos);

		System.out.println("Valor do carro para o Comsumidor: " + (valorCarro));

		System.out.println("||||||||||||||||||| OBRIGADO |||||||||||||||||||");

	}

}
