package Revisao;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		double peso;
		double altura;
		double imc;
		
		System.out.print("Digite seu peso: ");
		peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura: ");
		altura = entrada.nextDouble();
		
		imc = peso/(altura*altura);
		

		if(imc < 18.5) {
			System.out.println("Seu imc é: " + imc);
			System.out.println("Você está abaixo do peso!");
		}
		else if(imc < 25) {
			System.out.println("Seu imc é: " + imc);
			System.out.println("Parabéns! Você está no seu peso ideal");
		}
		else if(imc <= 30) {
			System.out.println("Seu imc é: " + imc);
			System.out.println("Cuidado! Você está acima do peso");
		}
		else if(imc > 30) {
			System.out.println("Seu imc é: " + imc);
			System.out.println("Preocupante! Procure seu endocrinologista");
		
		}
	}
}
