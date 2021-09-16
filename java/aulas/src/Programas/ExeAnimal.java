package Programas;

import Classes.Cachorro;
import Classes.Cavalo;
import Classes.Preguica;

public class ExeAnimal {

	public static void main(String[] args) {
		Preguica num1 = new Preguica ("num1",3,"som de preguica","Sobe em arvores");
		Cavalo num2 = new Cavalo ("num2", 8, "som de cavalo", "Corre");
		Cachorro num3 = new Cachorro ("num3", 3, "som de cachorro", "Corre");
		
		System.out.println(num1.somAnimal());
		System.out.println(num2.somAnimal());
		System.out.println(num3.somAnimal());
	}

}
