programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva ("Digite um número: ")
		leia (numero)

		se (numero % 2 == 0)
		{
			escreva ("O número é par e ")
			
			se (numero < 0)
			{
				escreva ("negativo.")
			}
			senao
			{
				escreva ("positivo.")
			}
		}
		senao se (numero % 2 < 0 ou numero % 2 > 0)
		{
			escreva ("O número é ímpar e ")
			
			se (numero < 0)
			{
				escreva ("negativo.")
			}
			senao
			{
				escreva ("positivo.")
			}
		}
		senao 
		{
			escreva ("O número é 0 e neutro.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 358; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */