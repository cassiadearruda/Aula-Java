package Lista3;

public class Lista3Tarefa1 
{
	public static void main (String [] args)
	{
		//VARI�VEIS
		int numero = 1000;
		
		//PROCESSAMENTOS E SA�DAS
		for (int x = 1000; x < 1999; x ++)
		{
			if (numero % 11 == 5)
			{
				System.out.println(numero);
			}	
			numero = numero + 1;
		}
	}
}
