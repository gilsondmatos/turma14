programa
{
	inclua biblioteca Matematica-->mat
	funcao pulaLinha() {
		escreva("\n")
	}
	funcao mostra (cadeia frase) {
		escreva(frase)
		pulaLinha()
	}
	funcao real calculaImc(real altura, real peso) {
		retorne (peso / (altura * altura))
	}
	
	funcao inicio()
	{
		real alturaInformada = 0.00
		real pesoInformado = 0.00
		cadeia nome
		caracter opcao = ' '

	para(inteiro i = 0; i < 10; i++){
		pulaLinha()
		escreva("Digite seu nome: ")
		leia(nome)
		
		escreva(nome+", informe seu peso: ")
		leia(pesoInformado)

		escreva(nome+", informe sua altura: ")
		leia(alturaInformada)

		real imc = calculaImc(alturaInformada,pesoInformado)
		mostra(nome+", o seu imc é: "+mat.arredondar(imc, 2))
		pulaLinha()
		se(imc < 18.5) {
			mostra(nome+", você está abaixo do peso")
		}
		se(imc >=18.5 e imc < 25){
			mostra(nome+", seu peso está normal")
		}
		se(imc >=25 e imc <=30){
			mostra(nome+", você está acima do peso")	
		}
		se(imc > 30){
			mostra(nome+", você está obeso")	
		}
		
		}
		pulaLinha()
		mostra("Deseja calcular novamente: [S][N]")
		
		
	}
	

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */