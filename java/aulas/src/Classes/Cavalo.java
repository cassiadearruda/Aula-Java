package Classes;

public class Cavalo extends Animal {
	private String deveCorrer;
	
	public Cavalo (String nome, int idade, String mostrarSom, String deveCorrer) {
		super (nome, idade, mostrarSom);
		this.deveCorrer = deveCorrer;
	}

	public String getDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	
	@Override
	public String somAnimal () {
		return "pocotó pocotó pocotó";
	}
}
