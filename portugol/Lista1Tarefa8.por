programa
{
	
	funcao inicio()
	{
		
		real cFabri, cDistri, cImpo

		cImpo = 0.45
		cDistri = 0.28

		escreva ("Digite o custo de fábrica: ")
		leia (cFabri)

		real cConsumidor = (cDistri * cFabri) + (cImpo * cFabri) + cFabri

		escreva ("O custo total do automóvel é de: " + cConsumidor)
		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */