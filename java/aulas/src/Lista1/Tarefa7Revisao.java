package Lista1;

import java.util.Scanner;

public class Tarefa7Revisao 
{

	public static void main(String[] args) 
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARI�VEIS
		double a, b, c, d, e, f, x, y, res1, res2, res3;
		
		//ENTRADAS
		System.out.println("DIGITE O N�MERO DE A: ");
		a = leia.nextDouble();
		System.out.println("DIGITE O N�MERO DE B: ");
		b = leia.nextDouble();
		System.out.println("DIGITE O N�MERO DE C: ");
		c = leia.nextDouble();
		System.out.println("DIGITE O N�MERO DE D: ");
		d = leia.nextDouble();
		System.out.println("DIGITE O N�MERO DE E: ");
		e = leia.nextDouble();
		System.out.println("DIGITE O N�MERO DE F: ");
		f = leia.nextDouble();
		
		//PROCESSAMENTOS
		res1 = (c * e) - (b * f);
		res2 = (a * f) - (c * d);
		res3 = (a * e) - (b * d);
		
		x = res1 / res3;
		y =  res2 / res3;
		
		//SA�DAS
		System.out.println("O RESULTADO DA OPERA��O DE X �: " + x);
		System.out.println("O RESULTADO DA OPERA��O DE Y �: " + y);


				
	}

}
