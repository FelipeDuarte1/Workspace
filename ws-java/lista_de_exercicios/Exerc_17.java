package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_17 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d, media;
		
		System.out.println("Digite as 4 notas tiradas: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		
		media = (a + b + c + d) / 4;
		
		if (media >= 5) {
			System.out.print("Aluno aprovado!");
		}
		else {
			System.out.print("O aluno foi reprovado!");
		}
		
		System.out.print("A media foi de : " + media);
		
		sc.close();
	}

}
