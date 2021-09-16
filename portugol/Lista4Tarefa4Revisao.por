programa
{
	
	funcao inicio()
	{
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.*/

		inteiro matriz [3][3]
		inteiro linha = 0
		inteiro coluna = 0
		inteiro soma = 0
		inteiro diagonal = 0
		
		para (linha = 0; linha < 3; linha ++)
		{
			para (coluna = 0; coluna < 3; coluna ++)
			{
				escreva("Digite um número: ")
				leia(matriz [linha][coluna])
				soma = soma + matriz [linha][coluna]
			}
		}

		para (linha = 0; linha < 3; linha ++)
		{
			diagonal = diagonal + matriz [linha][linha]
		}

		escreva ("\n")

		para (linha = 0; linha < 3; linha ++)
		{
			para (coluna = 0; coluna < 3; coluna ++)
			{
				escreva(" ", matriz [linha][coluna], " ")
			}

			escreva ("\n")
		}

		escreva ("\nA soma de todos os valores é: ", soma)
		
		escreva ("\nA soma dos valores da primeira diagonal principal é: ", diagonal, "\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 10, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */