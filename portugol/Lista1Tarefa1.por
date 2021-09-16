programa 
{
	
	funcao inicio() 
	{
		
		inteiro meses, anos, dias, resultadoAnos, resultadoMeses, resultado
		
		escreva ("informe sua idade.")
		escreva ("\nAnos: ")
		leia (anos)
		escreva ("Meses: ")
		leia (meses)
		escreva ("Dias: ")
		leia (dias)

		resultadoAnos = anos * 365
		resultadoMeses = meses * 30
		resultado = dias + resultadoAnos + resultadoMeses

		escreva ("Sua idade em dias é: " + resultado)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 83; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */