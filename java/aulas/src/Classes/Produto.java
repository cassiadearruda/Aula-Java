package Classes;

public class Produto {
	
	//ATRIBUTOS
	private String codigo;
	private String nome;
	private double preco;
	private int estoque;
	
	//CONSTRUTORES
	public Produto(String codigo, String nome, double preco, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//MÉTODOS
	
	

}
