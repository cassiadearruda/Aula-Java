programa
{
	
	funcao inicio()
	{
		real pesoTomates, excesso, multa

		escreva ("Digite o peso dos tomates: ")
		leia (pesoTomates)

		se (pesoTomates <= 50.00)
		{
			escreva ("O peso informado está dentro da quantidade permitida.")
		}
		senao 
		{
			excesso = pesoTomates - 50.00
			multa = excesso * 4.00
			escreva ("O peso informado foi maior que o permitido, sua multa é de: R$", multa)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */