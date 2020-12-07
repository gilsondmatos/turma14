programa
{
	inclua biblioteca Util

	
	funcao inicio()
	{
		/*
		2- Desenvolver um sistema que efetue a soma de todos os números ímpares que 
		são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
		*/

		
		inteiro num = 0
		inteiro nImpX = 3
		inteiro numMultTres = 0
		inteiro somaMultTres = 0	

		para(num = 1; num<=500;num++)
		{
			se(num % nImpX == 0){
				
			numMultTres = num
			escreva("\nA soma dos multiplos de 3 abaixo de 500 é: ",numMultTres)
			Util.aguarde(350)
			limpa()
			
			
			}

			
		}
			
		
		
	}
		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */