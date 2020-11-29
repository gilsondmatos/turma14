programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a=0.0,b=0.0,c=0.0,r=0.0,s=0.0,d=0.0

		escreva("Digite valor de A: ")
		leia(a)

		escreva("Digite valor de B: ")
		leia(b)

		escreva("Digite valor de C: ")
		leia(c)

		r = mat.potencia(a+b, 2)
		s = mat.potencia(b+c, 2)
		d = (r+s)/2

		escreva("O valor de D é: ", d)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 160; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */