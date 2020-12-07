programa
{

	funcao pulaLinha() {
		escreva("\n")
	}
	
	funcao inicio()
	{
        //Variaveis e Vetores
        const inteiro MOVIMENTOS = 10
        inteiro transacao[MOVIMENTOS]
        inteiro numeroConta = 1
        real saldoEmprestimo = 10500.0
        real saldo = 0.0, debito=0.00, credito=0.00, emprestimo=0.00
        cadeia cpf = "391.258.987-35"
        inteiro acessaTransacao = 0
        caracter opcao
				    	//Dados Bancarios
				    	escreva("▦▦▦▦▦▦▦▦G2BANK▦▦▦▦▦▦▦▦▦") 
	       			pulaLinha()
	       			escreva("Número da conta: ", numeroConta)
				    	pulaLinha()
				    	escreva("CPF: ", cpf)
				    	pulaLinha()
				    	escreva("▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦")
				    	pulaLinha()
				    	pulaLinha()
				    	escreva("▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦")
				    	pulaLinha()
				    	escreva("Saldo Atual R$ ",saldo) 
				    	pulaLinha()
				    	escreva("▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦")
				    	pulaLinha()  	
				    	pulaLinha()

				    	//Menu
				    	para(inteiro i = 0; i < MOVIMENTOS;i++) 
        				{   
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
	       	               			
	        			se(acessaTransacao == 1)
	        			{
		        			escreva("Quanto você quer depositar: ")
		        			leia(credito)
		        			pulaLinha()
		        			pulaLinha()
		        			escreva("------------------ Realizando Depósito: --------------- ")
		              		pulaLinha()
		              		escreva("Saldo anterior R$: ", saldo)
		              		saldo = (saldo + credito)
			        		pulaLinha()
		        			escreva("Deposito realizado com sucesso! Seu novo saldo R$ ",saldo)
		        	     	pulaLinha()
		        			escreva("------------------------------------------------------- ")
		        			pulaLinha()
		        			pulaLinha()
	        			}
	        			senao se(acessaTransacao == 2)
	        			{
		        			escreva("Quanto você quer sacar R$: ")
		        			leia(debito)
		        				se (saldo-debito <0) 
		        				{
				        			escreva("Saldo Insuficiente! Seu saldo é de R$ ",saldo)
				        			pulaLinha()
			        				pulaLinha()
		        				}
		        				senao 
		        				{
				        			saldo = (saldo-debito)
				        			limpa()
				        			escreva("Saque efetuado com sucesso! seu novo saldo é R$ ",saldo)
				        			pulaLinha()
			        				pulaLinha()
			        			}		
        				}
	        			senao se(acessaTransacao == 3) 
	        			{
		        			pulaLinha()
		        			escreva("Saldo: R$ ",saldo)
		        			pulaLinha()
		        			pulaLinha()
	        			}
	        				senao se(acessaTransacao == 4) 
	        				{
					        	escreva("Você tem o um limite de R$", saldoEmprestimo, " pré aprovado!")
					        	pulaLinha()
					        	pulaLinha()
					   	     escreva("Você confirma o empréstimo? S/N")
					   	     pulaLinha()
					   	     leia(opcao)
		
						   	     	se(opcao == 'S' ou opcao =='s')
						   	     	{
										
										pulaLinha()
										escreva("Digite valor do empréstimo: ")
										leia(emprestimo)
										
										se(emprestimo > saldoEmprestimo)
										{
											escreva("Valor não Aprovado! Lembrando você tem apenas R$", saldoEmprestimo, " pré aprovado")
											pulaLinha()
										}
										senao se(emprestimo <= saldoEmprestimo)
										{
										saldo = (saldo + emprestimo)
										limpa()
										escreva("Empréstimo efetuado com sucesso! Seu novo saldo é: R$ ",saldo)
										pulaLinha()
									     pulaLinha()
										}		
						   	     	}
									senao se(opcao == 'N' ou opcao =='n')
									{	pulaLinha()
										escreva("Obrigado por fazer parte do B2BANK")
										pulaLinha()
										pulaLinha()
									}
	
						}
				
									senao se(acessaTransacao == 5)
									{
										pulaLinha()
										escreva("Obrigado por fazer parte do G2BANK")
										pulaLinha()
							
									}
				}
									pulaLinha()
									escreva("Suas ", MOVIMENTOS, " movimentações diárias chegou ao limite! Por favor, retorne amanhã.")
									pulaLinha()
									escreva("O saldo após as movimentações é de R$ ", saldo)
	}								
}




/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4512; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */