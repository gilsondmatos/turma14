package ExerciciosLacoCondicional;

import java.util.Scanner;

public class maiorQueCem {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero > 100) {
			
			System.out.println("O Valor digitado foi:" + numero);
			
		}else {
			System.out.println("Valor: 0");
			
		}

	}

}
