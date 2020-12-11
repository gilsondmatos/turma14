package Exercicios;

import java.util.Random;

public class SomaMatriz {

	public static void main(String[] args) {
		Random gerador = new Random();
				//==Variaveis========================================
				int[][] matriz = new int[3][3];
				int soma = 0;
				int totalDiagonal = 0;
				//===================================================
				
				for(int linha = 0; linha < 3; linha++)
				{
					for(int coluna = 0; coluna < 3; coluna++)
					{
						matriz[linha][coluna] = gerador.nextInt(1000);
					}
				}

				for(int linha = 0; linha < 3; linha++) 
				{
						for(int coluna = 0; coluna < 3; coluna++)
					{
						soma = soma + matriz[linha][coluna];
					}
				}
				
				for(int linha = 0; linha < 3; linha++) 
				{
					for(int coluna = 0; coluna < 3; coluna++)
					{
						if(linha == coluna) 
						{
							totalDiagonal = totalDiagonal + matriz[linha][coluna];
						}
					}
				}
				
				//Saídas
				//Soma das Matrizes===================================
				System.out.println("A soma das matrizes é: " + soma);
				
				//=====================================================
				//Soma da Matriz Diagonal
				System.out.println("A soma das matrizes diagonal: " + totalDiagonal);
			}


	}

