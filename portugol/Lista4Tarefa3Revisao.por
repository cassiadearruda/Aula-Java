programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:*/
		
		/*a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			das matrizes N1 e N2;
		  b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
			posição das matrizes N1 e N2.*/
			
		inteiro matriz1 [4][6]
		inteiro matriz2 [4][6]
		inteiro soma [4][6]
		inteiro subt [4][6]

		para (inteiro linha = 0; linha < 4; linha ++)
		{
			para (inteiro coluna = 0; coluna < 6; coluna ++)
			{
				matriz1 [linha][coluna] = sorteia (4,6)
				matriz2 [linha][coluna] = sorteia (1,4)
				soma [linha][coluna] = matriz1 [linha][coluna] + matriz2 [linha][coluna]
				subt [linha][coluna] = matriz1 [linha][coluna] - matriz2 [linha][coluna]	
			}		
		}

		escreva ("Matriz 1 \n")
		escreva ("\n")
		
		para (inteiro linha = 0; linha < 4; linha ++)
		{
			para (inteiro coluna = 0; coluna < 6; coluna ++)
			{
				escreva (matriz1 [linha][coluna], "  ")
			}

			escreva ("\n")
		}

		escreva ("\n")
		escreva ("Matriz 2 \n")
		escreva ("\n")
		
		para (inteiro linha = 0; linha < 4; linha ++)
		{
			para (inteiro coluna = 0; coluna < 6; coluna ++)
			{
				escreva (matriz2 [linha][coluna], "  ")
			}

			escreva ("\n")
		}

		escreva ("\n")
		escreva ("Matriz soma \n")
		escreva ("\n")
		
		para (inteiro linha = 0; linha < 4; linha ++)
		{
			para (inteiro coluna = 0; coluna < 6; coluna ++)
			{
				escreva (soma [linha][coluna], "  ")
			}

			escreva ("\n")
		}

		escreva ("\n")
		escreva ("Matriz sub \n")
		escreva ("\n")
		
		para (inteiro linha = 0; linha < 4; linha ++)
		{
			para (inteiro coluna = 0; coluna < 6; coluna ++)
			{
				escreva (subt [linha][coluna], "  ")
			}

			escreva ("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 611; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz1, 14, 10, 7}-{matriz2, 15, 10, 7}-{soma, 16, 10, 4}-{subt, 17, 10, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */