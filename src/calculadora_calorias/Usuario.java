package calculadora_calorias;

import java.util.Objects;

public class Usuario {
	
	String name;
	int idade;
	int altura;
	double peso;
	double atividade;
	
	
	public Usuario(String name, int idade, int altura, double peso, double atividade) {
		super();
		this.name = name;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.atividade = atividade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAtividade() {
		return atividade;
	}


	public void setAtividade(double atividade) {
		this.atividade = atividade;
	}


	@Override
	public int hashCode() {
		return Objects.hash(altura, atividade, idade, name, peso);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return altura == other.altura && Double.doubleToLongBits(atividade) == Double.doubleToLongBits(other.atividade)
				&& idade == other.idade && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}
	
	
	
	
	
	

}

	
