package Lista1;
import java.util.Scanner;

public class Lista1Tarefa3 
{
	public static void main (String [] args)
	{
		
		//VARI�VEIS
		int segundos;
		int minutos;
		int horas;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.println("DIGITE O TEMPO DE DURA��O DO EVENTO EM SEGUNDOS: ");
		segundos = leia.nextInt();
		
		//PROCESSAMENTOS
		minutos = segundos / 60;
		horas = minutos / 60;
		segundos = minutos % 60;
		
		//SA�DAS
		System.out.println("O TEMPO DE DURA��O DO EVENTO �");
		System.out.println("HORAS: " + horas);
		System.out.println("MINUTOS: " + minutos);
		System.out.println("SEGUNDOS: " + segundos);

	}
}
