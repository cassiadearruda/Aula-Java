package Programas;

import Classes.Patinete;

public class ExePatinete 
{

	public static void main(String[] args) 
	{
		//OBJETOS
		Patinete exemplo1 = new Patinete ();
		
		//ENTRADAS
		exemplo1.modelo = "UltraMax 2.0";
		
		//SAÍDAS
		exemplo1.mostrarModelo();
		exemplo1.mostrarMovendo();
	}

}
