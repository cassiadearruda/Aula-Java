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
		
		//ENTRADAS E SA�DAS
		System.out.println("Quem � fulano? Fulano � " + fulano1.nome);
		fulano1.mostrarIdade();
		System.out.println("Idade " + (2021 - fulano1.anoNascimento));
		System.out.println(fulano1.nome + "sua idade � " + fulano1.calcIdade(2021));
		
	}

}
