package Programas;

import java.util.Scanner;

import Classes.Paciente;

public class ExePaciente 
{
	public static void main(String[] args) 
	{
		//OBJETOS
		Paciente exemplo1 = new Paciente ();
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		exemplo1.nome = "C�ssia";
		exemplo1.anoNascimento = 2001;
		exemplo1.telefone = 35353535;
		
		//SA�DAS
		exemplo1.mostrarNome();
		exemplo1.mostrarIdade();
		exemplo1.mostrarTelefone();
		
		//ENTRADAS E SA�DAS
		System.out.print("O paciente est� com est�vel? Digite 'S' para sim ou 'N' para n�o: ");
		exemplo1.status = leia.next().toUpperCase().charAt(0);
		exemplo1.mostrarStatus();
		
	}

}
