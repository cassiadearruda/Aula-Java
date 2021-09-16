package Lista1;

import java.util.Scanner;

public class Tarefa7Revisao 
{

	public static void main(String[] args) 
	{
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARIÁVEIS
		double a, b, c, d, e, f, x, y, res1, res2, res3;
		
		//ENTRADAS
		System.out.println("DIGITE O NÚMERO DE A: ");
		a = leia.nextDouble();
		System.out.println("DIGITE O NÚMERO DE B: ");
		b = leia.nextDouble();
		System.out.println("DIGITE O NÚMERO DE C: ");
		c = leia.nextDouble();
		System.out.println("DIGITE O NÚMERO DE D: ");
		d = leia.nextDouble();
		System.out.println("DIGITE O NÚMERO DE E: ");
		e = leia.nextDouble();
		System.out.println("DIGITE O NÚMERO DE F: ");
		f = leia.nextDouble();
		
		//PROCESSAMENTOS
		res1 = (c * e) - (b * f);
		res2 = (a * f) - (c * d);
		res3 = (a * e) - (b * d);
		
		x = res1 / res3;
		y =  res2 / res3;
		
		//SAÍDAS
		System.out.println("O RESULTADO DA OPERAÇÃO DE X É: " + x);
		System.out.println("O RESULTADO DA OPERAÇÃO DE Y É: " + y);


				
	}

}
