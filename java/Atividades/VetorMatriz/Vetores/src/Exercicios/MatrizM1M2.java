package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class MatrizM1M2 {

	public static void main(String[] args) {
		Random gerador = new Random();

		Scanner leia = new Scanner(System.in);

		int LINHA = 4, COLUNA = 6;
		int[][] N1 = new int[LINHA][COLUNA];
		int[][] N2 = new int[LINHA][COLUNA];
		int[][] M1 = new int[LINHA][COLUNA];
		int[][] M2 = new int[LINHA][COLUNA];

		for (int linha = 0; linha < LINHA; linha++){
			
			for (int coluna = 0; coluna < COLUNA; coluna++){
				
				N1[LINHA][COLUNA] = gerador.nextInt(10);
				System.out.println(N1[LINHA][COLUNA]);
			}

		}
		
		System.out.println("DADOS DE N2");

		for (int linha = 0; linha < LINHA; linha++){
			
			for (int coluna = 0; coluna < COLUNA; coluna++) {
				N2[linha][coluna] = gerador.nextInt(10);
				System.out.println(N2[linha][coluna]);
			}
		}

		System.out.println("DADOS DE M1");
		
		for (int linha = 0; linha < LINHA; linha++){
			
			for (int coluna = 0; coluna < COLUNA; coluna++){
				
				M1[LINHA][COLUNA] = N1[LINHA][COLUNA] + N2[LINHA][COLUNA];
				System.out.println(M1[LINHA][COLUNA]);
			}

		}
		
		System.out.println("DADOS DE M2");
		
			for (int linha = 0; linha < LINHA; linha++){
				
				for (int coluna = 0; coluna < COLUNA; coluna++){
				M2[LINHA][COLUNA] = N1[LINHA][COLUNA] - N2[LINHA][COLUNA];
				System.out.println(M2[LINHA][COLUNA]);
			}

		}
	}
}
