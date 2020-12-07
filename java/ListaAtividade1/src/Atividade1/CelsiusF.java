package Atividade1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CelsiusF {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double celsius, fahrenheit;

		System.out.println("Digite a temperatura em Celsius: ");
		celsius = leia.nextDouble();

		fahrenheit = ((celsius * 9 / 5) + 32);

		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("A temperatura em fahrenheit é: " + df.format(fahrenheit) + "°F, tenha um ótimo dia!");

	}

}
