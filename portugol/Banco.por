programa
{
	funcao pulaLinha() {
		escreva("\n")
	}
	
	funcao inicio()
	{
	 
        const inteiro MOVIMENTOS = 10
        inteiro transacao[MOVIMENTO]
        inteiro numeroConta = 1
        real saldo = 0.0, debito=0.0, credito=0.0, emprestimo=0.0
        cadeia cpf = "391.258.987-35"
        inteiro acessaTransacao

       	pulaLinha()
        	pulaLinha()
        	escreva("Digite uma das opções:")
        	pulaLinha()
        	pulaLinha()
        	escreva("1 - Crédito")
        	pulaLinha()
        	escreva("2 - Débito")
        	pulaLinha()
        	escreva("3 - Empréstimo")
        	pulaLinha()
		
        		para(inteiro i = 0; i < MOVIMENTOS;i++) 
        		
        		{
        			escreva("Número da conta: ", numeroConta)
			     pulaLinha()
			     escreva("CPF: ", cpf)
			     pulaLinha()
			     pulaLinha()
			     escreva("Saldo em conta Universitária: R$ ", saldoAtual)
        			leia(acessaTransacao)
        			
        			se(acessaTransacao == 1)
	        		{
	        			escreva("Muito bem! Quanto você quer depositar: ")
	        			leia(credito)
	        		}
	        		senao se(acessaTransacao == 2)
	        		{
	        			escreva("Muito bem! Quanto você sacar: ")
	        			leia(debito)
	        		}
	        		senao se(acessaTransacao == 3) 
	        		{
	        			escreva("Empréstimo: ")
	        			leia(emprestimo)
	        		}
        		}
	}	
        	
        	
        		
  
         	
       
        }
 

 

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 925; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */