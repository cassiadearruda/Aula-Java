package Lista1;
import java.util.Scanner;

public class Lista1Tarefa4 
{
	public static void main (String [] args)
	{
		//VARI�VEIS
		double a;
		double b;
		double c;
		double d;
		double r;
		double s;
		
		//SCANNER
		Scanner leia = new Scanner (System.in); 
		
		//ENTRADAS
		System.out.println("DIGTE O PRIMEIRO N�MERO: ");
		a = leia.nextDouble();
		System.out.println("DIGITE O SEGUNDO N�MERO: ");
		b = leia.nextDouble();
		System.out.println("DIGITE O TERCEIRO N�MERO: ");
		c = leia.nextDouble();
		
		//PROCESSAMENTOS
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		
		//SA�DAS
		System.out.println("O RESULTADO DE R �: " + r);
		System.out.println("O RESULTADO DE S �: " + s);
		System.out.println("O RESULTADO DE D �: " + d);

	}
}
