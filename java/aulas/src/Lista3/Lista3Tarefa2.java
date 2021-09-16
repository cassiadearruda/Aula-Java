package Lista3;

import java.util.Scanner;

public class Lista3Tarefa2 
{
	public static void main (String [] args)
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARIÁVEIS
		int numero = 0;	
		int impar = 0;
		int par = 0;
		
		//PROCESSAMENTOS E ENTRADAS
		for (int x = 0; x < 10; x ++)
		{
			System.out.print("DIGITE UM NÚMERO: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0)
			{
				par = par + 1;
			}
			else
			{
				impar = impar + 1;
			}
		}
		
		//SAÍDAS
		System.out.printf("\n%d são pares! e %d são ímpares!", par, impar);
	}
}
