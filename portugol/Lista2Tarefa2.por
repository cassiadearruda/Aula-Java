programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro hora
		real salario
		real extra
		
		escreva ("Digite seu nome: ")
		leia (nome)
		escreva ("Quantidade de horas trabalhadas: ")
		leia (hora)
		limpa ()

		se (hora <= 50.00)
		{
		salario = hora * 10.00
		escreva ("Colaboradore ",nome, ", o salário total é de: R$", salario)
		}
		senao 
		{
		salario = 50.00 * 10.00
		extra = (hora - 50.00) * 20.00
		escreva ("Colaboradore ",nome, ", o salário total é de: R$", salario)
		escreva ("\nO salário excedente é de: R$", extra)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */