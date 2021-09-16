package Classes;

import java.util.Scanner;

public class Funcionario 
{
	//OBJETOS
	Scanner leia = new Scanner (System.in);
	
	//ATRIBUTOS
	public String nome;
	public int anoNascimento;
	public int telefone;
	public double salario;
	private char desempenho;
	public char ponto;
	
	//CONSTRUTORES
	
	//MÉTODOS
	public void mostrarNome()
	{
		System.out.println("O nome é: " + nome);
	}
	public void mostrarIdade()
	{
		System.out.println("A idade é: " + (2021 - anoNascimento));
	}
	public void mostrarTelefone()
	{
		System.out.println("O numero de telefone é: " + telefone);
	}
	public void mostrarSalario()
	{
		System.out.println("O salário é: " + salario);
	}
	public void mostrarDesempenho()
	{
		System.out.print(nome + " entregou todos seus trabalhos? Digite '1' para sim ou '2' para não: ");
		desempenho = leia.next().charAt(0);
		
		if (desempenho == '1')
		{
			System.out.print(nome + " será promovide!");
		}
		else
		{
			System.out.print(nome + " precisa melhorar!");
		}

	}
}
