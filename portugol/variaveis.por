programa
{
	
	funcao inicio()
	{
		//TIPAGEM DE DADOS - FRACA OU FORTE 
		cadeia nomePessoa //A declaração de variável cadeia é utilizada para texto
		inteiro anoNascimento // Posso colocar as váriaveis na mesma linha
		const inteiro ANOATUAL = 2020 // const só pode ser mexido uma vez no programa
		// poderia declarar a variável inteiro idade
		
		
		escreva("Digite seu nome:")
		leia (nomePessoa) //Ler o nome da pessoa que digitou
		
		escreva("Digite o ano do Seu Nascimento:")
		leia (anoNascimento)


		//idade = anoAtual - anoNascimento
		//Poderia substituir (anoAtual - anoNascimento), pela variável idade 		
		escreva("Oi " + nomePessoa + ", sua idade aproximada é " + (ANOATUAL - anoNascimento) + " anos")
	}    
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */