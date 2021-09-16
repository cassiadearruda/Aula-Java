programa 
{
	
	funcao inicio() 
	{

		real numeroA, numeroB, numeroC, numeroR, numeroS, numeroD, resultadoR, resultadoS, resultadoD

		escreva ("Digite o primeiro número: ")
		leia (numeroA)
		escreva ("Digite o segundo número: ")
		leia (numeroB)
		escreva ("Digite o terceiro número: ")
		leia (numeroC)

		numeroR = Matematica.potencia ((numeroA + numeroB),2)
		numeroS = Matematica.potencia ((numeroB + numeroC),2)
		resultadoD = (numeroR + numeroS) / 2

		escreva ("O resultado da operação é: " + resultadoD)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 516; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */