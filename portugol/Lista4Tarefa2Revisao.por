programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		  que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		  imprima a média aritmética dos lançamentos, contabilize e apresente também
		  quantas foram as ocorrências da maior pontuação.*/

		  inteiro rodada [10]
		  inteiro total = 0
		  inteiro media = 0
		  inteiro maior = 0
		  inteiro auxiliar = 0

		  para (inteiro x = 0; x <10; x ++)
		  {
		  	rodada [x] = sorteia (1,6)
		  	total = total + rodada [x]
		  	escreva (rodada [x], "\n")

		  	se (rodada [x] > maior)
		  	{
		  		maior = rodada [x]
		  	}
		  }
		  media = total / 10
		  
		  escreva ("\nA média artmética dos lançamentos é: ", media)
		  escreva ("\nO maior número é: ", maior)
		  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 828; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */