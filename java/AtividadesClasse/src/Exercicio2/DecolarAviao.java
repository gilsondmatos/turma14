package Exercicio2;

import java.util.Scanner;

public class DecolarAviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Aviao aviao = new Aviao();
		
		aviao.empresa = "TAM";
		aviao.modelo = "Boeing 767-316";
		
		aviao.velocidadeAtual = 0;
		System.out.println("Empresa:" + aviao.empresa);
		System.out.println("Modelo: " + aviao.modelo);
		
		aviao.liga();
		
		//Velocidade Máxima para decolagem 360km/h
		System.out.println("Digite uma velocidade iniciar decolagem: ");
		double velocidade = leia.nextDouble();
		aviao.decola(velocidade);
		
		System.out.println("Velocidade atingida: " +aviao.velocidadeAtual +"km/h");
		aviao.viaje();
		
	}

}
