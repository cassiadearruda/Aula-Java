package Lista1;

import java.util.Scanner;

public class Tarefa8Revisao 
{

	public static void main(String[] args) 
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARIÁVEIS
		double cFab, cImp = 0.45, cDis = 0.28, soma;
		
		//ENTRADAS
		System.out.println("DIGITE O CUSTO DE FÁBRICA: ");
		cFab = leia.nextDouble();
		
		//PROCESSAMENTOS
		soma = cImp + cDis;
		cFab = (cFab * soma) + cFab;
		
		//SAÍDAS
		System.out.println("O CUSTO TOTAL DO AUTOMÓVEL É: " + cFab);

	}

}
