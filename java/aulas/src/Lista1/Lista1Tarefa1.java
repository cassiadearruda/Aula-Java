package Lista1;
import java.util.Scanner;

public class Lista1Tarefa1 
{
	public static void main (String [] args)
	{
		// VARIÁVEIS
		int anos;
		int meses;
		int dias;
		int total;
		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//PROCESSAMENTOS E ENTRADAS
		System.out.println("DIGITE SUA IDADE EM ANOS: ");
		anos = leia.nextInt();
		anos = anos * 365;
		
		System.out.println("DIGITE SUA IDADE EM MESES: ");
		meses = leia.nextInt();
		meses = meses * 30;
		
		System.out.println("DIGITE SUA IDADE EM DIAS: ");
		dias = leia.nextInt();

		total = dias + meses + anos;
		
		//SAÍDAS
		System.out.println("SUA IDADE EM DIAS É: " + total);
	}
	
}
