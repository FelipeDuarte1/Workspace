package Lista_de_exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double N;
		int Bolso, Lula, branco, nulo;
		
		System.out.print("Quantos votos serão digitados: ");
		N = sc.nextDouble();
		
		double[] vet = new double[(int) N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite o numero do voto: ");
			vet[i] = sc.nextDouble();
		}
		Bolso = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] == 1) {
				Bolso++;
			}
		}
		Lula = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] == 2) {
				Lula++;
			}
		}
		branco = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] == 3) {
				branco++;
			}
		}
		nulo = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] == 4) {
				nulo++;
			}
		}
		System.out.println("Total de votos feitos: ");
		System.out.println("Bolsonaro: " + Bolso);
		System.out.println("lula: " + Lula);
		System.out.println("Voto em branco: " +branco);
		System.out.println("Voto nulo: " + nulo);
		System.out.println("Total de votos lidos: " + N);
		
		if (Bolso > Lula) {
			System.out.print("Bolsonaro ganhou!");
		}
		else {
			System.out.print("Lula ganhou!");
		}
		sc.close();
		
	}

}
