package Lista1;
import java.util.Scanner;

public class Lista1Tarefa7 
{
	public static void main (String [] args)
	{
		//VARI�VEIS
		double a, b, c, d, e, f, x, y, res1, res2, res3;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.println("ESCREVA O N�MERO DE A: ");
		a = leia.nextDouble();
		System.out.println("ESCREVA O N�MERO DE B: ");
		b = leia.nextDouble();
		System.out.println("ESCREVA O N�MERO DE C: ");
		c = leia.nextDouble();
		System.out.println("ESCREVA O N�MERO DE D: ");
		d = leia.nextDouble();
		System.out.println("ESCREVA O N�MERO DE E: ");
		e = leia.nextDouble();
		System.out.println("ESCREVA O N�MERO DE F: ");
		f = leia.nextDouble();
		
		//PROCESSAMENTOS
		res1 = (c * e) - (b * f);
		res2 = (a * f) - (c * d);
		res3 = (a * e) - (b * d);
		
		x = res1 / res3;
		y = res2 / res3;
		
		//SA�DAS
		System.out.println("O RESULTADO DE X �: " + x);
		System.out.println("O RESULTADO DE Y �: " + y);
	}
}
