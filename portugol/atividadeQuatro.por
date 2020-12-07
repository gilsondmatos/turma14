programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		//==Variaveis========================================
		inteiro matriz[3][3]
		inteiro soma = 0
		inteiro totalDiagonal = 0
		//===================================================
		
		para(inteiro linha = 0; linha < 3; linha++)
		{
			para(inteiro coluna = 0; coluna < 3; coluna++)
			{
				matriz[linha][coluna] = Util.sorteia(8000 , 10000)
			}
		}

		para(inteiro linha = 0; linha < 3; linha++) 
		{
				para(inteiro coluna = 0; coluna < 3; coluna++)
			{
				soma = soma + matriz[linha][coluna]
			}
		}
		
		para(inteiro linha = 0; linha < 3; linha++) 
		{
			para(inteiro coluna = 0; coluna < 3; coluna++)
			{
				se(linha == coluna) 
				{
					totalDiagonal = totalDiagonal + matriz[linha][coluna]
				}
			}
		}
		
		//Saídas
		//Soma das Matrizes===================================
		escreva("A soma das matrizes é: ",soma)
		escreva("\n")
		
		//=====================================================
		//Soma da Matriz Diagonal
		escreva("A soma das matrizes diagonal: ",totalDiagonal)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 8, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */