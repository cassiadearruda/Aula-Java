package Lista1;
import java.util.Scanner;

public class Lista1Tarefa2 
{
	public static void main (String [] args)
	{
		
		//VARI�VEIS
		int anos;
		int meses;
		int dias;
		int resultadoMeses;
		int resultadoDias;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.println("DIGITE SUA IDADE EM DIAS: ");
		dias = leia.nextInt();
		
		//PROCESSAMENTOS
		anos = dias / 365;
		meses = dias % 365;
		resultadoMeses = meses / 30;
		dias = meses % 30;
		
		//SA�DAS
		System.out.println("SUA IDADE EM ANOS �: " + anos);
		System.out.println("SUA IDADE EM MESES �: " + resultadoMeses);
		System.out.println("SUA IDADE EM DIAS �: " + dias);
	}
}
