package Lista3;

import java.util.Scanner;

public class Lista3Tarefa3 
{
	public static void main (String [] args)
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARI�VEIS
		int idade = 0;
		int menos21 = 0;
		int mais50 = 0;
		
		//PROCESSAMENTOS E ENTRADAS
		while (idade != -99)
		{	
			System.out.print("DIGITE SUA IDADE: ");
			idade = leia.nextInt();
			
			if (idade < 21)
			{
				menos21 = menos21 + 1;
			}
			
			if (idade > 50)
			{
				mais50 = mais50 + 1;
			}
		}
		
		//SA�DAS
		System.out.printf("O TOTAL DE PESSOAS COM MENOS DE 21 ANOS �: %d\nO TOTAL DE PESSOAS COM MAIS DE 50 ANOS �: %d", menos21, mais50);
	}
}
