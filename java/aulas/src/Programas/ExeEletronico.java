package Programas;

import Classes.Eletronico;

public class ExeEletronico 
{

	public static void main(String[] args) 
	{
		//OBJETOS
		Eletronico exemplo1 = new Eletronico();
		
		//ENTRADAS
		exemplo1.nome = "PlayStation";
		exemplo1.modelo = "2021";
		exemplo1.cor = "Branca";
		exemplo1.numControles = 2;
		exemplo1.preco = 8000;
		
		//SAÍDAS
		exemplo1.mostrarNome();
		exemplo1.mostrarModelo();
		exemplo1.mostrarCor();
		exemplo1.mostrarNumControles();
		exemplo1.mostrarPreco();
		exemplo1.ligando();
	}

}
