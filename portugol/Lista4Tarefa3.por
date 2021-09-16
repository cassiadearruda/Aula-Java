programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		//3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		//das matrizes N1 e N2;
		//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		//posição das matrizes N1 e N2.

		inteiro matriz  [4][6]
		inteiro matriz2 [4][6]
		inteiro matriz3 [4][6]
		inteiro matriz4 [4][6]
		inteiro lin, col

		para (lin = 0; lin < 4; lin ++)
		{
			para (col = 0; col < 6; col ++)
			{
				matriz  [lin][col] = sorteia (1,10) 
				matriz2 [lin][col] = sorteia (1,10)
				matriz3 [lin][col] = matriz [lin][col] + matriz2 [lin][col]
				matriz4 [lin][col] = matriz [lin][col] - matriz2 [lin][col]				
			}
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 637; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 13, 10, 6}-{matriz2, 14, 10, 7}-{matriz3, 15, 10, 7}-{matriz4, 16, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */