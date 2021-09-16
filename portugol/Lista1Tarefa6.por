programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		
		real x1, x2, y1, y2, p1, p2, resultadoD

		escreva ("Digite o primeiro número: ")
		leia (x1)
		escreva ("Digite o segundo número: ")
		leia (x2)
		escreva ("Digite o terceiro número: ")
		leia (y1)
		escreva ("Digite o quarto número: ")
		leia (y2)

		p1 = Matematica.potencia ((x1 - x2),2)
		p2 = Matematica.potencia ((y1 - y2),2)
		resultadoD = Matematica.raiz((p1 + p2),2)

		escreva ("O resultado da operação é: " + resultadoD)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 65; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */