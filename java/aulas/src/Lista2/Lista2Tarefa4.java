package Lista2;

import java.util.Scanner;

public class Lista2Tarefa4 
{
	public static void main (String [] args)
	{
		//VARIÁVEIS
		double numero;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.print("DIGITE UM NÚMERO: ");
		numero = leia.nextDouble();
		
		//PROCESSAMENTOS E SAÍDAS
		if (numero % 2 == 0)
		{	
			System.out.print("O NUMERO " + numero + ", É PAR! E SUA RAIZ É: " + Math.sqrt(numero));
		}
		
		else
		{	
			System.out.print("O NUMERO " + numero + ", É ÍMPAR! E ELEVADO AO QUADRADO É: " + Math.pow(numero,2));
		}
	}
}
