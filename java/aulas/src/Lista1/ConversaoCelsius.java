package Lista1;
import java.util.Scanner;

public class ConversaoCelsius 
{
	public static void main (String [] args) {
	
	//VARI�VEIS	
	String nome;
	int celsius;
	double fahrenheit;
	
	//SCANNER
	Scanner leia = new Scanner (System.in);
	
	//PROCESSAMENTOS E ENTRADAS
	System.out.print("Digite seu nome: ");
	nome = leia.next();
	System.out.print("Qual a temperatura em Celsius: ");
	celsius = leia.nextInt();
	
	fahrenheit = 32+(celsius * 1.8);
	
	//SA�DAS
	System.out.println("Ol� " + nome + ", a temperatura em fahrenheit � de: " + fahrenheit );
	
	}
}
