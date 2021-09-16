package programas;

public class CadNovoAluno 
{

	public static void main(String[] args) 
	{
		//INSTANCIAR ALUNO
		Aluno exemplo1 = new Aluno();
		exemplo1.nome = "EPAMINONDAS";
		exemplo1.matricula = "MAT-1";
		System.out.println(exemplo1.nome+" "+exemplo1.matricula);
	}

}
