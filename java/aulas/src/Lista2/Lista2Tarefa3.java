package Lista2;

import java.util.Scanner;

public class Lista2Tarefa3 
{
	public static void main (String [] args)
	{
		//VARI�VEIS
		int idade;	
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.println("DIGITE SUA IDADE PARA DESCOBRIR SUA CATEGORIA: ");
		idade = leia.nextInt();
		
		//PROCESSAMENTOS E SA�DAS
		if (idade < 10)
		{
			System.out.println("\nSEM CATEGORIA.");
		}
		
		if (idade >= 10 &&  idade <= 14)
		{
			System.out.println("\nA SUA CATEGORIA � INFANTIL.");
		}
		
		if (idade >= 15 && idade <= 17)
		{
			System.out.println("\nA SUA CATEGORIA � JUVENIL.");
		}
		
		if (idade >= 18 && idade <= 25)
		{
			System.out.println("\nA SUA CATEGORIA � ADULTO.");
		}
		
		if (idade > 25)
		{
			System.out.println("\nSEM CATEGORIA.");
		}
	}
}
