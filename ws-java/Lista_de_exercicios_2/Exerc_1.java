package Lista_de_exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double cont,total, media;
		N = 10;
		double[] vet = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		System.out.println("Valores negativos digitados: ");
		for (int i = 0; i < N; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		cont = 0;
		total = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] < 0 ) {
				total = total +(double) vet[i];
				cont++;
			}
		}
		media = total / cont;
				
		System.out.println("Media dos valores negativos: " + media);
		
		sc.close();
	}

}
