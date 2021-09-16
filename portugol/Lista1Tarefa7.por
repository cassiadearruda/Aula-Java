programa
{
	
	funcao inicio()
	{
		
		real a1, b1, c1, d1, e1, f1, x1, y1, auxiliar, x, y

		escreva ("Digite o valor de a: ")
		leia (a1)
		escreva ("Digite o valor de b: ")
		leia (b1)
		escreva ("Digite o valor de c: ")
		leia (c1)
		escreva ("Digite o valor de d: ")
		leia (d1)
		escreva ("Digite o valor de e: ")
		leia (e1)
		escreva ("Digite o valor de f: ")
		leia (f1)

		x1 = ((c1 * e1) - (b1 * f1))
		y1 = ((a1 * f1) - (c1 * d1))
		auxiliar = ((a1 * e1) - (b1 * d1))
		x = x1 / auxiliar
		y = y1 / auxiliar

		escreva ("X é igual a: " + x)
		escreva ("\nY é igual a: " + y)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */