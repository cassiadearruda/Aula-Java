package Lista1;

public class Tarefa5Revisao 
{

	public static void main(String[] args) 
	{
		/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
		aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
		respectivamente.*/
		
		//VARI�VEIS
		double nota1 = 2, nota2 = 3, nota3 = 5, soma, media;
		
		//PROCESSAMENTOS
		soma = nota1 + nota2 + nota3;
		media = soma / 3;
		
		//SA�DAS
		System.out.println("A M�DIA TOTAL DAS NOTAS �: " + media);
	}

}
