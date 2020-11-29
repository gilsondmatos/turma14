programa
{
	
	funcao inicio()
	{
				
		inteiro idade, meses, diasVida;
		inteiro DiasNoAno = 365
		inteiro DiasNoMes = 30
		escreva("Digite sua idade: ")
		leia(idade)
		
		escreva("Quantos meses: ")
		leia(meses)

		escreva("Quantos dias: ")
		leia(diasVida)

		diasVida = (idade*DiasNoAno) + (meses*DiasNoMes)

		escreva("A sua idade em dias é: ", diasVida)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */