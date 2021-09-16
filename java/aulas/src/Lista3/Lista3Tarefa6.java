package Lista3;

import java.util.Scanner;

public class Lista3Tarefa6 {

	public static void main(String[] args) 
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARIÁVEIS
		int numero;
		int soma = 0;
		int media = 0;
		int contador = 0;
		
		//PROCESSAMENTOS E ENTRADAS
		do
		{
			System.out.print("DIGITE UM NÚMERO: ");
			numero = leia.nextInt();
			
			if (numero != 0 && numero % 3 == 0)
			{
				contador = contador + 1;
				soma = soma + numero;
			}
		}
		while (numero != 0);
		
		//PROCESSAMENTOS E SAÍDAS
		if (numero == 0)
		{
			media = soma / contador;
			System.out.printf("\nA MÉDIA DOS NÚMERO MÚLTIPLOS DE 3 É %d!", media);
		}
	}

}
