programa
{
	
	funcao inicio()
	{
		 //Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
           //em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
           //diagonal, ou seja, diagonal principal.

           inteiro matriz1 [3][3]
           inteiro soma = 0
           inteiro somaD = 0

           para (inteiro x = 0; x < 3; x ++)
           {
           	escreva ("Escreva um número: ")
           	leia (matriz1 [x][x])
           	somaD = somaD + matriz1 [x][x]
           }

           para ( inteiro lin = 0; lin < 3; lin ++)
           {
	           para ( inteiro col = 0; col < 3; col ++)
	           {          
	           	escreva ("Escreva um número: ")
	           	leia (matriz1 [lin][col])
	           	soma = soma + matriz1 [lin][col]
	           }
           }
			
           escreva ("\nA soma da Matriz é: ", soma)
           escreva ("\n1A soma da diagonal principal é : ", somaD)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 959; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz1, 10, 19, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */