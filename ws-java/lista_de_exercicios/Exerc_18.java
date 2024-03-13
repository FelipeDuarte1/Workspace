package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_18 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, diferenca;
		
		System.out.print("Digite o primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = sc.nextInt();
		
		if (a > b) {
			diferenca = a - b;
		}
		else {
			diferenca = b - a;
		}
		System.out.print("A diferença é de : " + diferenca);
		
		sc.close();
	}

}
