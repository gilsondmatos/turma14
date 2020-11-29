programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3, mediaPonderada
		cadeia nomeAluno

		escreva("▓▓▓▓▓▓▓▓ COLÉGIO JOÃO MARIA JOSÉ ▓▓▓▓▓▓▓▓▓▓▓\n\n")
		escreva("Nome do aluno:")
		leia(nomeAluno)
		
		escreva("Digite a primeira nota:")
		leia(nota1)

		escreva("Digite a segunda nota:")
		leia(nota2)

		escreva("Digite a terceira nota: ")
		leia(nota3)
		escreva("\n")

		mediaPonderada = ((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5)

		escreva("A média ponderada é: ", mediaPonderada)

		escreva("\n\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓BOAS AULAS ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n\n")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 444; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */