programa
{
	
	funcao inicio()
	{
		real indice

		escreva ("Escreva o índice de poluição: ")
		leia (indice)

		se (indice >= 0 e indice <= 0.25)
		{
			escreva ("Nenhum grupro de industrias é acionado.")
		}
		senao se (indice >= 0.26 e indice <= 0.39)
		{
			escreva ("Todas as industrias do 1° grupo devem ser acionadas e suspenderem suas atividades.")
		}
		senao se (indice >= 0.40 e indice <= 0.49)
		{
			escreva ("Todas as industrias do 1° e 2° grupo devem ser notificadas a paralisarem suas atividades.")
		}
		senao 
		{
			escreva ("Todas as industrias de todos os grupos devem ser acionadas e suspenderem suas atividades.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */