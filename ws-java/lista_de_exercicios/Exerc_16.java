package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_16 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a,b,c, maior;
		
		System.out.print("Digite o valor da primeira variavel: ");
		a = sc.nextInt();
		System.out.print("Digite o valor da segunda variavel: ");
		b = sc.nextInt();
		System.out.print("Digite o valor da terceira variavel: ");
		c = sc.nextInt();
		
		if (a > b && a > c) {
			maior = a;
		}
		else if ( b > c) {
			maior = b;
		}
		else {
			maior = c;
		}	
		System.out.print("O maior valor é = " + maior);
		
		sc.close();
		}
			
		

	}

