package Lista1;

import java.util.Scanner;

public class Tarefa2Revisao 
{

	public static void main(String[] args) 
	{
		/*2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.*/
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARI�VEIS
		int dias = 0;
		int meses = 0;
		int anos = 0;
		
		//ENTRADAS
		System.out.print("DIGITE SUA IDADE EXPRESSA EM DIAS: ");
		dias = leia.nextInt();
		
		//PROCESSAMENTOS
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = (dias % 365) % 30;
		
		//SA�DAS
		System.out.println("DIGITE SUA IDADE EXPRESSA EM ANOS �: " + anos);
		System.out.println("DIGITE SUA IDADE EXPRESSA EM MESES �: " + meses);
		System.out.println("DIGITE SUA IDADE EXPRESSA EM DIAS �: " + dias);
	}

}
