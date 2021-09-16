package Lista1;
import java.util.Scanner;

public class SegundoPrograma {
	
	public static void main (String [] args)
	{
		//VARIÁVEIS
		String nome;
		int anoNascimento;
		int idade;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//PROCESSAMENTOS
		nome = "Cássia";
		anoNascimento = 2001;
		idade = 2021 - anoNascimento;
		
		//ENTRADAS
		System.out.println("Digite seu nome: ");
		nome = leia.next (); 
		System.out.println("Digite o ano do seu nascimento: ");
		anoNascimento = leia.nextInt();
		
		//SAÍDAS
		System.out.println("Oi " + nome + ", você tem " + idade + " anos de idade!");
		
	}
}
