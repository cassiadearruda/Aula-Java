package Lista2;

import java.util.Scanner;

public class Exemplo2 
{
	public static void main (String [] args)
	{
		//VARIÁVEIS
		String nome;
		char opcao;
		double salario;
		double porcent1 = 0.15;
		double porcent2 = 0.25;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//ENTRADAS
		System.out.println("DIGITE SEU NOME: ");
		nome = leia.next().toUpperCase();
		System.out.println("FORMA QUE DESEJA SER TRATADE?\nPARA FEMININO DIGITE 'F'\nPARA MASCULINO DIGITE 'M'\nPARA NEUTRO DIGITE 'N'");
		opcao = leia.next().toUpperCase().charAt(0);
		System.out.println("DIGITE O SEU SALÁRIO: ");
		salario = leia.nextDouble();
		
		//PROCESSAMENTOS E SAÍDAS
		if (salario <= 2000)
		{
			if (opcao == 'F' || opcao == 'f')
			{
				System.out.println("SRA. " + nome + ", ISENTA!");
			}
			else if (opcao == 'M' || opcao == 'm')
			{
				System.out.println("SR. " + nome + ", ISENTO!");
			}
			else
			{
				System.out.println("SRE. " + nome + ", ISENTE!");
			}
		}
		else if (salario <= 5000)
		{
			if (opcao == 'F' || opcao == 'f')
			{
				System.out.println("SRA. " + nome + ", COM UM SALÁRIO DE R$" + salario + " A TAXA A PAGAR É DE: R$" + salario * porcent1);
			}
			else if (opcao == 'M' || opcao == 'm')
			{
				System.out.println("SR. " + nome + ", COM UM SALÁRIO DE R$" + salario + " A TAXA A PAGAR É DE: R$" + salario * porcent1);
			}
			else
			{
				System.out.println("SRE. " + nome + ", COM UM SALÁRIO DE R$" + salario + " A TAXA A PAGAR É DE: R$" + salario * porcent1);
			}
		}
		else
		{
			if (opcao == 'F' || opcao == 'f')
			{
				System.out.println("SRA. " + nome + ", COM UM SALÁRIO DE R$" + salario + " A TAXA A PAGAR É DE: R$" + salario * porcent2);
			}
			else if (opcao == 'M' || opcao == 'm')
			{
				System.out.println("SR. " + nome + ", COM UM SALÁRIO DE R$" + salario + " A TAXA A PAGAR É DE: R$" + salario * porcent2);
			}
			else
			{
				System.out.println("SRE. " + nome + ", COM UM SALÁRIO DE R$" + salario + " A TAXA A PAGAR É DE: R$" + salario * porcent2);
			}
		}
		
	}
}
