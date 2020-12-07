import java.util.Scanner;

public class eventoSegundos {
	
	public static void main(String[] args) {
		
		/*3. Faça um sistema que leia o tempo de duração de um 
		 * evento em uma fábrica expressa em segundos e mostre-o 
		 * expresso em horas, minutos e segundos. 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int tempoSegundos, horas, minutos, segundos;
		
		System.out.println("Digite a duração do evento(Em segundos): ");
		tempoSegundos = leia.nextInt();
		
		//Calculo horas
		horas = (tempoSegundos / 3600);
		
		//Calculo minutos
		minutos = ((tempoSegundos % 3600)/60);

		//Calculo segundos
		segundos = ((tempoSegundos % 3600)%60);
		
		System.out.println("||||||||| DURAÇÃO DO EVENTO ||||||||||||||\n");
		System.out.println(           horas + " Hora[s] | " + minutos +" Minuto[s] | "+ segundos +" Segundo[s] \n");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||\n");
		
		
		
		
	}

}
