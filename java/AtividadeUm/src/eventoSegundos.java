import java.util.Scanner;

public class eventoSegundos {
	
	public static void main(String[] args) {
		
		/*3. Fa�a um sistema que leia o tempo de dura��o de um 
		 * evento em uma f�brica expressa em segundos e mostre-o 
		 * expresso em horas, minutos e segundos. 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int tempoSegundos, horas, minutos, segundos;
		
		System.out.println("Digite a dura��o do evento(Em segundos): ");
		tempoSegundos = leia.nextInt();
		
		//Calculo horas
		horas = (tempoSegundos / 3600);
		
		//Calculo minutos
		minutos = ((tempoSegundos % 3600)/60);

		//Calculo segundos
		segundos = ((tempoSegundos % 3600)%60);
		
		System.out.println("||||||||| DURA��O DO EVENTO ||||||||||||||\n");
		System.out.println(           horas + " Hora[s] | " + minutos +" Minuto[s] | "+ segundos +" Segundo[s] \n");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||\n");
		
		
		
		
	}

}
