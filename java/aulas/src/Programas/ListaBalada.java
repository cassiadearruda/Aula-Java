package Programas;

import Classes.Pessoas;

public class ListaBalada 
{

	public static void main(String[] args) 
	{
		//OBJETOS
		Pessoas fulano1 = new Pessoas();
		
		//ENTRADAS
		fulano1.nome = "PAULO";
		fulano1.anoNascimento = 2000;
		
		//ENTRADAS E SAÍDAS
		System.out.println("Quem é fulano? Fulano é " + fulano1.nome);
		fulano1.mostrarIdade();
		System.out.println("Idade " + (2021 - fulano1.anoNascimento));
		System.out.println(fulano1.nome + "sua idade é " + fulano1.calcIdade(2021));
		
	}

}
