package Classes;

public class Pessoas 
{
	//ATRIBUTOS
	public String nome;
	public int anoNascimento;
	public String cpf;
	public char pronome;
	public boolean ativo;
	
	//CONSTRUTORES
	
	//M�TODO()
	public void mostrarIdade()
	{
		System.out.println(2021 - anoNascimento);
	}
	public int calcIdade(int anoAtual)
	{
		int valor;
		valor = anoAtual - anoNascimento;
		return valor;
	}
	
}
