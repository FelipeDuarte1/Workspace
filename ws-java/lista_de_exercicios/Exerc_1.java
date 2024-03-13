package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;


public class Exerc_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.print("Digite a altura: ");
		altura = sc.nextInt();
		System.out.print("Digite a base: ");
		base = sc.nextInt();
		
		area = base * altura / 2;
		
		System.out.print("A area do triangulo é de: " + area);
		
		
		sc.close();
	}

}
