programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.*/

		inteiro lancamentos [10]
		inteiro lancamentosTotal = 0
		inteiro lancamentosMedia = 0

		escreva ("A sequência de lançamentos é: ")

		para (inteiro x = 0; x <= 9; x++)
		{	
			se (x >= 0 e x <= 9)
			
				lancamentos [x] = sorteia (1,6)
				escreva (lancamentos[x], " ")
				lancamentosTotal = lancamentosTotal + lancamentos [x]
		}
	
		lancamentosMedia = lancamentosTotal / 10
		escreva ("\nA média do número dos lançamentos é: ", lancamentosMedia)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 597; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */