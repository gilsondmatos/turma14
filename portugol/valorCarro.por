programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		
		real porcDistribuidor = 0.28
		real impostos = 0.45 //CamlCase
		real valorCarro, totalImpostos=0//Melhor Documentação
	 
		escreva("|||||||CONCESSIONÁRIO QUEBRA-GALHO||||||||||||\n\n")
		escreva("-----------------------------------------------\n\n")
		
		//Entrada
		escreva("Digite o valor do carro: ")
		leia(valorCarro)

		//Processamento
		totalImpostos = (valorCarro*(porcDistribuidor+impostos))
		valorCarro = (valorCarro+totalImpostos)
		
		//saida
		escreva("Valor do carro para o Comsumidor: ",mat.arredondar(valorCarro, 2))

		escreva("\n\n||||||||||||||||||| OBRIGADO |||||||||||||||||||\n\n")
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */