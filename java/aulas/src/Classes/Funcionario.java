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
	
	//M�TODOS
	public void mostrarNome()
	{
		System.out.println("O nome �: " + nome);
	}
	public void mostrarIdade()
	{
		System.out.println("A idade �: " + (2021 - anoNascimento));
	}
	public void mostrarTelefone()
	{
		System.out.println("O numero de telefone �: " + telefone);
	}
	public void mostrarSalario()
	{
		System.out.println("O sal�rio �: " + salario);
	}
	public void mostrarDesempenho()
	{
		System.out.print(nome + " entregou todos seus trabalhos? Digite '1' para sim ou '2' para n�o: ");
		desempenho = leia.next().charAt(0);
		
		if (desempenho == '1')
		{
			System.out.print(nome + " ser� promovide!");
		}
		else
		{
			System.out.print(nome + " precisa melhorar!");
		}

	}
}
