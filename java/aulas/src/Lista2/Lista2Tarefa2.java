package Lista2;

import java.util.Scanner;

public class Lista2Tarefa2 
{
	public static void main (String [] args)
	{
		// 2- Faça um programa que entre com três números e coloque em ordem crescente.
		
		//VARIÁVEIS
		int numero1;
		int numero2;
		int numero3;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
		numero1 = leia.nextInt();
		System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
		numero2 = leia.nextInt();
		System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
		numero3 = leia.nextInt();
		
		//PROCESSAMENTOS E SAÍDAS
		if (numero1 > numero2 && numero1 > numero3)
		{	
			if (numero2 > 3)
			{
				System.out.println(numero3 + " " + numero2 + " " + numero1);
			}
			else
			{
				System.out.println(numero2 + " " + numero3 + " " + numero1);
			}		
		}
		
		else if (numero2 > numero1 && numero2 > numero3)
		{	
			if (numero1 > 3)
			{
				System.out.println(numero3 + " " + numero1 + " " + numero2);
			}
			else
			{
				System.out.println(numero1 + " " + numero3 + " " + numero2);
			}		
		}
		else
		{
			if (numero2 > numero1)
			{
				System.out.println(numero1 + " " + numero2 + " " + numero3);
			}
			else
			{
				System.out.println(numero2 + " " + numero1 + " " + numero3);
			}
		}
		
	}
}
