package Lista1;

import java.util.Scanner;

public class Tarefa3Revisao 
{

	public static void main(String[] args) 
	{
		/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		  expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARIÁVEIS
		int segundos = 0;
		int minutos = 0;
		int horas = 0;
		
		//ENTRADAS
		System.out.println("DIGITE O TEMPO DE DURAÇÃO DO EVENTO EXPRESSO EM SEGUNDOS: ");
		segundos = leia.nextInt();
		
		//PROCESSAMENTOS
		minutos = segundos / 60;
		horas = minutos / 60;
		segundos = minutos % 60;
		
		//SAÍDAS
		System.out.println("O TEMPO EM HORAS É: " + horas);
		System.out.println("O TEMPO EM MINUTOS É: " + minutos);
		System.out.println("O TEMPO EM SEGUNDOS É: " + segundos);
	}

}
