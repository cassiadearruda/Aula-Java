programa
{
	
	funcao inicio()
	{
		// Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total 
		// do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto 
		// o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer 
		// um valor negativo.

		inteiro numero = 0
		inteiro soma = 0
		inteiro media = 0
		inteiro contador = 0

		enquanto (numero >= 0)
		{
			escreva ("Digite um número: ")
			leia (numero)

			se (numero < 0)
			{
				soma = soma - numero
			}

			soma = soma + numero
			contador = contador + 1
		}

		media = soma / contador

		limpa ()
		escreva ("\nO total da soma é: ", soma)
		escreva ("\nA média é: ", media)
		escreva ("\nA quantidade de valores lidos é: ", contador)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 668; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */