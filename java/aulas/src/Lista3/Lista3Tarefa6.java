package Lista3;

import java.util.Scanner;

public class Lista3Tarefa6 {

	public static void main(String[] args) 
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARI�VEIS
		int numero;
		int soma = 0;
		int media = 0;
		int contador = 0;
		
		//PROCESSAMENTOS E ENTRADAS
		do
		{
			System.out.print("DIGITE UM N�MERO: ");
			numero = leia.nextInt();
			
			if (numero != 0 && numero % 3 == 0)
			{
				contador = contador + 1;
				soma = soma + numero;
			}
		}
		while (numero != 0);
		
		//PROCESSAMENTOS E SA�DAS
		if (numero == 0)
		{
			media = soma / contador;
			System.out.printf("\nA M�DIA DOS N�MERO M�LTIPLOS DE 3 � %d!", media);
		}
	}

}
