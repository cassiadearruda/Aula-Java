programa
{
	
	funcao inicio()
	{
		cadeia produto [4] = {"um","dois","tres","quatro"}
		inteiro codigo [4] = {1,2,3,4}
		inteiro estoque [4] = {10,10,10,10}
		real preco [4] = {2.50,2.50,2.50,2.50}
		inteiro auxCod = 0
		inteiro x
		inteiro auxEst = 0
		
		escreva ("COD\tPRODUTO\tPRECO\tESTOQUE")
		para (x = 0; x < 4; x ++)
		{
			escreva ("\n" + codigo [x] + "\t" + produto [x] + "\t" + preco [x] + "\t" + estoque [x])
		}
	
		escreva ("\nDIGITE O CÓDIGO DO PRODUTO: ")
		leia (auxCod)
			
		para (x = 0; x < 4; x ++)
		{
			se (auxCod == codigo [x])
			{
				escreva ("\nDIGITE A QUANTIDADE QUE DESEJA TIRAR: ")
				leia (auxEst)
				estoque [x] = estoque [x] - auxEst
	
				para (x = 0; x < 4; x ++)
				{
					escreva ("\n" + codigo [x] + "\t" + produto [x] + "\t" + preco [x] + "\t" + estoque [x])
				}
			}
		}	
	}		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 679; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */