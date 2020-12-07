programa
{
	funcao pulaLinha()
	{
		escreva("\n")
	}
	
	funcao inicio()
	{
		/*
		Elaborar um programa que efetue a leitura sucessiva de valores 
		numéricos e apresente no final o total do somatório, a média e 
		o total de valores lidos. O programa deve fazer as leituras 
		dos valores enquanto o usuário estiver fornecendo valores positivos. 
		Ou seja, o programa deve parar quando o usuário fornecer um
		valor negativo.
		*/	

		inteiro numero = 0
		real media = 0.0
		real soma = 0.0
		inteiro contador = 0

		enquanto (numero >= 0)
		{
			escreva("Digite um valor para soma: ")
			leia(numero)

			se (numero >=0) 
			{
				soma = soma+numero
				contador++	
			}
		}
		
		se (contador >0) 
		{
			media = (soma/contador)
			
			pulaLinha()
			escreva("A soma dos valor é: ", soma)
			pulaLinha()
			escreva("A média dos valores digitados é: ", media)
			pulaLinha()
			escreva("Foram contabilizados: ", contador, " valores")
		
		}
	}
}
		


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 782; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */