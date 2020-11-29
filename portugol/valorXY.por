programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a=0.0,b=0.0,c=0.0,d=0.0,eh=0.0,f=0.0,x=0.0,y=0.0

		escreva("||||||VAMOS ENCONTRAR O VALOR DE X||||||\n\n")
		
		//Valor de X
		escreva("Digite valor de C: ")
		leia(a)
		
		escreva("Digite valor de E: ")
		leia(eh)

		escreva("Digite valor de B: ")
		leia(b)

		escreva("Digite valor de F: ")
		leia(f)

		escreva("Digite valor de A: ")
		leia(a)
		
		escreva("Digite valor de D: ")
		leia(d)
		
		//calculo
		x = (((c*eh)-(b*f))/((a*eh)-(b*d)))
		escreva("\nO valor de X é: ", x,"\n\n")
		
		escreva("|||PRONTO! AGORA SÓ FALTA O VALOR DE Y|||\n\n")
		
		//Valor de Y
		escreva("Digite valor de A: ")
		leia(a)

		escreva("Digite valor de F: ")
		leia(f)

		escreva("Digite valor de C: ")
		leia(c)

		escreva("Digite valor de D: ")
		leia(d)

		escreva("Digite valor de E: ")
		leia(eh)
		
		escreva("Digite valor de B: ")
		leia(b)

		//calculo
		y = (((a*f)-(c*d))/((a*eh)-(b*d)))
		escreva("O valor de Y é: ", y)

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 690; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */