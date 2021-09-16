
package Programas;

import java.util.Scanner;

import Classes.Cliente;

public class ExeCliente 
{
	public static void main(String[] args) 
	{
		//OBJETOS
		Cliente exemplo1 = new Cliente ();
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
		System.out.println("O cliente est� com debito? Digite 'S' para sim ou 'N' para n�o: ");
		exemplo1.status = leia.next().toUpperCase().charAt(0);
		exemplo1.mostrarStatus();
	}

}
