programa
{
	
	funcao inicio()
	{
		//Calculo da area do Retângulo
		real altura=0.0, base=0.0, area=0.0

		escreva("---------------------------------------------")
		escreva("\n")
		escreva("   Vamos calcular área de um retângulo   ")
		escreva("\n")
		escreva("---------------------------------------------")
		escreva("\n")
		escreva("\n")
		escreva("Digite a altura do retangulo: ")
		leia(altura)
		escreva("Digite a base do retangulo: ")
		leia(base)

		escreva("A área do retângulo é:m²",areaRetangulo(area))
		
	}

	funcao real areaRetangulo(altura,base:real)
	{
		real area = altura*base
		retorne area
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 569; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */