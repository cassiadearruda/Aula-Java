package Classes;

import java.util.Scanner;

public class Patinete 
{
	//SCANNER
	Scanner leia = new Scanner (System.in);
	public String modelo;
	public char mover;
	public int velocidade;
	
	//CONSTRUTORES
	
	//M�TODOS
	public void mostrarModelo()
	{
		System.out.print("\nO modelo do patinete �: " + modelo);
	}
	public void mostrarMovendo()
	{
		System.out.print("\nDeseja andar para frente? Para sim digite '1' para n�o '2': ");
		mover = leia.next().charAt(0);
		
		if (mover == '1')
		{
			velocidade = velocidade + 2;
			System.out.printf("\nAumentantando velocidade em 2km totalizando %dkm!", velocidade);
		}
		else
		{
			System.out.print("\nMantendo parado!");
		}
	}
}
