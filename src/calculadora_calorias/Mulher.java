package calculadora_calorias;

public class Mulher extends Usuario {

	public Mulher(String name, int idade, int altura, double peso, double atividade) {
		super(name, idade, altura, peso, atividade);
		
	}
	
	public double calorias() {
		return (10 * peso + 6.25 * altura - 5 * idade -161) * atividade;
	}

	@Override
	public String toString() {
		return "Mulher [name=" + name + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + ", atividade="
				+ atividade + ", calorias()=" + calorias() + "]";
	}
	
	

}
