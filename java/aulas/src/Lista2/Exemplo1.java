package Lista2;

import java.util.Scanner;

public class Exemplo1 {
	
	public static void main(String[] args) {
		//SCANNER
		Scanner leia = new Scanner(System.in);
		
		//VARIÁVEIS
		String nome;
		char opcao; //m, f, e
		
		//ENTRADAS
		System.out.print("Digite o nome : ");
		nome = leia.nextLine().toUpperCase();
		System.out.println("Selecione M-masculino, F-Feminino ou E-neutro :");
		opcao = leia.next().toUpperCase().charAt(0);
		
		//PROCESSAMENTOS
		if (opcao == 'M') {
			System.out.println("Selecionado masculino");
		}
		else if (opcao=='F') {
			System.out.println("Selecionado feminina");
		} else if (opcao=='E') {
			System.out.println("Selecionado neutro - ellu");
		}
		
		//SAÍDAS
		System.out.println();
		System.out.printf ("[versão printf ] O nome digitado foi %s \n",nome.toUpperCase());
		System.out.println("[versão println] O nome digitado foi "+nome);
		System.out.println("a quantidade de caracteres do nome digitado é "+nome.length());
		
		leia.close();
	}

}
