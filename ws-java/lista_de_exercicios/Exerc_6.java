package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("Digite um numero: ");
		a = sc.nextInt();
		
		if (a < 300 && a > 200){
			System.out.print("O numero esta entre 200 e 300");
		}
		else {
			System.out.print("O numero nao esta entre 200 e 300");
		}
		sc.close();
	}
		

}
