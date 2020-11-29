programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//Declaração da variavel real, pois não é número inteiro e sim quebrado
          real celsius,fahrenheit 
          cadeia nomeGringo

          escreva("Digite seu nome: ")
          leia(nomeGringo)

		escreva("Digite a temperatura em fahrenheit: ")
		leia(fahrenheit)

		//Calculo - Conversão de Fahrenheit para Celsius 
		celsius = (fahrenheit - 32) * 5/9)
				
		//(Matematica.arredondar(fahrenheit, 1)) - arredonda o resulta para mostra 1 casa decimal
		escreva(+ (nomeGringo) + " a temperatura em Celsius é: " + (Matematica.arredondar(celsius, 1)) + "°C, tenha um ótimo dia!"))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 426; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */