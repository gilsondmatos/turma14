programa
{
    funcao pulaLinha() {
		escreva("\n")
	}
	funcao mostra (cadeia frase) {
		escreva(frase)
		pulaLinha()
	}
	
	funcao inicio()
	{
	real valorDesconto = 0.00
	real valorProduto = 0.00
	real valorJuros = 0.00
	inteiro opcao = 0

	escreva(" Digite o valor do produto :")
	leia (valorProduto)
	pulaLinha()
	mostra (" Digite uma opção para pagamento:")
	pulaLinha()
	mostra (" 1. À Vista em dinheiro ou cheque.")
	mostra(" 2. À Vista no cartão de crédito.")
	mostra (" 3. Em 2x sem juros")
	mostra (" 4. Em 2x com 10% de juros.")
	
	leia(opcao)

	se(opcao == 1){
		valorDesconto =  valorProduto * 0.20
		mostra("Você ganhou um desconto de R$" + valorDesconto)
		mostra("Você irá paga R$" + (valorProduto-valorDesconto))
		
	}
	se(opcao == 2){
		valorDesconto =  valorProduto * 0.15
		mostra("Você ganhou um desconto de R$" + valorDesconto)
		mostra("Você irá paga R$" + (valorProduto-valorDesconto))

	}
	se(opcao == 3){
		mostra("Total à pagar R$" + valorProduto)
	
	}
		se(opcao == 4){
		valorJuros =  (valorProduto * 0.10)
		mostra("Você pagará R$ " + valorJuros +" em juros")
		mostra("Você irá paga R$" + (valorProduto+valorJuros))
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */