programa
{
	funcao pulaLinha() {
		escreva("\n")
	}
	
	funcao inicio()
	{
	 
        //Variaveis e Vetores
        const inteiro MOVIMENTOS = 4
        inteiro transacao[MOVIMENTOS]
        inteiro numeroConta = 1
        real saldoEmprestimo = 10500.0
        real saldo = 0.0, debito=0.00, credito=0.00, emprestimo=0.00
        cadeia cpf = "391.258.987-35"
        inteiro acessaTransacao
        cadeia retiraEmprestimo, sair
        

        			para(inteiro i = 0; i < MOVIMENTOS;i++) 
        			{   		
				    	escreva("G2BANK") 
	       			pulaLinha()
	       			escreva("Número da conta: ", numeroConta)
				    	pulaLinha()
				    	escreva("CPF: ", cpf)
				    	pulaLinha()
				    	pulaLinha()
				    	escreva("Saldo Atual R$ ",saldo) 
				    	pulaLinha()  	
				    	pulaLinha()
				    	escreva("Digite uma das opções:")
				    	pulaLinha()
			        	escreva("1 - Crédito")
			        	pulaLinha()
			        	escreva("2 - Débito")
			        	pulaLinha()
			        	escreva("3 - Saldo")
			        	pulaLinha()
			        	escreva("4 - Empréstimo")
			        	pulaLinha()
			        	escreva("5 - Sair")
			        	pulaLinha()
	        			leia(acessaTransacao)
	        			pulaLinha()
	        			se (saldo < 0) {
	        				escreva("Seu saldo está negativo, quer um empréstimo: S/N?: ")
	        				leia(retiraEmprestimo)
	        			}
	        		      		 
	        			se(acessaTransacao == 1)
	        			
	        			{
		        			escreva("Quanto você quer depositar: ")
		        			leia(credito)
		        			saldo = saldo+credito)
		        			pulaLinha()
	        			}
	        			senao se(acessaTransacao == 2)
	        		{
	        			escreva("Quanto você quer sacar: ")
	        			leia(debito)
	        			saldo = (saldo-debito)
	        			pulaLinha()
	        			
	        		}
	        		
	        		
	        			senao se(acessaTransacao == 3) 
	        		{
	        			pulaLinha()
	        			escreva("Saldo: R$ ",saldo)
	        			leia(saldo)
	        			pulaLinha()
	        			
	        		}

	        			senao se(acessaTransacao == 4) 
	        			
	        			{
		        			escreva("Quanto você precisa: ")
		        			leia(emprestimo)
		        			saldo = (saldo + emprestimo)
		        			se(emprestimo > 10500)
		        				escreva("Valor não diponivel")
        				}
        				senao se(acessaTransacao == 5) 
	        			
	        			{
		        			escreva("Deseja realmente sair? (S/N) ")
		        			leia(sair)
	        			}		        		
		        			
		        			
        				}
        				

			}
}


   	


 

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2561; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */