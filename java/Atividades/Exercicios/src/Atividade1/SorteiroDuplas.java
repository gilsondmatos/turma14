package Atividade1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SorteiroDuplas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numeros[] = new int[2];
		String[] alunos = {"Allen de Lima Vieira","Andr� de Brito Silva da Costa","B�rbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima",
				"Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
				"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","Fernanda Agapito",
				"Fernanda Barbosa Ferraz","Francisco Jos� Pires","Gabriel S�rgio Nascimento Santos Gon�alves","Gide�o da Silva Idelfonso",
				"Gilson Amorim de Matos","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles","Heloisa Beatriz de Oliveira Costa",
				"Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","Jos� Jorge Hauck J�nior","Juliana Santos Andr�",
				"K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas Anseloni Barros","Lucas Gon�alves da Silva","Luis felipe da silva",
				"Luiz Felipe da Silva Magalh�es","Marcos Eduardo Gomes Gon�alves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins",
				"Ver�nica Navarro Almena", "Vinicius de Alvez Miranda"};

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = new Random().nextInt(39)+1;
			alunos[i];
		}
		Arrays.sort(numeros);	
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(alunos));
		

		}

		

	}


