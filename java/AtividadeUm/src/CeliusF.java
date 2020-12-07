import java.util.Scanner;

public class CeliusF {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		          double celsius,fahrenheit;		 
		          
		          System.out.println("Digite a temperatura em Celsius: ");
		          celsius = leia.nextDouble();

		          fahrenheit = ((celsius * 9/5) + 32);
					
				System.out.println("A temperatura em fahrenheit é: " + Math.round(fahrenheit) + "°F, tenha um ótimo dia!");
				
			}

	}


