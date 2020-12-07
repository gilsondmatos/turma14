import java.util.Scanner;

	public class FarehCelisus {
	
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);

			         double celsius,fahrenheit;

			        System.out.println("Digite a temperatura em fahrenheit: ");
			        fahrenheit = leia.nextDouble();

					celsius = ((fahrenheit - 32) * 5/9);
							
					 System.out.println("A temperatura em Celsius é: " + Math.round(celsius) + "°C, tenha um ótimo dia!");
	
			}
	}


