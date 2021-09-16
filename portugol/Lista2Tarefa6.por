programa
{
	
	funcao inicio()
	{
		inteiro idade
		inteiro iA, iB, jA, jB, adultos

		escreva ("Digite sua idade: ")
		leia (idade)

		se (idade < 5)
		{
			escreva ("Infelizmente, não trabalhamos com essa idade.")
		}
		senao se (idade >= 5 e idade <= 7)
		{
			escreva ("Sua classificação é: Infantil A")
		}
		senao se (idade > 7 e idade <= 11)
		{
			escreva ("Sua classificação é Infantil B")
		}
		senao se (idade > 11 e idade <= 13)
		{
			escreva ("Sua classificação é Juvenil A")
		}
		senao se (idade > 13 e idade <= 17)
		{
			escreva ("Sua classificação é Juvenil B")
		}
		senao
		{
			escreva ("Sua classificação é Adultos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */