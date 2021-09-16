package Lista1;

public class Tarefa5Revisao 
{

	public static void main(String[] args) 
	{
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
		respectivamente.*/
		
		//VARIÁVEIS
		double nota1 = 2, nota2 = 3, nota3 = 5, soma, media;
		
		//PROCESSAMENTOS
		soma = nota1 + nota2 + nota3;
		media = soma / 3;
		
		//SAÍDAS
		System.out.println("A MÉDIA TOTAL DAS NOTAS É: " + media);
	}

}
