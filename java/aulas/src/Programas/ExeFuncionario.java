package Programas;

import Classes.Funcionario;

public class ExeFuncionario 
{

	public static void main(String[] args) 
	{
		//OBJETOS
		Funcionario exemplo1 = new Funcionario ();
		
		//ENTRADAS
		exemplo1.nome = "Cássia";
		exemplo1.anoNascimento = 2001;
		exemplo1.telefone = 37329235;
		exemplo1.salario = 1980.00;
		
		//SAÍDAS
		exemplo1.mostrarNome();
		exemplo1.mostrarIdade();
		exemplo1.mostrarTelefone();
		exemplo1.mostrarSalario();
		exemplo1.mostrarDesempenho();
	}

}
