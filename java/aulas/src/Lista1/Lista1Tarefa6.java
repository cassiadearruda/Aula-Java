package Lista1;
import java.util.Scanner;

public class Lista1Tarefa6 
{
	public static void main (String [] args)
	{
		//VARIÁVEIS
		double x1;
		double x2;
		double y1;
		double y2;
		double resX;
		double resY;
		double d;
		double somaD;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.println("DIGITE O NÚMEERO DE X1: ");
		x1 = leia.nextDouble();
		System.out.println("DIGITE O NÚMEERO DE X2: ");
		x2 = leia.nextDouble();
		System.out.println("DIGITE O NÚMEERO DE Y1: ");
		y1 = leia.nextDouble();
		System.out.println("DIGITE O NÚMEERO DE Y2: ");
		y2 = leia.nextDouble();
		
		//PROCESSAMENTOS
		resX = Math.pow((x1 - x2), 2);
		resY = Math.pow((y1 - y2), 2);
		somaD = resX + resY;
		d = Math.sqrt(somaD);
		
		//SAÍDAS
		System.out.println("O RESULTADO DA RAIZ DE D É: " + d);
		
	}
}
