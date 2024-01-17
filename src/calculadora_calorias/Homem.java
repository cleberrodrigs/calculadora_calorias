package calculadora_calorias;

public class Homem extends Usuario {

	public Homem(String name, int idade, int altura, double peso, double atividade) {
		super(name, idade, altura, peso, atividade);
		
	}
	
	public double calorias() {
		return  (10 * peso + 6.25 * altura - 5 * idade + 5) * atividade;
	}

	@Override
	public String toString() {
		return "Homem [name=" + name + 
				"\n, idade=" + idade + 
				"\n, altura=" + altura + 
				"\n, peso=" + peso + 
				"\n, atividade=" + atividade +
				"\n, calorias()=" + calorias() + "]";
	}
	
	
	
	

	
	
	
	
		
	

}
