package Lista1;

import java.util.Scanner;

public class Tarefa4Revisao 
{

	public static void main(String[] args) 
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARI�VEIS
		double a, b, c, d, r, s;
		
		//ENTRADAS
		System.out.println("DIGITE O PRIMEIRO N�MERO: ");
		a = leia.nextDouble();
		System.out.println("DIGITE O SEGUNDO N�MERO: ");
		b = leia.nextDouble();
		System.out.println("DIGITE O TERCEIRO N�MERO: ");
		c = leia.nextDouble();
		
		//PROCESSAMENTOS
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r + s) / 2;
		
		//SA�DAS
		System.out.print("\nO RESULTADO DA OPERA��O 'R': " + r);
		System.out.print("\nO RESULTADO DA OPERA��O 'S': " + s);
		System.out.print("\nO RESULTADO DA OPERA��O 'D': " + d);
	}

}
