programa 
{
	
	funcao inicio() 
	{
	
		inteiro segundos, minutos, horas
		
		escreva ("informe o tempo de duração de um evento em segundos: ")
		leia (segundos)
		
		minutos = segundos / 60
		horas = minutos / 60
		
		escreva ("O tempo de duração em horas é: " + horas)
		escreva ("\nO tempo de duração em minutos é: " + minutos)
		escreva ("\nO tempo de duração em segundos é: " + segundos)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 36; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */