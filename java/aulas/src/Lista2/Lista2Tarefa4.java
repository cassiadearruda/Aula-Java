package Lista2;

import java.util.Scanner;

public class Lista2Tarefa4 
{
	public static void main (String [] args)
	{
		//VARI�VEIS
		double numero;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.print("DIGITE UM N�MERO: ");
		numero = leia.nextDouble();
		
		//PROCESSAMENTOS E SA�DAS
		if (numero % 2 == 0)
		{	
			System.out.print("O NUMERO " + numero + ", � PAR! E SUA RAIZ �: " + Math.sqrt(numero));
		}
		
		else
		{	
			System.out.print("O NUMERO " + numero + ", � �MPAR! E ELEVADO AO QUADRADO �: " + Math.pow(numero,2));
		}
	}
}
