package Classes;

public class ContaBancaria 
{
	//ATRIBUTOS
	public String titular;
	public String cpf;
	public double saldo;
	public double credito;
	
	//M�TODOS
	public void mostrarExtrato()
	{
		System.out.print("TITULAR\t\tCPF\tSALDO\tCR�DITO");
		System.out.print("\n" + titular + "\t" + cpf + "\t" + saldo + "\t" + credito);
	}
}
