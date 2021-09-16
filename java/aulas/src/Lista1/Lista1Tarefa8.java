package Lista1;
import java.util.Scanner;

public class Lista1Tarefa8 
{
	public static void main (String [] args)
	{
		//VARIÁVEIS
		double cFab = 0, cImp = 0.45, cDis = 0.28, cCon = 0;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.println("DIGITE O CUSTO DE FABRICA DO AUTOMÓVEL: ");
		cFab = leia.nextDouble();
		
		//PROCESSAMENTOS
		cCon = (cImp * cFab) + (cDis * cFab) + cFab;
		
		//SAÍDAS
		System.out.println("O CUSTO DO AUTOMÓVEL PARA O CONSUMIDOR É: " + cCon);
	}
}
