programa
{
	
	funcao inicio()
	{
		//Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. Ex.: 
		//o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28
		
		inteiro numero = 0
		inteiro soma = 0
		inteiro linha = 1

		escreva ("Digite um número do seu teclado: ")
		leia (numero)

		faca
		{	
		     escreva (linha)
		     	
		     se (linha != numero)
		     {
		     	escreva (" + ")
		     }
		     
		     soma = soma + linha
			linha = linha + 1
		}
		enquanto (linha >= 0 e linha <= numero)

		escreva (" = ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 590; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */