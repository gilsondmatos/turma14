programa
{
	inclua biblioteca Util
	
	funcao pulaLinha()
	{
		escreva("\n")
	}
	
	funcao inicio()
	{
		inteiro lancar [10]
		inteiro somaNum = 0, maiorNum = 0, episodio = 0
	
	para(inteiro x=0; x < 10; x++)
	{
		lancar[x] = Util.sorteia(1,6)
		escreva("\nValor sorteado é: ",(lancar[x]))

		somaNum = somaNum + lancar[x]

		se (lancar[x] > maiorNum)
		{
			maiorNum =  lancar[x]
			episodio++
		}
		
	}
		para(inteiro x = 0; x < 10; x++)
		{
			se(lancar[x] == maiorNum)
			episodio++
		}

		pulaLinha()
		escreva("A soma do valor é: ", somaNum)
		pulaLinha()
		escreva("O valor da média é: ", somaNum / 10)
		pulaLinha()
		escreva("Maior número lançado: ", maiorNum)
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {x, 15, 14, 1}-{x, 29, 15, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */