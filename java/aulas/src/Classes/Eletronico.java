package Classes;

import java.util.Scanner;

public class Eletronico 
{	
	//SCANNER
	Scanner leia = new Scanner (System.in);
	
	//ATRIBUTOS
	public String nome;
	public String modelo;
	public String cor;
	public int numControles;
	public double preco;
	public char op;
	
	//M�TODOS
	public void mostrarNome()
	{
		System.out.println("O nome do aparelho �: " + nome);
	}
	public void mostrarModelo()
	{
		System.out.println("O modelo do aparelho �: " + modelo);
	}
	public void mostrarCor()
	{
		System.out.println("A cor do aparelho �: " + cor);
	}
	public void mostrarNumControles()
	{
		System.out.println("O aparelho tem " + numControles + " controles");
	}
	public void mostrarPreco()
	{
		System.out.println("O pre�o do aparelho �: " + preco);
	}
	public void ligando()
	{
		System.out.print("\nDeseja ligar o videogame? Digite '1' para sim ou '2' para n�o: ");
		op = leia.next().charAt(0);
		
		if (op == '1')
		{
			System.out.print("Videogame ligado!");
		}
		else
		{
			System.out.print("Continua desligado!");
		}
	}
	
}
