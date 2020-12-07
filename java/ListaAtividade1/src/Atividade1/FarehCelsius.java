package Atividade1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FarehCelsius {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double celsius, fahrenheit;

		System.out.println("Digite a temperatura em fahrenheit: ");
		fahrenheit = leia.nextDouble();

		celsius = ((fahrenheit - 32) * 5 / 9);

		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("A temperatura em Celsius é: " + df.format(celsius) + "°C, tenha um ótimo dia!");

	}

}
