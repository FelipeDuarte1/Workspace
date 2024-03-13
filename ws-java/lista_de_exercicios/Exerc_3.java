package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario, totalVendas;
		double salarioFinal;
		
		System.out.print("Digite o seu nome: ");
		nome = sc.next();
		System.out.print("Digite seu salario: ");
		salario = sc.nextDouble();
		System.out.print("Digite o total de vendas feitas: ");
		totalVendas = sc.nextDouble();
		
		salarioFinal = salario + totalVendas * 0.2;
		
		System.out.println("Seu nome é " + nome + " recebe " + salario + " reais de salario fixo e " + salarioFinal + " reais de salario final");
		
			
		
		sc.close();

	}

}
