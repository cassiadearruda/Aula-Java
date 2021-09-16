package Lista3;

import java.util.Scanner;

public class Lista3Tarefa5 {

	public static void main(String[] args) 
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARIÁVEIS
		int numero = 0;
		int soma = 0;
		
		//PROCESSAMENTOS E ENTRADAS
		do
		{
			System.out.print("DIGITE UM NÚMERO: ");
			numero = leia.nextInt();
			soma = soma + numero;
		}
		while (numero != 0);
		
		//SAÍDAS
		System.out.printf("\nO RESULTADO DA SOMA DE TODOS OS NÚMERO É %d!", soma);
	}	

}
