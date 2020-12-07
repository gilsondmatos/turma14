programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		const real MULTA = 4.00
		real pesoTomates = 0.0
		real excesso = 0.0
		real multaPagar=0.0

		//Entrada
		escreva("Qual o peso dos tomates: ")
		leia(pesoTomates)

		//Processamento
		excesso = (pesoTomates-50)
		multaPagar = (pesoTomates-50)*MULTA)

		//Saidas
		se (pesoTomates >50)
		{
			escreva("Você excedeu o peso dos tomates em: ", excesso, " kg e terá que pagar uma multa de R$ ", mat.arredondar(multaPagar, 2))
		}
		senao se(pesoTomates <=0)
		{
			escreva("Valor Incorreto! Por favor, insira um peso permitido")
		}
		
		senao
		{
			escreva("Peso dos tomates: ", pesoTomates, " kgs", " | Excesso: 0.0", " |Multa R$ 0.00")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 718; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */