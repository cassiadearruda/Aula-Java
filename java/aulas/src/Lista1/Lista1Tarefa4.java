package Lista1;
import java.util.Scanner;

public class Lista1Tarefa4 
{
	public static void main (String [] args)
	{
		//VARIÁVEIS
		double a;
		double b;
		double c;
		double d;
		double r;
		double s;
		
		//SCANNER
		Scanner leia = new Scanner (System.in); 
		
		//ENTRADAS
		System.out.println("DIGTE O PRIMEIRO NÚMERO: ");
		a = leia.nextDouble();
		System.out.println("DIGITE O SEGUNDO NÚMERO: ");
		b = leia.nextDouble();
		System.out.println("DIGITE O TERCEIRO NÚMERO: ");
		c = leia.nextDouble();
		
		//PROCESSAMENTOS
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		
		//SAÍDAS
		System.out.println("O RESULTADO DE R É: " + r);
		System.out.println("O RESULTADO DE S É: " + s);
		System.out.println("O RESULTADO DE D É: " + d);

	}
}
