package Lista1;

import java.util.Scanner;

public class Tarefa6Revisao 
{

	public static void main(String[] args) 
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARIÁVEIS
		double x1, x2, y1, y2, x, y, somaD, d;
		
		//ENTRADAS
		System.out.println("DIGITE O NÚMERO DE X1: ");
		x1 = leia.nextDouble();
		System.out.println("DIGITE O NÚMERO DE X2: ");
		x2 = leia.nextDouble();
		System.out.println("DIGITE O NÚMERO DE Y1: ");
		y1 = leia.nextDouble();
		System.out.println("DIGITE O NÚMERO DE Y2: ");
		y2 = leia.nextDouble();
		
		//PROCESSAMENTOS
		x = Math.pow((x1 - x2), 2); 
		y = Math.pow((y1 - y2), 2); 
		
		somaD = x + y;
		d = Math.sqrt(somaD);
		
		//SAÍDAS
		System.out.println("A RAIZ QUADRADA DE 'D' É: " + d);
	}

}
