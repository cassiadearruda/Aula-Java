package Lista1;
import java.util.Scanner;

public class Lista1Tarefa8 
{
	public static void main (String [] args)
	{
		//VARI�VEIS
		double cFab = 0, cImp = 0.45, cDis = 0.28, cCon = 0;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.println("DIGITE O CUSTO DE FABRICA DO AUTOM�VEL: ");
		cFab = leia.nextDouble();
		
		//PROCESSAMENTOS
		cCon = (cImp * cFab) + (cDis * cFab) + cFab;
		
		//SA�DAS
		System.out.println("O CUSTO DO AUTOM�VEL PARA O CONSUMIDOR �: " + cCon);
	}
}
