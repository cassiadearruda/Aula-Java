programa
{
	
	funcao inicio()
	{
		//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		//a) média do salário da população; 
		//b) média do número de filhos; 
		//c) maior salário; 
		//d) percentual de pessoas com salário até R$100,00.

		//variaveis
		inteiro habitantes = 3
		real salario = 0.00
		inteiro filhos = 0
		real mediaSalarios = 0.00
		real totalSalarios = 0.00
		real mediaFilhos = 0.00
		real totalFilhos = 0.00
		real maiorSalario = 0.00
		real contadorSalario100 = 0.00
		real percentualSalario100 = 0.00

		//Entradas
		para (inteiro x = 1; x <= habitantes; x ++)
		{
			escreva ("Digite seu salário: ")
			leia (salario)
			escreva ("Digite o número de filhos: ")
			leia (filhos)
		//Processamentos
			totalSalarios = totalSalarios + salario
			totalFilhos = totalFilhos + filhos 
		//Conversor
			se (salario > maiorSalario)
			{
				maiorSalario = salario
			}
		//Contador
			se (salario <= 100)
			{
				contadorSalario100 = contadorSalario100 + 1
			}
			
		}//Laço termina aqui.
		percentualSalario100 = (contadorSalario100 / habitantes) * 100
		mediaSalarios = totalSalarios / habitantes
		mediaFilhos = totalFilhos / habitantes
		
		//Saidas
		escreva ("\nTotal salarial: ", totalSalarios)
		escreva ("\nMédia salarial: ", mediaSalarios)
		escreva ("\nTotal de filhos: ", totalFilhos)	
		escreva ("\nMédia de filhos: ", mediaFilhos)
		escreva ("\nO maior salário: ", maiorSalario)
		escreva ("\nO percentual de pessoas até 100%: ", percentualSalario100)
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */