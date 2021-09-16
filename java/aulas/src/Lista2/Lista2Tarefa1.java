package Lista2;

import java.util.Scanner;

public class Lista2Tarefa1 
{
	// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main (String [] args)
	{	
		//VARIÁVEIS
		int numero1;
		int numero2;
		int numero3;
		int maior = 0;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
		numero1 = leia.nextInt();
		System.out.println("DIGITE O SEGUNDO NÚMERO: ");
		numero2 = leia.nextInt();
		System.out.println("DIGITE O TERCEIRO NÚMERO: ");
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
		
		//SAÍDAS
		System.out.println("O maior número é: " + maior);
	}
}
