package Lista3;

import java.util.Scanner;

public class Exemplo1 
{
	public static void main (String [] args)
	{		
		//SCANNER
		Scanner leia = new Scanner (System.in);
		
		//VARI�VEIS
		int idade = 0;
		int sexo = 0;
		int opcao = 0;
		char sim;
		int pessoasCalmes = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outresCalmes = 0;
		int pessoasNervosesMais40 = 0;
		int pessoasCalmesMenos18 = 0;
		
		//ENTRADAS
		System.out.print("DIGITE SUA IDADE: ");
		idade = leia.nextInt();
		System.out.print("DIGITE SEU SEXO '1'- FEMININO / '2'- MASCULINO / '3'- OUTROS: ");
		sexo = leia.nextInt();
		System.out.print("DIGITE SEU TEMPERAMENTO '1'- PESSOA CALMA / '2'- PESSOA NERVOSA / '3'- PESSOA AGRESSIVA: ");
		opcao = leia.nextInt();
		System.out.print("DESEJA CONTINUAR? DIGITE 'S' PARA SIM E 'N' PARA N�O: ");
		sim = leia.next().toUpperCase().charAt(0);
		
		//PROCESSAMENTOS
		while (sim == 'S')
		{
			
			if (opcao == 1)
			{
				pessoasCalmes = pessoasCalmes + 1;
			}
			
			if (sexo == 1 && opcao == 2)
			{
				mulheresNervosas = mulheresNervosas + 1;
			}
			
			if (sexo == 2 && opcao == 3)
			{
				homensAgressivos = homensAgressivos + 1;
			}
			
			if (sexo == 3 && opcao == 1)
			{
				outresCalmes = outresCalmes + 1;
			}
			
			if (idade > 40 && opcao == 2)
			{
				pessoasNervosesMais40 = pessoasNervosesMais40 + 1;
			}
			
			if (idade < 18 && opcao == 1)
			{
				pessoasCalmesMenos18 = pessoasCalmesMenos18 + 1;
			}
			
			//ENTRADAS
			System.out.print("DIGITE SUA IDADE: ");
			idade = leia.nextInt();
			System.out.print("DIGITE SEU SEXO '1'- FEMININO / '2'- MASCULINO / '3'- OUTROS: ");
			sexo = leia.nextInt();
			System.out.print("DIGITE SEU TEMPERAMENTO '1'- PESSOA CALMA / '2'- PESSOA NERVOSA / '3'- PESSOA AGRESSIVA: ");
			opcao = leia.nextInt();
		}
		
		//SA�DAS
		System.out.println("A QUANTIDADE DE PESSOAS CALMES �: " + pessoasCalmes);
		System.out.println("A QUANTIDADE DE MULHERES NERVOSAS �: " + mulheresNervosas);
		System.out.println("A QUANTIDADE DE HOMENS AGRESSIVOS �: " + homensAgressivos);
		System.out.println("A QUANTIDADE DE OUTRES CALMES �: " + outresCalmes);
		System.out.println("A QUANTIDADE DE PESSOAS NERVOSES COM MAIS DE 40 ANOS �: " + pessoasNervosesMais40);
		System.out.println("A QUANTIDADE DE PESSOAS CALMES COM MENOS DE 18 ANOS �: " + pessoasCalmesMenos18);
	}
}
