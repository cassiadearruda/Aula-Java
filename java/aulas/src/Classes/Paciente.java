package Classes;

public class Paciente 
{
	//ATRIBUTOS
	public String nome;
	public int anoNascimento;
	public int telefone;
	public char status;
	
	//CONSTRUTORES
	
	//MÉTODOS
	public void mostrarNome()
	{
		System.out.println("O nome é: " + nome);
	}
	public void mostrarIdade()
	{
		System.out.println("A idade é: " + (2021 - anoNascimento));
	}
	public void mostrarTelefone()
	{
		System.out.println("O numero de telefone é: " + telefone);
	}
	public void mostrarStatus()
	{
		if (status == 'S')
		{
			System.out.println("Paciente " + nome +", está estável!");
		}
		else
		{
			System.out.println("Paciente " + nome +", está em observação!");
		}
	}
}
