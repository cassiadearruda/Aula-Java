package Lista1;

import java.util.Scanner;

public class Tarefa4Revisao 
{

	public static void main(String[] args) 
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARIÁVEIS
		double a, b, c, d, r, s;
		
		//ENTRADAS
		System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
		a = leia.nextDouble();
		System.out.println("DIGITE O SEGUNDO NÚMERO: ");
		b = leia.nextDouble();
		System.out.println("DIGITE O TERCEIRO NÚMERO: ");
		c = leia.nextDouble();
		
		//PROCESSAMENTOS
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r + s) / 2;
		
		//SAÍDAS
		System.out.print("\nO RESULTADO DA OPERAÇÃO 'R': " + r);
		System.out.print("\nO RESULTADO DA OPERAÇÃO 'S': " + s);
		System.out.print("\nO RESULTADO DA OPERAÇÃO 'D': " + d);
	}

}
