package Lista1;
import java.util.Scanner;

public class ConversaoCelsius 
{
	public static void main (String [] args) {
	
	//VARIÁVEIS	
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
	
	//SAÍDAS
	System.out.println("Olá " + nome + ", a temperatura em fahrenheit é de: " + fahrenheit );
	
	}
}
