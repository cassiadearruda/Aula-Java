package Lista2;

import java.util.Scanner;

public class Lista2Tarefa1 
{
	// 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main (String [] args)
	{	
		//VARI�VEIS
		int numero1;
		int numero2;
		int numero3;
		int maior = 0;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.println("DIGITE O PRIMEIRO N�MERO: ");
		numero1 = leia.nextInt();
		System.out.println("DIGITE O SEGUNDO N�MERO: ");
		numero2 = leia.nextInt();
		System.out.println("DIGITE O TERCEIRO N�MERO: ");
		numero3 = leia.nextInt();
		
		//PROCESSAMENTOS
		if (numero1 > maior)
		{
			maior = numero1;
		}
		
		if (numero2 > maior)
		{
			maior = numero2;
		}
		
		if (numero3 > maior)
		{
			maior = numero3;
		}
		
		//SA�DAS
		System.out.println("O maior n�mero �: " + maior);
	}
}
