programa
{
	
	funcao inicio()
	{
		cadeia alunes [1]
		real nota [1] 

		para (inteiro x = 0; x <1; x++)
		{
			escreva ("Digite seu nome: ")
			leia (alunes [x])
			escreva ("Digite sua nota: ")
			leia (nota [x])
		}

		para (inteiro x = 0; x < 1; x ++)
		{
			se (nota [x] <= 5)
			{
				escreva (alunes [x], ", sua nota foi: ", nota [x],". Ainda não conseguiu!\n")
			}
			senao
			{
				escreva (alunes [x], ", sua nota foi: ", nota [x], ". Muito bem! Continue assim! \n")
			}
		}
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 219; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */