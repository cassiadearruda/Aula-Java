package Lista1;

import java.util.Scanner;

public class Tarefa2Revisao 
{

	public static void main(String[] args) 
	{
		/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.*/
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARIÁVEIS
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
		
		//SAÍDAS
		System.out.println("DIGITE SUA IDADE EXPRESSA EM ANOS É: " + anos);
		System.out.println("DIGITE SUA IDADE EXPRESSA EM MESES É: " + meses);
		System.out.println("DIGITE SUA IDADE EXPRESSA EM DIAS É: " + dias);
	}

}
