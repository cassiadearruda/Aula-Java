package Lista1;

import java.util.Scanner;

public class Tarefa8Revisao 
{

	public static void main(String[] args) 
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARI�VEIS
		double cFab, cImp = 0.45, cDis = 0.28, soma;
		
		//ENTRADAS
		System.out.println("DIGITE O CUSTO DE F�BRICA: ");
		cFab = leia.nextDouble();
		
		//PROCESSAMENTOS
		soma = cImp + cDis;
		cFab = (cFab * soma) + cFab;
		
		//SA�DAS
		System.out.println("O CUSTO TOTAL DO AUTOM�VEL �: " + cFab);

	}

}
