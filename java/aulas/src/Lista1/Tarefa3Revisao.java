package Lista1;

import java.util.Scanner;

public class Tarefa3Revisao 
{

	public static void main(String[] args) 
	{
		/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		  expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARI�VEIS
		int segundos = 0;
		int minutos = 0;
		int horas = 0;
		
		//ENTRADAS
		System.out.println("DIGITE O TEMPO DE DURA��O DO EVENTO EXPRESSO EM SEGUNDOS: ");
		segundos = leia.nextInt();
		
		//PROCESSAMENTOS
		minutos = segundos / 60;
		horas = minutos / 60;
		segundos = minutos % 60;
		
		//SA�DAS
		System.out.println("O TEMPO EM HORAS �: " + horas);
		System.out.println("O TEMPO EM MINUTOS �: " + minutos);
		System.out.println("O TEMPO EM SEGUNDOS �: " + segundos);
	}

}
