package Programas;

import Classes.ContaBancaria;

public class ExeContaBancaria 
{

	public static void main(String[] args) 
	{
		//OBJETOS
		ContaBancaria exemplo1 = new ContaBancaria();
		
		//ENTRADAS
		exemplo1.titular = "C�ssia";
		exemplo1.cpf = "000.000.000-00";
		exemplo1.saldo = 867.55;
		exemplo1.credito = 231.98;
		
		//SA�DAS
		exemplo1.mostrarExtrato();
	}

}
