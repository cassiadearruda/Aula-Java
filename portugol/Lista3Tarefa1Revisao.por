programa
{
	
	funcao inicio()
	{
		// A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de 
		// filhos. A prefeitura deseja saber:   
		// a) média do salário da população; 
		// b) média do número de filhos; 
		// c) maior salário; 
		// d) percentual de pessoas com salário até R$100,00.  

		//Variáveis
		inteiro habitantes = 10
		inteiro filhos = 0
		real salario = 0
		real totalSalario = 0
		real mediaSalario = 0
		real totalFilhos = 0
		real mediaFilhos = 0
		real maiorSalario = 0
		real percentualPessoasSalario100 = 0
		real contador = 0

		//Entrada
		para (inteiro x = 0; x < habitantes; x ++)
		{
			escreva ("Digite o seu salário: ")
			leia (salario)
			//escreva ("Digite o número de filhos: ")
			//leia (filhos)
	
			totalSalario = totalSalario + salario
			totalFilhos = totalFilhos + filhos
	
			mediaSalario = totalSalario / habitantes
			mediaFilhos = totalFilhos / habitantes

			se (salario > maiorSalario)
			{
				maiorSalario = salario
			}

			se (salario > 100)
			{
				contador = contador + 1 
			}

			percentualPessoasSalario100 = (contador / habitantes) * 100
		}
		limpa ()
		escreva ("\nA média do salário da população é: ", mediaSalario)
		escreva ("\nA média de filhos da população é: ", mediaFilhos)
		escreva ("\nO maior salário da população é: ", maiorSalario)
		escreva ("\nO percentual da população que recebe até R$100 é de: ", percentualPessoasSalario100, " %")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1478; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */