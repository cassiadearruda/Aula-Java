package Lista1;
import java.util.Scanner;

public class SegundoPrograma {
	
	public static void main (String [] args)
	{
		//VARI�VEIS
		String nome;
		int anoNascimento;
		int idade;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//PROCESSAMENTOS
		nome = "C�ssia";
		anoNascimento = 2001;
		idade = 2021 - anoNascimento;
		
		//ENTRADAS
		System.out.println("Digite seu nome: ");
		nome = leia.next (); 
		System.out.println("Digite o ano do seu nascimento: ");
		anoNascimento = leia.nextInt();
		
		//SA�DAS
		System.out.println("Oi " + nome + ", voc� tem " + idade + " anos de idade!");
		
	}
}
