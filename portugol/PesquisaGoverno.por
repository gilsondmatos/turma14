programa
{
	inclua biblioteca Matematica-->mat
	funcao pulaLinha()
	{
		escreva("\n")
	}
	
	funcao inicio()
	{

/*1- A prefeitura de uma cidade fez uma pesquisa entre 
 * 20 de seus habitantes,coletando dados sobre o salário e 
 * número de filhos. A prefeitura deseja saber:   

a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.
*/  

		//Variaveis
		const real HABITANTES = 2
		cadeia nomeMorador
		inteiro nFilhos, habitantes
		real salario=0.0, mediaSalario=0.0, percSalario = 0.0, somaSalario=0.0, maiorSalario=0.0
		real mediaFilhos=0.0, totalFilhos=0.0
		real contaCem = 0
		
		para(habitantes = 1;habitantes<=HABITANTES;habitantes++)
		{
			escreva("Quem é o responsável familiar:  ")
			leia(nomeMorador)
			escreva("Quantos filhos você tem: ")
			leia(nFilhos)
			escreva("Qual o valor do seu salário: ")
			leia(salario)

			limpa()

			//============media salarios habitantes ========================
			
			mediaSalario = (somaSalario+salario)
			
			
			//=============Media de filhos por familia=======================
			
			totalFilhos = (totalFilhos+nFilhos)
			mediaFilhos = totalFilhos/HABITANTES
			

			//=====================Maior Salário=============================
			
			se (salario > maiorSalario) 
			{
				maiorSalario = salario
			}
			
			//=====================Percentual=================================
			
			se (salario <=100) {
				contaCem++
			}
			
			percSalario = (contaCem/HABITANTES)*100)

			////==============================================================
						
		}
			//Saídas
			escreva("A média de Salarios é R$: ",(mediaSalario/HABITANTES))
			pulaLinha()
			escreva("A média de Filhos é: ",mediaFilhos)
			pulaLinha()
			escreva("O maior Salario é: ",maiorSalario)
			pulaLinha()
			escreva("Percentual de pessoas com salário até R$100,00:",mat.arredondar(percSalario,2)," %")
			
			
			}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1147; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */