package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Digite o primeiro numero: ");
		a = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		b = sc.nextInt();
		
		if (a == b)
			System.out.println("Os valores são iguais");
		else if (a > b)
			System.out.println("O valor de A é maior");
		else 
			System.out.println("O valor de B é maior");
		
		sc.close();
		
			

	}

}
