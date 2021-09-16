package Lista1;

import java.util.Scanner;

public class Tarefa1Revisao 
{
	public static void main (String [] args)
	{
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.*/
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARIÁVEIS
		int anos = 0;
		int meses = 0;
		int dias = 0;
		int totalDias = 0;
		
		//ENTRADAS
		System.out.print("DIGITE SUA IDADE EXPRESSA EM ANOS: ");
		anos = leia.nextInt();
		System.out.print("DIGITE SUA IDADE EXPRESSA EM MESES: ");
		meses = leia.nextInt();
		System.out.print("DIGITE SUA IDADE EXPRESSA EM DIAS: ");
		dias = leia.nextInt();
		
		//PROCESSAMENTOS
		anos = anos * 365;
		meses = meses * 30;
		totalDias = dias + meses + anos;
		
		//SAÍDAS
		System.out.print("DIGITE SUA IDADE TOTAL EXPRESSA EM DIAS É: " + totalDias);
	}
}
