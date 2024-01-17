package calculadora_calorias;

import java.util.Locale;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Sexo masculino ou feminino? M/F");
		String sexo = sc.nextLine();
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.print("Digite sua altura em cm: ");
		int altura = sc.nextInt();
		System.out.print("Digite seu peso atual: ");
		double peso = sc.nextDouble();
		
		System.out.println("SELECIONE UMA OPÇÃO ABAIXO:");
		System.out.println("____________________________");
		System.out.println("1 - Sedentario (sem atividade física)");
		System.out.println("2 - Levemente ativo (1 a 3 dias na semana)");
		System.out.println("3 - Moderadamente ativo (3 a 5 dias por semana)");
		System.out.println("4 - Altamente ativo (5 a 6 dias por semana)");
		System.out.println("5 - Extremamente ativo (2 vezes ao dia)");
		int opcao = sc.nextInt();
		double atividade = 0;
		switch (opcao) {
		case 1 : atividade = 1.2; break;
		case 2 : atividade = 1.375; break;
		case 3 : atividade = 1.55; break;
		case 4 : atividade = 1.725; break;
		case 5 : atividade = 1.9; break;
		default : atividade = 0; break;
		}
				
		if (sexo.equalsIgnoreCase("M")) {
			Homem novo = new Homem(nome, idade, altura, peso, atividade);
			novo.calorias();
			System.out.println("DADOS DO USUARIO: ");
			System.out.println(novo);
		}else if (sexo.equalsIgnoreCase("F")) {
			Mulher novo = new Mulher(nome, idade, altura, peso, atividade);
			novo.calorias();
			System.out.println("DADOS DO USUARIO: ");
			System.out.println(novo);
		}else {
			System.out.println("Erro nas informações do usuario");
		}
		
		
		
		
		
		sc.close();
		
	}

}
