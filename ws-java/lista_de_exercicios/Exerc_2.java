package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a,  b;
		double soma, subtracao, multiplicacao, divisao;
		
		System.out.print("Digite o valor do primeiro numero: ");
		a = sc.nextInt();
		System.out.print("Digite o valor do segundo numero: ");
		b = sc.nextInt();
		
		soma = a + b;
		subtracao = a - b;
		multiplicacao = a * b;
		divisao = a / b;
		
		System.out.println("Soma = " + soma);
		System.out.println("subtracao = " + subtracao);
		System.out.println("multiplicacao = " + multiplicacao);
		System.out.println("divisao = " + divisao);
		
		sc.close();
		
	}

}
