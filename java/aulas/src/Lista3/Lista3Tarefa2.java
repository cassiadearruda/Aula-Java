package Lista3;

import java.util.Scanner;

public class Lista3Tarefa2 
{
	public static void main (String [] args)
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARI�VEIS
		int numero = 0;	
		int impar = 0;
		int par = 0;
		
		//PROCESSAMENTOS E ENTRADAS
		for (int x = 0; x < 10; x ++)
		{
			System.out.print("DIGITE UM N�MERO: ");
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
		
		//SA�DAS
		System.out.printf("\n%d s�o pares! e %d s�o �mpares!", par, impar);
	}
}
