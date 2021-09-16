package Classes;

public class Animal {
	
	private String nome;
	private int idade;
	private String mostrarSom;
	
	public Animal(String nome, int idade, String mostrarSom) {
		this.nome = nome;
		this.idade = idade;
		this.mostrarSom = mostrarSom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getmostrarSom() {
		return mostrarSom;
	}

	public void setmostrarSom(String mostrarSom) {
		this.mostrarSom = mostrarSom;
	}
	
	public String somAnimal () {
		return "Emitindo o som do animal";
	}
	
}
